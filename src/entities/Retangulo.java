package entities;

import visitor.ElementoConcreto;
import visitor.VisitorIF;

public class Retangulo implements ElementoConcreto {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public void aceitaVisita(VisitorIF visitor) {
        visitor.visitaRetangulo(this);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
