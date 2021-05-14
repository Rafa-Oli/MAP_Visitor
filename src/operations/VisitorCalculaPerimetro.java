package operations;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import visitor.VisitorIF;

public class VisitorCalculaPerimetro implements VisitorIF {
    @Override
    public double visitaRetangulo(Retangulo retangulo) {
        return (2 * retangulo.getLargura()) + (2 * retangulo.getAltura());
    }

    @Override
    public double visitaTriangulo(Triangulo triangulo) {
        return 3 * triangulo.getLado();
    }

    @Override
    public double visitaCirculo(Circulo circulo) {
        return 2 * 3.14 * circulo.getRaio();
    }

    @Override
    public double visitaTrapezio(Trapezio trapezio) {
        return trapezio.getBaseMenor() + trapezio.getBaseMaior() + trapezio.getLado1() + trapezio.getLado2();
    }
}
