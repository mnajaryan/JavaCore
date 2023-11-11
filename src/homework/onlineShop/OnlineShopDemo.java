package homework.onlineShop;

import homework.onlineShop.model.Product;
import homework.onlineShop.model.User;
import homework.onlineShop.model.enamModel.PaymentMethodType;
import homework.onlineShop.model.enamModel.ProductType;
import homework.onlineShop.model.enamModel.UserType;
import homework.onlineShop.storage.OrderStorage;
import homework.onlineShop.storage.ProductStorage;
import homework.onlineShop.storage.UserStorage;

import java.util.Scanner;

import static homework.onlineShop.model.enamModel.ProductType.*;
import static homework.onlineShop.model.enamModel.UserType.ADMIN;
import static homework.onlineShop.model.enamModel.UserType.USER;


public class OnlineShopDemo implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static OrderStorage orderStorage = new OrderStorage();
    private static ProductStorage productStorage = new ProductStorage();
    public static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {
        boolean isRan = true;
        while (isRan) {
            Command.printCommands();
            switch (scanner.nextLine()) {
                case "0":
                    isRan = false;
                    break;
                case "1":
                    logIn();
                    break;
                case "2":
                    registerCommand();
                    break;
                default:
                    System.out.println("Try again!");
            }
        }
    }

    private static void registerCommand() {
        System.out.println("Please input your ID");
        String userId = scanner.nextLine();
        System.out.println("Please input your name");
        String userName = scanner.nextLine();
        System.out.println("Please input your email");
        String userEmail = scanner.nextLine();
        System.out.println("Please input your password");
        String userPassword = scanner.nextLine();
        System.out.println("If you are admin please input 1 and something else for user");
        UserType userType;
        if (scanner.nextLine().equals("1")) {
            userType = ADMIN;
        } else {
            userType = USER;
        }
        User user = new User(userId, userName, userEmail, userPassword, userType);
        userStorage.add(user);
    }

    private static void logIn() {
        System.out.println("Please input your email");
        String email = scanner.nextLine();
        System.out.println("Please input your password");
        String password = scanner.nextLine();
        User user = userStorage.isUser(email, password);
        try {
            if (user.getUserType() == UserType.ADMIN) {
                loginAdmin();
            } else if (user.getUserType() == UserType.USER) {
                loginUser();
            }
            user.getUserType();
        } catch (NullPointerException nul) {
            System.out.println("Sorry, Uncorrected email or password. Try again!");
        }
    }

    private static void loginAdmin() {
        boolean isRun = true;
        while (isRun) {
            Command.printAdminCommands();
            switch (scanner.nextLine()) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addProduct();
                    break;
                case "2":
                    removeProductById();
                    break;
                case "3":
                    productStorage.printProducts();
                    break;
                case "4":
                    userStorage.printUsers();
                    break;
                case "5":
                    orderStorage.printOrders();
                    break;
                case "6":
//                    productStorage.changeOrderStatus();
                    break;
                default:
                    System.out.println("try again!");
            }
        }

//        2 - remove product by id
//        6 - change order status(Ստուգում եք եթե
//        օրդերի ստատուսը դրեց DELIVERED ուրեմն պրոդուկտից էդ քանակով կհանեք )

    }

    private static void loginUser() {
        boolean isRun = true;
        while (isRun) {
            Command.printUserCommands();
            switch (scanner.nextLine()) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    productStorage.printProducts();
                    break;
                case "2":
                    buyProduct();

                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Try again!");
            }
        }
    }
//        եթե գրեց, Order ի օբյեկտ կսարքենք NEW ստատուսով ու կպահենք )
//        Պետք է ստուգել արդյոք ներմուծված  քանակը  կա պահեստում, եթե չլինի քցեք OutOfStockException, որը մեյն կլասսում կմշակեք։
//        3 - print my orders
//        4 - cancel order by id


    private static void buyProduct() {
        System.out.println("If you want to buy a product, please input product ID");
        String buyId = scanner.nextLine();
        System.out.println("input count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("and select type to payment \n click 1 for CARD \n" +
                " click 2 for CASH,\n click 3 for PAYPAL");
        PaymentMethodType paymentMethodType = null;
        switch (scanner.nextLine()) {
            case "1":
                paymentMethodType = PaymentMethodType.CARD;
                break;
            case "2":
                paymentMethodType = PaymentMethodType.CASH;
                break;
            case "3":
                paymentMethodType = PaymentMethodType.PAYPAL;
            default:
                System.out.println("Select again!");
                break;
        }
        int cost = productStorage.howCost(buyId, count);
        Product product = productStorage.product(buyId);
        System.out.println("If you want to buy " + product.getName() + " in this count` " + count
                + " and at this price `" + cost + ", write YES if you want to confirm");
        String confirm = scanner.nextLine();

    }

    private static void addProduct() {
        System.out.println("Please input product ID");
        String productId = scanner.nextLine();
        System.out.println("Please input product name");
        String productName = scanner.nextLine();
        System.out.println("Please input product description");
        String productDescription = scanner.nextLine();
        System.out.println("Please input product price");
        int productPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input product stockQty");
        int productStockQty = Integer.parseInt(scanner.nextLine());
        System.out.println("Please select product type \n click 1 for ELECTRONICS,\n" +
                " click 2 for CLOTHING,\n click 3 for BOOKS");
        ProductType productType = null;
        switch (scanner.nextLine()) {
            case "1":
                productType = ELECTRONICS;
                break;
            case "2":
                productType = CLOTHING;
                break;
            case "3":
                productType = BOOKS;
            default:
                System.out.println("Select again!");
        }
        Product product = new Product(productId, productName, productDescription, productPrice, productStockQty, productType);
        productStorage.add(product);
    }

    private static void removeProductById() {
        System.out.println("If you want to delete the product, import product ID");
        String prId = scanner.nextLine();
        productStorage.removeById(prId);
    }
}
