/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Marque {
    //Attributs
    private int ID_marque;
    private String nom_marque, pays_marque;
    
    //Constructeurs
    public Marque(int ID_marque,String nom_marque,String pays_marque){
        this.ID_marque=ID_marque;
        this.nom_marque=nom_marque;
        this.pays_marque=pays_marque;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_marque+";"+nom_marque+";"+pays_marque);
    }
    
    public String getNomMarque(){
        return nom_marque;
    }
    
    public String getPaysMarque(){
        return pays_marque;
    }
    
    public String toString(){
        return "ID_marque : "+ID_marque+System.lineSeparator()+"nom_marque : "+nom_marque+System.lineSeparator()+"pays_marque : "+pays_marque+System.lineSeparator();
    }
}
