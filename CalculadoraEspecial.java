/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraPoo;
import java.util.Random;

public class CalculadoraEspecial extends Calculadora {
    
    //Herencia    
    //Constructor
    public CalculadoraEspecial (String tipoCalculadora, String color, int dimensionPantalla, String numeroDeSerie, String nombrePropietario){
        super(tipoCalculadora,color,dimensionPantalla,numeroDeSerie,nombrePropietario);
    }
    
    public void mostrarDatos(){
    System.out.println("Tipo de Calculadora: "+tipoCalculadora+"\nColor: "+color+"\nDimension: "+dimensionPantalla+"x"+dimensionPantalla+"\nNumero de Serie: "+numeroDeSerie+"\nNombre del Propietario: "+nombrePropietario);
    }
    
    //calculadora especial
    public int generarNumeroAleatorio(int limiteSuperior) {
        Random random = new Random();
        return random.nextInt(limiteSuperior);
    }

    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    public double calcularLogaritmo(double numero) {
        return Math.log(numero);
    }

    public double calcularSeno(double anguloEnRadianes) {
        return Math.sin(anguloEnRadianes);
    }

    public double calcularCoseno(double anguloEnRadianes) {
        return Math.cos(anguloEnRadianes);
    }
    
    public double calcularTangente(double anguloEnRadianes) {
        return Math.tan(anguloEnRadianes);
    }
    
    public double calcularRaizCubica(double numero) {
        return Math.cbrt(numero);
    }
    
}
