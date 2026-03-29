package smarttask;

public abstract class Tarea implements Accionable {
	
    protected int id;
    protected String nombre;
    protected int prioridad;
    protected boolean completada;

    public Tarea(int id, String nombre, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public boolean isCompletada() { return completada; }
}
