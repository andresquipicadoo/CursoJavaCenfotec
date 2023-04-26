import java.io.*;
import java.sql.Array;
import java.util.Scanner;

public class avance2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);

        int cantExistencia=0,multConsumo=0,cantProdUtilizar=0,precioUnitario=0,cantidadPorciones=0;
        String nombreReceta="", provedor="",nombreProducto="",respuesta;
        boolean continuar = true;
        double mayorCosto = Double.MIN_VALUE;
        double menorCosto = Double.MAX_VALUE;
        String nombreProductoMayorCosto = "";
        String nombreProductoMenorCosto = "";
        int InvRestante=0,montXDesperdicio=0,cantidadIngredienteNecesario=0;

        System.out.println("Ingrese la cantidad de porciones que desea preparar: ");
        cantidadPorciones = Integer.parseInt(in.readLine());

        System.out.println("Ingrese la cantidad de ingredientes necesarios por porción: ");
        cantidadIngredienteNecesario = Integer.parseInt(in.readLine());

        int cantidad = cantidadIngredienteNecesario;

        System.out.println("Ingrese el nombre de la receta: ");
        Scanner nombRec =new Scanner(System.in);
        nombreReceta =nombRec.nextLine();
        while(continuar) {
            for (int i = 0; i < cantidad; i++) {
                continuar = true;
                System.out.println("Digite el nombre del producto: ");
                Scanner nombProd = new Scanner(System.in);
                nombreProducto = nombProd.nextLine();

                System.out.println("Digite el provedor del producto: ");
                Scanner prov = new Scanner(System.in);
                provedor = prov.nextLine();

                System.out.println("Digite la cantidad actual en existencia: ");
                cantExistencia = Integer.parseInt(in.readLine());

                System.out.println("Digite el precio unitario: ");
                precioUnitario = Integer.parseInt(in.readLine());

                System.out.println("Digite los multiplos de consumo: ");
                multConsumo = Integer.parseInt(in.readLine());

                System.out.println("Digite la cantidad de producto a utilizar por porción: ");
                cantProdUtilizar = Integer.parseInt(in.readLine());

                // Preguntar si el usuario quiere registrar otro producto
                System.out.println("¿Desea registrar otro producto? (s/n)");
                Scanner resp = new Scanner(System.in);
                respuesta = resp.nextLine();

                if (respuesta.equals("n")) {
                    continuar = false;
                }

                InvRestante = cantExistencia - multConsumo;

                montXDesperdicio = (multConsumo - cantProdUtilizar) * precioUnitario;

                cantidadIngredienteNecesario = cantProdUtilizar * cantidadPorciones;

                if (precioUnitario > mayorCosto) {
                    mayorCosto = precioUnitario;
                    nombreProductoMayorCosto = nombreProducto;
                }

                if (precioUnitario < menorCosto) {
                    menorCosto = precioUnitario;
                    nombreProductoMenorCosto = nombreProducto;
                }
            }
        }
        int costoTotal;
        costoTotal = multConsumo * precioUnitario;
        costoTotal =+ costoTotal;

        int costoTotalReceta;
        costoTotalReceta = costoTotal * cantidadPorciones;

        System.out.println("Para realizar la preparación de la receta: " + nombreReceta);
        System.out.println("Se requieren de: " + multConsumo + " unidades");
        System.out.println("El costo es de: " + costoTotal + " colones.");
        System.out.println("Inventario restante: " + InvRestante + " unidades");
        System.out.println("El monto en dinero por producto desperdiciado es de: " + montXDesperdicio + " colones.");
        System.out.println("El costo total de la receta es de: " + costoTotalReceta + " colones.");
        System.out.println("El producto con mayor costo en la receta es: " + nombreProductoMayorCosto);
        System.out.println("El producto con menor costo en la receta es: " +  nombreProductoMenorCosto);
        System.out.println("La cantidad total de productos es: " + cantidad);
    }

   /* static public void validarRegistroProducto() throws IOException {
        boolean salir = false;
        int opcion;

        do {
            System.out.println("1. Registrar Producto");
            System.out.println("4. Salir");
            opcion = Integer.parseInt(in.readLine());

            switch (opcion) {
                case 1:
                    registrarProductos();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números 1 y 4");
            }
        }
        while (!salir);

    }*/
    

        
      

}
