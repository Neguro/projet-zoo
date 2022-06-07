package animal;

public class Tigre extends Mammifere{
    private boolean vagabonder;

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
     * @param vagabonder
     */
    public Tigre(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, int gestation, boolean vagabonder) {
        super(nom, sexe, poids, taille, age, faim, sommeil, sante, false, false, gestation);
        this.vagabonder = vagabonder;
    }

    /**
     * get si ce tigre est en train de vagabonder
     * @return vagabonder
     */
    public boolean isVagabonder() {
        return this.vagabonder;
    }

    /**
     * set si ce tigre est en train de vagabonder
     * @param vagabonder
     */
    public void setVagabonder(boolean vagabonder) {
        this.vagabonder = vagabonder;
    }

    /**
     * Tigre peut vagabonder
     */
    public void vagabonder() {
        this.vagabonder = true;
        System.out.println(this.getNom() + " est en train de vagabonder");
    }
}
