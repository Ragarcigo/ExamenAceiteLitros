import java.util.Scanner;

/**
 * Una empresa que se dedica a la venta de Aceite de Oliva necesita una aplicación en java para gestionar las facturas.
 * En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
 * Realizar un menú, con la siguiente estructura:
 * 1. Facturar
 * 2. Salir
 * En facturar, solicitar el código que pueden ser (01 de 1 litro, 02 de 3 litros y 03 de 5 litros)
 * Según el formato, los precios son:
 * 1 litro -> 9,99€
 * 3 litros -> 29,99€
 * 5 litros-> 49,95€
 * Según lo que haya facturado mostrar los datos suministrados, el total de la factura, y el IVA 4%
 **/

public class Examen {
    public static void main(String[] args) {
//Declaramos las constantes de los precios para el aceite
        Scanner sc = new Scanner(System.in);
        final double Aceite1Litro = 9.99;
        final double Aceite3Litro = 29.99;
        final double Aceite5Litro = 49.95;

        double totallitros= 0;
        int cantidad=0;
        int cantidad3=0;
        int cantidad5=0;
        double totalcuenta=0;
        int opcion;

        do{ //ésto va a permitir que se repita hasta que el usuario decida "salir"
            System.out.println("\nSeleccione la opcion de aceite que desea comprar:");
            System.out.println("1. Aceite 1 Litro = 9.99€");
            System.out.println("2. Aceite 3 Litros = 29.99€");
            System.out.println("3. Aceite 5 Litros = 49.95");
            System.out.println("0. Salir");
            System.out.println("Eliga una opcion: ");
            opcion = sc.nextInt();

            //ahora con el switch se suman los litros y los precios dependiendo de la cantidad que elija el usuario
            switch(opcion){
                case 1:
                    System.out.println("¿Cuántas botellas quiere?");
                    cantidad = sc.nextInt();
                    totalcuenta+= cantidad * Aceite1Litro;
                    totallitros += cantidad;
                    break;
                case 2:
                    System.out.println("¿Cuántas garrafas quiere comprar?");
                    cantidad3 = sc.nextInt();
                    totalcuenta+= cantidad3 * Aceite3Litro;
                    totallitros += cantidad3 * 3;
                    break;
                case 3:
                    System.out.println("¿Cuántas garrafas quiere comprar?");
                    cantidad5 = sc.nextInt();
                    totalcuenta+= cantidad5 * Aceite5Litro;
                    totallitros += cantidad5 * 5;
                    break;
                case 0:
                    System.out.println("Espere un momento mientras le preparamos la factura...");
                    break;
                default:
                    System.out.println("Ha ocurrido un error, intente nuevamente");
            }
            //Ahora mostramos con el while el total de litros de aceite que ha comprado y por consiguiente el total a pagar
        }while(opcion!=0);
        System.out.println("\nHa comprado " + totallitros + " litros de aceite");
        System.out.println("Aceite de 1 Litro: " + cantidad + " X " + Aceite1Litro + " = " + cantidad * Aceite1Litro);
        System.out.println("Aceite de 3 Litros: " + cantidad3 + " X " + Aceite3Litro + " = " + cantidad3 * Aceite3Litro);
        System.out.println("Aceite de 5 Litros: " + cantidad5 + " X " + Aceite5Litro + " = " + cantidad5 * Aceite5Litro);
        System.out.println("TOTAL A PAGAR : " + totalcuenta + "€");
        System.out.println("***GRACIAS POR CONFIAR EN NOSOTROS***");
    }
}