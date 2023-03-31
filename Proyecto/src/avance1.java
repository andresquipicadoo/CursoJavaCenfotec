import java.io.*;
import java.util.Scanner;
public class avance1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    public static void main(String[] args) throws Exception {
        String provedor;
        String nombreProducto;
        int cantExistencia;
        int PrecioUnitario;
        int multConsumo;
        int cantProdUtilizar;
       
        System.out.println("Digite el nombre del producto : ");
        Scanner nomb =new Scanner(System.in);
        nombreProducto=nomb.nextLine();
        System.out.println("Digite el provedor del producto : ");
        Scanner prov =new Scanner(System.in);
        provedor=prov.nextLine();

        System.out.println("Digite la cantidad actual en existencia : ");
        cantExistencia=Integer.parseInt(in.readLine());

        System.out.println("Digite el precio unitario: ");
        PrecioUnitario=Integer.parseInt(in.readLine());
        
        System.out.println("Digite los multiplos de consumo : ");
        multConsumo=Integer.parseInt(in.readLine());

        System.out.println("Digite la cantidad de producto a utilizar : ");
        cantProdUtilizar=Integer.parseInt(in.readLine());
        
        int costoTotal;
        costoTotal=multConsumo*PrecioUnitario;
        int InvRestante;
        InvRestante=cantExistencia-multConsumo;
        int montXDesperdicio;

        System.out.println("Se requieren de "+multConsumo+ "unidades");
        System.out.println("El costo es de :"+costoTotal);
        System.out.println("Inventario restante "+InvRestante +"unidades");
        
    }

}
