package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

public class Controller {

    private final Model miModel;
    /**
     * Nueva clase controller para crear un nuevo coche y mostrarlo por pantalla
     */
    public static void controladorCoches(){

        Model.crearCoche("zl1", "0765-VGF", 250);
        Coche miCoche = Model.getCoche("0765-VGF");


        System.out.println(View.muestraVelocidad(miCoche.getMatricula(), miCoche.getVelocidad()));

    }
    public Controller(Model miModel) {
        this.miModel = miModel;

        ObservableVelocidad obsVel = new ObservableVelocidad();
        miModel.addObserver(obsVel);

        ObserverLimite obsLim = new ObserverLimite();
        miModel.addObserver(obsLim);
    }

    public void crearCoche(String modelo, String matricula, int velocidad) {
        miModel.crearCoche(matricula,modelo,velocidad);
    }

    public void cambiarVelocidad(String matricula, Integer velocidad) {

        miModel.cambiarVelocidad(matricula,velocidad);
    }

}