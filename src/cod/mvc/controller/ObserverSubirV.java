package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObserverSubirV implements Observer{
    Model model = Model.getInstance();

    private static final int subida = 15;

    public ObserverSubirV(Model model) {
        this.model = model;
    }
    @Override
    public void update(Coche arg) {

    }
}
