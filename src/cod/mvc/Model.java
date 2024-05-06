package cod.mvc;

import java.util.ArrayList;

public class Model {

    private static ArrayList<Coche> parking = new ArrayList<>();

    public static ArrayList<Coche> crearCoche(String newModelo, String newMatricula, Integer newVelocidad) {
        parking.add(new Coche(newModelo, newMatricula, newVelocidad));
        return parking;
    }

    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }

        return null;
    }


}