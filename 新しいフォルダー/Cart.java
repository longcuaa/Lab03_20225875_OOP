package lab02;
class Cart{
    public static final int MAX_NUMBERS_ORDERED=20;
    private int qtyOrdered=0;
    private DigitalVideoDisc itemsOrdered[]= new  DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public cart(){
        System.out.println(x:"An cart  has been created");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        if(this.qtyOrdered>=MAX_NUMBERS_ORDERED)
        System.out.println(x:"The cart is  almost full");
        else{
            this.itemsOrdered[this.qtyOrdered] - dvd;
            this.qtyOrdered ++;
            System.out.println(x:"The cart has been added");
        } 
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        int pos = -1;
    
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrdered[i] == dvd) {
                pos = i;
                break;
            }
        }
    
        if (pos < 0) {
            System.out.println("No such disc found!");
        } else {
            for (int i = pos; i < this.qtyOrdered - 1; i++) {
                this.itemsOrdered[i] = this.itemsOrdered[i + 1];
            }
            this.qtyOrdered = this.qtyOrdered - 1;
        }
    }
    public double calculateTotalCost() {
        double total = 0.0;
    
        for (int i = 0; i < this.qtyOrdered; i++) {
            total += this.itemsOrdered[i].getCost();
        }
        
        return total;
    }
    
    public int getQuantityOrdered() {
        return this.qtyOrdered;
    }
    
    public static void main(String[] args) {
        Cart shoppingCart = new Cart();
    
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Action","The Dark Knight",10f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Drama", "Moonlight", 20f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Anime", "Conan", 8f);
    
        shoppingCart.addDigitalVideoDisc(dvd1);
        shoppingCart.addDigitalVideoDisc(dvd2);
        shoppingCart.addDigitalVideoDisc(dvd3);
    
        System.out.printf("%.3f\n", shoppingCart.calculateTotalCost());
        System.out.println("The number of discs is: " + shoppingCart.getQuantityOrdered());
    
        shoppingCart.removeDigitalVideoDisc(dvdThree);
        System.out.printf("%.3f\n", shoppingCart.calculateTotalCost());
        System.out.println("The number of discs is: " + shoppingCart.getQuantityOrdered());
    }
    
}