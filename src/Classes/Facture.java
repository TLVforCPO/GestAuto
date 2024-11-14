/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
public class Facture extends Commande{
    //Attributs
    private int ID_facture,ID_concession,ID_client,ID_commande;
    private String prix_facture,date_facture;
    
    //Constructeurs
    public Facture(int ID_client,int ID_commande,int ID_concession,int ID_facture,String date_facture,String prix_facture){
        super(ID_commande,date_facture,prix_facture);
        this.ID_client=ID_client;
        this.ID_commande=ID_commande;
        this.ID_concession=ID_concession;
        this.ID_facture=ID_facture;
        this.date_facture=date_facture;
        this.prix_facture=prix_facture;
    }
}
