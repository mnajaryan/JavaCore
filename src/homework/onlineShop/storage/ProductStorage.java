package homework.onlineShop.storage;

import homework.onlineShop.model.Product;

public class ProductStorage {
    private Product[] products = new Product[10];
    private int size;

    public void add(Product product) {
        if (size == products.length) {
            extend();
        }
        products[size++] = product;
    }

    private void extend() {
        Product[] tmp = new Product[products.length + 10];
        System.arraycopy(products, 0, tmp, 0, products.length);
        products = tmp;
    }

    public void removeById(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {

            }
        }
    }

    public void printProducts() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i].getId() + " " + products[i].getName() + " " + products[i].getDescription() + " " +
                    products[i].getPrice() + " " + products[i].getStockQty() + " " + products[i].getProductType());
        }
    }

    public int howCost(String productId, int count) {
        int cost = 0;
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(productId)) {
                cost = count * products[i].getPrice();
                System.out.println();
            }
        }
        return cost;
    }
    public Product product(String productId){
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(productId)){
                return products[i];
            }
        }
        return null;
    }

}
