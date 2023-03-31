import java.io.*;
public class AndresQuirosPicado_Tarea2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    public static void main(String[] args) throws Exception {
        
        int CantPuntos;
        System.out.println("Antes de renovar su licencia verifique que cumpla con todos los requisitos presentados a continuacion");
        System.out.println("REQUISITOS PARA LA RENOVACION DE LA LICENCIA - COSEVI");
        System.out.println("1) Tener documento de identificacion al dia y en buen estado.");
        System.out.println("2) Tener vigente el dictamen medico digital.");
        System.out.println("3) Pagar todas las multas de transito que usted tenga pendiente.");
        System.out.println("4) No haber llegado a los 12 puntos o más por infracciones de tránsito.");
        
        System.out.println("Digite la cantidad de puntos en su licencia de conducir : ");
        CantPuntos=Integer.parseInt(in.readLine());
        
       
         if (CantPuntos >= 12) {
            System.out.println(
                    "Su cantidad de puntos en su licencia es de " + CantPuntos + " por lo tanto no se puede renovar");
            System.out.println("Ya que su puntaje es " + CantPuntos
                    + " y es mayor o igual a 12 se la va suspender su licencia de conducir");
        } else if (CantPuntos <= 4) {

            System.out.println("Su cantidad de puntos en su licencia es de " + CantPuntos);
            System.out.println("Tiene que pagar un monto de 5000 colones y tiene una vigencia de 6 años");
            System.out.println("Desea renovar su licencia por medio del BCR ?");
            int opc;
            
            System.out.println("Digite una opcion 1) Si 2)No");
            opc=Integer.parseInt(in.readLine());
            switch (opc) {
                case 1:
                    int precioFinal;
                    precioFinal = 5000 + 4200;
                    System.out.println("El precio final de la licencia con recargo del BCR es de " + precioFinal);
                    break;
                case 2:
                    System.out.println("Su renovacion tiene un costo de 5000 colones");
                    break;
                default:
                    break;
            }

        } else if (CantPuntos >= 5 && CantPuntos <= 8) {
            System.out.println("Su cantidad de puntos en su licencia es de " + CantPuntos);
            System.out.println("Tiene que pagar un monto de 10000 colones y tiene una vigencia de 4 años");
            System.out.println("Desea renovar su licencia por medio del BCR ?  ");
            int opt;
          
            System.out.println("Digite una opcion 1) Si 2)No");
            opt=Integer.parseInt(in.readLine());

            switch (opt) {
                case 1:
                    int precioFinal;
                    precioFinal = 10000 + 4200;
                    System.out.println("El precio final de la licencia con recargo del BCR es de " + precioFinal);
                    break;
                case 2:
                    System.out.println("Su renovacion tiene un costo de 10000 colones");
                    break;

                default:
                    break;
            }

        } else if (CantPuntos >= 9 && CantPuntos <= 11) {
            System.out.println("Su cantidad de puntos en su licencia es de " + CantPuntos);
            System.out.println("Tiene que pagar un monto de 10000 colones y tiene una vigencia de 3 años");
            System.out.println("Desea renovar su licencia por medio del BCR ?");
            int option;
            
            System.out.println("Digite una opcion 1) Si 2)No");
            option=Integer.parseInt(in.readLine());

            switch (option) {
                case 1:
                    int precioFinal;
                    precioFinal = 10000 + 4200;
                    System.out.println("El precio final de la licencia con recargo del BCR es de " + precioFinal);
                    break;
                case 2:
                    System.out.println("Su renovacion tiene un costo de 10000 colones");
                    break;

                default:
                    break;
            }

        }

    }

}
