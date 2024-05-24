package cod.mvc.model;
import cod.mvc.controller.Observer;
import cod.mvc.model.Coche;
public interface Observable {

    void addObserver(Observer observer);


    void removeObserver(Observer observer);


    void notifyObservers(Coche coche);

}
