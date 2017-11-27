package behavioral.observer.custom

/**
 *
 * Created by ivanp on 27.11.2017
 */
class WeatherData implements Subject {

    float temperature
    float humidity
    float pressure

    List<Observer> observers = new ArrayList<>()

    void measurementsChanged() {
        notifyObservers()
    }

    @Override
    void registerObserver(Observer observer) {
        observers.add(observer)
    }

    @Override
    void removeObserver(Observer observer) {
        observers.remove(observer)
    }

    @Override
    void notifyObservers() {
        observers.each { it -> it.update(temperature, humidity, pressure) }
    }

    void setTemperature(float temperature) {
        this.temperature = temperature
        measurementsChanged()
    }

    void setHumidity(float humidity) {
        this.humidity = humidity
        measurementsChanged()
    }

    void setPressure(float pressure) {
        this.pressure = pressure
        measurementsChanged()
    }
}
