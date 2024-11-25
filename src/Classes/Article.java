/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

import java.util.Scanner;

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
    
    public String getPU(){
        return PU_article;
    }
    
    public void majStock(int stock){
        stock_article=stock_article-stock;
    }
    
    public void modifNom(){
        System.out.println("Entrez le nouveau nom :");
        Scanner sc = new Scanner(System.in);
        String nom=sc.nextLine();
        this.nom_article=nom;
    }
    
    public void modifDesc(){
        System.out.println("Entrez la nouvelle description :");
        Scanner sc = new Scanner(System.in);
        String desc=sc.nextLine();
        this.desc_article=desc;
    }
    // Faire une sécu en cas de mauvaise entrée
    public void modifStock(){
        System.out.println("Entrez le nouveau stock :");
        Scanner sc = new Scanner(System.in);
        int stock=sc.nextInt();
        this.stock_article=stock;
    }
    
    public void modifPU(){
        System.out.println("Entrez le nouveau prix unitaire :");
        Scanner sc = new Scanner(System.in);
        String PU=sc.nextLine();
        this.PU_article=PU;
    }
    
    public int getIDConc(){
        return ID_concession;
    }
}
