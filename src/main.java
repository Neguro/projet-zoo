//Ceci importe la classe Scanner du package java.util
import animal.*;
import employe.Employe;
import enclos.*;
import zoo.Zoo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println('\n');
        System.out.println("############# MENU ###############");
        System.out.println("1 - Démarrer la simulation 1");
        System.out.println("2 - Démarrer la simulation 2");
        System.out.println("3 - Démarrer la simulation 3");
        System.out.println("4 - Démarrer la simulation 4");
        System.out.println("5 - Démarrer la simulation 5");
        System.out.println("Q - Quitter le terminal");
        System.out.println("##################################");
        String value = sc.nextLine();

        while(value != "q") {
            switch (value) {
                case "1":
                    launchSimulation1(); //lance la simulation 1
                    System.out.println("Vous avez lancé la simulation 1");
                    break;
                case "2":
                    launchSimulation2(); //lance la simulation 2
                    System.out.println("Vous avez lancé la simulation 2");
                    break;
                case "3":
                    launchSimulation3(); //lance la simulation 3
                    System.out.println("Vous avez lancé la simulation 3");
                    break;
                case "4":
                    launchSimulation4(); //lance la simulation 4
                    System.out.println("Vous avez lancé la simulation 4");
                    break;
                case "5":
                    launchSimulation5(); //lance la simulation 5
                    System.out.println("Vous avez lancé la simulation 5");
                    break;
                case "Q":
                case "q":
                    System.out.println("Merci vous allez quitter le terminal");
                    System.exit(0);
                    break;
                default:
                    System.out.println("le caractère tapé n'existe pas dans le menu");
                    break;
            }

            System.out.println('\n');
            System.out.println("############# MENU ###############");
            System.out.println("1 - Démarrer la simulation 1");
            System.out.println("2 - Démarrer la simulation 2");
            System.out.println("3 - Démarrer la simulation 3");
            System.out.println("4 - Démarrer la simulation 4");
            System.out.println("5 - Démarrer la simulation 5");
            System.out.println("Q - Quitter le terminal");
            System.out.println("##################################");

            value = sc.nextLine();
        }

    }
    public static void launchSimulation1()
    {
        // Simulation de création d'un enclos
        System.out.println("Simulation de création d'un enclos");
        Employe employe = new Employe("Zidane","M",43);
        Zoo zoo = new Zoo("Zoo_1",employe,4);
        System.out.println("le zoo " + zoo.getNom() + " a éte crée");

        // Création des enclos
        Enclos enclos = new Enclos("Enclos des loup",20.0, 2,"bon");
        Enclos enclos_2 = new Enclos("Enclos ours",20.0, 2,"bon");
        Aquarium enclos_3 = new Aquarium("Aquarium des balaines",200.0, 3,3,"mauvais",50.0,5);
        Voliere enclos_4 = new Voliere("Voliere des aigles",20.0, 1,2,"bon");

        // Affichage des enclos
        System.out.println("l'enclos " + enclos.getNom() + " a été crée");
        System.out.println("l'enclos " + enclos_2.getNom() + " a été crée");
        System.out.println("l'aquarium " + enclos_3.getNom() + " a été crée");
        System.out.println("la volière " + enclos_4.getNom() + " a été crée");

        // Création des animaux
        Loup loup_1 = new Loup("Morty","M",35,12,4,false,false,true,0,false);
        Loup loup_2 = new Loup("Rick","F",30,11,3,false,false,true,0,false);
        System.out.println("Les loups ont été crée : " + loup_1.getNom() + " / " + loup_2.getNom());
        enclos.ajouterAnimal(loup_1);
        enclos.ajouterAnimal(loup_2);
        System.out.println("Les loups " + loup_1.getNom() + " et " + loup_2.getNom() + " ont été ajouter à l'enclos " + enclos.getNom());

        Ours ours_1 = new Ours("Robert","M",35,12,4,false,false,true,0);
        Ours ours_2 = new Ours("Michel","F",30,11,3,false,false,true,0);
        System.out.println("Les ours ont été crée : " + ours_1.getNom() + " / " + ours_2.getNom());
        enclos_2.ajouterAnimal(ours_1);
        enclos_2.ajouterAnimal(ours_2);
        System.out.println("Les ours " + ours_1.getNom() + " et " + ours_2.getNom() + " ont été ajouter à l'enclos " + enclos_2.getNom());

        Baleine baleine_1 = new Baleine("Luc","M",35,12,4,false,false,true,0);
        Baleine baleine_2 = new Baleine("Lucie","F",30,11,3,false,false,true,0);
        System.out.println("Les baleines ont été crée : " + baleine_1.getNom() + " / " + baleine_2.getNom());
        enclos_3.ajouterAnimal(baleine_1);
        enclos_3.ajouterAnimal(baleine_2);
        System.out.println("Les baleines " + baleine_1.getNom() + " et " + baleine_2.getNom() + " ont été ajouter à l'aquarium " + enclos_3.getNom());

        Aigle aigle_1 = new Aigle("Phillipe","M",15,25,2,false,false,true,0);
        Aigle aigle_2 = new Aigle("Dory","F",12,20,3,false,false,true,0);
        System.out.println("Les aigles ont été crée : " + aigle_1.getNom() + " / " + aigle_2.getNom());
        enclos_4.ajouterAnimal(aigle_1);
        enclos_4.ajouterAnimal(aigle_2);
        System.out.println("Les aigles " + aigle_1.getNom() + " et " + aigle_2.getNom() + " ont été ajouter à l'enclos " + enclos_4.getNom());

        // Entretien d'un enclos
        System.out.println("Etat de l'aquarium " + enclos_3.getNom() + " est : " + enclos_3.getProprete());
        System.out.println("L'employé " + employe.getNom() + " va nettoyer l'enclos");
        enclos_3.entretienEnclos();
        System.out.println("le nettoyage et terminer");
        System.out.println("Etat de l'aquarium " + enclos_3.getNom() + " est : " + enclos_3.getProprete());
    }


    public static void launchSimulation2()
    {
        // simulation de manger et soigner

        // Simulation de création d'un enclos
        System.out.println("Simulation de création d'un enclos");
        Employe employe = new Employe("Zidane","M",43);
        Zoo zoo = new Zoo("Zoo_1",employe,4);
        System.out.println("le zoo " + zoo.getNom() + " a éte crée");

        // Création d'enclos
        Enclos enclos = new Enclos("Enclos des loup",20.0, 2,"bon");

        // Affichage des enclos
        System.out.println("l'enclos " + enclos.getNom() + " a été crée");

        // Création des loups
        Loup loup_1 = new Loup("Morty","M",35,12,4,true,false,true,0,false);
        Loup loup_2 = new Loup("Rick","F",30,11,3,false,false,false,0,false);
        System.out.println("Les loups ont été crée : " + loup_1.getNom() + " / " + loup_2.getNom());
        enclos.getAnimaux().add(loup_1);
        enclos.getAnimaux().add(loup_2);
        System.out.println("Les loups " + loup_1.getNom() + " et " + loup_2.getNom() + " ont été ajouter à l'enclos " + enclos.getNom());

        loup_1.manger();
        loup_2.manger();

        loup_1.soigner();
        loup_2.soigner();
    }

    public static void launchSimulation3()
    {
        // simulation de dormir se reveiller

        // Simulation de création d'un enclos
        System.out.println("Simulation de création d'un enclos");
        Employe employe = new Employe("Zidane","M",43);
        Zoo zoo = new Zoo("Zoo_1",employe,4);
        System.out.println("le zoo " + zoo.getNom() + " a éte crée");

        // Création des enclos

        Enclos enclos_2 = new Enclos("Enclos ours",20.0, 2,"bon");

        // Affichage des enclos

        System.out.println("l'enclos " + enclos_2.getNom() + " a été crée");

        // Création des animaux

        Ours ours_1 = new Ours("Robert","M",35,12,4,false,true,true,0);
        Ours ours_2 = new Ours("Michel","F",30,11,3,false,true,true,0);
        System.out.println("Les ours ont été crée : " + ours_1.getNom() + " / " + ours_2.getNom());
        enclos_2.ajouterAnimal(ours_1);
        enclos_2.ajouterAnimal(ours_2);
        System.out.println("Les ours " + ours_1.getNom() + " et " + ours_2.getNom() + " ont été ajouter à l'enclos et dorment " + enclos_2.getNom());

        ours_1.reveiller();
        ours_2.reveiller();
    }

    public static void launchSimulation4()
    {
        // simulation de balade + bruit

        // Simulation de création d'un Zoo
        System.out.println("Simulation de création d'un enclos");
        Employe employe = new Employe("Zidane","M",43);
        Zoo zoo = new Zoo("Zoo_1",employe,4);
        System.out.println("le zoo " + zoo.getNom() + " a éte crée");

        // Création des enclos
        Enclos enclos = new Enclos("Enclos Loup",20.0, 4,"bon");

        // Affichage des enclos
        System.out.println("l'enclos " + enclos.getNom() + " a été crée");

        // Création des animaux
        Loup loup_1 = new Loup("Robert","M",35,12,4,false,false,true,0, true);
        Loup loup_2 = new Loup("Michel","F",30,11,3,false,false,true,0, true);
        System.out.println("Les loups ont été crée : " + loup_1.getNom() + " / " + loup_2.getNom());
        enclos.ajouterAnimal(loup_1);
        enclos.ajouterAnimal(loup_2);
        System.out.println("Les Loups " + loup_1.getNom() + " et " + loup_2.getNom() + " ont été ajouter à l'enclos " + enclos.getNom());
        loup_1.vagabonder();
        loup_2.vagabonder();
        loup_1.emettreSon();
        loup_2.emettreSon();

    }

    public static void launchSimulation5()
    {
        // simulation de bebe
        System.out.println("Simulation de création d'un enclos");
        Employe employe = new Employe("Zidane","M",43);
        Zoo zoo = new Zoo("Zoo_1",employe,4);
        System.out.println("le zoo " + zoo.getNom() + " a éte crée");

        // Création des enclos
        Enclos enclos = new Enclos("Enclos des loup",20.0, 2,"bon");
        Loup loup_1 = new Loup("Morty","M",35,12,4,true,false,true,0,false);
        Loup loup_2 = new Loup("Rick","F",30,11,3,false,false,false,0,false);
        System.out.println("Les loups ont été crée : " + loup_1.getNom() + " / " + loup_2.getNom());
        enclos.ajouterAnimal(loup_1);
        enclos.ajouterAnimal(loup_2);
        System.out.println("Les loups " + loup_1.getNom() + " et " + loup_2.getNom() + " ont été ajouter à l'enclos " + enclos.getNom());

        System.out.println("Tentative de mise a bas pour " + loup_1.getNom() + " de sexe " + loup_1.getSexe());
        loup_1.mettreBas();
        System.out.println("Tentative de mise a bas pour " + loup_2.getNom() + " de sexe " + loup_2.getSexe());
        loup_2.mettreBas();
    }
}
