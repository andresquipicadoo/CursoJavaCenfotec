import java.io.*;
import java.util.Scanner;


public class AndresQuirosPicado_Tarea4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;      
    public static void main(String[] args) throws Exception {
        int opciones;
        boolean salir=false;
        while(!salir){
            System.out.println("Menu de Opciones");
            System.out.println("1) Calcular el mes con más consumo");
            System.out.println("2) Calcular la eco-factura del mes");
            System.out.println("3) Salir");
            System.out.println("Ingrese una opcion valida ");
            opciones= Integer.parseInt(in.readLine());
            double montoEnergia=0;
            double montoBomberos=0;   
            double montoAlumbrado=0;
            double montoIVA=0;
            switch (opciones) {
              
                case 1:
                    
                    int consumo[]=new int[6];
                   
                    int y=0;
                  
                    String [] meses =new String [6];
                    int mayorConsumo=0;
                    int mayorMes=0;
                    
                 
                    for (y=0;y<5;y++){
                        
                        System.out.println("Digite el mes");
                        Scanner m =new Scanner(System.in);
                        meses[y]=m.nextLine();
                        
                        out.print("Por favor escriba el consumo por mes "+ (y+1) +" :");
                        consumo[y]=Integer.parseInt(in.readLine());      
                          
                    }
                    mayorConsumo=consumo[0];
                    for(y=1;y<6;y++){
                      if(consumo[y]>mayorConsumo){
                           
                           mayorConsumo=consumo[y];
                           mayorMes=y;
                          

                      }
                  
                      
                 
                 
                    }
                    System.out.println("El mes con mayor consumo de kilowatts es : " +meses[mayorMes]);
                    
                     
           
                  
                  break;
                      
                case 2:
                  int options;
                  boolean exit =false;
                  while (!exit){
                    System.out.println("Calculo de la Ecofactura");
                    System.out.println("1) Calcular monto de energia");
                    System.out.println("2) Calcular el monto de alumbrado publico");
                    System.out.println("3) Calcular el monto de tributo de bomberos");
                    System.out.println("4) Calcular el monto IVA");
                    System.out.println("5) Calcular la ecofactura");
                    System.out.println("6) Salir"); 

                    System.out.println("Ingrese una opcion valida ");
                    options= Integer.parseInt(in.readLine());
                    switch (options) {
                      case 1:
                        int totConsHorarioPunta;
                        int totConsHorariovalle; 
                        int totConsHorarioNoche;
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario punta");
                        totConsHorarioPunta= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario valle");
                        totConsHorariovalle= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario nocturno");
                        totConsHorarioNoche= Integer.parseInt(in.readLine());
                        
                        if ((totConsHorarioPunta >0 && totConsHorarioPunta<=500) &&( totConsHorariovalle >0 && totConsHorariovalle <=500) && ( totConsHorarioNoche >0 && totConsHorarioNoche<=500)) {
                            double punta;
                            double valle;
                            double noche;
                          
                            punta=totConsHorarioPunta*167.25; 
                            valle=totConsHorariovalle*68.75;
                            noche=totConsHorarioNoche*28.77;
                            montoEnergia=(int)punta+(int)valle+(int)noche;
                            System.out.println("El monto total de energia es de : "+(int)montoEnergia);  
                             
                        }
                        else if ((totConsHorarioPunta >500) &&( totConsHorariovalle >500) && ( totConsHorarioNoche >500)) {
                          double punta;
                          double valle;
                          double noche;
                         
                          punta=totConsHorarioPunta*207.39; 
                          valle=totConsHorariovalle*83.71;
                          noche=totConsHorarioNoche*38.74;
                          montoEnergia=(int)punta+(int)valle+(int)noche;
                          System.out.println("El monto total de energia es de : "+(int)montoEnergia);
                        
                      }
                      
                      
                        break;
                      case 2:
                        int totPunta;
                        int totvalle; 
                        int totNoche;
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario punta");
                        totPunta= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario valle");
                        totvalle= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario nocturno");
                        totNoche= Integer.parseInt(in.readLine());
                        int sumaTotalKL;
                        sumaTotalKL=totPunta+totvalle+totNoche;
                        
                        montoAlumbrado=sumaTotalKL*3.37;
                        System.out.println("El monto de alumbrado publico es de : "+ (int)montoAlumbrado);
                        break;
                      case 3:
                        int totPuntas;
                        int totvalles; 
                        int totNoches;
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario punta");
                        totPuntas= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario valle");
                        totvalles= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario nocturno");
                        totNoches= Integer.parseInt(in.readLine());
                        int sumaTotal;
                        sumaTotal=totPuntas+totvalles+totNoches;
                        
                        montoBomberos=sumaTotal*1.75;
                        System.out.println("El monto de bomberos es de : "+(int)montoBomberos);
                        
                       break;

                      case 4:
                      
                        int totPuntass;
                        int totvalless; 
                        int totNochess;
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario punta");
                        totPuntass= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario valle");
                        totvalless= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario nocturno");
                        totNochess= Integer.parseInt(in.readLine());
                        int totalKilowatts;
                        totalKilowatts=totPuntass+totvalless+totNochess;
                      
                        if (totalKilowatts >=280){

                          
                          montoIVA=montoEnergia*0.13;
                          System.out.println("El monto IVA es de :"+(int)montoIVA);
 
                           


                        }
                      
                       

                       
                       break;
                      case 5:
                        String nombreMes;
                        System.out.println("Digite el mes");
                        Scanner m =new Scanner(System.in);
                        nombreMes=m.nextLine();
                       
                        int totP;
                        int totv; 
                        int totN;
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario punta");
                        totP= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario valle");
                        totv= Integer.parseInt(in.readLine());
                        System.out.println("Digite el consumo total de kilowatts consumidos en el horario nocturno");
                        totN= Integer.parseInt(in.readLine());
                        int totalKilo;
                        totalKilo=totP+totv+totN;
                        
                        



                        System.out.println("ECO- Factura");

                        System.out.println("Mes consultado : "+ nombreMes);
                        System.out.println("Total de kilowatts en mes : " +totalKilo);
                        System.out.println("Monto de Energia :"+(int) montoEnergia);    
                        System.out.println("Monto de Alumbrado Publico : " +(int)montoAlumbrado);    
                        System.out.println("Monto de tributo de bomberos : " +(int)montoBomberos);    
                        System.out.println("Monto de IVA : " +(int)montoIVA); 
                        double montoTotal;
                        montoTotal=(int)montoEnergia+(int)montoAlumbrado+(int)montoBomberos+(int)montoIVA;
                        System.out.println("El monto total es de : "+ montoTotal);

                        
                      



                        
                       break;
                      case 6:
                       exit=true;
                       break;


                      default:
                        break;
                    }





                  }

                  break;
                
                case  3:

                  salir=true;
                  break;

                default:
                     
                  System.out.println("Digite una opcion valida");
                break;
            }



        }

      


    }

}
