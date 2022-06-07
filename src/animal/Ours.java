package animal;

public class Ours extends Mammifere{

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
    public Ours(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, int gestation) {
        super(nom, sexe, poids, taille, age, faim, sommeil, sante, false, false, gestation);
    }
}
