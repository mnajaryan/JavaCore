package homework.onlineShop.storage;

import homework.onlineShop.model.Order;

public class OrderStorage {
    private Order[] orders = new Order[10];
    private int size;

    public void add(Order order) {
        if (size == orders.length) {
            extend();
        }
        orders[size++] = order;
    }

    private void extend() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, tmp, 0, orders.length);
        orders = tmp;
    }

    public void printOrders() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i].getOrderId() + " " + orders[i].getUser() + " " + orders[i].getProduct() + " "
                    + orders[i].getData() + " " + orders[i].getOrderPrice() + " " + orders[i].getQty() + " " + orders[i].getPaymentMethodType());
        }
    }


}
