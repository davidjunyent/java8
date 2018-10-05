/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dj.magatzem.objectes;

import com.dj.magatzem.objectes.utils.Logger;

/**
 *
 * @author Blau9
 */
public class Proveidor {

    private String nom;
    private String mail;
    private String domain;
    public Proveidor(String nom, String mail){
        this.nom=nom;
        this.setMail(mail);
    }
    public String getMail(){
        return mail;
    }
    public String getDomain(){
        return domain;
    }
    public void setMail(String mail){
        if(!(mail.contains("@") && mail.contains("."))){
            return;
        }
        this.mail=mail;
        String domain=this.mail.substring(this.mail.indexOf("@")+1);
        if(domain.contains(".") && domain.length()>3){
            this.domain=domain;
        }
            
    }
    public void demanaItem(Item item) {
        Logger.getInstance().debug("Enviando correo a "+nom+" ("+mail+") pidiendo "+item.toString());
    }
}
