package Semana2;

import java.io.*;

public class Liquidacion {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        double salario;
        System.out.println("Digite el salario del trabajador :");
        salario = Double.parseDouble(in.readLine());
        int VacNoGozadas,AguinaldoProp,cesantia,liquidacion;
        VacNoGozadas=(int)salario/30*14;
        System.out.println("Él monto de las vacaciones no gozadas es de "+VacNoGozadas+ " colones");      
        AguinaldoProp=(int)salario/12;
        System.out.println("Él monto del aguinaldo del trabajador es de  "+AguinaldoProp+ " colones");      
        cesantia=(int)salario/30*20*2;
        System.out.println("Él monto de la cesantia del trabajador es de  "+cesantia+ " colones");      
        liquidacion=(int)salario+VacNoGozadas+AguinaldoProp+(int) salario+cesantia;
        System.out.println("Él monto de la liquidacion del trabajador es de "+liquidacion+ " colones");      


    }

}
