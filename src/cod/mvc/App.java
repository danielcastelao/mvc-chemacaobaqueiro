package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.model.Model;

public class App {
    public static void main(String[] args) {

        Model model = Model.getInstance();

        Controller controller = new Controller(model);

        controller.crearCoche("Camaro ZL1","MJK 6976",200);
        controller.crearCoche("Panamera","PWU 3105",170);
        controller.crearCoche("Huracan","JTA 4310",250);


        controller.subirVelocidad("PWU 3105",15);


    }
}
