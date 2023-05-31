/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraPoo;

/**
 *
 * @author cmarj
 */

public class Calculadora {    
    //atributos 
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    protected String numeroDeSerie;
    protected String nombrePropietario;
    //Constructor de la calse
    public Calculadora(String propietario){
        this.tipoCalculadora="Calculadora Básica";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="Azul";
        this.nombrePropietario=propietario;
    }
    //constructor 
    public Calculadora(String tipoCalculadora, String color, int dimensionPantalla, String numeroDeSerie, String nombrePropietario) {
        this.tipoCalculadora = tipoCalculadora;
        this.color = color;
        this.dimensionPantalla = dimensionPantalla;
        this.numeroDeSerie = numeroDeSerie;
        this.nombrePropietario = nombrePropietario;
    } 
    //get
    public String getTipoCalculadora() {
        return tipoCalculadora;
    }
    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getDimensionPantalla() {
        return dimensionPantalla;
    }
    public void setDimensionPantalla(int dimensionPantalla) {
        this.dimensionPantalla = dimensionPantalla;
    }
    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }
    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
    public String getNombrePropietario() {
        return nombrePropietario;
    }
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }   
    
    //Constructor vacio
    public Calculadora(){
    }
    
    //  Declaracion 
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero + segundoNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado){
        boolean primo = false;
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else{
            return false;
        }
    }   
}
