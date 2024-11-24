/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

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
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_marque+";"+ID_modele+";"+nom_modele+";"+this.getNomMarque()+";"+this.getPaysMarque());
    }
    
    public int getIDMarque(){
        return ID_marque;
    }
    
    public String getNomModele(){
        return nom_modele;
    }
    
    public String toString(){
        return "ID_marque : "+ID_marque+System.lineSeparator()+"ID_modele : "+ID_modele+System.lineSeparator()+"nom_modele : "+nom_modele+System.lineSeparator()+"nom_marque : "+this.getNomMarque()+System.lineSeparator()+"pays_marque : "+this.getPaysMarque()+System.lineSeparator();
    }
}
