package org.bestiario;

import java.util.ArrayList;
import java.util.List;

public class Humano {
    private List<Animal> mascotas = new ArrayList<Animal>();

    void agregarMascota(Animal mascota) {
        mascotas.add(mascota);
    }

    void alimentarMascotas() {
        for (Animal mascota : mascotas) {
            mascota.comer();
        }
    }
}
