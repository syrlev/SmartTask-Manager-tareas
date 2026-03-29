package smarttask;

public class TareaNormal extends Tarea {

    public TareaNormal(int id, String nombre, int prioridad) {
        super(id, nombre, prioridad);
    }

    @Override
    public void mostrarDetalles() {
     
        System.out.println("Normal: " + id + " - " + nombre);
    }
}
