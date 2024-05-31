package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

import static cod.mvc.model.Model.parking;

public class BuscarCoche {
    Coche coche = new Coche();
    Model miModel = Model.getInstancia();
    /**
     * variables las cuales voy a usar para en la view mostrar los datos del coche
     */
    public static Coche buscador;

    /**
     * Clase pora buscar un coche segun la matricula
     * @param matricula
     */

    public Coche buscarCoche(String matricula){
        for (Coche buscar: parking) {
            if (buscar.matricula.equals(matricula)) {
                buscador = buscar;
            }
        }
        return buscador;
    }

}
