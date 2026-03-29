package smarttask;

public class TareaUrgente extends Tarea {

    public TareaUrgente(int id, String nombre, int prioridad) {
        super(id, nombre, prioridad);
    }

    @Override
    public void mostrarDetalles() {
        
        System.out.println("!!! URGENTE !!! " + nombre.toUpperCase());
    }
}