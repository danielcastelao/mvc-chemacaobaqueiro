package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.view.View;

public class ObserverVelocidad implements Observer {
    /**
     * Este método es llamado siempre que hay un cambio
     * El observable cuando hace el notifyObservers
     * 'dispara' todos los update de los Observers
     *
     * @param arg el argumento pasado por el observable, el coche actualizado
     */
    @Override
    public void update(Coche arg) {
        System.out.println("[ObserverVelocidad] Se ha cambiado la velocidad: " + arg.velocidad.toString() + "km/hr");
        View.muestraVelocidad(arg.matricula, arg.velocidad);

    }
}
