package cod.mvc.view;

import cod.mvc.controller.BuscarCoche;

public class View {
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println("(View) " + matricula + ": " + v + "km/hr");

        /**
         * Sacar por pantalla los datos del coche el cual ha sido buscado en la clase
         */
        System.out.println("(View)"+" El coche correspondiente a la matricula introducida es : "+"\nModelo: "+ BuscarCoche.modelo+" , Velocidad : "+BuscarCoche.vel+" , Matricula : "+matricula);
        return true;
    }
}
