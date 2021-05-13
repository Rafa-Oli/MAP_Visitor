package visitor;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public interface VisitorIF {
    public double visitaRetangulo(Retangulo retangulo);
    public double visitaTriangulo(Triangulo triangulo);
    public double visitaCirculo(Circulo circulo);
    public double visitaTrapezio(Trapezio trapezio);
}
