import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.controller.Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelTest {

    private Model model;
    private Controller controller;
    @Test
    public void crearCocheReturnTrue(){
        Assertions.assertNotNull(Model.crearCoche("matricula", "modelo", 20));
    }

    @Test
    public void getCocheAssertSameReturnTrue(){
        Coche coche = Model.crearCoche("modelo", "matricula", 20);
        Model.parking.add(coche);
        assertEquals(Model.getCoche("matricula"), coche);
    }

    @Test
    public void cambiarVelocidadComprobarCambioReturnTrue(){
        Coche coche = Model.crearCoche("modelo", "matricula", 20);
        Integer velocidad = 40;
        Model.parking.add(coche);
        Model.cambiarVelocidad("matricula", velocidad);
        assertEquals(velocidad, coche.getVelocidad());

    }

    @Test
    public void cambiarVelocidadComprobarCambioReturnFalse(){
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        controller.crearCoche("ModeloTest","MatriculaTest",120);
        controller.cambiarVelocidad("MatriculaTest",350);
        Coche coche = Model.getCoche("MatriculaTest");
        assertEquals(350, coche.getVelocidad());

        String salidaTest = "Se ha cambiado  la velocidad 350km/h\n"+"MatriculaTest: 350km/h\n"+"Infraccion\n";
        assertEquals(salidaTest, salida.toString());
    }
}
