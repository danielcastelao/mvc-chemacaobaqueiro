package cod.mvc.view;

import cod.mvc.controller.BuscarCoche;

public class View {

    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println("(View) " + matricula + ": " + v + "km/hr");
        return true;
    }

    public static boolean muestraBuscador(String matricula){

        BuscarCoche buscador = new BuscarCoche();
        /**
         * Sacar por pantalla los datos del coche el cual ha sido buscado en la clase
         */
        System.out.println("(View)"+" El coche correspondiente a la matricula introducida es : "+buscador.buscarCoche(matricula));
        return true;
    }
}
