package cod.mvc.model;

import java.util.ArrayList;
import cod.mvc.controller.Observer;

public class Model implements Observable{

    public static ArrayList<Coche> parking = new ArrayList<>();

    private static final ArrayList<Observer> observers = new ArrayList<>();

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



    /**
     * Metodo en el que se crea un coche
     * @param newModelo modelo del coche
     * @param newMatricula identificador del coche
     * @return array con los coches
     */

    public static Coche crearCoche(String newModelo, String newMatricula) {

        Coche newCoche = new Coche(newModelo, newMatricula);
        parking.add(newCoche);
        return newCoche;
    }

    /**
     * Metodo para sacar el coche creado anteriormente
     * @param matricula identificador del coche
     * @return devuelve el coche asociado a la mátricula introducida
     */

    public static Coche getCoche(String matricula) {
        Coche newCoche = null;
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                newCoche = coche;
            }
        }
        return newCoche;
    }

    /**
     * Metodo en el cual se puede cambiar la velocidad de un coche
     *
     * @param matricula identificador del coche
     * @param velocidad velocidad a la que la quieres cambiar
     */

    public void cambiarVelocidad(String matricula, Integer velocidad) {
        getCoche(matricula).velocidad = velocidad;
        notifyObservers(getCoche(matricula));
    }

    /**
     * Metodo para sacar la velocidad de un coche
     * @param matricula identificador del coche
     * @return devuelve la velocidad del coche
     */

    public static Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }



}