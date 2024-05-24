package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.model.Model;

public class App {
    public static void main(String[] args) {

        Model model = new Model();

        Controller controller = new Controller(model);

        controller.crearCoche("Camaro ZL1","MJK 6976");
        controller.crearCoche("Panamera","PWU 3105");
        controller.crearCoche("Huracan","JTA 4310");

        controller.cambiarVelocidad("JTA 4310",150);


        controller.cambiarVelocidad("MJK 6976",300);
    }
}
