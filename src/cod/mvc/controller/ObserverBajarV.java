package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObserverBajarV implements Observer{
    Model model = Model.getInstance();

    private static final int bajada = 10;

    public ObserverBajarV(Model model) {
        this.model = model;
    }
    @Override
    public void update(Coche arg) {

    }
}
