/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
public class Administrer {
    //Attributs
    private int ID_employe,ID_article;
    private String date_modif_article;
    
    //Constructeurs
    public Administrer (int ID_employe, int ID_article, String date_modif_article){
        this.ID_employe=ID_employe;
        this.ID_article=ID_article;
        this.date_modif_article=date_modif_article;
    }
}
