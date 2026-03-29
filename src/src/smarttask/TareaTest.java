package smarttask;

import static org.junit.Assert.*;
import org.junit.Test;

public class TareaTest {

    @Test
    public void testMarcarComoCompletada() {
        
        TareaNormal tarea = new TareaNormal(1, "Prueba", 1);
      
        tarea.marcarComoCompletada();
       
        assertTrue(tarea.isCompletada()); 
    }
}