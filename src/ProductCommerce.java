public class ProductCommerce implements IProduct{
    private Product[] products;
    private int count;

    public ProductCommerce(){
        products = new Product[max];
        count = 0;
    }

    @Override
    public boolean addProduct(String id, String name, int quantity, double price) {
        Product p = new Product(id, name, quantity, price);
        if(search(p.getProdId()) != null) return false;
        if(count == max) return false;
        products[count++] = p;
        return true;
    }

    @Override
    public boolean deleteProduct(Product p) {
        for(int i = 0; i < count; i++) {
            if(products[i].equals(p)) {
                for(int j = i; j < count - 1; j++) products[j] = products[j + 1];
                products[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int buyProduct(String id, int quantity) {
        for(Product p: products) {
            if(p.getProdId().equals(id)) {
                if(p.getQuantity() >= quantity) {
                    p.setQuantity(p.getQuantity() - quantity);
                    return 1;
                } else return 0;
            }
        }
        return -1;
    }

    @Override
    public Product search(String id) {
        for(int i = 0; i < count; i++) if(products[i].getProdId().equals(id)) return products[i];
        return null;
    }
    @Override
    public void bulkOrder(Product[] p) {
        for(Product product : p) {
            if(search(product.getProdId()) != null) {
                buyProduct(product.getProdId(), product.getQuantity());
            }
        }
    }

    public void display() {
        for(Product p : products) {
            if(p != null) System.out.println(p);
        }
    }
}
