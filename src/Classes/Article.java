/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

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
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_article+";"+stock_article+";"+ID_concession+";"+nom_article+";"+desc_article+";"+PU_article);
    }
    public String toString(){
        return "ID_article : "+ID_article+System.lineSeparator()+"ID_concession : "+ID_concession+System.lineSeparator()+"nom_article : "+nom_article+System.lineSeparator()+"desc_article : "+desc_article+System.lineSeparator()+"PU_article : "+PU_article+System.lineSeparator()+"stock_article : "+stock_article+System.lineSeparator();
    }
    
    public int getStock(){
        return stock_article;
    }
}
