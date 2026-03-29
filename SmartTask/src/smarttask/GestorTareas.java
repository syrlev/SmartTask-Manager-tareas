package smarttask;

import java.util.ArrayList;

public class GestorTareas implements Accionable {
    
    private final String SIGNATURE = "M4-2026";
    private ArrayList<Tarea> listaDeTareas;

    public GestorTareas() {
        this.listaDeTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        listaDeTareas.add(tarea);
    }

    public void listarTareas() {
        for (Tarea t : listaDeTareas) {
            t.mostrarDetalles();
        }
    }

    public void marcarTareaComoCompletada(int id) {
        for (Tarea t : listaDeTareas) {
            if (t.getId() == id) {
                t.marcarComoCompletada();
                System.out.println("Tarea " + id + " marcada como completada.");
                return;
            }
        }
        System.out.println("No se encontró el ID: " + id);
    }

    public void eliminarTarea(int id) {
        boolean eliminado = listaDeTareas.removeIf(t -> t.getId() == id);
        if (eliminado) {
            System.out.println("Tarea " + id + " eliminada correctamente.");
        } else {
            System.out.println("No se encontró el ID para eliminar.");
        }
    }
}