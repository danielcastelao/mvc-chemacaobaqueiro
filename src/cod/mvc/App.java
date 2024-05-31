package cod.mvc;

import cod.mvc.controller.BuscarCoche;
import cod.mvc.controller.Controller;
import cod.mvc.model.Model;

/**
 * Clase principal
 */
public class App {

    public static void main(String[] args) {

        Model miModel = new Model();

        Controller miController = new Controller(miModel);

        BuscarCoche buscador = new BuscarCoche();


        miController.crearCoche("Huracan", "YIO 9875");
        miController.crearCoche("Camaro ZL1", "XGF 6548");
        miController.crearCoche("GTR", "LKN 4348");

        miController.cambiarVelocidad("YIO 9875", 30);


        miController.cambiarVelocidad("XGF 6548", 150);

        /**
         * Prueba para comprobar si funciona el buscador de coches
         */
        buscador.buscarCoche("YIO 9875");

    }
}
