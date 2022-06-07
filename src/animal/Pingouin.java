package animal;

public class Pingouin extends Autre{

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
    public Pingouin(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, int incubation) {
        super(nom, sexe, poids, taille, age, faim, sommeil, sante, false, false, incubation);
    }
}
