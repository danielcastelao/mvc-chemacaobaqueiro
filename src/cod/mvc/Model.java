package cod.mvc;

import java.util.ArrayList;

public class Model {

    private static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Metodo en el que se crea un coche
     * @param newModelo modelo del coche
     * @param newMatricula identificador del coche
     * @param newVelocidad velocidad del coche
     * @return array con los coches
     */
    public static ArrayList<Coche> crearCoche(String newModelo, String newMatricula, Integer newVelocidad) {
        parking.add(new Coche(newModelo, newMatricula, newVelocidad));
        return parking;
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
     * @param matricula identificador del coche
     * @param velocidad velocidad a la que la quieres cambiar
     * @return devuelve la velocidad
     */
    public static Integer cambiarVelocidad(String matricula, Integer velocidad) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                coche.setVelocidad(velocidad);
            }
        }
        return velocidad;
    }

    /**
     * Metodo para sacar la velocidad de un coche
     * @param matricula identificador del coche
     * @return devuelve la velocidad del coche
     */
    public static Integer getVelocidad(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche.getVelocidad();
            }
        }
        return null;
    }
}