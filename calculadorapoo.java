/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CalculadoraPoo;
import java.util.Scanner;




public class calculadorapoo {
    @SuppressWarnings("UnusedAssignment") //esto no se que es pero es del inge    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);     
       //Haciendo que el usuario ingrese sus datos para la calculadora apra que sean utilizados en la creacion de la calculadora especial
     
       System.out.println("HOLA soy LAMI BIENVENIDO  ");
       CalculadoraEspecial calculadoraEspecial;
       System.out.println("LAMI: Indique el tipo de calculadora que desea:? ");
       String Nombrecalcu = sn.nextLine();
       System.out.println("LAMI: Indique el color de la Calculadora: ");
       String Colorcalcu = sn.nextLine();
       System.out.println("LAMI: Indique la dimension de su calculadora: ");
       int Dimensioncalcu = sn.nextInt();
       sn.nextLine();
       System.out.println("LAMI: Ingrese el numero de serie de la calculadora: ");
       String NumeroSeriecalcu = sn.nextLine();
       System.out.println("LAMI: Indique el numero de serie de su calculadora: ");
       String Nombreusuario= sn.nextLine();
       System.out.println("");
       
       System.out.println("-----------------------");
       calculadoraEspecial = new CalculadoraEspecial(Nombrecalcu, Colorcalcu, Dimensioncalcu, NumeroSeriecalcu, Nombreusuario);
       boolean salir = false;
       int opcion, opcioncalculadora, num1,  num2;      
       //mostrar los datos
       calculadoraEspecial.mostrarDatos();
       System.out.println("-----------------------");
       do{      
           System.out.println("");
           System.out.println("HOLA SOY LAMI ");
           System.out.println("BIENVENIDO" +Nombreusuario);
           System.out.println("Tu calculadora es: "+Nombrecalcu);         
           System.out.println("Bienvenido a tu calculadora virtual.");
           System.out.println("LAMI: Selecciona el tipo de calculadora que desea utilizar");
           System.out.println("");
           System.out.println("-----------------------");
           System.out.println("LAMI: 1. Calculadora Simple");
           System.out.println("LAMI: 2. Calculadora Especial");
           System.out.println("LAMI: 3. Salir");
           System.out.println("-----------------------");       
           opcioncalculadora = sn.nextInt();          
           switch(opcioncalculadora){
               case 1:
                  System.out.println("LAMI");
                  System.out.println("-----------------------");
                  System.out.println("1. Sumar");
                  System.out.println("2. Restar");
                  System.out.println("3. Multiplicar");
                  System.out.println("4. Dividir");
                  System.out.println("5. Raiz Cuadrada");
                  System.out.println("6. Verificar numero Primo");
                  System.out.println("7. Salir");
                  System.out.println("LAMI: Selecciona una opcion");
                  System.out.println("-----------------------");                  
                  opcion = sn.nextInt();                   
              switch(opcion){
                  case 1:  
                      System.out.println("LAMI: Ingrese el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("LAMI: Ingrese el segundo numero: ");
                      num2 = sn.nextInt();                     
                      System.out.println("LAMI: El resultado de la suma es = " + calculadoraEspecial.sumar(num1, num2));
                      break;
                  case 2:
                      System.out.println("LAMI: Ingrese el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("LAMI: Ingrese el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("LAMI: El resultado de la resta es = " + calculadoraEspecial.restar(num1, num2));
                      break;
                  case 3:
                      System.out.println("LAMI: Ingrese el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("LAMI: Ingrese el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("LAMI: El resultado de la multiplicacion es = " + calculadoraEspecial.multiplicar(num1, num2));
                      break;
                  case 4:
                      System.out.println("LAMI: Ingrese el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("LAMI: Ingrese el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("LAMI: El resultado de la división es = " + calculadoraEspecial.dividir(num1, num2));
                      break;
                  case 5:
                      System.out.println("LAMI: Ingrese el numero: ");
                      num1 = sn.nextInt();
                      System.out.println("LAMI: El resultado de la raíz cuadrada es = " + calculadoraEspecial.raizCuadrada(num1));
                      break;
                  case 6:
                      System.out.println("LAMI: Ingrese el numero: ");
                      num1 = sn.nextInt();
                      System.out.println("LAMI: Es primo? = " + calculadoraEspecial.esPrimo(num1));
                      break;
                  case 7:
                      salir=true;
                  default:
                      System.out.println("LAMI: Solo números entre 1 y 7");     
                }
              break;          
              case 2:
                    System.out.println("LAMI");
                    System.out.println("-----------------------");
                    System.out.println("1. Generar numero aleatorio");
                    System.out.println("2. Calcular potencia");
                    System.out.println("3. Calcular logaritmo");
                    System.out.println("4. Calcular seno");
                    System.out.println("5. Calcular coseno");
                    System.out.println("6. Calcular tangente");
                    System.out.println("7. Calcular raiz cubica");
                    System.out.println("8. Salir");
                    System.out.println("Selecciona una opcion");
                    System.out.println("-----------------------");
                    opcion = sn.nextInt();
                    switch (opcion) {
                        case 1: {
                            System.out.println("LAMI: Ingrese el limite superior: ");
                            num1 = sn.nextInt();
                            System.out.println("LAMI: Numero aleatorio generado = " + calculadoraEspecial.generarNumeroAleatorio(num1));
                            break;
                        }
                        case 2:{
                            System.out.println("LAMI: Ingrese la base: ");
                            num1 = sn.nextInt();
                            System.out.println("LAMI: Ingrese el exponente: ");
                            num2 = sn.nextInt();
                            System.out.println("LAMI: El resultado de la potencia es = " + calculadoraEspecial.calcularPotencia(num1, num2));
                            break;
                        }
                        case 3: {
                            System.out.println("LAMI: Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("LAMI: El resultado del logaritmo es = " + calculadoraEspecial.calcularLogaritmo(num1));
                            break;
                        }
                        case 4: {
                            System.out.println("LAMI: Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("LAMI: El resultado del seno es = " + calculadoraEspecial.calcularSeno(num1));
                            break;
                        }
                        case 5: {
                            System.out.println("LAMI: Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("LAMI: El resultado del coseno es = " + calculadoraEspecial.calcularCoseno(num1));
                            break;
                        }
                        case 6:{
                            System.out.println("LAMI: Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("LAMI: El resultado de la tangente es = " + calculadoraEspecial.calcularTangente(num1));
                            break;
                        }
                        case 7: {
                            System.out.println("LAMI: Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("LAMI: El resultado de la raiz cubica es = " + calculadoraEspecial.calcularRaizCubica(num1));
                            break;
                        }
                         case 8: 
                            salir = true;
                         default:
                            System.out.println("LAMI: Solo numeros entre 1 y 8");
                    }
                break;   
                case 3:
                    salir=true;
            }  
        }   
        while(!salir);
       System.out.println("LAMI: FUE UN GUSTO AYUDARTE HASTA UNA PROXIMA"+Nombreusuario);        
    }
}
