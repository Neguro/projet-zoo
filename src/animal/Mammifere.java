package animal;

public class Mammifere extends Animal{

    private int gestation; //Jours

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
     * @param gestation
     */
    public Mammifere(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, boolean savoirNager, boolean savoirVoler, int gestation) {
        super(nom, sexe, poids, taille, age, faim, sommeil, sante, savoirNager, savoirVoler);
        this.gestation = gestation;
    }

    /**
     * Cet animal peut mettre bas
     */
    public void mettreBas() {
        if ( this.getSexe().equals("M") )
            System.out.println("Cet animal est un mâle, il ne peu pas mettre bas.");
        else
            System.out.println("Cet animal met a bas.");
    }

    /**
     * Cet animal peut pondre des oeufs
     */
    public void pondreOeufs() {
        if ( this.getSexe().equals("M") )
            System.out.println("Cet animal est un mâle, il ne peu pas pondre.");
        else
            System.out.println("Cet animal pond un oeuf");
    }
}
