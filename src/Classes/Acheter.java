/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
public class Acheter {
    //Attributs
    private int ID_acheter,ID_article;
    private String date_achat;
    
    //Constructeurs
    public Acheter(int ID_acheter,int ID_article, String date_achat){
        this.ID_acheter=ID_acheter;
        this.ID_article=ID_article;
        this.date_achat=date_achat;
    }
}
