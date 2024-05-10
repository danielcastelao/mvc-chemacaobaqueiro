import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ModelTest {
    @Test
    public void crearCocheReturnTrue(){
        Assertions.assertNotNull(Model.crearCoche("matricula", "modelo", 20));
    }

    @Test
    public void getCocheAssertSameReturnTrue(){
        ArrayList<Coche> coche = Model.crearCoche("modelo", "matricula", 20);
        Model.parking.add(coche.get(0));
        Assertions.assertEquals(Model.getCoche("matricula"), coche);
    }

    @Test
    public void cambiarVelocidadComprobarCambioReturnTrue(){
        ArrayList<Coche> coche = Model.crearCoche("modelo", "matricula", 20);
        Integer velocidad = 40;
        Model.parking.add(coche.get(0));
        Model.cambiarVelocidad("matricula", velocidad);
        Assertions.assertEquals(velocidad, Model.getVelocidad("matricula"));

    }

}
