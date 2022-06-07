package enclos;

import animal.*;

import java.sql.Array;
import java.util.ArrayList;

public class Enclos {
    private String nom;
    private double superficie;
    protected int nb_max_animaux;
    protected int nb_animaux_pres;
    protected ArrayList<Animal> animaux; // Liste d'animaux présent dans l'enclos
    private String proprete;

    /**
     * @param nom
     * @param superficie
     * @param nb_max_animaux
     * @param proprete
     */
    public Enclos(String nom, double superficie, int nb_max_animaux, String proprete) {
        this.nom = nom;
        this.superficie = superficie;
        this.nb_max_animaux = nb_max_animaux;
        this.animaux = new ArrayList<Animal>();
        this.nb_animaux_pres = animaux.size();
        this.proprete = proprete;
    }

    /**
     * get le nom de cet enclos
     * @return nom
     */
    public String getNom() { return nom; }

    /**
     * set le nom de cet enclos
     * @param nom
     */
    public void setNom(String nom) { this.nom = nom; }

    /**
     * get la superficie de cet enclos
     * @return superficie
     */
    public double getSuperficie() { return this.superficie; }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNb_max_animaux() {
        return nb_max_animaux;
    }
    public void setNb_max_animaux(int nb_max_animaux) {
        this.nb_max_animaux = nb_max_animaux;
    }

    public int getNb_animaux_pres() {
        return nb_animaux_pres;
    }
    public void setNb_animaux_pres(int nb_animaux_pres) {
        this.nb_animaux_pres = nb_animaux_pres;
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }
    public void setAnimaux(ArrayList<Animal> animaux) {
        this.animaux.clear();
        for ( int i = 1; i <= animaux.size(); i++ )
            this.ajouterAnimal( animaux.get(i) );
    }
    public void setAnimaux(Animal[] animaux) {
        this.animaux.clear();
        for ( int i = 0; i < animaux.length; i++ )
            this.ajouterAnimal( animaux[i] );
    }

    public String getProprete() {
        return proprete;
    }
    public void setProprete(String proprete) {
        this.proprete = proprete;
    }

    public void ajouterAnimaux(ArrayList<Animal> listAnimaux) {
        for ( int i = 1; i <= listAnimaux.size(); i++ )
            this.ajouterAnimal( listAnimaux.get(i) );
    }

    public void ajouterAnimaux(Animal[] listAnimaux) {
        for ( int i = 0; i < listAnimaux.length; i++ )
            this.ajouterAnimal( listAnimaux[i] );
    }

    public void ajouterAnimal(Animal animal) {
        if (this.animaux.size() == 0)
        {
            if ( animal.isSavoirNager() )
            {
                System.out.println(animal.getNom() + " ne peut pas être ajouté dans un enclos, il faut lui mettre dans un aquarium");
            }
            if ( animal.isSavoirVoler() )
            {
                System.out.println(animal.getNom() + " ne peut pas être ajouté dans un enclos, il faut lui mettre dans un volière");
            }

            if ( !animal.isSavoirNager() && !animal.isSavoirVoler() )
            {
                this.animaux.add(animal);
            }
        }
        else
        {
            if (animal.getClass().getName().equals(this.animaux.get(0).getClass().getName()))
            {
                if (this.animaux.size() >= this.nb_max_animaux)
                {
                    System.out.println("Cet enclos est plein.");
                }
                else
                {
                    this.animaux.add(animal);
                    this.nb_animaux_pres = this.animaux.size();
                }
            }
            else
            {
                System.out.println("Cet animal ne peut pas être ajouté dans cet enclos, car il n'est pas de la même espèce.");
            }
        }
    }

    public void enleverAnimaux( ArrayList<Animal> listAnimaux ) {
        for ( int i = 1; i <= listAnimaux.size(); i++ )
            this.enleverAnimal( listAnimaux.get(i) );
    }

    public void enleverAnimaux( Animal[] listAnimaux ) {
        for ( int i = 0; i < listAnimaux.length; i++ )
            this.enleverAnimal( listAnimaux[i] );
    }

    public void enleverAnimal(Animal animal) {
        for ( Animal a : this.animaux )
            if ( a.equals(animal) )
                this.animaux.remove(a);
    }

    public void nourrirAnimaux() {
        for ( Animal a : this.animaux ) {
            if ( a.isFaim() == true ) {
                System.out.println( a.getNom() + " a été nourri" );
                a.setFaim(false);
            }
        }
    }

    public void entretienEnclos() {
        if ( this.proprete.equals("mauvais") && this.nb_animaux_pres == 0 ) {
            this.setProprete("bon");
        }
    }

    @Override
    public String toString() {
        return "Enclos {" +
                "nom = '" + nom + '\'' +
                ", superficie = " + superficie +
                ", nb_max_animaux = " + nb_max_animaux +
                ", nb_animaux_pres = " + nb_animaux_pres +
                ", animaux = " + animaux +
                ", proprete = '" + proprete + '\'' +
                '}';
    }
}
