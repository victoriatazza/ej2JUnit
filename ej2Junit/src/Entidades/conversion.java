/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class conversion {

    public double convertirFarenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }
    
    public double convertirCelsius(double farenheit) {

        return (farenheit -32)*5/9;
    }
}
