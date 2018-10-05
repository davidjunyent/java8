package com.dj.magatzem.objectes;


public class Item {

    private String name;
    private double price;
    private int quantity;
    private Estanteria location;
    private String[] manuals;
    boolean promoted;
    
    private Proveidor proveidor;
    
    private Item(){ }

    public static Item createItem(String name) {
    	if(name==null ||  name.isEmpty()) {
    		//TO-DO el nom no pot ser null
    	}    	
    	Item item = new Item();
    	item.name=name;
    	return item;
    }
    public static Item createItem(String name, int quantity){
    	Item item = createItem(name);
    	item.quantity=quantity;
    	return item;
    }
    public static Item createItem(String name, double price) {
    	Item item = createItem(name);
    	item.price=price;
    	return item;
    }
    public static Item createItem(String name, double price, int quantity, Estanteria location) {
    	Item item = createItem(name);
    	item.quantity=quantity;
    	item.price=price;
    	item.location=location;
    	return item;
    }
    private Item(String name) {
    	this.name=name;
    }
    
    private Item(String name, int quantity){
    	this(name);
        this.quantity=quantity;
    }

    private Item(String name, double price) {
    	this(name);
        this.price = price;
    }

    private Item(String name, double price, int quantity, Estanteria location) {
        this(name, price);
        this.quantity = quantity;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>100 && price<9999){
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0){
            this.quantity = quantity;
        }
    }

    public Estanteria getLocation() {
        return location;
    }

    public void setLocation(Estanteria location) {
        this.location = location;
    }

    public String[] getManuals() {
        return manuals;
    }

    public void setManuals(String[] manuals) {
        this.manuals = manuals;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public Proveidor getProveidor() {
        return proveidor;
    }

    public void setProveidor(Proveidor proveidor) {
        this.proveidor = proveidor;
    }
   
    public boolean isOutOfStock(){
        return quantity<=0;
    }
    public int getNumberOfManuals(){
        return manuals!=null?manuals.length:0;
    }
    public void addManual(String manual){
        if(manual==null) return;
         
        if(manuals==null){ 
            //que estigui inicialitzat
            manuals = new String[]{manual};
            return;
        }else{
            //comprovem que no tinguem una posicio a null
            for(int i=0;i<manuals.length; i++){
                if(manuals[i]==null){
                    manuals[i]=manual;
                    return;
                }
            }
        }
        
        //Ampliem el manual en una posicio
        String[] newManuals = new String[manuals.length+1];
        for(int i=0;i<manuals.length; i++)
            newManuals[i]=manuals[i];
        
        newManuals[newManuals.length-1]=manual;
        manuals=newManuals;
        
    }
    public void assegurarStock(int quantity){
        if(this.quantity<quantity){
            proveidor.demanaItem(this);
        }
    }
    @Override
    public String toString(){
        return quantity+" "+name+" 's";
    }
    
    public float getStockValue(){
        return (float)price*quantity;
    }
    
    public static void main(String args[]){
        Item item = new Item();
        item.setPrice(104);;
        item.setPrice(10000);;
        new Item(null,1);
        
        
    }
}
