package Semana3;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args){
        int golesEquipo1;
        int golesEquipo2;

        Scanner eq1=new Scanner(System.in);
        System.out.println("Digite la cantidad de goles que anoto el equipo de Paco :");
        golesEquipo1=eq1.nextInt();
        
        Scanner eq2=new Scanner(System.in);
        System.out.println("Digite la cantidad de goles que anoto el equipo de Luis :");
        golesEquipo2=eq2.nextInt();

        if (golesEquipo1==golesEquipo2){
            
            System.out.println("Los equipos de Paco y Luis empataron con marcador de"+golesEquipo1+ " a "+ golesEquipo2);
 


        }
        if (golesEquipo1 <golesEquipo2){

            System.out.println("El equipo de Paco perdio con marcador de :"+golesEquipo1+ " a "+ golesEquipo2);

        }
        else{
            System.out.println("El equipo de Luis perdio con marcador de :"+golesEquipo1+ " a "+ golesEquipo2);

        }
        if (golesEquipo1 >golesEquipo2){

            System.out.println("El equipo de Paco gano con marcador de :"+golesEquipo1+ " a "+ golesEquipo2);

        }
        else{
            System.out.println("El equipo de Luis gano con marcador de :"+golesEquipo1+ " a "+ golesEquipo2);

        }

    }
   


}
