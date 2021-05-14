package test;

import operations.*;
import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Maximiza_figura_test {
    VisitorMaximizaFigura maximizaFigura;
    Retangulo retangulo;
    Circulo circulo;
    Trapezio trapezio;
    Triangulo triangulo;
    @Before
    public void instancia () {
        maximizaFigura = new VisitorMaximizaFigura();
        retangulo = new Retangulo(30, 56.0);
        circulo = new Circulo(15);
        trapezio = new Trapezio(10, 5, 8, 20,30);
        triangulo = new Triangulo(10, 5, 8);
    }
    @Test
    public void testVisitRetangulo () {
        retangulo.aceitaVisita(maximizaFigura);
        double value = maximizaFigura.visitaRetangulo(retangulo);
        Assert.assertEquals(344, maximizaFigura.visitaRetangulo(retangulo), Math.abs(344 - value));
    }
    @Test
    public void testVisitTriangulo () {
        triangulo.aceitaVisita(maximizaFigura);
        double value = maximizaFigura.visitaTriangulo(triangulo);
        Assert.assertEquals(48.0, value, Math.abs(48.0 - value));
    }
    @Test
    public void testVisitCirculo () {
        circulo.aceitaVisita(maximizaFigura);
        double value = maximizaFigura.visitaCirculo(circulo);
        Assert.assertEquals(124.0, value, Math.abs(124.0 - value));
    }
    @Test
    public void testVisitTrapezio () {
        trapezio.aceitaVisita(maximizaFigura);
        double value = maximizaFigura.visitaTrapezio(trapezio);
        Assert.assertEquals(130.00, value, Math.abs(130.00 - value));
    }
}
