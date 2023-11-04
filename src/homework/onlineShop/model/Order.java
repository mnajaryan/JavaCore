package homework.onlineShop.model;

import homework.onlineShop.model.enamModel.PaymentMethodType;

import java.util.Date;

public class Order {

    private String orderId;
    private User user;
    private Product product;
    private Date data;
    private int orderPrice;
    private int qty; //qanak
    private PaymentMethodType paymentMethodType;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public Order() {
    }

    public Order(String orderId, User user, Product product, Date data, int orderPrice, int qty, PaymentMethodType paymentMethodType) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.data = data;
        this.orderPrice = orderPrice;
        this.qty = qty;
        this.paymentMethodType = paymentMethodType;
    }
}
