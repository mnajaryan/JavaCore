package homework;

public class ArrayUtil {
        int[] numbers;

        //1. Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
        void seeAllElem (){
            System.out.println("Ex 1");
            for (int i = 0; i < numbers.length-1; i++) {
                System.out.print(numbers[i] + " ");
            }
        }


        //2.Տպել մասիվի առաջին էլեմենտը
        int firstElem(){
            System.out.println();
            System.out.println("Ex 2: " + numbers[0]);
            return numbers[0];
        }

        //3. Տպել մասիվի վերջին էլեմենտը
         void lastElem(){
             System.out.println("Ex 3 : " + numbers[numbers.length - 1]);
         }


        //4. Տպել մասիվի երկարությունը
        void arrayLength(){
            System.out.println("Ex 4 : " + numbers.length);
        }


        //5. Տպել մասիվի ամենափոքր թիվը
        void minNum(){
            int min = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                }
            }
            System.out.println("Ex 5 : " + min);
        }


        //6.
        void middlNum(){
            if (numbers.length % 2 != 0){
                System.out.println(numbers[numbers.length / 2]);
            } else {
                System.out.println(numbers[numbers.length / 2 - 1] + "," +
                                  numbers[numbers.length /2] );
            }
        }


        //7.Հաշվել ու տպել մասիվում զույգերի քանակը։
        void numOfEven(){
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0){
                    count++;
                }
            }
            System.out.println("Ex 7 : " + count);
        }

        //8.Հաշվել ու տպել մասիվում կենտերի քանակը։
        void numOfOdd(){
            int count2 = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0){
                    count2++;
                }
            }
            System.out.println("Ex 8 : " + count2);
        }


        //9. Տպել մասիվում էլեմենտների գումարը։
        void printSum(){
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Ex 9 : " + sum);
        }


    //10.Տպել մասիվում թվերի միջին թվաբանականը։
        void printAverage(){
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            double average = sum / numbers.length;
            System.out.println("Ex 10 : " + average); // ամբողջով թիվ չստացվեց
        }


//

//    }
}
