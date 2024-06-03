package cod.mvc.controller;
import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

public class ObserverVelocidad implements Observer {
    Model model = Model.getInstance();

    public ObserverVelocidad(Model model) {
        this.model = model;
    }

    /**
     * Método update para avisar a los observers
     * @param arg el argumento que le pasemos
     */
    @Override
    public void update(Coche arg) {
        View.muestraVelocidad(arg.getMatricula(),arg.getVelocidad());
    }
}