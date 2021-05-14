package visitor;

import entities.*;

public interface VisitorIF {
    public double visitaRetangulo(Retangulo retangulo);
    public double visitaTriangulo(Triangulo triangulo);
    public double visitaCirculo(Circulo circulo);
    public double visitaTrapezio(Trapezio trapezio);
}
