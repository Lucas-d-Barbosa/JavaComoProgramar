public class Invoice {
    private int quantity;
    private double price;
    private String number;
    private String description;

    public Invoice(){

    }

    public Invoice(String number, String description, 
        int quantity,double price){
            this.description = description;
            this.number = number;
            this.price = price < 0.0 ? 0.0 : price;
            this.quantity = quantity < 0 ? 0 : quantity;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPrice(double price) {
        this.price += price;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double getInvoice(){
        return (this.quantity * this.price) > 0.0 ? (this.quantity * this.price) : 0.0;
    }
}
