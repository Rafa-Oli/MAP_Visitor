package entities;

import visitor.*;
import visitor.VisitorIF;

public class Triangulo implements ElementoConcreto {
    private double base;
    private double altura;
    private double lado;

    public Triangulo(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void aceitaVisita(VisitorIF visitor) {

    }
}
