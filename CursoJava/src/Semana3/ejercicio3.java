package Semana3;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) throws Exception {
        float nota;
        Scanner n = new Scanner(System.in);
        System.out.print("Digite nota del estudiante: ");
        nota = n.nextInt();
        if(nota >=70){
            System.out.println("Aprobado ");
        }
        else if (nota<=69){
            System.out.println("Reprobado ");

        }

    }
}

