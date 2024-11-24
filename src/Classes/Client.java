/*
 * @author DIA Yoan, GERARD Ilyes, LE VAN Thomas, RAGEH Nydel
 *
 */
package Classes;

public class Client {
    
    //Attributs
    private int ID_client,tel_client;
    private String nom_client,prenom_client,adresse_client,email_client,mdp_client;
    
    //Constructeur
    public Client(int ID_client,String nom_client,String prenom_client, String adresse_client, int tel_client, String email_client,String mdp_client){
        this.ID_client=ID_client;
        this.nom_client=nom_client;
        this.prenom_client=prenom_client;
        this.adresse_client=adresse_client;
        this.tel_client=tel_client;
        this.email_client=email_client;
        this.mdp_client=mdp_client;
    }
    
    //Méthodes
    public String versFichier(){
        return String.valueOf(ID_client+";"+nom_client+";"+prenom_client+";"+adresse_client+";"+tel_client+";"+email_client+";"+mdp_client);
    }
    
    public String getEmail(){
        return email_client;
    }
    
    public String getMDP(){
        return mdp_client;
    }
    
    public String toString(){
        return "ID_client : "+ID_client+System.lineSeparator()+"nom_client : "+nom_client+System.lineSeparator()+"prenom_client : "+prenom_client+System.lineSeparator()+"adresse_client : "+adresse_client+System.lineSeparator()+"email_client : "+email_client+System.lineSeparator()+"tel_client : "+tel_client+System.lineSeparator()+"mdp_client : "+mdp_client+System.lineSeparator();
    }
    
    public void modifNom(String nom){
        nom_client=nom;
    }
    public void modifPrenom(String prenom){
        prenom_client=prenom;
    }
    public void modifAdresse(String adresse){
        adresse_client=adresse;
    }
    public void modifTel(String tel){
        tel_client=Integer.parseInt(tel);
    }
    public void modifEmail(String email){
        email_client=email;
    }
    public void modifMDP(String mdp){
        mdp_client=mdp;
    }
}
