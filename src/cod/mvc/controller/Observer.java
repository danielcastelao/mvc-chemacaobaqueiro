package cod.mvc.controller;
import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public interface Observer {

    void update(Coche arg,Model model);

}
