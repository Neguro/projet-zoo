package animal;

import java.util.Objects;

/**
 * @author FANG Jingyao, AHMED ALI Nassim, PEZONE Lucas
 * @version 1.1
 */
public class Animal {
    private String nom;
    private String sexe;
    private int poids;
    private int taille;
    private int age;
    private boolean faim; //true si l'animal a faim, false si l'animal n'a pas faim
    private boolean sommeil; //true si l'animal dorm, false si l'animal se réveille
    private boolean sante; //true si l'animal reste en bonne santé, false s'il est malade
    private boolean savoirNager; //true si l'animal peut nager
    private boolean savoirVoler; //true si l'animal peut voler

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
     */
    public Animal(String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante, boolean savoirNager, boolean savoirVoler) {
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.faim = faim;
        this.sommeil = sommeil;
        this.sante = sante;
        this.savoirNager = savoirNager;
        this.savoirVoler = savoirVoler;
    }

    /**
     * set le nom de cet animal
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * set le sexe de cet animal
     * @param sexe
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * set le poids de cet animal
     * @param poids
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }

    /**
     * set la taille de cet animal
     * @param taille
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }

    /**
     * set âge de cet animal
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * set si l'animal a faim
     * @param faim
     */
    public void setFaim(boolean faim) {
        this.faim = faim;
    }

    /**
     * set si l'animal est en train de dormir
     * @param sommeil
     */
    public void setSommeil(boolean sommeil) {
        this.sommeil = sommeil;
    }

    /**
     * set si l'animal reste en bonne santé
     * @param sante
     */
    public void setSante(boolean sante) {
        this.sante = sante;
    }

    /**
     * set si l'animal savoir nager
     * @param savoirNager
     */
    public void setSavoirNager(boolean savoirNager) {
        this.savoirNager = savoirNager;
    }

    /**
     * set si l'animal savoir voler
     * @param savoirVoler
     */
    public void setSavoirVoler(boolean savoirVoler) {
        this.savoirVoler = savoirVoler;
    }

    /**
     * get le nom de cet animal
     * @return nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * get le sexe de cet animal
     * @return sexe
     */
    public String getSexe() {
        return this.sexe;
    }

    /**
     * get le poids de cet animal
     * @return poids
     */
    public int getPoids() {
        return this.poids;
    }

    /**
     * get la taille de cet animal
     * @return taille
     */
    public int getTaille() {
        return this.taille;
    }

    /**
     * get l'âge de cet animal
     * @return age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * get si l'animal a faim
     * @return faim
     */
    public boolean isFaim() {
        return this.faim;
    }

    /**
     * get si l'animal est en train de dormir
     * @return sommeil
     */
    public boolean isSommeil() {
        return this.sommeil;
    }

    /**
     * get si l'animal reste en bonne santé
     * @return sante
     */
    public boolean isSante() {
        return this.sante;
    }

    /**
     * get si l'animal savoir nager
     * @return savoirNager
     */
    public boolean isSavoirNager() {
        return this.savoirNager;
    }

    /**
     * get si l'animal savoir voler
     * @return savoirVoler
     */
    public boolean isSavoirVoler() {
        return this.savoirVoler;
    }

    /**
     * Nourrir l'animal
     */
    public void manger() {
        if ( this.sommeil )
            return;
        if ( this.isFaim() )
            System.out.println(this.getNom() + " mange, et il n'a pas faim maintenant");
        else
            System.out.println(this.getNom() + " ne mange pas, car il n'a pas faim maintenant");
        this.setFaim(false);
    }

    /**
     * L'animal peut emettre son
     */
    public void emettreSon() {
        System.out.println(this.getNom() + " émet son blabla");
    }

    /**
     * Soigner cet animal
     */
    public void soigner() {
        if ( this.isSante() )
            System.out.println(this.getNom() + " est en bonne santé, pas besoin de soigner");
        else
            System.out.println(this.getNom() + " vient d'être soigné, il est en bonne santé maintenant");
        this.sante = true;
    }

    /**
     * set l'état de cet animal en non-veille
     */
    public void reveiller() {
        System.out.println(this.getNom() + " se réveille");
        this.sommeil = false;
    }

    /**
     * set l'état de cet animal en veille
     */
    public void dormir() {
        System.out.println(this.getNom() + " s'endors");
        this.sommeil = true;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "nom = '" + nom + '\'' +
                ", sexe = '" + sexe + '\'' +
                ", poids = " + poids +
                ", taille = " + taille +
                ", age = " + age +
                ", faim = " + faim +
                ", sommeil = " + sommeil +
                ", sante = " + sante +
                '}';
    }

    public boolean equals(Animal a) {
        if (this == a) return true;
        Animal animal = a;
        return this.poids == animal.poids && this.taille == animal.taille && this.age == animal.age && this.faim == animal.faim && this.sommeil == animal.sommeil && this.sante == animal.sante && this.nom.equals(animal.nom) && this.sexe.equals(animal.sexe);
    }
}