package animal;

public class Poisson extends Autre{

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
    public Poisson(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, int incubation) {
        super(nom, sexe, poids, taille, age, faim, sommeil, sante, true, false, incubation);
    }

    /**
     * Poisson peut nager
     */
    public void nager() {
        System.out.println(this.getNom() + "est en train de nager");
    }
}
