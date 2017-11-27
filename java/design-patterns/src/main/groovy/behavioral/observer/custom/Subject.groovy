package behavioral.observer.custom

/**
 *
 * Created by ivanp on 27.11.2017
 */
interface Subject {

    void registerObserver(Observer observer)
    void removeObserver(Observer observer)
    void notifyObservers()
}
