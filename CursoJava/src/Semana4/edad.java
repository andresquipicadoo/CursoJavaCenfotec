package Semana4;
import java.util.Scanner;
public class edad {
   
    public static void main(String[] args) throws Exception {
        int edadMay=0;
        int edadmen=0;
        int edad;
        Scanner ed = new Scanner(System.in);
        System.out.print("Digite la edad de la persona : ");
        edad=ed.nextInt();
        boolean edadvalida=true;
        while(edadvalida){
            if (edad > edadMay) {
                edadMay=edad;
               
            }
            else if(edad <edadmen){
                edadmen=edad;
              
            }
          

            break;
        }
        while (edad <=0){
            System.out.println("Error");
            break;
        }
        System.out.println("La edad mayor es"+edadMay);
        System.out.println("La edad mayor es"+edadmen);
    }
      


}
