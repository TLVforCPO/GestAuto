/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
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
}
