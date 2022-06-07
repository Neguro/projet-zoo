package animal;

public class Autre extends Animal{

    private int incubation; //Jours

    /**
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param age
     * @param faim
     * @param sommeil
     * @param sante
     * @param savoirNager
     * @param savoirVoler
     * @param incubation
     */
    public Autre(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, boolean savoirNager, boolean savoirVoler, int incubation) {
        super(nom, sexe, poids, taille, age, faim, sommeil, sante, savoirNager, savoirVoler);
        this.incubation = incubation;
    }
}
