package com.dj.magatzem.objectes;

public class Adhesiu extends Item{
	
		
	public Adhesiu(String name, double price,boolean promoted) {
		super(name,price);
		setQuantity(1);
		setPromoted(promoted);
	}
	@Override
	public String toString() {
		return getName();
	}
	@Override
	public double getDiscount() {
    	return promoted?25.2:0.0;
    }
	@Override
	protected Item getItemRelacionat() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
