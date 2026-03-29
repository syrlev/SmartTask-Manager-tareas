package smarttask;

public interface Accionable {
    void agregarTarea(Tarea tarea);
    void listarTareas();
    void marcarTareaComoCompletada(int id);
    void eliminarTarea(int id);
}