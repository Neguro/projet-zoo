package zoo;

import employe.Employe;
import enclos.*;
import java.util.ArrayList;

public class Zoo {
    private String nom;
    private Employe employe;
    private int nb_max_enclos;
    private ArrayList<Enclos> enclos; // Liste des enclos dans le zoo

    /**
     * @param nom
     * @param employe
     * @param nb_max_enclos
     */
    public Zoo(String nom, Employe employe, int nb_max_enclos) {
        this.nom = nom;
        this.employe = employe;
        this.nb_max_enclos = nb_max_enclos;
        this.enclos = new ArrayList<Enclos>();
    }

    /**
     * get le nom de cet zoo
     * @return nom
     */
    public String getNom() { return this.nom; }

    /**
     * set le nom de cet zoo
     * @param nom
     */
    public void setNom(String nom) { this.nom = nom; }

    /**
     * get l'employé de cet zoo
     * @return employe
     */
    public Employe getEmploye() { return this.employe; }

    /**
     * set l'employé de cet zoo
     * @param employe
     */
    public void setEmploye(Employe employe) { this.employe = employe; }

    /**
     * get le nombre maximum d'animaux que le zoo peut contenir
     * @return nb_max_enclos
     */
    public int getNb_max_enclos() { return this.nb_max_enclos; }

    /**
     * set le nombre maximum d'animaux que cet zoo peut contenir
     * @param nb_max_enclos
     */
    public void setNb_max_enclos(int nb_max_enclos) { this.nb_max_enclos = nb_max_enclos; }

    /**
     * get la liste d'enclos de cet zoo
     * @return enclos
     */
    public ArrayList<Enclos> getEnclos() { return this.enclos; }

    public void setEnclos(ArrayList<Enclos> enclos) { this.enclos = enclos; }

    @Override
    public String toString() {
        return "Zoo {" +
                "nom = '" + nom + '\'' +
                ", employe = " + employe +
                ", nb_max_enclos = " + nb_max_enclos +
                ", enclos = " + enclos +
                '}';
    }
}
