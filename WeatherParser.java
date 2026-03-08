public class WeatherParser {

    public Weather parse(String json, String city) {

        try {
            String temp = extract(json, "\"temp_C\"");
            String hum = extract(json, "\"humidity\"");
            String desc = extract(json, "\"value\"");

            return new Weather(city, temp, hum, desc);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String extract(String text, String key) {

        int keyIndex = text.indexOf(key);
        if (keyIndex == -1) return "N/A";

        int colonIndex = text.indexOf(":", keyIndex);
        int firstQuote = text.indexOf("\"", colonIndex + 1);
        int secondQuote = text.indexOf("\"", firstQuote + 1);

        return text.substring(firstQuote + 1, secondQuote);  
    }
}