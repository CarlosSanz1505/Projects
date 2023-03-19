package figurasgeometricas;

import java.util.Scanner;

public class PruebaFiguras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Creacion y prueba del rectangulo
        System.out.println("PRUEBA DEL RECTANGULO");
        Rectangulo figura2 = new Rectangulo();
        int base,altura;
        System.out.println("Ingrese la base:");
        base = input.nextInt();
        System.out.println("Ahora ingrese la altura");
        altura = input.nextInt();
        figura2.calcularPerimetro(base, altura);
        figura2.calcularArea(base,altura);
        System.out.println("\n");
        
        //Creacion y prueba del cuadrado
        System.out.println("PRUEBA DEL CUADRADO");
        Cuadrado figura3 = new Cuadrado();
        int lado;
        System.out.println("Ingrese el valor del lado:");
        lado = input.nextInt();
        figura3.calcularPerimetro(lado);
        figura3.calcularArea(lado);
        System.out.println("\n");
    }
}
