package test;
import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import operations.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Calcular_area_spec {
    VisitorCalculaArea visitorCalculaArea;
    Retangulo retangulo;
    Circulo circulo;
    Trapezio trapezio;
    Triangulo triangulo;

    @Before
    public void instancia () {
        visitorCalculaArea = new VisitorCalculaArea();
        retangulo = new Retangulo(30, 56.0);
        circulo = new Circulo(15);
        trapezio = new Trapezio(10, 5, 8, 20,30);
        triangulo = new Triangulo(10, 5, 8);
    }
    @Test
    public void testVisitRetangulo () {
        retangulo.aceitaVisita(visitorCalculaArea);
        double value = visitorCalculaArea.visitaRetangulo(retangulo);
        Assert.assertEquals(1680.0, visitorCalculaArea.visitaRetangulo(retangulo), Math.abs(1680 - value));
    }
    @Test
    public void testVisitTriangulo () {
        triangulo.aceitaVisita(visitorCalculaArea);
        double value = visitorCalculaArea.visitaTriangulo(triangulo);
        Assert.assertEquals(25.0, value, Math.abs(25.0 - value));
    }
    @Test
    public void testVisitCirculo () {
        circulo.aceitaVisita(visitorCalculaArea);
        double value = visitorCalculaArea.visitaCirculo(circulo);
        Assert.assertEquals(62.800000000000004, value, Math.abs(62.800000000000004 - value));
    }
    @Test
    public void testVisitTrapezio () {
        trapezio.aceitaVisita(visitorCalculaArea);
        double value = visitorCalculaArea.visitaTrapezio(trapezio);
        Assert.assertEquals(60.0, value, Math.abs(60.0 - value));
    }
}
