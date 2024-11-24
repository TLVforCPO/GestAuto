/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Gerer {
    //Attributs
    private int ID_vehicule,ID_employe;
    private String date_modif_vehicule;
    
    //Constructeurs
    public Gerer (int ID_vehicule,int ID_employe,String date_modif_vehicule){
        this.ID_vehicule=ID_vehicule;
        this.ID_employe=ID_employe;
        this.date_modif_vehicule=date_modif_vehicule;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_vehicule+";"+ID_employe+";"+date_modif_vehicule);
    }
    
    public String toString(){
        return "ID_vehicule : "+ID_vehicule+System.lineSeparator()+"ID_employe : "+ID_employe+System.lineSeparator()+"date_modif_vehicule : "+date_modif_vehicule+System.lineSeparator();
    }
}
