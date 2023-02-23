public class Main {
    public static void main(String[] args) {
        ProductCommerce pc = new ProductCommerce();
        Product p1 = new Product("1", "Product 1", 10, 10);
        pc.addProduct("1", "Product 1", 10, 10);
        pc.addProduct("2", "Product 2", 10, 10);
        pc.addProduct("3", "Product 3", 10, 10);
        pc.addProduct("4", "Product 4", 10, 10);
        pc.addProduct("5", "Product 5", 10, 10);
        pc.addProduct("6", "Product 6", 10, 10);
        pc.addProduct("7", "Product 7", 10, 10);
        pc.addProduct("8", "Product 8", 10, 10);
        pc.addProduct("9", "Product 9", 10, 10);
        pc.addProduct("10", "Product 10", 10, 10);
        pc.addProduct("11", "Product 11", 10, 10);
        pc.addProduct("12", "Product 12", 10, 10);
        pc.addProduct("13", "Product 13", 10, 10);
        pc.addProduct("14", "Product 14", 10, 10);
        pc.addProduct("15", "Product 15", 10, 10);
        pc.addProduct("16", "Product 16", 10, 10);
        pc.addProduct("17", "Product 17", 10, 10);
        pc.addProduct("18", "Product 18", 10, 10);
        pc.addProduct("19", "Product 19", 10, 10);
        pc.addProduct("20", "Product 20", 10, 10);
        pc.addProduct("21", "Product 21", 10, 10);
        pc.addProduct("22", "Product 22", 10, 10);
        pc.addProduct("23", "Product 23", 10, 10);
        pc.addProduct("24", "Product 24", 10, 10);
        pc.addProduct("25", "Product 25", 10, 10);
        pc.addProduct("26", "Product 26", 10, 10);
        pc.addProduct("27", "Product 27", 10, 10);
        pc.deleteProduct(p1);
        pc.bulkOrder(new Product[]{new Product("1", "Product 1", 10, 10), new Product("2", "Product 2", 20, 10), new Product("3", "Product 3", 10, 10), new Product("4", "Product 4", 10, 10), new Product("5", "Product 5", 10, 10), new Product("6", "Product 6", 10, 10), new Product("7", "Product 7", 10, 10), new Product("8", "Product 8", 10, 10), new Product("9", "Product 9", 10, 10), new Product("10", "Product 10", 10, 10), new Product("11", "Product 11", 10, 10), new Product("12", "Product 12", 10, 10), new Product("13", "Product 13", 10, 10), new Product("14", "Product 14", 10, 10), new Product("15", "Product 15", 10, 10), new Product("16", "Product 16", 10, 10), new Product("17", "Product 17", 10, 10), new Product("18", "Product 18", 10, 10), new Product("19", "Product 19", 10, 10), new Product("20", "Product 20", 10, 10), new Product("21", "Product 21", 10, 10), new Product("22", "Product 22", 10, 10), new Product("23", "Product 23", 10, 10), new Product("24", "Product 24", 10, 10), new Product("25", "Product 25", 10, 10), new Product("26", "Product 26", 10, 10), new Product("27", "Product 27", 10, 10), new Product("28", "Product 28", 10, 10), new Product("29", "Product 29", 10, 10), new Product("30", "Product 30", 10, 10), new Product("31", "Product 31", 10, 10)});
        pc.display();
        System.out.println(pc.search("27"));
    }
}