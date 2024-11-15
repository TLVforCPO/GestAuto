/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
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
    
}
