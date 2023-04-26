public class S12Tarea05 {

    public static void main(String[] args) {
        
        int[] barcosUsuario = inicializarBarcosUsuario();
        Utils.limpiar();
        imprimirValores(barcosUsuario);
        int[] barcosCompu = inicializarBarcosComputadora();
        imprimirValores(barcosCompu);

    }

    static int[] inicializarBarcosComputadora() {
        int[] arreglo = new int[20];
        int control = 1, indice;
        while (control <= 5) {
            indice = generarNumeroEnRango(0, arreglo.length-1);
            if (arreglo[indice] == 0) {
                arreglo[indice] = control;
                control++;

                //arreglo[indice] = control++;
            }
        }
        return arreglo;
    }

    static int[] inicializarBarcosUsuario() {
        int[] arreglo = new int[20];
        int control = 1, indice;
        while (control <= 5) {
            indice = Utils.leerRangosEnteros("Digite la posición del barco: ", 1, 20);
            indice--;
            if (arreglo[indice] == 0) {
                arreglo[indice] = control;
                control++;
                System.out.println("Posición válida");
            } else {
                System.out.println("Posición inválida, por favor intente en otra posición");
            }
        }
        return arreglo;
    }

    static void imprimirValores(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%2d ",a[i]);
        }
        System.out.println();
    }

    static int generarNumeroEnRango(int limInf, int limSup) {
        return limInf + generarNumero(limSup-limInf);
    }

    static int generarNumero(int limite) {
        return (int) Math.round( (limite * Math.random()) );
    }
}
