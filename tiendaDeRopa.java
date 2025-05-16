import java.util.Scanner;
public class tiendaDeRopa {
    public static void main(String[] args) {
       
        Scanner plus = new Scanner(System.in);

        double descuento = 0.85;
        double descuento2 = 0.95;
        double precioCamisas = 25;
        double precioPantalon = 30;
        System.out.println("ingrese cantidad de camisas");
        double compraCamisas = plus.nextDouble();
    
        System.out.println("ingrese cantidad de pantalones");
        double compraPantalones = plus.nextDouble();

        double valorCamisas = compraCamisas * precioCamisas;

        double valorPantalones = compraPantalones * precioPantalon;

        double valorCompra = valorCamisas + valorPantalones * descuento;

        double nuevoDescuento = valorCamisas + valorPantalones * descuento2;

        if (compraCamisas >= 2){
         System.out.println("total a pagar es " + nuevoDescuento);    
        }else {
         System.out.println("total a pagar es " + valorCompra);   
        }
        plus.close();
    }
}
