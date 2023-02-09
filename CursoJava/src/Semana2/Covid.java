package Semana2;
import java.util.Scanner;

public class Covid {
    public static void main(String[] args) throws Exception {
        String Pais;
        Scanner ps=new Scanner(System.in);
        System.out.print("Digite el nombre del pais");
        Pais=ps.nextLine();
        int cantEnfermos;
        Scanner enf =new Scanner(System.in);
        System.out.print("Digite la cantidad de enfermos");
        cantEnfermos=enf.nextInt();
        int cantMuertos;
        Scanner mue =new Scanner(System.in);
        System.out.print("Digite la cantidad de muertes");
        cantMuertos=mue.nextInt();
        float tasaMortalidad;
        tasaMortalidad=((float)cantMuertos/(float)cantEnfermos)*1000;
        System.out.print(tasaMortalidad+"%"+ Pais);











    }

}
