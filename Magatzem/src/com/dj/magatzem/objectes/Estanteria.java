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
public class Estanteria {
   
    private String sala;
    private String pasadis;
    private String lletra;
    
    private Item[] items;

    public static int NUM_ESTANTERIES;
    
    private final static String ITEM_SEPARATOR=", ";
    private final static String CODI_ANTIC_SEPARATOR="-";
    private final static String SALA_PREFIX="sala";
    private final static String PASSADIS_PREFIX="passadis";
    
    private final static String SALA_PER_DEFECTE="1";
    private final static String PASADIS_PER_DEFECTE="2";
    
    //Bolc d'inicialitzacio static
    static{
        NUM_ESTANTERIES=0;
        //System.out.println("Inicialitzacio static");
    }
    //Bolc d'inicialitzacio
    {
        items = new Item[0];
       // System.out.println("Metode d'inicialitzacio");
    }
    public Estanteria(){
        this(SALA_PER_DEFECTE,PASADIS_PER_DEFECTE);
    }
    public Estanteria(String sala,String pasadis){
        if(sala==null || sala.isEmpty()){
            //to-do
        }
        this.sala=sala;
        this.pasadis=pasadis;
        NUM_ESTANTERIES++;
    }
    
    public Estanteria(String sala,String pasadis, Item[] items){
        this(sala,pasadis);
        this.items=items;
    }
    
    public Estanteria(String codiAntic){
        this(converteixCodiAntic(codiAntic));
    }
    
    private Estanteria(String[] salaiPasadis){
        this(salaiPasadis[0], salaiPasadis[1]);
    }
    
    
    public String getNomsItems(){
        final StringBuilder noms= new StringBuilder("");
        
        boolean first=true;
        if(items!=null){
            for (Item item : items) {
                if(first){
                    noms.append(item.getName()); 
                    first=false;
                }else{
                    noms.append(ITEM_SEPARATOR).append(item.getName());
                }
            }
        }
        return noms.toString();
    }

    @Override
    public String toString(){
        
        return sala.trim()+"-"+pasadis.trim();
    }
    
        
    //sala-22-pasadis55
    private static String[] converteixCodiAntic(String codiAntic){
        String[] result = new String[]{null,null};
        if(codiAntic==null || !codiAntic.contains(CODI_ANTIC_SEPARATOR)){
            Logger.getInstance().error("null or blank value");
            return result;
        }
        String[] codis=codiAntic.split(CODI_ANTIC_SEPARATOR);
        
        result[0]=codis[0].toLowerCase().replaceFirst(SALA_PREFIX,"");
        result[1]=codis[1].toLowerCase().replaceFirst(PASSADIS_PREFIX,"");
        
        return result;
    }
    /**
     * @param items the items to set
     */
    public void setItems(Item[] items) {
        this.items = items;
    }
    public void addItems(Item ... items){
        
    }
	public String getLletra() {
		return lletra;
	}
    
    
}
