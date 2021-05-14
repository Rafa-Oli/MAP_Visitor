package test;

import operations.*;
import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Calcular_perimetro_spec {
    VisitorCalculaPerimetro calculaPerimetro;
    Retangulo retangulo;
    Circulo circulo;
    Trapezio trapezio;
    Triangulo triangulo;
    @Before
    public void instancia () {
        calculaPerimetro = new VisitorCalculaPerimetro();
        retangulo = new Retangulo(30, 56.0);
        circulo = new Circulo(15);
        trapezio = new Trapezio(10, 5, 8, 20,30);
        triangulo = new Triangulo(10, 5, 8);
    }
    @Test
    public void testVisitRetangulo () {
        retangulo.aceitaVisita(calculaPerimetro);
        double value = calculaPerimetro.visitaRetangulo(retangulo);
        Assert.assertEquals(172.0, calculaPerimetro.visitaRetangulo(retangulo), Math.abs(172.0 - value));
    }
    @Test
    public void testVisitTriangulo () {
        triangulo.aceitaVisita(calculaPerimetro);
        double value = calculaPerimetro.visitaTriangulo(triangulo);
        Assert.assertEquals(24.0, value, Math.abs(24.0 - value));
    }
    @Test
    public void testVisitCirculo () {
        circulo.aceitaVisita(calculaPerimetro);
        double value = calculaPerimetro.visitaCirculo(circulo);
        Assert.assertEquals(62.800000000000004, value, Math.abs(62.800000000000004 - value));
    }
    @Test
    public void testVisitTrapezio () {
        trapezio.aceitaVisita(calculaPerimetro);
        double value = calculaPerimetro.visitaTrapezio(trapezio);
        Assert.assertEquals(65.0, value, Math.abs(65.0 - value));
    }
}
