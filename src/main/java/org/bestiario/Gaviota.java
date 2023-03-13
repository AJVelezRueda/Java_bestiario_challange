package org.bestiario;

public class Gaviota implements Animal {
    private int energia;
    public Gaviota(int energia) {
        this.energia = energia;
    }

    @Override
    public int getEnergia() {
        return energia;
    }

    public void volarEnCirculos() {
        energia -= 10;
    }

    public void planear() {
        energia -= 5;
    }

    public void comerAlpiste(int cantidadAlpiste) {
        energia += cantidadAlpiste * 2;
    }

    @Override
    public void comer() {
        comerAlpiste(50);
    }

    @Override
    public void jugar() {
        planear();
    }
}
