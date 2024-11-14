/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
public class Marque {
    //Attributs
    private int ID_marque;
    private String nom_marque, pays_marque;
    //MEC=mise en circulation
    
    //Constructeurs
    public Marque(int ID_marque,String nom_marque,String pays_marque){
        this.ID_marque=ID_marque;
        this.nom_marque=nom_marque;
        this.pays_marque=pays_marque;
    }
}
