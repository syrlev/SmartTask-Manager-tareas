package smarttask;

import java.util.ArrayList;

public class GestorTareas {
    
    
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
        System.out.println("No se encontró ninguna tarea con el ID: " + id);
    }
    }