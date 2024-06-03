package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

public class Controller{

    /**
     * Atributo miModel de la clase Model
     */
    Model miModel = Model.getInstance();

    /**
     * Constructor de la clase Controller
     * @param miModel de la clase Model
     */
    public Controller(Model miModel){
        this.miModel = miModel;

        /**
         * Añadimos los observadores
         */
        ObserverVelocidad obsVelocidad = new ObserverVelocidad(miModel);
        miModel.addObserver(obsVelocidad);

        /**
         * Añadimos los observadores
         */
        ObserverLimite observoLimite = new ObserverLimite(miModel);
        miModel.addObserver(observoLimite);

        ObserverSubirV observerSubirVelocidad= new ObserverSubirV(miModel);
        miModel.addObserver(observerSubirVelocidad);


    }

    /**
     * Crea un coche
     * @param modelo del coche
     * @param matricula del coche
     */
    public void crearCoche(String modelo, String matricula, Integer velocidad){
        miModel.crearCoche(modelo, matricula, velocidad);
    }

    /**
     * Busca un coche y nos muestra sus datos
     * @param matricula del coche
     */
    public void buscarCoche(String matricula){
        miModel.getDatosCoche(matricula);
    }

    /**
     * Sube la velocidad de un coche
     * @param matricula del coche
     * @param velocidad a subir
     */
    public void subirVelocidad(String matricula, Integer velocidad){
        miModel.subirVelocidad(matricula, velocidad);
    }

    /**
     * Baja la velocidad de un coche
     * @param matricula del coche
     * @param velocidad que va a ser reducir
     */
    public void bajarVelocidad(String matricula,Integer velocidad){
        miModel.bajarVelocidad(matricula,velocidad);
    }
}