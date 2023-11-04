package homework.onlineShop;

public interface Command {
   static void printCommands(){
       System.out.println("Please input 0 for EXIT");
       System.out.println("Please input 1 for LOGIN");
       System.out.println("Please input 2 for REGISTER");
   }

   static void printAdminCommands(){
       System.out.println("Hi Admin");
       System.out.println("Please input 0 for logout");
       System.out.println("Please input 1 for add product");
       System.out.println("Please input 2 for remove product by id");
       System.out.println("Please input 3 for print products");
       System.out.println("Please input 4 for print USER");
       System.out.println("Please input 5 for print orders");
       System.out.println("Please input 6 for change order status");
   }

   static void printUserCommands(){
       System.out.println("Hi User");
       System.out.println("Please input 0 for logout");
       System.out.println("Please input 1 for print all products");
       System.out.println("Please input 2 for buy product");
       System.out.println("Please input 3 for print my orders");
       System.out.println("Please input 4 for cancel order by id");
   }


}
