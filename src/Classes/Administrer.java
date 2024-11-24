/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

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
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_employe+";"+ID_article+";"+date_modif_article);
    }
    public String toString(){
        return "ID_employe : "+ID_employe+System.lineSeparator()+"ID_article : "+ID_article+System.lineSeparator()+"date_modif_article : "+date_modif_article+System.lineSeparator();
    }
}
