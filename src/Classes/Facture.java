/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Facture extends Commande{
    //Attributs
    private int ID_facture,ID_concession,ID_client,ID_commande;
    private String prix_facture,date_facture;
    
    //Constructeurs
    public Facture(int ID_client,int ID_commande,int ID_concession,int ID_facture,String date_facture,String prix_facture){
        super(ID_commande,ID_concession,ID_client,date_facture,prix_facture);
        this.ID_client=ID_client;
        this.ID_commande=ID_commande;
        this.ID_concession=ID_concession;
        this.ID_facture=ID_facture;
        this.date_facture=date_facture;
        this.prix_facture=prix_facture;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_client+";"+ID_commande+";"+ID_concession+";"+ID_facture+";"+date_facture+";"+prix_facture);
    }
    
    public String toString(){
        return "ID_facture : "+ID_facture+System.lineSeparator()+"ID_concession : "+ID_concession+System.lineSeparator()+"ID_client : "+ID_client+System.lineSeparator()+"ID_commande : "+ID_commande+System.lineSeparator()+"prix_facture : "+prix_facture+System.lineSeparator()+"date_facture : "+date_facture+System.lineSeparator();
    }
}
