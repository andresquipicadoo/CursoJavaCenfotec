package Semana2;

public class Clase2 {
    static final double PI = 3.14;

    public static void main(String[] args) throws Exception {
        System.out.println("Mi primer ejemplo");

        int numero1 = 100;
        int dividendo = 7;
        int divisor = 3;
        double resultado;
        int residuo;
        int suma;
        int resta;
        String nombre, apellido, nombreCompleto;

        resultado = numero1 * (1.0 * dividendo / divisor);
        System.out.println(resultado);

        residuo = dividendo % divisor;
        System.out.println(residuo);

        suma = (int) resultado + residuo;

        System.out.println(suma);

        resta = residuo - (int) resultado;
        System.out.println(resta);

        nombre = "Andres";
        apellido = "Quiros";

        nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        System.out.println("El número PI " + PI);

        System.out.println("Suma: " + suma);

    }
}
