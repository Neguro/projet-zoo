package animal;

public class Aigle extends Autre{

    /**
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param age
     * @param faim
     * @param sommeil
     * @param sante
     * @param incubation
     */
    public Aigle(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, int incubation) {
        super(nom, sexe, poids, taille, age, faim, sommeil, sante, false, true, incubation);
    }

    /**
     * Aigle peut voler
     */
    public void voler() {
        System.out.println(this.getNom() + " est en train de voler");
    }
}
