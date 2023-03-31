package Tarea3;
import java.io.*;


public class tarea3 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {
        int cantEstudiantes;
        int NivelEstudiante;
        int setimo=0;
        int octavo=0;
        int noveno=0;
        int decimo=0;
        int undecimo=0;
        int totalEstudiantes=0;
        int estudiantesBecados=0;
        int estudiantesnoBecados=0;
        int eqDeportivos;
        int baloncesto=0;
        int natacion=0;
        int ajedrez=0;
        int ninguno=0;
        int becaAcademica=50000;
        int becaDeportiva=80000;
        int becEstudiantes;
        
        float porcentajeBecados;
        float porcentajeNOBecados;
       
        int anualesAcademicas;
        int anualesDeportivas;
        System.out.println("Digite la cantidad de estudiantes");
        cantEstudiantes=Integer.parseInt(in.readLine());
        
        for (int n = 0; n<=70 ; n++){
           
           while(n<cantEstudiantes){
               
              
                System.out.println("Ingrese su nivel ");
                System.out.println("1) Setimo");
                System.out.println("2) Octavo");
                System.out.println("3) Noveno");
                System.out.println("4) Decimo");
                System.out.println("5) Undecimo");
               
                NivelEstudiante=Integer.parseInt(in.readLine());
                cantEstudiantes=cantEstudiantes-1;
                if (NivelEstudiante == 1){
                    setimo += 1;
                    totalEstudiantes += 1;
                    
                }
                else if(NivelEstudiante==2){
                    octavo+=1;
                    totalEstudiantes+=1;
                }
                else if(NivelEstudiante==3){
                    noveno+=1;
                    totalEstudiantes+=1;
                }
                else if(NivelEstudiante==4){
                    decimo+=1;
                    totalEstudiantes+=1;
                }
                else if(NivelEstudiante==5){
                    undecimo+=1;
                    totalEstudiantes+=1;
                }
                System.out.println("Ingrese a cual equipo quiere pertenecer");
                System.out.println("1) Baloncesto");
                System.out.println("2) Natacion");
                System.out.println("3) Ajedrez");
                System.out.println("4) Ningun equipo deportivo");
                eqDeportivos=Integer.parseInt(in.readLine());
                switch (eqDeportivos) {
                    case 1:
                        baloncesto+=1;
                        break;
                    
                    case 2:
                       natacion+=1;
                       break;
                    case 3:
                       ajedrez+=1;
                       break;
                    case 4:
                       ninguno+=1;
                       break;
                    default:
                        break;
                }  
                
                System.out.println("Digite el tipo de beca que posee el estudiante");
                System.out.println("1) Beca Academica");
                System.out.println("2) Beca deportiva");
                System.out.println("3) Ningun tipo de beca");
               
                becEstudiantes=Integer.parseInt(in.readLine());
                switch (becEstudiantes){
                    case  1:
                        becEstudiantes=becaAcademica;
                        
                        estudiantesBecados+=1;
                        break;
                    case 2:
                       becEstudiantes=becaDeportiva;
                       
                       estudiantesBecados+=1;
                       break;
                    case 3:
                       becEstudiantes=0;
                       estudiantesnoBecados+=1;
                    default:
                        break;
                }
             
            } 
           
            
        }
    
           porcentajeBecados=estudiantesBecados*100/totalEstudiantes;
           porcentajeNOBecados=estudiantesnoBecados*100/totalEstudiantes;
           anualesAcademicas=50000*11;
           anualesDeportivas=80000*11;

           System.out.println("La cantidad total de estudiantes en setimo es de : "+setimo);
           System.out.println("La cantidad total de estudiantes en octavo es de : "+octavo);
           System.out.println("La cantidad total de estudiantes en noveno es de : "+noveno);
           System.out.println("La cantidad total de estudiantes en decimo es de : "+decimo);
           System.out.println("La cantidad total de estudiantes en undecimo es de : "+undecimo);

           System.out.println("-------------------------------------------------------------------------");

           System.out.println("La cantidad total de estudiantes en Baloncesto es de : "+baloncesto);
           System.out.println("La cantidad total de estudiantes en Natacion es de : "+natacion);
           System.out.println("La cantidad total de estudiantes en Ajedrez es de :"+ajedrez);
           System.out.println("La cantidad total de estudiantes en ninguna actividad es de :"+ninguno);

           System.out.println("-------------------------------------------------------------------------");

           System.out.println("El porcentaje total de estudiantes  becados es de : "+porcentajeBecados+"%");
           System.out.println("El porcentaje total de estudiantes no becados es de : "+porcentajeNOBecados+"%");

           System.out.println("-------------------------------------------------------------------------");

           System.out.println("El monto mensual  de becas deportivas es de 80000: ");
           System.out.println("El monto mensual  mensual de becas academicas 50000 ");

           System.out.println("-------------------------------------------------------------------------");

           
           System.out.println("El monto anual de becas academicas: "+anualesAcademicas);
           System.out.println("El monto anual de becas academicas: "+anualesDeportivas);









           
        
            


        }
    }
         

        
       
        
        
        
    
    
