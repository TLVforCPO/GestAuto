/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Concession {
    //Attributs
    private int ID_concession;
    private String nom_concession,adresse_concession,SIRET_concession;
    
    //Constructeurs
    public Concession(int ID_concession,String SIRET_concession,String nom_concession,String adresse_concession){
        this.ID_concession=ID_concession;
        this.SIRET_concession=SIRET_concession;
        this.adresse_concession=adresse_concession;
        this.nom_concession=nom_concession;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_concession+";"+SIRET_concession+";"+nom_concession+";"+adresse_concession);
    }
    
    public String toString(){
        return "ID_concession : "+ID_concession+System.lineSeparator()+"nom_concession : "+nom_concession+System.lineSeparator()+"adresse_concession : "+adresse_concession+System.lineSeparator()+"SIRET_concession : "+SIRET_concession+System.lineSeparator();
    }
}
