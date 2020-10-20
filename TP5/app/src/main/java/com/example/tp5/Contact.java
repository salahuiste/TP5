package com.example.tp5;

public class Contact {
    private String nom;
    private String prenom;

    public Contact(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }


    public String getNom(){ return new String(nom); }
    public String getPrenom(){ return new String(prenom); }
    public void setNom(String nom) { this.nom=nom;}
    public void setPrenom(String nom) { this.prenom=prenom;}
}
