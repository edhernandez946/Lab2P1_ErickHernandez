package lab2p1_erickhernandez;
import java.util.Scanner;

public class Lab2P1_ErickHernandez {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //Ciclo para seguir el programa hasta que el usuario lo incique
        
        while (true) {
            
            //Eleccion de programa
            
            System.out.println("");
            System.out.println("Eliga una opcion");
            System.out.println("1 = Opcion 1 | 2 = Opcion 2 | Opcion 3 | 4 = Salir");
            
            int opcion = leer.nextInt();
            
            //Condicionales para cada 
            
            if (opcion == 1) {
                
                //Ingreso de longitudes del triangulo
                    
                System.out.println("Ingrese la primera longitud: ");
                int longitud1 = leer.nextInt();
                    
                System.out.println("Ingrese la segunda longitud: ");
                int longitud2 = leer.nextInt();
                    
                System.out.println("Ingrese la tercera longitud: ");
                int longitud3 = leer.nextInt();
                
                
                //Logica para dar respuestas
                
                if (longitud1 <= 0 || longitud2 <= 0 || longitud3 <= 0) {
                    System.out.println("Las longitudes no pueden ser negativas");
                    System.out.println("");
                    
                } else if (longitud1 + longitud2 < longitud3 || longitud1 + longitud3 < longitud2 || longitud2 + longitud3 < longitud1) {
                    System.out.println("Las longitudes ingresadas no forman un triangulo");
                    System.out.println("");
                    
                } else {
                    System.out.println("Las longitudes ingresadas forman un triangulo");
                    System.out.println("");
                }
                
            } else if (opcion == 2) {
                
                while (true) {
                    
                    
                    //Eleccion de figuras
                    
                    System.out.println("");
                    System.out.println("Eliga una figura:");
                    System.out.println("1 = Rectangulo | 2 = Triangulo | 3 = Circulo");

                    int figura = leer.nextInt();
                    
                    
                    

                    if (figura == 1) {
                        
                        // Logica para rectangulo

                        System.out.println("Ingrese la base del rectangulo: ");
                        int base = leer.nextInt();

                        System.out.println("Ingrese la altura del rectangulo: ");
                        int altura = leer.nextInt();

                        double area = base * altura;
                        
                        System.out.println("El area del rectangulo es " + area);
                        System.out.println("");

                    } else if (figura == 2) {
                        
                        //Logica para triangulo
                        
                        System.out.println("Ingrese la base del triangulo: ");
                        int base = leer.nextInt();

                        System.out.println("Ingrese la altura del traingulo: ");
                        int altura = leer.nextInt();

                        double area = 0.5 * base * altura;

                        System.out.println("El area del triangulo es " + area);
                        System.out.println("");

                    } else if (figura == 3) {
                        
                        //Logica para circulo
                        
                        System.out.println("Ingrese el radio del circulo: ");
                        int radio = leer.nextInt();
                        
                        double area = Math.PI * Math.pow(radio, 2);

                        System.out.println("El area del circulo es " + area);
                        System.out.println("");

                    } else {
                        System.out.println("Figura invalida!");
                        System.out.println("");
                    }
                    
                    System.out.println("Desea calcular otra area? Si = 1, No = 0");
                    int continuar = leer.nextInt();
                    
                    if (continuar == 0) {
                        break;
                    }
                    
                }
                
            } else if (opcion == 3) {
                
                System.out.println("Ingrese el numero que quiere evaluar: ");
                int numero = leer.nextInt();
                
                boolean par;
                boolean primo = false;
                
                
                //Chequeo de numero par o impar
                
                if (numero % 2 == 0) {
                    par = true;
                } else {
                    par = false;
                }
                
                
                //Chequeo de si numero es primo
                
                int contador = 1;
                
                while (contador < numero) {
                    if (numero % contador == 0) {
                        primo = true;
                    } else {
                        primo = false;
                    }
                    
                    contador += 1;
                }
                
                
                //Dar respuetas al usuario
                
                System.out.print("El numero " + numero + " es ");
                
                if (par == true) {
                    System.out.print("par ");
                } else {
                    System.out.print("impar ");
                }
                
                if (primo == true) {
                    System.out.print("y primo ");
                    System.out.println("");
                }
                
                
            } else if (opcion == 4) {
                
                //Fin del programa con break
                
                System.out.println("Fin del programa");
                break;
                
            } else {
                
                //Chequeo de opcion invalida
                
                System.out.println("Opcion Invalida!");
                System.out.println("");
            }
            
        }
        
    }
    
}
