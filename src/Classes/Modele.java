/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
public class Modele extends Marque {
    //Attributs
    private int ID_modele,ID_marque;
    private String nom_modele;
    
    //Constructeurs
    public Modele(int ID_marque,int ID_modele,String nom_modele,String nom_marque,String pays_marque){
        super(ID_marque,nom_marque,pays_marque);
        this.ID_marque=ID_marque;
        this.ID_modele=ID_modele;
        this.nom_modele=nom_modele;
    }
}
