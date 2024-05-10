package cod.mvc;

public class Controller {

    public static void controladorCoches(){

        Model.crearCoche("zl1", "0765-VGF", 250);
        Coche miCoche = Model.getCoche("0765-VGF");


        System.out.println(View.muestraVelocidad(miCoche.getMatricula(), miCoche.getVelocidad()));

    }
}