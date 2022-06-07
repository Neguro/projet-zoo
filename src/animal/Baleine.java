package animal;

public class Baleine extends Mammifere{

    /**
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param age
     * @param faim
     * @param sommeil
     * @param sante
     * @param gestation
     */
    public Baleine(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, int gestation) {
        super(nom, sexe, poids, taille, age, faim, sommeil, sante, true, false, gestation);
    }

    /**
     * Baleine peut nager
     */
    public void nager() {
        System.out.println(this.getNom() + "est en train de nager");
    }
}
