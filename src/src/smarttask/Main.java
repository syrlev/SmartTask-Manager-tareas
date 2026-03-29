package smarttask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in, "UTF-8");
        GestorTareas gestor = new GestorTareas();
        int opcion = 0;
        int contadorId = 1;

        while (opcion != 4) {
            System.out.println("\n1. Agregar Tarea");
            System.out.println("2. Listar Tareas");
            System.out.println("3. Marcar como Completada");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.print("¿Es urgente? (s/n): ");
                    String tipo = teclado.nextLine();

                    if (tipo.equalsIgnoreCase("s")) {
                        gestor.agregarTarea(new TareaUrgente(contadorId++, nombre, 5));
                    } else {
                        gestor.agregarTarea(new TareaNormal(contadorId++, nombre, 1));
                    }
                    break;

                case 2:
                    gestor.listarTareas();
                    break;

                case 3:
                    System.out.print("ID de la tarea: ");
                    int id = teclado.nextInt();
                    gestor.marcarTareaComoCompletada(id);
                    break;

                case 4:
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        }
        teclado.close();
    }
}