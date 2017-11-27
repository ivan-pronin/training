package behavioral.observer.custom

/**
 *
 * Created by ivanp on 27.11.2017
 */
class CurrentConditionsDisplay implements Observer, DisplayElement {

    float temperature
    float humidity
    float pressure
    Subject subject

    CurrentConditionsDisplay(Subject subject) {
        this.subject = subject
        subject.registerObserver(this)
    }

    @Override
    void display() {
        println toString()
    }

    @Override
    void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    @Override
    String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
