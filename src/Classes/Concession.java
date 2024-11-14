/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
public class Concession {
    //Attributs
    private int ID_concession,SIRET_concession;
    private String nom_concession,adresse_concession;
    
    //Constructeurs
    public Concession(int ID_concession,int SIRET_concession,String nom_concession,String adresse_concession){
        this.ID_concession=ID_concession;
        this.SIRET_concession=SIRET_concession;
        this.adresse_concession=adresse_concession;
        this.nom_concession=nom_concession;
    }
}
