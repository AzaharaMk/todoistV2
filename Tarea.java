//importa la clase LocalDate
import java.time.LocalDate;

public class Tarea
{
    // Descripción de la tarea
    private String descripcion;
    //Muestra si la tarea está completada o no
    private boolean tareaCompletada;
    //prioridad de la tarea. Por defecto es 0
    private int prioridad;
    //guarda la fecha de vencicimient
    private LocalDate fechaVencimiento;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String descripcionTarea)
    {
        //Añade la descripción de la tarea
       descripcion = descripcionTarea;
       tareaCompletada = false;
       //Por defecto, las tareas tienen prioridad 0
       prioridad = 0;
       //Las nuevas tareas no tienen fecha de vencimiento
       fechaVencimiento = null;
    }
    
    /**
     * Devuelve el valor de la descripcion
     */
    public String getDescripcion()
    {
        return descripcion;
    }
    
    /**
     * Devuelve el valor de la variable tarea
     */
    public boolean getValidarTarea()
    {
        return tareaCompletada;
    }
    
    /**
     * cambia el valor del atributo tareaCompletada
     */
    public void completarTarea()
    {
        tareaCompletada = true;
    }
    
    /**
     * metodo toString que devuelve un String.
     * Sirve para que la clase tarea devuelva textualmente 
     * todos los meteodos de la tarea
     */
    public String toString()
    {
        String textoADevolver = "";
        if (tareaCompletada)
        {
            textoADevolver += "HECHA ";
        }
        textoADevolver += descripcion + " (" +prioridad+ ").";
        return textoADevolver;
    } 
    
    /**
     * Cambia la prioridad por parámetros.
     */
    public void cambiarPrioridad(int nuevaPrioridad)
    {
        if (nuevaPrioridad >=0 && nuevaPrioridad <=5)
        {
            prioridad = nuevaPrioridad;
        }
    }
    
    /**
     * La fecha de vencimiento indica el día en el que
     * la tarea debe estar hecha.
     */
    
    public void cambiarFechaVencimiento ( int dia, int mes, int anio)
    {
            fechaVencimiento = LocalDate.of(dia, mes, anio);
    }
}
