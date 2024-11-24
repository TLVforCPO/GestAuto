/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Acheter {
    //Attributs
    private int ID_commande,ID_article,quantite_achat;
    private String date_achat;
    
    //Constructeurs
    public Acheter(int ID_commande,int ID_article, String date_achat, int quantite_achat){
        this.ID_commande=ID_commande;
        this.ID_article=ID_article;
        this.date_achat=date_achat;
        this.quantite_achat=quantite_achat;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_commande+";"+ID_article+";"+date_achat+";"+quantite_achat);
    }
    
    public String toString(){
        return "ID_commande : "+ID_commande+System.lineSeparator()+"ID_article : "+ID_article+System.lineSeparator()+"date_achat : "+date_achat+System.lineSeparator();
    }
}
