/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Traiter {
    //Attributs
    private int ID_employe,ID_commande;
    private String date_traitement;
    
    //Constructeurs
    public Traiter (int ID_employe, int ID_commande, String date_traitement){
        this.ID_employe=ID_employe;
        this.ID_commande=ID_commande;
        this.date_traitement=date_traitement;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_employe+";"+ID_commande+";"+date_traitement);
    }
    
    public String toString(){
        return "ID_employe : "+ID_employe+System.lineSeparator()+"ID_commande : "+ID_commande+System.lineSeparator()+"date_traitement : "+date_traitement+System.lineSeparator();
    }
}
