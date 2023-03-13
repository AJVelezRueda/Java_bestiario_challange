/* package determines the directory in which we are working */
package org.bestiario;
/**
 * This class contains all the sentences to be executed
 */
public class Main {
    public static void main(String[] args) {
        Gaviota pepita = new Gaviota(200);
        System.out.println(pepita.getEnergia());

        Can puchi = new Can(5000);
        System.out.println(puchi.getEnergia());
        puchi.ladrar();

        Humano anita = new Humano();
        anita.agregarMascota(pepita);
        anita.agregarMascota(puchi);

        anita.alimentarMascotas();
        System.out.println(pepita.getEnergia());
        System.out.println(puchi.getEnergia());
    }
}