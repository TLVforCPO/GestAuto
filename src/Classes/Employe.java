/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Employe {
    //Attributs
    private int ID_employe,tel_employe,ID_concession;
    private String nom_employe,prenom_employe,adresse_employe,email_employe,mdp_employe,statut_employe;
    
    //Constructeurs
    public Employe (int ID_employe,int tel_employe,int ID_concession,String nom_employe,String prenom_employe,String adresse_employe,String email_employe,String mdp_employe,String statut_employe){
        this.ID_concession=ID_concession;
        this.ID_employe=ID_employe;
        this.adresse_employe=adresse_employe;
        this.email_employe=email_employe;
        this.mdp_employe=mdp_employe;
        this.nom_employe=nom_employe;
        this.prenom_employe=prenom_employe;
        this.statut_employe=statut_employe;
        this.tel_employe=tel_employe;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_employe+";"+tel_employe+";"+ID_concession+";"+nom_employe+";"+prenom_employe+";"+adresse_employe+";"+email_employe+";"+mdp_employe+";"+statut_employe);
    }
    
    public String getEmail(){
        return email_employe;
    }
    
    public String getMDP(){
        return mdp_employe;
    }
    
    public String toString(){
        return "ID_employe : "+ID_employe+System.lineSeparator()+"ID_concession : "+ID_concession+System.lineSeparator()+"nom_employe : "+nom_employe+System.lineSeparator()+"prenom_employe : "+prenom_employe+System.lineSeparator()+"adresse_employe : "+adresse_employe+System.lineSeparator()+"email_employe : "+email_employe+System.lineSeparator()+"tel_employe : "+tel_employe+System.lineSeparator()+"statut_employe : "+statut_employe+System.lineSeparator()+"mdp_employe : "+mdp_employe+System.lineSeparator();
    }
    
    public int getIDConc(){
        return ID_concession;
    }
    
    public int getID(){
        return ID_employe;
    }
}
