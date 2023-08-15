package de.moritz.umrechner;

public class Umrechner {
    private double fahrenheit;

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    public double getFahrenheit() {
        return this.fahrenheit;
    }
    
    public double umrechnenInCelsius() {
        double celsius;
        celsius = (fahrenheit-32) *5 / 9;
        return celsius;
    }
}
