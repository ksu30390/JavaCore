package ru.geekbrains.JavaCoreLesson6;

import ru.geekbrains.JavaCoreLesson6.CalgaryWeather;

import java.sql.*;

public class CalgaryWeatherRepository {
    private Statement statement;
    private PreparedStatement preparedStatement;

    public CalgaryWeatherRepository() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
    }

    public void save(String localDate, String weatherText, double temperature) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db")) {
            statement = connection.createStatement();
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS WeatherInCalgary" +
                            " (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                            "localDate String," +
                            "weatherText String,"
                            + "temperature Double);"
            );
            preparedStatement = connection.prepareStatement("INSERT INTO WeatherInCalgary" +
                    "(localDate, weatherText, temperature)" +
                    "VAlUES (?,?,?)");
            preparedStatement.setString(1, localDate);
            preparedStatement.setString(2, weatherText);
            preparedStatement.setDouble(3, temperature);
            preparedStatement.execute();

        }
    }

    public void read() throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db")) {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM WeatherInCalgary");
            while (resultSet.next()) {
                CalgaryWeatherForecast forecast = new CalgaryWeatherForecast(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4)
                );
                System.out.println(forecast);
            }

        }
    }
}
