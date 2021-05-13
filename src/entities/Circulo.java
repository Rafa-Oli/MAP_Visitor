package entities;

import visitor.ElementoConcreto;
import visitor.VisitorIF;

public class Circulo implements ElementoConcreto {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void aceitaVisita(VisitorIF visitor) {
        visitor.visitaCirculo(this);
    }
}
