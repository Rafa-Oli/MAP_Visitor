package operations;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import visitor.VisitorIF;

public class VisitorMaximizaFigura implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo retangulo) {
        return 2 * retangulo.getAltura() + 2 * retangulo.getLargura();
    }

    @Override
    public double visitaTriangulo(Triangulo triangulo) {
        return 2 * triangulo.getLado() + 2 * triangulo.getAltura() + 2 * triangulo.getBase();
    }

    @Override
    public double visitaCirculo(Circulo circulo) {
        return 2 * circulo.getRaio();
    }

    @Override
    public double visitaTrapezio(Trapezio trapezio) {
        return 2 * trapezio.getLado2() + 2 * trapezio.getLado1() + 2 * trapezio.getBaseMaior() + 2 * trapezio.getBaseMenor() + 2 * trapezio.getAltura();
    }
}
