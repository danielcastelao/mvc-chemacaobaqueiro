import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelTest {
    @Test
    public void crearCocheReturnTrue(){
        Assertions.assertNotNull(Model.crearCoche("matricula", "modelo", 20));
    }

    @Test
    public void getCocheAssertSameReturnTrue(){
        Coche coche = Model.crearCoche("modelo", "matricula", 20);
        Model.parking.add(coche);
        Assertions.assertEquals(Model.getCoche("matricula"), coche);
    }

    @Test
    public void cambiarVelocidadComprobarCambioReturnTrue(){
        Coche coche = Model.crearCoche("modelo", "matricula", 20);
        Integer velocidad = 40;
        Model.parking.add(coche);
        Model.cambiarVelocidad("matricula", velocidad);
        Assertions.assertEquals(velocidad, coche.getVelocidad());

    }

}
