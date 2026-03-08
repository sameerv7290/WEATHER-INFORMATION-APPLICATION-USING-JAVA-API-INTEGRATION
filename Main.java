import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter city:");
        String city = sc.nextLine();

        WeatherService service = new WeatherService();
        String json = service.getWeatherData(city);

        if (json == null) {
            System.out.println("API error");
            return;
        }

        // ⭐ DEBUG LINE (ADD THIS)
        //System.out.println(json);

        WeatherParser parser = new WeatherParser();
        Weather weather = parser.parse(json, city);

        if (weather != null) {
            System.out.println("\nWeather Report");
            System.out.println("City: " + weather.getCity());
            System.out.println("Temperature: " + weather.getTemperature() + " C");
            System.out.println("Humidity: " + weather.getHumidity() + "%");
            System.out.println("Condition: " + weather.getDescription());
        }
    }
}