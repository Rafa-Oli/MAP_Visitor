package operations;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import visitor.VisitorIF;

public class VisitorCalculaArea implements VisitorIF {
    @Override
    public double visitaRetangulo(Retangulo retangulo) {
        return retangulo.getAltura() * retangulo.getLargura();
    }

    @Override
    public double visitaTriangulo(Triangulo triangulo) {
        return (triangulo.getBase() * triangulo.getAltura()) / 2;
    }

    @Override
    public double visitaCirculo(Circulo circulo) {
        return 2 * 3.14 * circulo.getRaio();
    }

    @Override
    public double visitaTrapezio(Trapezio trapezio) {
        return ((trapezio.getBaseMaior() + trapezio.getBaseMenor()) * trapezio.getAltura()) / 2 ;
    }
}
