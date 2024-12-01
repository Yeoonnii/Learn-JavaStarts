package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 10;
        int b = 3;

        // 덧셈
        int sum = a + b;    // 10 + 3 = 13
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;   // 10 - 3 = 7
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;  // 10 * 3 = 30
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;    // 10 / 3 = 3.33333... -> 3
        /*
        * Java 에서 int 형 끼리 계산하면 계산 결과도 int 형이 된다.
        * int 형은 정수이기 때문에 소숫점 이하를 포함할 수 없다.
        * */
        System.out.println("a / b = " + div);

        // 나머지 연산자
        int mod = a % b;    // 10 % 3 = 1
        System.out.println("a % b = " + mod);

    }
}
