package enclos;

import animal.*;
import java.util.ArrayList;

public class Aquarium extends Enclos {

    private double profondeur;
    private int salinite;
    private boolean estVerifie;

    public Aquarium(String nom, double superficie, int nb_max_animaux, int nb_animaux_pres, String proprete, double profondeur, int salinite) {
        super(nom, superficie, nb_max_animaux, proprete);
        this.profondeur = profondeur;
        this.salinite = salinite;
    }

    public double getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(double profondeur) {
        this.profondeur = profondeur;
    }

    public int getSalinite() {
        return salinite;
    }

    public void setSalinite(int salinite) {
        this.salinite = salinite;
    }

    public boolean isEstVerifie() {
        return estVerifie;
    }

    public void setEstVerifie(boolean estVerifie) {
        this.estVerifie = estVerifie;
    }

    public void entretienAquarium() {
        if(this.isEstVerifie() == true) {
            this.entretienEnclos();
        }
        this.setEstVerifie(false);
    }

    /**
     * @param animal
     */
   // @Override
    public void ajouterAnimal(Animal animal) {
        if (this.animaux.size() == 0) {
            if ( !animal.isSavoirNager() && !animal.isSavoirVoler() )
                System.out.println(animal.getNom() + " ne peut pas être ajouté dans un aquarium, il faut lui mettre dans un enclos");
            if ( animal.isSavoirVoler() )
                System.out.println(animal.getNom() + " ne peut pas être ajouté dans un aquarium, il faut lui mettre dans un volière");
            if ( animal.isSavoirNager() )
                this.animaux.add(animal);
        } else {
            if (animal.getClass().getName().equals(this.animaux.get(0).getClass().getName())) {
                if (this.animaux.size() >= this.nb_max_animaux)
                    System.out.println("Cet aquarium est plein.");
                else {
                    this.animaux.add(animal);
                    this.nb_animaux_pres = this.animaux.size();
                }
            } else {
                System.out.println("Cet animal ne peut pas être ajouté dans cet aquarium, car il n'est pas de la meme espèce.");
            }
        }
    }
}