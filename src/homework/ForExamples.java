package homework;

public class ForExamples {
    public static void main(String[] args) {

        //Տպել 1-ից 1000 թվերը իրար կողք, արանքում դնելով - սինվոլը։ Այնպես գրեք, որ վերջում - չլինի։
        System.out.println("#1");
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i);
            if (i < 1000){
                System.out.print(" - ");
            }
        }

        //Տպել 1-ից 100 թվերի մեջ ընկած զույգերը օգտագործելով % գործողությունը։
        System.out.println("\n#2");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
        }

        //Հայտարարել թվերի մասիվ՝ int[] array = {2,5,8,4,9,3,7}, ֆոր- օգտագործելով գտնել մասիվի ամենամեծ թիվը ու տպել։
        System.out.println("\n#3");
        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int big = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > big){
                big = array[i];
            }
        }
        System.out.println("is the greatest number: " + big);


    }
}
