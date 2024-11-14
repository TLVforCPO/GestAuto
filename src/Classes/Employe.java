/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thoma
 */
public class Employe {
    //Attributs
    private int ID_employe,tel_employe,ID_concession;
    private String nom_employe,prenom_employe,adresse_employe,email_employe,mdp_employe,statut_employe;
    
    //Constructeurs
    public Employe (int ID_employe,int tel_employe,int ID_concession,String nom_employe,String prenom_employe,String adresse_employe,String email_employe,String mdp_employe,String statut_employe){
        this.ID_concession=ID_concession;
        this.ID_employe=ID_employe;
        this.adresse_employe=adresse_employe;
        this.email_employe=email_employe;
        this.mdp_employe=mdp_employe;
        this.nom_employe=nom_employe;
        this.prenom_employe=prenom_employe;
        this.statut_employe=statut_employe;
        this.tel_employe=tel_employe;
    }
}
