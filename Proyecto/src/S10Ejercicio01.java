public class S10Ejercicio01 {
    public static void main(String[] args) {
        int numero = 1734;
        int usuario = 2143;
        System.out.println(numero);
        System.out.println(contarPicas(numero, usuario));
    }

    static int contarPicas(int n1, int n2) {
        int contador = 0;
        String s1 = String.valueOf(n1), s2 = String.valueOf(n2);
        char digitoS1, digitoS2;

        for (int i = 0; i < s1.length(); i++) {
            digitoS1 = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                digitoS2 = s2.charAt(j);
                if (digitoS1 == digitoS2 && i != j) {
                    contador++;
                }
            }
        }

        return contador;
    }

    static int contarFijas(int n1, int n2) {
        int contador = 0;
        String s1 = String.valueOf(n1), s2 = String.valueOf(n2);

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                contador++;
            }       
        }
        return contador;
    }

    static int generarNumeroSecreto() {
        int numero = 0;
        do {
            numero = generarNumeroEnRango(1000,9999);
        } while (!esNumeroValido(numero));
        return numero;
    }

    static int generarNumeroEnRango(int limInf, int limSup) {
        return limInf + generarNumero(limSup-limInf);
    }

    static int generarNumero(int limite) {
        return (int) Math.round( (limite * Math.random()) );
    }

    static boolean esNumeroValido(int numero) {
        boolean salida = false;
        int m, c, d, u;

        if (numero >= 1000) {
            m = numero / 1000;
            numero = numero - (m * 1000);
            c = numero / 100;
            numero = numero - (c * 100);
            d = numero / 10;
            u = numero - (d * 10);
            salida = m != c & m != d && m != u && c != d && c != u && d != u;
        }

        return salida;
    }
}
