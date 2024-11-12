/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
public class Article {
    //Attributs
    private int ID_article,stock_article,ID_concession;
    private String nom_article,desc_article,PU_article;
    
    //Constructeurs
    public Article(int ID_article,int stock_article,int ID_concession,String nom_article, String desc_article,String PU_article){
        this.ID_article=ID_article;
        this.ID_concession=ID_concession;
        this.PU_article=PU_article;
        this.desc_article=desc_article;
        this.nom_article=nom_article;
        this.stock_article=stock_article;
    }
}
