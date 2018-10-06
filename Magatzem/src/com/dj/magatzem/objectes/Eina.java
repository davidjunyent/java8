package com.dj.magatzem.objectes;

public class Eina extends Item{

		private int anysGarantia;
		
		public Eina(String name, int quantitat) {
			super(name, quantitat);
		}
		public Eina(String name, double price, int quantitat,int anysGarantia) {
			super(name,price);
			this.setQuantity(quantitat);
			this.anysGarantia=anysGarantia;
		}
	    public Eina(String name, double price, int quantity, Estanteria location,int anysGarantia) {
	    	super(name, price, quantity, location);
	    	this.anysGarantia=anysGarantia;
	    }
	    
	    public int getAnysGarantia() {
	    	return anysGarantia;
	    }
	    public void ampliaGarantia(int anys) {
	    	this.anysGarantia+=anys;
	    }
	    @Override
	    public String toString(){
	    	StringBuilder result= new StringBuilder("");
	    	result.append("La eina ")
	    		.append(getName())
	    		.append("(").append(getQuantity()).append(")")
	    		.append(" que te ")
	    		.append(anysGarantia)
	    		.append(" de garantia.");
	    	return result.toString();
	    }
	    @Override
	    protected Eina getItemRelacionat() {
	    	return null;
	    }
	    @Override
	    public double getDiscount() {
	    	return 10;
	    }
}
