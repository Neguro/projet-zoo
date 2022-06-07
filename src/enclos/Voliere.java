package enclos;

import animal.*;
import java.util.ArrayList;

public class Voliere extends Enclos{

    private double hauteur;
    private boolean verifToit;
    private boolean estVerifie;

    public Voliere(String nom, double superficie, int nb_max_animaux, int nb_animaux_pres, String proprete) {
        super(nom, superficie, nb_max_animaux, proprete);
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public boolean isVerifToit() {
        return verifToit;
    }

    public void setVerifToit(boolean verifToit) {
        this.verifToit = verifToit;
    }

    public boolean isEstVerifie() {
        return estVerifie;
    }

    public void setEstVerifie(boolean estVerifie) {
        this.estVerifie = estVerifie;
    }

    public void entretienVoliere() {
        if(this.isEstVerifie() == true) {
            this.entretienEnclos();
        }
        this.setEstVerifie(false);
    }

    public void ajouterAnimal(Animal animal) {
        if (this.animaux.size() == 0) {
            if ( animal.isSavoirNager() )
                System.out.println(animal.getNom() + " ne peut pas être ajouté dans un volière, il faut lui mettre dans un aquarium");
            if ( !animal.isSavoirNager() && !animal.isSavoirVoler() )
                System.out.println(animal.getNom() + " ne peut pas être ajouté dans un volière, il faut lui mettre dans un enclos");
            if ( !animal.isSavoirNager() && animal.isSavoirVoler() )
                this.animaux.add(animal);
        } else {
            if (animal.getClass().getName().equals(this.animaux.get(0).getClass().getName())) {
                if (this.animaux.size() >= this.nb_max_animaux)
                    System.out.println("Cet volière est plein.");
                else {
                    this.animaux.add(animal);
                    this.nb_animaux_pres = this.animaux.size();
                }
            } else {
                System.out.println("Cet animal ne peut pas être ajouté dans cet volière, car il n'est pas de la même espèce.");
            }
        }
    }
}
