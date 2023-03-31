

import java.io.*;
import java.text.Format;

public class AndresQuirosPicado_Tarea1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        double salario;
        System.out.println("Digite el salario del trabajador :");
        salario = Double.parseDouble(in.readLine());
     
        double liquidacion,VacNoGozadas,AguinaldoProp,cesantia;
       
        VacNoGozadas =( salario /30)*14  ;
        System.out.println("Él monto de las vacaciones no gozadas es de " + (int) VacNoGozadas + " colones");
        AguinaldoProp =  salario / 12;
        System.out.println("Él monto del aguinaldo del trabajador es de  " +(int) AguinaldoProp + " colones");
        cesantia =  salario/30*20*2;
        System.out.println("Él monto de la cesantia del trabajador es de  " + (int)cesantia + " colones");
        liquidacion =  (int) salario + (int) VacNoGozadas + (int)AguinaldoProp +  (int)salario + (int) cesantia;
        System.out.println("Él monto de la liquidacion del trabajador es de " + liquidacion + " colones");

    }

}
