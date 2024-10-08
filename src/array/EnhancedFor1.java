package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

        /* iter 단축어 사용하면 아래처럼 나옴
        for (int number : numbers) {

        }
        for-each문을 사용할 수 없는 경우 = 증가하는 index 값이 필요한 경우
        */
    }
}
