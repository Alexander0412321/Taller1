
package umariana.taller1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import mundo.Tarea;

/** 
 *
 * @author Lopez
 */
public class Taller1 {


    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        ArrayList<Tarea> misTareas = new ArrayList<>();
        boolean activo = true;
        do{
            System.out.println("Menu de opciones");
            System.out.println("1.Agregar tarea");
            System.out.println("2.Mostrar tares");
            System.out.println("3.Ordenar tareas");
            System.out.println("4.Terminar programa");
            System.out.println("Seleccione una opcion");
            int opcion = lector.nextInt();
            switch(opcion){
                //agregrar tareas 
                case 1:
                    System.out.println("Ingrese el id de la tarea");
                    int id=lector.nextInt();
                    lector.nextLine();
                    
                    System.out.println("Ingrese la descripcion de la tarea");
                    String descripcion = lector.nextLine();
                    
                    System.out.println("Ingrese la prioridad de 1-5");
                    int prioridad = lector.nextInt();
                    
                   //Creacion del objeto y llenar la informacion 
                   Tarea nuevaTarea = new Tarea(id,descripcion,prioridad); 
                   //Almacenar el objeto en la contenedora
                   misTareas.add(nuevaTarea);
                   System.out.println("Tarea agregada satisfactoriamente ");
                   
                    break;
                    // mostrar tareas registradas
                case 2:
                    System.out.println("TAREAS REGISTRADAS");
                    
                    for (Tarea t: misTareas) {
                        System.out.println("id: " + "" + t.getIdTarea() );
                        System.out.println("descripcion: " + "" + t.getDescripcion());
                        System.out.println("prioridad: " + "" + t.getPrioridad());
                    }
                    break;
                    
                    //ordernar descendente 
                case 3:
                    // ordenar las tareas por prioridad de forma descendente
                      Collections.sort(misTareas, (tarea1, tarea2) -> tarea2.getPrioridad() - tarea1.getPrioridad());
                    // mostrar las tareas ordenadas por prioridad de forma descendente
                     System.out.println("Tareas ordenadas por prioridad de forma descendente:");
                     for (Tarea a : misTareas) {
                      System.out.println("id: " + a.getIdTarea()+"descripcion:" + a.getDescripcion() +"prioridad: " + a.getPrioridad());
                     
                     
                     }
             break;

                case 4:
                    //cerrar el programa
                    activo = false; System.out.println("Cerrando Programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }
            
        }while(activo);
    }

    
}
