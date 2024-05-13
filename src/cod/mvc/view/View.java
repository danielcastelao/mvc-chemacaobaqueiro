package cod.mvc.view;

public class View {

    /**
     * Metodo en el que se recibe la velocidad y la matricula
     *
     * @param matricula identificador del vehículo
     * @param velocidad velocidad del vehículo
     * @return
     */
    public static boolean muestraVelocidad(String matricula, int velocidad) {

        System.out.println(matricula + " : " + velocidad + "km/h");
        return true;
    }
}