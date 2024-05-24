package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObserverLimite implements Observer {

    final static int vlimite = 300;


    @Override
    public void update(Coche arg, Model model) {

        if (arg.velocidad > vlimite) {
            System.out.println("(ObserverLimite) Velocidad por encima del límite");
            model.cambiarVelocidad(arg.matricula, arg.velocidad-10);
            System.out.println("(ObserverLimite) Reducción de velocidad");
        }
    }

}
