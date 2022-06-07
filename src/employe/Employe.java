package employe;

public class Employe {
    private String nom;
    private String sexe;
    private int age;

    // ------------ Constructeur ------------

    /**
     * @param nom
     * @param sexe
     * @param age
     */
    public Employe(String nom, String sexe, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    /**
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return âge
     */
    public int getAge() {
        return age;
    }

    /**
     * @param âge
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void examinerEnclos() {

    }

    @Override
    public String toString() {
        return "Employe {" +
                "nom = '" + nom + '\'' +
                ", sexe = '" + sexe + '\'' +
                ", age = " + age +
                '}';
    }
}