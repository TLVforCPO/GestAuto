/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principale {

    //Attributs
    private ArrayList<Acheter> tAcheter;
    private ArrayList<Administrer> tAdministrer;
    private ArrayList<Article> tArticle;
    private ArrayList<Client> tClient;
    private ArrayList<Commande> tCommande;
    private ArrayList<Concession> tConcession;
    private ArrayList<Employe> tEmploye;
    private ArrayList<Facture> tFacture;
    private ArrayList<Gerer> tGerer;
    private ArrayList<Marque> tMarque;
    private ArrayList<Modele> tModele;
    private ArrayList<Traiter> tTraiter;
    private ArrayList<Vehicule> tVehicule;
    private int indiceConnexion;

    //Constructeurs
    public Principale() {
        tAcheter = new ArrayList<Acheter>();
        tAdministrer = new ArrayList<Administrer>();
        tArticle = new ArrayList<Article>();
        tClient = new ArrayList<Client>();
        tCommande = new ArrayList<Commande>();
        tConcession = new ArrayList<Concession>();
        tEmploye = new ArrayList<Employe>();
        tFacture = new ArrayList<Facture>();
        tGerer = new ArrayList<Gerer>();
        tMarque = new ArrayList<Marque>();
        tModele = new ArrayList<Modele>();
        tTraiter = new ArrayList<Traiter>();
        tVehicule = new ArrayList<Vehicule>();
    }

    //Méthodes
    //Permet de sauvegarder les données dans un fichier texte
    public void sauvegarder() throws IOException {
        File SaveGame = new File("test.txt");
        FileWriter filewriter = new FileWriter(SaveGame);
        //Tableau acheter :
        //ID_commande;ID_article;date_achat;quantite_achat
        filewriter.write("tAcheter" + System.lineSeparator());
        filewriter.write(String.valueOf(tAcheter.size()) + System.lineSeparator());
        for (int i = 0; i < tAcheter.size(); i++) {
            filewriter.write(tAcheter.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau administrer :
        //ID_employe;ID_article;date_modif_article
        filewriter.write("tAdministrer" + System.lineSeparator());
        filewriter.write(String.valueOf(tAdministrer.size()) + System.lineSeparator());
        for (int i = 0; i < tAdministrer.size(); i++) {
            filewriter.write(tAdministrer.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau article :
        //ID_article;stock_article;ID_concession;nom_article;desc_article;PU_article
        filewriter.write("tArticle" + System.lineSeparator());
        filewriter.write(String.valueOf(tArticle.size()) + System.lineSeparator());
        for (int i = 0; i < tArticle.size(); i++) {
            filewriter.write(tArticle.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau client :
        //ID_client;nom_client;prenom_client;adresse_client;tel_client;email_client;mdp_client
        filewriter.write("tClient" + System.lineSeparator());
        filewriter.write(String.valueOf(tClient.size()) + System.lineSeparator());
        for (int i = 0; i < tClient.size(); i++) {
            filewriter.write(tClient.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau commande :
        //ID_commande;date_commande;prix_commande;ID_concession;ID_client
        filewriter.write("tCommande" + System.lineSeparator());
        filewriter.write(String.valueOf(tCommande.size()) + System.lineSeparator());
        for (int i = 0; i < tCommande.size(); i++) {
            filewriter.write(tCommande.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau concession :
        //ID_concession;SIRET_concession;nom_concession;adresse_concession
        filewriter.write("tConcession" + System.lineSeparator());
        filewriter.write(String.valueOf(tConcession.size()) + System.lineSeparator());
        for (int i = 0; i < tConcession.size(); i++) {
            filewriter.write(tConcession.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau employe :
        //ID_employe;tel_employe;ID_concession;nom_employe;prenom_employe;adresse_employe;email_employe;mdp_employe;statut_employe
        filewriter.write("tEmploye" + System.lineSeparator());
        filewriter.write(String.valueOf(tEmploye.size()) + System.lineSeparator());
        for (int i = 0; i < tEmploye.size(); i++) {
            filewriter.write(tEmploye.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau facture :
        //ID_client;ID_commande;ID_concession;ID_facture;date_facture;prix_facture
        filewriter.write("tFacture" + System.lineSeparator());
        filewriter.write(String.valueOf(tFacture.size()) + System.lineSeparator());
        for (int i = 0; i < tFacture.size(); i++) {
            filewriter.write(tFacture.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau gerer :
        //ID_vehicule;ID_employe;date_modif_vehicule
        filewriter.write("tGerer" + System.lineSeparator());
        filewriter.write(String.valueOf(tGerer.size()) + System.lineSeparator());
        for (int i = 0; i < tGerer.size(); i++) {
            filewriter.write(tGerer.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau Marque :
        //ID_marque;nom_marque;pays_marque
        filewriter.write("tMarque" + System.lineSeparator());
        filewriter.write(String.valueOf(tMarque.size()) + System.lineSeparator());
        for (int i = 0; i < tMarque.size(); i++) {
            filewriter.write(tMarque.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau Modele :
        //ID_marque;ID_modele;nom_modele;nom_marque;pays_marque
        filewriter.write("tModele" + System.lineSeparator());
        filewriter.write(String.valueOf(tModele.size()) + System.lineSeparator());
        for (int i = 0; i < tModele.size(); i++) {
            filewriter.write(tModele.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau Traiter :
        //ID_employe;ID_commande;date_traitement
        filewriter.write("tTraiter" + System.lineSeparator());
        filewriter.write(String.valueOf(tTraiter.size()) + System.lineSeparator());
        for (int i = 0; i < tTraiter.size(); i++) {
            filewriter.write(tTraiter.get(i).versFichier() + System.lineSeparator());
        }
        //Tableau Véhicule :
        //ID_vehicule;kilometrage_vehicule;ID_concession;ID_commande;ID_modele;date_mec_vehicule;etat_vehicule;disponibilite_vehicule;ID_marque;nom_modele;nom_marque;pays_marque;prix_vehicule
        filewriter.write("tVehicule" + System.lineSeparator());
        filewriter.write(String.valueOf(tVehicule.size()) + System.lineSeparator());
        for (int i = 0; i < tVehicule.size(); i++) {
            filewriter.write(tVehicule.get(i).versFichier() + System.lineSeparator());
        }
        filewriter.close();
        System.out.println("Base de donnée enregistrée");
    }

    //Permet de charger la base de donnée
    public void charger() throws FileNotFoundException, IOException {
        String[] temp;
        int taille;
        FileReader filereader = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(filereader);
        if (br.readLine().equals("tAcheter")) {
            System.out.println("tAcheter ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tAcheter : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tAcheter.add(new Acheter(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2], Integer.parseInt(temp[3])));
            }
        } else {
            System.out.println("tAcheter ko");
        }
        if (br.readLine().equals("tAdministrer")) {
            System.out.println("tAdministrer ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tAdministrer : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tAdministrer.add(new Administrer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2]));
            }
        } else {
            System.out.println("tAdministrer ko");
        }
        if (br.readLine().equals("tArticle")) {
            System.out.println("tArticle ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tArticle : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tArticle.add(new Article(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), temp[3], temp[4], temp[5]));
            }
        } else {
            System.out.println("tArticle ko");
        }
        if (br.readLine().equals("tClient")) {
            System.out.println("tClient ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tClient : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tClient.add(new Client(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[5], temp[6]));
            }
        } else {
            System.out.println("tClient ko");
        }
        if (br.readLine().equals("tCommande")) {
            System.out.println("tCommande ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tCommande : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tCommande.add(new Commande(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), temp[3], temp[4]));
            }
        } else {
            System.out.println("tCommande ko");
        }
        if (br.readLine().equals("tConcession")) {
            System.out.println("tConcession ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tConcession : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tConcession.add(new Concession(Integer.parseInt(temp[0]), (temp[1]), temp[2], temp[3]));
            }
        } else {
            System.out.println("tConcession ko");
        }
        if (br.readLine().equals("tEmploye")) {
            System.out.println("tEmploye ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tEmploye : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tEmploye.add(new Employe(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]));
            }
        } else {
            System.out.println("tEmploye ko");
        }
        if (br.readLine().equals("tFacture")) {
            System.out.println("tFacture ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tFacture : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tFacture.add(new Facture(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5]));
            }
        } else {
            System.out.println("tFacture ko");
        }
        if (br.readLine().equals("tGerer")) {
            System.out.println("tGerer ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tGerer : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tGerer.add(new Gerer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2]));
            }
        } else {
            System.out.println("tGerer ko");
        }
        if (br.readLine().equals("tMarque")) {
            System.out.println("tMarque ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tMarque : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tMarque.add(new Marque(Integer.parseInt(temp[0]), temp[1], temp[2]));
            }
        } else {
            System.out.println("tMarque ko");
        }
        if (br.readLine().equals("tModele")) {
            System.out.println("tModele ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tModele : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tModele.add(new Modele(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2], temp[3], temp[4]));
            }
        } else {
            System.out.println("tModele ko");
        }
        if (br.readLine().equals("tTraiter")) {
            System.out.println("tTraiter ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tTraiter : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tTraiter.add(new Traiter(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2]));
            }
        } else {
            System.out.println("tTraiter ko");
        }
        if (br.readLine().equals("tVehicule")) {
            System.out.println("tVehicule ok");
            taille = Integer.parseInt(br.readLine());
            System.out.println("taille tVehicule : " + taille);
            for (int i = 0; i < taille; i++) {
                temp = br.readLine().split(";");
                tVehicule.add(new Vehicule(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], temp[7], Integer.parseInt(temp[8]), temp[9], temp[10], temp[11], temp[12]));
            }
        } else {
            System.out.println("tVehicule ko");
        }
        System.out.println("Base de donnée chargée");
    }

    //Permet de démarrer le système
    public void start() throws IOException {
        this.charger();
        System.out.println();
        System.out.println("Bienvenue sur GEST'AUTO !");
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Que voulez-vous faire ?");
                System.out.println("1) Connexion client");
                System.out.println("2) Connexion employe");
                System.out.println("3) EXIT");
                System.out.println();
                System.out.println("Choix :");
                choix = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (choix == 1) {
                this.connexionClient();
                b = true;
            } else if (choix == 2) {
                this.connexionEmploye();
                b = true;
            } else if (choix == 3) {
                b = true;
            } else if (b2 == false) {
                System.out.println("Choix impossible, réessayez !");
            }
        }
    }

    //Portail de connexion client
    public void connexionClient() throws IOException {
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        String ID = "";
        String mdp = "";
        while (b == false) {
            System.out.println("Entrez votre identifiant (email) :");
            ID = sc.nextLine();
            System.out.println("Entrez votre mot de passe :");
            mdp = sc.nextLine();
            for (int i = 0; i < tClient.size(); i++) {
                if (tClient.get(i).getEmail().equals(ID)) {
                    if (tClient.get(i).getMDP().equals(mdp)) {
                        this.accueilClient();
                        indiceConnexion = i;
                        b = true;
                    } else {
                        System.out.println("Mot de passe inconnu, réessayez !");
                        System.out.println();
                    }
                } else {
                    System.out.println("Identifiant inconnu, réessayez !");
                    System.out.println();
                }
            }
        }
    }

    //Portail de connexion employé
    public void connexionEmploye() throws IOException {
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        String ID = "";
        String mdp = "";
        while (b == false) {
            System.out.println("Entrez votre identifiant (email) :");
            ID = sc.nextLine();
            System.out.println("Entrez votre mot de passe :");
            mdp = sc.nextLine();
            for (int i = 0; i < tEmploye.size(); i++) {
                if (tEmploye.get(i).getEmail().equals(ID)) {
                    if (tEmploye.get(i).getMDP().equals(mdp)) {
                        this.accueilEmploye();
                        indiceConnexion = i;
                        b = true;
                    } else {
                        System.out.println("Mot de passe inconnu, réessayez !");
                        System.out.println();
                    }
                } else {
                    System.out.println("Identifiant inconnu, réessayez !");
                    System.out.println();
                }
            }
        }
    }

    //Page d'accueil espace client
    public void accueilClient() throws IOException {
        System.out.println();
        System.out.println("ACCUEIL CLIENT :");
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Que voulez-vous faire ?");
                System.out.println("1) Voir les véhicules disponibles");
                System.out.println("2) Voir les articles disponibles");
                System.out.println("3) Modifier mes informations");
                System.out.println("4) Voir mes informations");
                System.out.println("5) EXIT");
                System.out.println();
                System.out.println("Choix :");
                choix = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (choix == 1) {
                this.listeVehiculeClient();
                b = true;
            } else if (choix == 2) {
                this.listeArticleClient();
                b = true;
            } else if (choix == 3) {
                this.modifInfoClient();
                b = true;
            } else if (choix == 4) {
                System.out.println(tClient.get(indiceConnexion));
            } else if (choix == 5) {
                b = true;
            } else if (b2 == false) {
                System.out.println("Choix impossible, réessayez !");
            }
        }
    }

    public void modifInfoClient() throws IOException {
        System.out.println();
        System.out.println("Mes informations :");
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Que voulez-vous modifier ?");
                System.out.println("1) Nom");
                System.out.println("2) Prenom");
                System.out.println("3) Adresse");
                System.out.println("4) Numéro de téléphone");
                System.out.println("5) Email");
                System.out.println("6) Mot de passe");
                System.out.println("7) Retour à l'accueil");
                System.out.println();
                System.out.println("Choix :");
                choix = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (choix == 1) {
                boolean b3 = false;
                while (b3 == false) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Entrez le nouveau nom :");
                    String nom = sc.nextLine();
                    if (nom != null && !nom.isEmpty()) {
                        tClient.get(indiceConnexion).modifNom(nom);
                        b3 = true;
                    } else {
                        System.out.println("Erreur, réessayez !");
                    }
                }
                this.accueilClient();
                b = true;
            } else if (choix == 2) {
                boolean b3 = false;
                while (b3 == false) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Entrez le nouveau prénom :");
                    String prenom = sc.nextLine();
                    if (prenom != null && !prenom.isEmpty()) {
                        tClient.get(indiceConnexion).modifPrenom(prenom);
                        b3 = true;
                    } else {
                        System.out.println("Erreur, réessayez !");
                    }
                }
                this.accueilClient();
                b = true;
            } else if (choix == 3) {
                boolean b3 = false;
                while (b3 == false) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Entrez la nouvelle adresse :");
                    String adresse = sc.nextLine();
                    if (adresse != null && !adresse.isEmpty()) {
                        tClient.get(indiceConnexion).modifAdresse(adresse);
                        b3 = true;
                    } else {
                        System.out.println("Erreur, réessayez !");
                    }
                }
                this.accueilClient();
                b = true;
            } else if (choix == 4) {
                boolean b3 = false;
                while (b3 == false) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Entrez le nouveau numéro de téléphone :");
                    String tel = sc.nextLine();
                    if (tel != null && !tel.isEmpty()) {
                        tClient.get(indiceConnexion).modifTel(tel);
                        b3 = true;
                    } else {
                        System.out.println("Erreur, réessayez !");
                    }
                }
                this.accueilClient();
                b = true;
            } else if (choix == 5) {
                boolean b3 = false;
                while (b3 == false) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Entrez le nouvel email :");
                    String email = sc.nextLine();
                    if (email != null && !email.isEmpty()) {
                        tClient.get(indiceConnexion).modifEmail(email);
                        b3 = true;
                    } else {
                        System.out.println("Erreur, réessayez !");
                    }
                }
                this.accueilClient();
                b = true;
            } else if (choix == 6) {
                boolean b3 = false;
                while (b3 == false) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Entrez le nouvel mot de passe :");
                    String mdp = sc.nextLine();
                    if (mdp != null && !mdp.isEmpty()) {
                        tClient.get(indiceConnexion).modifEmail(mdp);
                        b3 = true;
                    } else {
                        System.out.println("Erreur, réessayez !");
                    }
                }
                this.accueilClient();
                b = true;
            } else if (choix == 7) {
                this.accueilClient();
                b = true;
            } else if (b2 == false) {
                System.out.println("Choix impossible, réessayez !");
            }
        }
        this.sauvegarder();
    }

    //Permet de lister les articles
    public void listeArticleClient() throws IOException {
        System.out.println("LISTE DES ARTICLES :");
        System.out.println();
        for (int i = 0; i < tArticle.size(); i++) {
            System.out.println("Article " + i + " :");
            System.out.println(tArticle.get(i));
        }
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Que voulez-vous faire ?");
                System.out.println("1) Acheter un article");
                System.out.println("2) Retourner à l'accueil");
                System.out.println();
                System.out.println("Choix :");
                choix = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (choix == 1) {
                this.acheterArticleClient();
                b = true;
            } else if (choix == 2) {
                this.accueilClient();
                b = true;
            } else if (b2 == false) {
                System.out.println("Choix impossible, réessayez !");
            }
        }
    }

    //Permet de lister les véhicules
    public void listeVehiculeClient() throws IOException {
        System.out.println("LISTE DES VEHICULES :");
        System.out.println();
        for (int i = 0; i < tVehicule.size(); i++) {
            System.out.println("Véhicule " + i + " :");
            System.out.println(tVehicule.get(i));
        }
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Que voulez-vous faire ?");
                System.out.println("1) Acheter un véhicule");
                System.out.println("2) Retourner à l'accueil");
                System.out.println();
                System.out.println("Choix :");
                choix = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (choix == 1) {
                this.acheterVehiculeClient();
                b = true;
            } else if (choix == 2) {
                this.accueilClient();
                b = true;
            } else if (b2 == false) {
                System.out.println("Choix impossible, réessayez !");
            }
        }
    }

    //Permet de choisir son article pour un client
    public void acheterArticleClient() throws IOException {
        boolean b = false;
        boolean b2 = false;
        int nArt = 0, qt = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Entrez le numéro de l'article :");
                nArt = sc.nextInt();
                System.out.println("Entrez la quantité :");
                qt = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (nArt < tArticle.size()) {
                if (qt <= tArticle.get(nArt).getStock()) {
                    this.majAchatArticleClient(nArt, qt, 0);
                    this.accueilClient();
                    b = true;
                }
            } else if (b2 == true) {
                System.out.println("Erreur, réessayez !");
            }
        }
    }

    //Permet de choisir son véhicule pour un client
    public void acheterVehiculeClient() throws IOException {
        boolean b = false;
        boolean b2 = false;
        int nVeh = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Entrez le numéro du véhicule :");
                nVeh = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (nVeh < tVehicule.size()) {
                if (tVehicule.get(nVeh).getDispo().equals("oui")) {
                    this.majAchatVehiculeClient(nVeh, 0);
                    this.accueilClient();
                    b = true;
                }
            } else if (b2 == false) {
                System.out.println("Erreur, réessayez !");
            }
        }
    }

    //Mets à jour la base de donnée pour un achat d'article par un client
    public void majAchatArticleClient(int nArt, int qt, int ID_conc) throws IOException {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        int prix = qt * (Integer.parseInt(tArticle.get(nArt).getPU()));
        tCommande.add(new Commande(tCommande.size(), tArticle.get(nArt).getIDConc(), tClient.get(indiceConnexion).getID(), formattedDate, String.valueOf(prix)));
        tAcheter.add(new Acheter(tCommande.size(), tArticle.size(), formattedDate, qt));
        tFacture.add(new Facture(tClient.get(indiceConnexion).getID(), tCommande.size(), ID_conc, tFacture.size(), formattedDate, String.valueOf(prix)));
        tArticle.get(nArt).majStock(qt);
        this.sauvegarder();
    }

    //Mets à jour la base de donnée pour un achat d'un véhicule par un client
    public void majAchatVehiculeClient(int nVeh, int ID_conc) throws IOException {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        String prix = tVehicule.get(nVeh).getPrix();
        tCommande.add(new Commande(tCommande.size(), tVehicule.get(nVeh).getIDConc(), tClient.get(indiceConnexion).getID(), formattedDate, prix));
        tFacture.add(new Facture(tClient.get(indiceConnexion).getID(), tCommande.size(), ID_conc, tFacture.size(), formattedDate, prix));
        tVehicule.get(nVeh).majVente(tCommande.size());
        this.sauvegarder();
    }

    //Page d'accueil espace employé
    public void accueilEmploye() throws IOException {
        System.out.println();
        System.out.println("ACCUEIL EMPLOYE :");
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Que voulez-vous faire ?");
                System.out.println("1) Créer/modifier un véhicule");
                System.out.println("2) Créer/modifier un article");
                System.out.println("3) Vendre un véhicule");
                System.out.println("4) Vendre un article");
                System.out.println("5) Créer une marque");
                System.out.println("6) Créer un modèle");
                System.out.println("7) EXIT");
                System.out.println();
                System.out.println("Choix :");
                choix = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (choix == 1) {
                this.listeVehiculeEmploye(false);
                b = true;
            } else if (choix == 2) {
                this.listeArticleEmploye(false);
                b = true;
            } else if (choix == 3) {
                this.listeVehiculeEmploye(true);
                b = true;
            } else if (choix == 4) {
                this.listeArticleEmploye(true);
                b = true;
            } else if (choix == 5) {
                //this.ajouterMarque();
                b = true;
            } else if (choix == 6) {
                //this.ajouterModele();
                b = true;
            } else if (choix == 7) {
                b = true;
            } else if (b2 == false) {
                System.out.println("Choix impossible, réessayez !");
            }
        }
    }

    //Permet de lister les articles
    public void listeArticleEmploye(boolean bool) throws IOException {
        System.out.println("LISTE DES ARTICLES :");
        System.out.println();
        for (int i = 0; i < tArticle.size(); i++) {
            System.out.println("Article " + i + " :");
            System.out.println(tArticle.get(i));
        }
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        if (bool == true) {
            while (b == true) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Que voulez-vous faire ?");
                    System.out.println("1) Vendre un article");
                    System.out.println("2) Retourner à l'accueil");
                    System.out.println();
                    System.out.println("Choix :");
                    choix = sc.nextInt();
                } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                    System.out.println("Le choix ne peut pas être un caractère");
                    b2 = true;
                }
                if (choix == 1) {
                    this.acheterArticleEmploye();
                    b = true;
                } else if (choix == 2) {
                    this.accueilEmploye();
                    b = true;
                } else if (b2 == false) {
                    System.out.println("Choix impossible, réessayez !");
                }
            }
        } else {
            while (b == false) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Que voulez-vous faire ?");
                    System.out.println("1) Modifier un article");
                    System.out.println("2) Ajouter un article");
                    System.out.println("3) Retourner à l'accueil");
                    System.out.println();
                    System.out.println("Choix :");
                    choix = sc.nextInt();
                } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                    System.out.println("Le choix ne peut pas être un caractère");
                    b2 = true;
                }
                if (choix == 1) {
                    this.modifArticle();
                    b = true;
                } else if (choix == 2) {
                    this.ajouterArticle();
                    b = true;
                } else if (choix == 3) {
                    this.accueilEmploye();
                    b = true;
                } else if (b2 == false) {
                    System.out.println("Choix impossible, réessayez !");
                }
            }
        }
    }

    //Permet de lister les véhicules
    public void listeVehiculeEmploye(boolean bool) throws IOException {
        System.out.println("LISTE DES VEHICULE :");
        System.out.println();
        for (int i = 0; i < tVehicule.size(); i++) {
            System.out.println("Véhicule " + i + " :");
            System.out.println(tVehicule.get(i));
        }
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        if (bool == true) {
            while (b == true) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Que voulez-vous faire ?");
                    System.out.println("1) Vendre un véhicule");
                    System.out.println("2) Retourner à l'accueil");
                    System.out.println();
                    System.out.println("Choix :");
                    choix = sc.nextInt();
                } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                    System.out.println("Le choix ne peut pas être un caractère");
                    b2 = true;
                }
                if (choix == 1) {
                    this.acheterVehiculeEmploye();
                    b = true;
                } else if (choix == 2) {
                    this.accueilEmploye();
                    b = true;
                } else if (b2 == false) {
                    System.out.println("Choix impossible, réessayez !");
                }
            }
        } else {
            while (b == false) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Que voulez-vous faire ?");
                    System.out.println("1) Modifier un article");
                    System.out.println("2) Ajouter un article");
                    System.out.println("3) Retourner à l'accueil");
                    System.out.println();
                    System.out.println("Choix :");
                    choix = sc.nextInt();
                } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                    System.out.println("Le choix ne peut pas être un caractère");
                    b2 = true;
                }
                if (choix == 1) {
                    this.modifVehicule();
                    b = true;
                } else if (choix == 2) {
                    this.ajouterVehicule();
                    b = true;
                } else if (choix == 3) {
                    this.accueilEmploye();
                    b = true;
                } else if (b2 == false) {
                    System.out.println("Choix impossible, réessayez !");
                }
            }
        }
    }

    // Vérification des données entrées à faire !!!
    public void ajouterArticle() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez les données :");
        System.out.println();
        System.out.println("Nom article :");
        String nom_art = sc.nextLine();
        System.out.println("Description article :");
        String desc_art = sc.nextLine();
        System.out.println("Prix unitaire :");
        String PU = sc.nextLine();
        System.out.println("Stock :");
        int stock = sc.nextInt();
        tArticle.add(new Article(tArticle.size(), stock, tEmploye.get(indiceConnexion).getIDConc(), nom_art, desc_art, PU));
        this.sauvegarder();
        this.accueilEmploye();
    }

    // Gestion de la modification en fonction du statut à faire !!!
    public void modifArticle() throws IOException {
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        int nArt = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Entrez le numéro de l'article à modifier :");
                System.out.println();
                nArt = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (nArt < tArticle.size()) {
                boolean b3 = false;
                boolean b4 = false;
                int choix2 = 0;
                while (b3 == false) {
                    try {
                        Scanner sc = new Scanner(System.in);
                        System.out.println();
                        System.out.println("Que voulez-vous modifier ?");
                        System.out.println("1) Nom");
                        System.out.println("2) Description");
                        System.out.println("3) Stock");
                        System.out.println("4) PU");
                        System.out.println("5) Accueil");
                        System.out.println();
                        System.out.println("Choix :");
                        choix2 = sc.nextInt();
                    } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                        System.out.println("Le choix ne peut pas être un caractère");
                        b4 = true;
                    }
                    if (choix2 == 1) {
                        tArticle.get(nArt).modifNom();
                        this.accueilEmploye();
                        b3 = true;
                    } else if (choix2 == 2) {
                        tArticle.get(nArt).modifDesc();
                        this.accueilEmploye();
                        b3 = true;
                    } else if (choix2 == 3) {
                        tArticle.get(nArt).modifStock();
                        this.accueilEmploye();
                        b3 = true;
                    } else if (choix2 == 4) {
                        tArticle.get(nArt).modifPU();
                        this.accueilEmploye();
                        b3 = true;
                    } else if (choix2 == 5) {
                        this.accueilEmploye();
                        b3 = true;
                    } else if (b4 == false) {
                        System.out.println("Choix impossible, réessayez !");
                    }
                }
                b = true;
            } else if (b2 == false) {
                System.out.println("Choix impossible, réessayez !");
            }
        }
        this.sauvegarder();
    }

    //Permet de choisir son article pour un client
    public void acheterArticleEmploye() throws IOException {
        boolean b = false;
        boolean b2 = false;
        int nArt = 0, qt = 0;
        int ID_clt = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Entrez le numéro de l'article :");
                nArt = sc.nextInt();
                System.out.println("Entrez la quantité :");
                qt = sc.nextInt();
                System.out.println("Entrez l'ID client :");
                ID_clt = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (nArt < tArticle.size()) {
                if (qt <= tArticle.get(nArt).getStock()) {
                    this.majAchatArticleEmploye(nArt, qt, ID_clt);
                    this.accueilEmploye();
                    b = true;
                }
            } else if (b2 == true) {
                System.out.println("Erreur, réessayez !");
            }
        }
    }

    //Mets à jour la base de donnée pour un achat d'article par un employé
    public void majAchatArticleEmploye(int nArt, int qt, int ID_clt) throws IOException {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        int prix = qt * (Integer.parseInt(tArticle.get(nArt).getPU()));
        tCommande.add(new Commande(tCommande.size(), tEmploye.get(indiceConnexion).getIDConc(), ID_clt, formattedDate, String.valueOf(prix)));
        tAcheter.add(new Acheter(tCommande.size(), tArticle.size(), formattedDate, qt));
        tFacture.add(new Facture(tClient.get(indiceConnexion).getID(), tCommande.size(), tEmploye.get(indiceConnexion).getIDConc(), tFacture.size(), formattedDate, String.valueOf(prix)));
        tArticle.get(nArt).majStock(qt);
        tTraiter.add(new Traiter(tEmploye.get(indiceConnexion).getID(), tCommande.size(), formattedDate));
        this.sauvegarder();
    }

    // Vérification des données entrées à faire !!!
    public void ajouterVehicule() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez les données :");
        System.out.println();
        System.out.println("Kilométrage :");
        int kilo = sc.nextInt();
        System.out.println("ID_modele :");
        int ID_modele = sc.nextInt();
        sc.nextLine();
        System.out.println("Date de première mise en circulation :");
        String mec = sc.nextLine();
        System.out.println("Etat :");
        String etat = sc.nextLine();
        System.out.println("Disponibilité :");
        String dispo = sc.nextLine();
        System.out.println("ID_marque :");
        int ID_marque = sc.nextInt();
        sc.nextLine();
        System.out.println("Nom modèle :");
        String nom_modele = sc.nextLine();
        System.out.println("Nom marque :");
        String nom_marque = sc.nextLine();
        System.out.println("Pays marque :");
        String pays_marque = sc.nextLine();
        System.out.println("Prix :");
        String prix = sc.nextLine();
        tVehicule.add(new Vehicule(tVehicule.size(), kilo, tEmploye.get(indiceConnexion).getIDConc(), 0, ID_modele, mec, etat, dispo, ID_marque, nom_modele, nom_marque, pays_marque, prix));
        this.sauvegarder();
        this.accueilEmploye();
    }

    // Gestion de la modification en fonction du statut à faire !!!
    public void modifVehicule() throws IOException {
        boolean b = false;
        boolean b2 = false;
        int choix = 0;
        int nVeh = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Entrez le numéro du véhicule à modifier :");
                System.out.println();
                nVeh = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (nVeh < tVehicule.size()) {
                boolean b3 = false;
                boolean b4 = false;
                int choix2 = 0;
                while (b3 == false) {
                    try {
                        Scanner sc = new Scanner(System.in);
                        System.out.println();
                        System.out.println("Que voulez-vous modifier ?");
                        System.out.println("1) Kilométrage");
                        System.out.println("2) Etat");
                        System.out.println("3) Prix");
                        System.out.println("4) Accueil");
                        System.out.println();
                        System.out.println("Choix :");
                        choix2 = sc.nextInt();
                    } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                        System.out.println("Le choix ne peut pas être un caractère");
                        b4 = true;
                    }
                    if (choix2 == 1) {
                        tVehicule.get(nVeh).modifKilo();
                        this.accueilEmploye();
                        b3 = true;
                    } else if (choix2 == 2) {
                        tVehicule.get(nVeh).modifEtat();
                        this.accueilEmploye();
                        b3 = true;
                    } else if (choix2 == 3) {
                        tVehicule.get(nVeh).modifPrix();
                        this.accueilEmploye();
                        b3 = true;
                    } else if (choix2 == 4) {
                        this.accueilEmploye();
                        b3 = true;
                    } else if (b4 == false) {
                        System.out.println("Choix impossible, réessayez !");
                    }
                }
                b = true;
            } else if (b2 == false) {
                System.out.println("Choix impossible, réessayez !");
            }
        }
        this.sauvegarder();
    }

    //Permet de choisir son véhicule pour un client
    public void acheterVehiculeEmploye() throws IOException {
        boolean b = false;
        boolean b2 = false;
        int nVeh = 0;
        int ID_clt = 0;
        while (b == false) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Entrez le numéro du véhicule :");
                nVeh = sc.nextInt();
                System.out.println("Entrez l'ID client :");
                ID_clt = sc.nextInt();
            } catch (InputMismatchException ex) {  // permet d'éviter les erreurs de frappe (lettres et caratères spéciaux)
                System.out.println("Le choix ne peut pas être un caractère");
                b2 = true;
            }
            if (nVeh < tVehicule.size()) {
                if (tVehicule.get(nVeh).getDispo().equals("oui")) {
                    this.majAchatVehiculeEmploye(nVeh, ID_clt);
                    this.accueilEmploye();
                    b = true;
                }
            } else if (b2 == false) {
                System.out.println("Erreur, réessayez !");
            }
        }
    }

    //Mets à jour la base de donnée pour un achat d'un véhicule par un employé
    public void majAchatVehiculeEmploye(int nVeh, int ID_clt) throws IOException {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        String prix = tVehicule.get(nVeh).getPrix();
        tCommande.add(new Commande(tCommande.size(), tEmploye.get(indiceConnexion).getIDConc(), ID_clt, formattedDate, prix));
        tFacture.add(new Facture(tClient.get(indiceConnexion).getID(), tCommande.size(), tEmploye.get(indiceConnexion).getIDConc(), tFacture.size(), formattedDate, prix));
        tVehicule.get(nVeh).majVente(tCommande.size());
        this.sauvegarder();
    }
    
    public void ajouterMarque() throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez les données :");
        System.out.println();
        System.out.println("Nom marque :");
        String nom_marque = sc.nextLine();
        System.out.println("Pays :");
        String pays_marque = sc.nextLine();
        tMarque.add(new Marque(tMarque.size(),nom_marque,pays_marque));
        this.sauvegarder();
    }
    
    public void ajouterModele() throws IOException{
        System.out.println("LISTE DES MARQUES :");
        System.out.println();
        for(int i=0;i<tMarque.size();i++){
            System.out.println(tMarque.get(i));
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez les données :");
        System.out.println();
        System.out.println("ID_marque :");
        int ID_marque = sc.nextInt();
        sc.nextLine();
        System.out.println("Nom du modèle :");
        String nom_modele = sc.nextLine();
        System.out.println("Nom de la marque :");
        String nom_marque = sc.nextLine();
        System.out.println("Pays de la marque :");
        String pays_marque = sc.nextLine();
        tModele.add(new Modele(ID_marque,tModele.size(),nom_modele,nom_marque,pays_marque));
        this.sauvegarder();
    }
}
