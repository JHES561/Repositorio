import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.sound.sampled.*;
import java.net.URL;

public class Matriz extends JFrame {
    private int vidaBatman = 100;
    private int vidaBane = 100;
    private final int vidaMaxima = 100;

    private JLabel iconoBatman;
    private JLabel iconoBane;
    private JLabel barraBatman;
    private JLabel barraBane;
    private JLabel turnoLabel;
    private JTextArea areaTexto;
    private JPanel panelBotones;
    private boolean turnoBatman = true;
    private Clip clipFondo;

    public Matriz() {
        setTitle("Batman vs Bane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280, 1000);

        PanelConFondo fondo = new PanelConFondo("/fondo_gotica.png");
        fondo.setLayout(new BorderLayout());
        setContentPane(fondo);

        JPanel panelVida = new JPanel(new GridLayout(3, 3));
        panelVida.setOpaque(false);

        iconoBatman = new JLabel(new ImageIcon(getClass().getResource("/batman.gif")));
        iconoBane = new JLabel(new ImageIcon(getClass().getResource("/bane.gif")));

        barraBatman = new JLabel(barraVida(vidaBatman, vidaMaxima) + " " + vidaBatman + "%");
        barraBane = new JLabel(barraVida(vidaBane, vidaMaxima) + " " + vidaBane + "%");

        JLabel nombreBatman = new JLabel("Batman", SwingConstants.CENTER);
        nombreBatman.setForeground(Color.BLUE);
        JLabel nombreBane = new JLabel("Bane", SwingConstants.CENTER);
        nombreBane.setForeground(Color.RED);

        panelVida.add(nombreBatman);
        panelVida.add(new JLabel(""));
        panelVida.add(nombreBane);
        panelVida.add(iconoBatman);
        panelVida.add(new JLabel(""));
        panelVida.add(iconoBane);
        panelVida.add(barraBatman);
        panelVida.add(new JLabel(""));
        panelVida.add(barraBane);

        fondo.add(panelVida, BorderLayout.NORTH);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        fondo.add(scroll, BorderLayout.CENTER);

        turnoLabel = new JLabel("", SwingConstants.CENTER);
        turnoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        turnoLabel.setForeground(Color.WHITE);
        fondo.add(turnoLabel, BorderLayout.WEST);

        panelBotones = new JPanel(new GridLayout(2, 3));
        panelBotones.setOpaque(false);
        fondo.add(panelBotones, BorderLayout.SOUTH);

        reproducirMusicaFondo("/musicafondo.wav");

        actualizarInterfaz();
        setVisible(true);
    }

    private void actualizarInterfaz() {
        actualizarBarraVida();
        turnoLabel.setText("Turno de " + (turnoBatman ? "Batman" : "Bane"));
        actualizarBotones();
    }

    private void actualizarBotones() {
        panelBotones.removeAll();

        if (turnoBatman) {
            agregarBoton("Atacar a Bane", e -> {
                reproducirSonido("/ataque.wav");
                int daño = 15;
                vidaBane = Math.max(0, vidaBane - daño);
                areaTexto.append("Batman ataca a Bane y causa " + daño + " de daño.\n");
                siguienteTurno();
            });

            agregarBoton("Ataque especial", e -> {
                reproducirSonido("/ataqueespecial.wav");
                int daño = 30;
                vidaBane = Math.max(0, vidaBane - daño);
                areaTexto.append("Batman usa ataque especial y causa " + daño + " de daño a Bane.\n");
                siguienteTurno();
            });

            agregarBoton("Recuperarse", e -> {
                reproducirSonido("/curacion.wav");
                int cura = 16;
                vidaBatman = Math.min(vidaMaxima, vidaBatman + cura);
                areaTexto.append("Batman se recupera " + cura + " puntos de vida.\n");
                siguienteTurno();
            });

            agregarBoton("Estadísticas", e -> {
                areaTexto.append("Batman: " + vidaBatman + " | Bane: " + vidaBane + "\n");
            });

            agregarBoton("Terminar batalla", e -> System.exit(0));
        } else {
            agregarBoton("Atacar a Batman", e -> {
                reproducirSonido("/ataque.wav");
                int daño = 20;
                vidaBatman = Math.max(0, vidaBatman - daño);
                areaTexto.append("Bane ataca a Batman y causa " + daño + " de daño.\n");
                siguienteTurno();
            });

            agregarBoton("Usar veneno", e -> {
                reproducirSonido("/veneno.wav");
                int daño = 35;
                vidaBatman = Math.max(0, vidaBatman - daño);
                areaTexto.append("Bane usa veneno y causa " + daño + " de daño a Batman.\n");
                siguienteTurno();
            });

            agregarBoton("Recuperarse", e -> {
                reproducirSonido("/curacion.wav");
                int cura = 13;
                vidaBane = Math.min(vidaMaxima, vidaBane + cura);
                areaTexto.append("Bane se recupera " + cura + " puntos de vida.\n");
                siguienteTurno();
            });

            agregarBoton("Estadísticas", e -> {
                areaTexto.append("Batman: " + vidaBatman + " | Bane: " + vidaBane + "\n");
            });

            agregarBoton("Terminar batalla", e -> System.exit(0));
        }

        panelBotones.revalidate();
        panelBotones.repaint();
    }

    private void agregarBoton(String texto, ActionListener accion) {
        JButton boton = new JButton(texto);
        boton.addActionListener(accion);
        panelBotones.add(boton);
    }

    private void siguienteTurno() {
        actualizarBarraVida();
        if (vidaBatman <= 0 || vidaBane <= 0) {
            mostrarGanador();
        } else {
            turnoBatman = !turnoBatman;
            actualizarInterfaz();
        }
    }

    private Color colorVida(int vida) {
        int porcentaje = (vida * 100) / vidaMaxima;
        if (porcentaje > 60) return Color.GREEN.darker();
        else if (porcentaje > 30) return Color.ORANGE;
        else return Color.RED;
    }

    private void actualizarBarraVida() {
        barraBatman.setText(barraVida(vidaBatman, vidaMaxima) + " " + vidaBatman + "%");
        barraBatman.setForeground(colorVida(vidaBatman));
        barraBane.setText(barraVida(vidaBane, vidaMaxima) + " " + vidaBane + "%");
        barraBane.setForeground(colorVida(vidaBane));
    }

    private String barraVida(int vida, int vidaMaxima) {
        int porcentaje = Math.max(0, (vida * 100 / vidaMaxima));
        int barras = Math.max(0, porcentaje / 5);
        StringBuilder barra = new StringBuilder();
        for (int i = 0; i < barras; i++) barra.append("█");
        for (int i = barras; i < 20; i++) barra.append(" ");
        return barra.toString();
    }

    private void mostrarGanador() {
        detenerMusica();
        reproducirSonido("/victoria.wav");
        String ganador = (vidaBatman > 0) ? "¡Batman gana!" : "¡Bane gana!";
        String gifGanador = (vidaBatman > 0) ? "/batman_victoria.gif" : "/bane_victoria.gif";

        URL url = getClass().getResource(gifGanador);
        if (url == null) {
            JOptionPane.showMessageDialog(this, ganador, "Fin del Juego", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ImageIcon gif = new ImageIcon(url);
            JOptionPane.showMessageDialog(this, ganador, "Fin del Juego", JOptionPane.INFORMATION_MESSAGE, gif);
        }

        System.exit(0);
    }

    private void reproducirSonido(String ruta) {
        try {
            URL url = getClass().getResource(ruta);
            if (url == null) throw new RuntimeException("Archivo no encontrado: " + ruta);
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error de sonido: " + e.getMessage());
        }
    }

    private void reproducirMusicaFondo(String ruta) {
        try {
            URL url = getClass().getResource(ruta);
            if (url == null) throw new RuntimeException("Archivo no encontrado: " + ruta);
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            clipFondo = AudioSystem.getClip();
            clipFondo.open(audio);
            FloatControl volumen = (FloatControl) clipFondo.getControl(FloatControl.Type.MASTER_GAIN);
            volumen.setValue(-15.0f);
            clipFondo.loop(Clip.LOOP_CONTINUOUSLY);
            clipFondo.start();
        } catch (Exception e) {
            System.out.println("Error de música de fondo: " + e.getMessage());
        }
    }

    private void detenerMusica() {
        if (clipFondo != null && clipFondo.isRunning()) {
            clipFondo.stop();
        }
    }

    class PanelConFondo extends JPanel {
        private Image imagen;

        public PanelConFondo(String rutaImagen) {
            URL url = getClass().getResource(rutaImagen);
            if (url != null) {
                this.imagen = new ImageIcon(url).getImage();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (imagen != null) {
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    public static void main(String[] args) {
        new Matriz();
    }
}