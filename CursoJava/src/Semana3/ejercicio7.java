package Semana3;
import java.util.Scanner;
public class ejercicio7 {
   public static void main(String[] args){
      int nota1;
      int nota2;
      int nota3;
      double notafinal;
      Scanner n1=new Scanner(System.in);
      System.out.println("Digite la nota del primer examen del estudiante :");
      nota1=n1.nextInt();

      Scanner n2=new Scanner(System.in);
      System.out.println("Digite la nota del segundo examen del estudiante :");
      nota2=n2.nextInt(); 

      Scanner n3=new Scanner(System.in);
      System.out.println("Digite la nota del segundo examen del estudiante :");
      nota3=n3.nextInt(); 

      notafinal=(nota1+nota2+nota3)/3;

    if (notafinal >=70){

        System.out.println("Usted ha aprobado el curso con una nota de :"+notafinal);
    }
    if (notafinal <=69){
        System.out.println("Usted ha reprobado el curso con una nota de :"+notafinal);

    }



     



   }
}
