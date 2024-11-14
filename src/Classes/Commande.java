/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
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
}
