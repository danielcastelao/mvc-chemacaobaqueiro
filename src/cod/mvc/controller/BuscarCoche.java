package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class BuscarCoche {

    /**
     * variables las cuales voy a usar para en la view mostrar los datos del coche
     */

    public static String modelo;
    public static Integer vel;

    /**
     * Clase pora buscar un coche segun la matricula
     * @param matricula
     */

    public void buscarCoche(String matricula){
        if(matricula.equals(Coche.matricula)){
            modelo = Coche.modelo;
            vel = Coche.velocidad;
        }
    }

}
