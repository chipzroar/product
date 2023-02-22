public class Product {
    private String prodId;
    private String prodName;
    private int quantity;
    private double price;

    public Product(){
        this.prodId = "";
        this.prodName = "";
        this.quantity = 0;
        this.price = 0;
    }

    public Product(String prodId, String prodName, int quantity, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        if(quantity < 0 || price < 0){
            throw new Error("Quantity and price must be greater than 0");
        }
        this.quantity = quantity;
        this.price = price;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Object obj){
        if(obj instanceof Product){
            Product p = (Product) obj;
            return this.prodId.equals(p.prodId);
        }
        return false;
    }

    public String toString(){
        return String.format("%-10s %-20s %-10d %-10.2f", prodId, prodName, quantity, price);
    }
}
