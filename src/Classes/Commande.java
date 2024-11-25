/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Commande {
    //Attributs
    private int ID_commande,ID_concession,ID_client;
    private String date_commande,prix_commande;
    
    //Constructeurs
    public Commande(int ID_commande, int ID_concession, int ID_client, String date_commande,String prix_commande){
        this.ID_commande=ID_commande;
        this.ID_concession=ID_concession;
        this.ID_client=ID_client;
        this.date_commande=date_commande;
        this.prix_commande=prix_commande;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_commande+";"+date_commande+";"+prix_commande+";"+ID_concession+";"+ID_client);
    }
    
    public String toString(){
        return "ID_commande : "+ID_commande+System.lineSeparator()+"date_commande : "+date_commande+System.lineSeparator()+"prix_commande : "+prix_commande+System.lineSeparator();
    }
}
