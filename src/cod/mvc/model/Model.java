package cod.mvc.model;

import java.util.ArrayList;
import cod.mvc.controller.Observer;

public class Model implements Observable{


    public static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Metodo en el que se crea un coche
     * @param newModelo modelo del coche
     * @param newMatricula identificador del coche
     * @param newVelocidad velocidad del coche
     * @return array con los coches
     */

    public static Coche crearCoche(String newModelo, String newMatricula, Integer newVelocidad) {

        Coche newCoche = new Coche(newModelo, newMatricula, newVelocidad);
        return newCoche;
    }

    /**
     * Metodo para sacar el coche creado anteriormente
     * @param matricula identificador del coche
     * @return devuelve el coche asociado a la mátricula introducida
     */

    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }

        return null;
    }

    /**
     * Metodo en el cual se puede cambiar la velocidad de un coche
     *
     * @param matricula identificador del coche
     * @param velocidad velocidad a la que la quieres cambiar
     * @return devuelve la velocidad
     */

    public static boolean cambiarVelocidad(String matricula, Integer velocidad) {
        Coche coche = getCoche(matricula);
        coche.setVelocidad(velocidad);
        return true;
    }

    /**
     * Metodo para sacar la velocidad de un coche
     * @param matricula identificador del coche
     * @return devuelve la velocidad del coche
     */

    public static Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return coche.getVelocidad();
    }

    private static final ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }


    public static ArrayList<Coche> getParking() {
        return parking;
    }

    public static void setParking(ArrayList<Coche> parking) {
        Model.parking = parking;
    }

}