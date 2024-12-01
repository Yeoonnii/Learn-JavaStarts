package operator;

public class Operator3 {

    public static void main(String[] args) {
        // 연산자 우선순위 변경시 괄호를 사용한다.
        int sum1 = 1 + 2 * 3;   // 1 + (2 * 3)
        int sum2 = (1 + 2) * 3;

        System.out.println("sum1 = " + sum1);   // 7
        System.out.println("sum2 = " + sum2);   // 9
    }
}
