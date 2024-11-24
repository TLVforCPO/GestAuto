/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 * 
 */
package Classes;

public class Vehicule extends Modele {
    //Attributs
    private int ID_vehicule, kilometrage_vehicule,ID_concession,ID_commande,ID_modele;
    private String date_mec_vehicule,etat_vehicule,disponibilite_vehicule; 
    
    //Constructeurs
    public Vehicule (int ID_vehicule,int kilometrage_vehicule,int ID_concession,int ID_commande,int ID_modele,String date_mec_vehicule,String etat_vehicule,String disponibilite_vehicule,int ID_marque,String nom_modele,String nom_marque,String pays_marque){
        super(ID_marque,ID_modele,nom_modele,nom_marque,pays_marque);
        this.ID_commande=ID_commande;
        this.ID_concession=ID_concession;
        this.ID_modele=ID_modele;
        this.ID_vehicule=ID_vehicule;
        this.date_mec_vehicule=date_mec_vehicule;//MEC : Mise en circulation
        this.disponibilite_vehicule=disponibilite_vehicule;
        this.etat_vehicule=etat_vehicule;
        this.kilometrage_vehicule=kilometrage_vehicule;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_vehicule+";"+kilometrage_vehicule+";"+ID_concession+";"+ID_commande+";"+ID_modele+";"+date_mec_vehicule+";"+etat_vehicule+";"+disponibilite_vehicule+";"+this.getIDMarque()+";"+this.getNomModele()+";"+this.getNomMarque()+";"+this.getPaysMarque());
    }
    
    public String toString(){
        return "ID_vehicule : "+ID_vehicule+System.lineSeparator()+"ID_concession : "+ID_concession+System.lineSeparator()+"ID_commande : "+ID_commande+System.lineSeparator()+"ID_modele : "+ID_modele+System.lineSeparator()+"ID_marque : "+this.getIDMarque()+System.lineSeparator()+"kilometrage_vehicule : "+kilometrage_vehicule+System.lineSeparator()+"date_mec_vehicule : "+date_mec_vehicule+System.lineSeparator()+"etat_vehicule : "+etat_vehicule+System.lineSeparator()+"disponibilite_vehicule : "+disponibilite_vehicule+System.lineSeparator()+"nom_modele : "+this.getNomModele()+System.lineSeparator()+"nom_marque : "+this.getNomMarque()+System.lineSeparator()+"pays_marque : "+this.getPaysMarque()+System.lineSeparator();
    }
}
