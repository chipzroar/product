public interface IProduct {

    int max = 100;
    boolean addProduct(String id, String name, int quantity, double price);
    boolean deleteProduct(Product p);
    int buyProduct(String id, int quantity);
    Product search(String id);
    void bulkOrder(Product[] p);
}
