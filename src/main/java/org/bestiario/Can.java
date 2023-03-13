package org.bestiario;

public class Can implements Animal {
    public int energia;

    public Can(int energia) {
        this.energia = energia;
    }

    public void ladrar() {
        System.out.println("Guau!Guau!");
    }

    @Override
    public void comer() {
        energia = 1000;
    }

    @Override
    public void jugar() {
        energia -= 500;
    }

    @Override
    public int getEnergia() {
        return energia;
    }
}
