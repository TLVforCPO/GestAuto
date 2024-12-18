/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 * 
 */
package Classes;

import java.util.Scanner;

public class Vehicule extends Modele {

    //Attributs
    private int ID_vehicule, kilometrage_vehicule, ID_concession, ID_commande, ID_modele;
    private String date_mec_vehicule, etat_vehicule, disponibilite_vehicule, prix_vehicule;

    //Constructeurs
    public Vehicule(int ID_vehicule, int kilometrage_vehicule, int ID_concession, int ID_commande, int ID_modele, String date_mec_vehicule, String etat_vehicule, String disponibilite_vehicule, int ID_marque, String nom_modele, String nom_marque, String pays_marque, String prix_vehicule) {
        super(ID_marque, ID_modele, nom_modele, nom_marque, pays_marque);
        this.ID_commande = ID_commande;
        this.ID_concession = ID_concession;
        this.ID_modele = ID_modele;
        this.ID_vehicule = ID_vehicule;
        this.date_mec_vehicule = date_mec_vehicule;//MEC : Mise en circulation
        this.disponibilite_vehicule = disponibilite_vehicule;
        this.etat_vehicule = etat_vehicule;
        this.kilometrage_vehicule = kilometrage_vehicule;
        this.prix_vehicule = prix_vehicule;
    }

    //Méthodes
    public String versFichier() {
        return String.valueOf(ID_vehicule + ";" + kilometrage_vehicule + ";" + ID_concession + ";" + ID_commande + ";" + ID_modele + ";" + date_mec_vehicule + ";" + etat_vehicule + ";" + disponibilite_vehicule + ";" + this.getIDMarque() + ";" + this.getNomModele() + ";" + this.getNomMarque() + ";" + this.getPaysMarque() + ";" + prix_vehicule);
    }

    public String toString() {
        return "ID_vehicule : " + ID_vehicule + System.lineSeparator() + "ID_concession : " + ID_concession + System.lineSeparator() + "ID_commande : " + ID_commande + System.lineSeparator() + "ID_modele : " + ID_modele + System.lineSeparator() + "ID_marque : " + this.getIDMarque() + System.lineSeparator() + "kilometrage_vehicule : " + kilometrage_vehicule + System.lineSeparator() + "date_mec_vehicule : " + date_mec_vehicule + System.lineSeparator() + "etat_vehicule : " + etat_vehicule + System.lineSeparator() + "disponibilite_vehicule : " + disponibilite_vehicule + System.lineSeparator() + "nom_modele : " + this.getNomModele() + System.lineSeparator() + "nom_marque : " + this.getNomMarque() + System.lineSeparator() + "pays_marque : " + this.getPaysMarque() + System.lineSeparator() + "Prix : " + prix_vehicule + System.lineSeparator();
    }

    public String getDispo() {
        return disponibilite_vehicule;
    }
    
    public String getPrix(){
        return prix_vehicule;
    }
    
    public void majVente(int ID_commande){
        this.ID_commande=ID_commande;
        this.disponibilite_vehicule="non";
    }
    
    public void modifKilo(){
        System.out.println("Entrez le nouveau kilométrage :");
        Scanner sc = new Scanner(System.in);
        int kilo=sc.nextInt();
        this.kilometrage_vehicule=kilo;
    }
    
    public void modifEtat(){
        System.out.println("Entrez le nouvel état :");
        Scanner sc = new Scanner(System.in);
        String etat=sc.nextLine();
        this.etat_vehicule=etat;
    }
    
    public void modifPrix(){
        System.out.println("Entrez le nouveau prix :");
        Scanner sc = new Scanner(System.in);
        String prix=sc.nextLine();
        this.prix_vehicule=prix;
    }
    
    public int getIDConc(){
        return ID_concession;
    }
}
