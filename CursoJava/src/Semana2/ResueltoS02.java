package Semana2;
import java.util.Scanner;

public class ResueltoS02 {
   
    public static void main(String[] args) throws Exception {

        int KilometroAntes;
        Scanner Km=new Scanner(System.in);
        System.out.println("Digite el kilometraje de auto antes de iniciar el viaje");
        KilometroAntes=Km.nextInt();
        int KilometroDespues;
        Scanner Kms=new Scanner(System.in);
        System.out.println("Digite el kilometraje de auto despues del viaje");
        KilometroDespues=Kms.nextInt();
        int KmTotal;
        KmTotal=KilometroAntes+KilometroDespues;
        System.out.println(KmTotal);
 
  


    }

}
