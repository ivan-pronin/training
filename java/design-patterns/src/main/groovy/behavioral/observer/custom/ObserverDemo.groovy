package behavioral.observer.custom

/**
 *
 * Created by ivanp on 27.11.2017
 */
class ObserverDemo {

    static void main(String ... args)
    {
        Subject weatherData = new WeatherData()
        DisplayElement displayElement = new CurrentConditionsDisplay(weatherData)

        weatherData.setHumidity(20)
        weatherData.setTemperature(35)
        weatherData.setPressure(500)
    }
}
