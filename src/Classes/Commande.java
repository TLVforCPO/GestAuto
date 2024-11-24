/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Commande {
    //Attributs
    private int ID_commande;
    private String date_commande,prix_commande;
    
    //Constructeurs
    public Commande(int ID_commande,String date_commande,String prix_commande){
        this.ID_commande=ID_commande;
        this.date_commande=date_commande;
        this.prix_commande=prix_commande;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_commande+";"+date_commande+";"+prix_commande);
    }
    
    public String toString(){
        return "ID_commande : "+ID_commande+System.lineSeparator()+"date_commande : "+date_commande+System.lineSeparator()+"prix_commande : "+prix_commande+System.lineSeparator();
    }
}
