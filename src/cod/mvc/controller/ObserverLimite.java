package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObserverLimite implements Observer {

    final static int LIMITE = 200;

    private final Model miModel;

    /**
     * Constructor
     * @param miModel el modelo para poder hacer cambios
     */
    public ObserverLimite(Model miModel) {
        this.miModel = miModel;
    }

    /**
     * Método update para avisar a los observers
     * @param coche el argumento que le pasemos
     */
    @Override
    public void update(Coche coche) {
        /**
         * Si la velocidad del coche es mayor que el límite
         */
        if (coche.getVelocidad() > LIMITE) {

            /**
             * Cambiamos la velocidad del coche
             */
            miModel.cambiarVelocidad(coche.getMatricula(), coche.getVelocidad() - 10);
            /**
             * Mostramos un mensaje
             */
            System.out.println("(ObserverLimite) Supera velocidad limite, se reducirá la velocidad a : "+(coche.getVelocidad()-10)+"km/h");
        }
    }
}