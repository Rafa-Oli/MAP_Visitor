import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import operations.VisitorCalculaArea;
import operations.VisitorCalculaPerimetro;
import operations.VisitorMaximizaFigura;
import visitor.VisitorIF;

public class Program {
    public static void main(String[] args) {
        //Visitor
        VisitorIF visitorCA = new VisitorCalculaArea();
        VisitorIF visitorCP = new VisitorCalculaPerimetro();
        VisitorIF visitorMF = new VisitorMaximizaFigura();

        //Retangulo
        Retangulo retangulo = new Retangulo(30.0, 56.0);
        retangulo.aceitaVisita(visitorCA);
        System.out.println("Area Retângulo: " + visitorCA.visitaRetangulo(retangulo));
        System.out.println("Perimetro Retangulo: " + visitorCP.visitaRetangulo(retangulo));
        System.out.println("Perimetro Retangulo: " + visitorCP.visitaRetangulo(retangulo));

        //Circulo
        Circulo circulo = new Circulo(10);
        circulo.aceitaVisita(visitorCA);
        System.out.println("Area Circulo: " + visitorCA.visitaCirculo(circulo));
        System.out.println("Perimetro Circulo: " + visitorCP.visitaCirculo(circulo));

        //Trapezio
        Trapezio trapezio = new Trapezio(10, 5, 8, 20,30);
        trapezio.aceitaVisita(visitorCA);
        System.out.println("\nArea Trapezio: " + visitorCA.visitaTrapezio(trapezio));
        System.out.println("Perimetro Trapezio: " + visitorCP.visitaTrapezio(trapezio));

        //Triangulo
        Triangulo triangulo = new Triangulo(10, 5, 8);
        triangulo.aceitaVisita(visitorCA);
        System.out.println("\nArea Triangulo: " + visitorCA.visitaTriangulo(triangulo));
        System.out.println("Perimetro Triangulo: " + visitorCP.visitaTriangulo(triangulo));
    }
}
