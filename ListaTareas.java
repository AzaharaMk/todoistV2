
//importa el arraylist
import java.util.ArrayList;

public class ListaTareas
{
    //ArrayList de objetos de la clase tarea
    private ArrayList <Tarea> listaDeTareas;
    
    public ListaTareas()
    {
       /*
        * se crea un elemento vacío en el ArrayList que permite guardar objetos
        * de la clase Tarea.
        */
        listaDeTareas = new ArrayList<Tarea>();
    }
   
    /**
     * Añade una nueva tarea a la lista de tareas
     */
    
    public void crearTarea (String descripcionTarea)
    {
       Tarea nuevaTarea = new Tarea(descripcionTarea);
       listaDeTareas.add(nuevaTarea);
    }
    
    /**
     * Ver todas las tareas numeradas (empezando en 1) pudiendo ver si estan
     * completadas o no
     */
    
    public void mostrarTareas()
    {
        int  posicion = 1;
        for (Tarea tarea: listaDeTareas)
        {
            System.out.println(posicion + " . " +tarea.toString());
            posicion++;
        }
    }
    
    /**
     * Marcar como completada una tarea indicando su numero 
     * (teniendo en cuenta que la numeración de las tareas empieza en 1)
     */
    
    public void marcarCompletada(int posicionTarea)
    {
        int posicionReal = posicionTarea - 1;
        //comprobamos que posicionReal sea un indice valido del arraylist
        if (posicionReal >= 0 && posicionReal < listaDeTareas.size())
        {
            listaDeTareas.get(posicionReal).completarTarea();
        }

    }
    
    /**
     * Mostrar todas las tareas cuyo nombre contenga un determinado texto
     * indicando si estan completadas o no
     */
    
    public void textoCoincidente(String textoABuscar)
    {
        int posicion = 0;
        while(posicion < listaDeTareas.size())
        {
            Tarea tareaActual= listaDeTareas.get(posicion);
            if (tareaActual.getDescripcion().contains(textoABuscar))
            {
                String estaTerminada = "";
            if (tareaActual.getValidarTarea())
            {
                textoABuscar =" HECHA " ;
            }
            System.out.println((posicion + 1) +". " +tareaActual.getDescripcion());
            }
            posicion++;
        }
        
    }
  
    /**
     * Elimina la tarea con la posicion que se pasa por parámetros
     */
     public void eliminarTarea(int posicion)
     {
         int posicionReal = posicion -1;
         if (posicionReal >= 0 && posicionReal < listaDeTareas.size())
         {
              listaDeTareas.remove(posicionReal);
         }
     }
     
     /**
      * muestra la prioridad de las tareas del 0 al 5 siendo 0 prioridad baja
      * y 5 prioridad alta.
      */
     public void establecerNuevaPrioridad(int numeroTarea,int numeroPrioridad)
     {
         int posicionReal = numeroTarea - 1;
         if (posicionReal >= 0 && posicionReal < listaDeTareas.size())
         {
             listaDeTareas.get(posicionReal);
             if (numeroPrioridad >= 0 && numeroPrioridad <= 5)
             {
                 listaDeTareas.get(posicionReal).cambiarPrioridad(numeroPrioridad);
             }
         }  
     }          
}
