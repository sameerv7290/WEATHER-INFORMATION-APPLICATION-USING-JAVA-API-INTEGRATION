# 🌦 WEATHER INFORMATION APPLICATION USING JAVA API INTEGRATION

## 📌 Project Description
This project is a Java console-based application that fetches real-time weather information for a user-specified city using a public Weather REST API. The application sends HTTP requests to the API, receives weather data in JSON format, parses the response, and displays important weather details such as temperature, humidity, and weather condition.

The project demonstrates the use of API integration, JSON parsing, and Object-Oriented Programming (OOP) concepts in Java.

## 🚀 Features
- Fetches real-time weather data for any city.
- Uses REST API integration to retrieve weather information.
- Parses JSON response to extract weather details.
- Displays temperature, humidity, and weather condition.
- Simple console-based user interaction.

## 🛠 Technologies Used
- Java
- Object-Oriented Programming (OOP)
- REST API
- JSON Parsing
- HTTPURLConnection

## 📂 Project Structure
Weather-App
│
├── Main.java
├── WeatherService.java
├── WeatherParser.java
└── Weather.java

## File Description
 - Main.java – Handles user input and program execution.
 - WeatherService.java – Connects to the weather API and retrieves the JSON response.
 - WeatherParser.java – Parses the JSON data and extracts weather information.
 - Weather.java – Model class that stores weather details.



## ⚙️ How It Works
1. User enters the city name.
2. Application sends an HTTP GET request to the weather API.
3. API returns weather data in JSON format.
4. JSON response is parsed to extract required information.
5. Weather details are displayed in the console.

## 📊 Example Output
Enter City Name: Chennai

Temperature: 30°C
Humidity: 70%
Weather: Clear Sky
