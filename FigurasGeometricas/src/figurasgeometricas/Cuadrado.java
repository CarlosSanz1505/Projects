package figurasgeometricas;

public class Cuadrado {
    double calcularArea(int lado){
        double area = Math.pow(lado,2);
        System.out.println("Su area es: "+area);
        return 0;
    }
    double calcularPerimetro(int lado){
        double perimetro = 2*lado;
        System.out.println("Su perimetro es: "+perimetro);
        return 0;
    }
}
