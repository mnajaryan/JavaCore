package homework;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        //1. Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.print(numbers[i] + " ");
        }

        //2.Տպել մասիվի առաջին էլեմենտը
        System.out.println("\n" + "Ex 2 : " + numbers[0]);

        //3. Տպել մասիվի վերջին էլեմենտը
        System.out.println("Ex 3 : " + numbers[numbers.length - 1]);

        //4. Տպել մասիվի երկարությունը
        System.out.println("Ex 4 : " + numbers.length);

        //5. Տպել մասիվի ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Ex 5 : " + min);

        //6.


        //7.Հաշվել ու տպել մասիվում զույգերի քանակը։
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Ex 7 : " + count);

        //8.Հաշվել ու տպել մասիվում կենտերի քանակը։
        int count2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                count2++;
            }
        }
        System.out.println("Ex 8 : " + count2);

        //9. Տպել մասիվում էլեմենտների գումարը։
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Ex 9 : " + sum);

        //10.Տպել մասիվում թվերի միջին թվաբանականը։
        float average = sum / numbers.length;
        System.out.println("Ex 10 : " + average); // ամբողջով թիվ չստացվեց



    }
}
