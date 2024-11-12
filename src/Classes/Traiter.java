/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
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
}
