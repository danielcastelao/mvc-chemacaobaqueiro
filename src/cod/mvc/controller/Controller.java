package cod.mvc.controller;


import cod.mvc.model.Model;


public class Controller {

    private final Model miModel;

    public Controller(Model miModel) {
        this.miModel = miModel;

        ObservableVelocidad obsVel = new ObservableVelocidad();
        miModel.addObserver(obsVel);

        ObserverLimite obsLim = new ObserverLimite();
        miModel.addObserver(obsLim);
    }

    public void crearCoche(String modelo, String matricula) {
        miModel.crearCoche(matricula,modelo);
    }

    public void cambiarVelocidad(String matricula, Integer velocidad) {

        miModel.cambiarVelocidad(matricula,velocidad);
    }

}