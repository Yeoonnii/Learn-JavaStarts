package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;       // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3);

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        /*
        *   sum3과 sum4는 같은 연산을 수행한다.
        *   -> sum4 처럼 괄호를 명시적으로 사용하는 것이 명확하고 이해하기 쉬우며 유지보수도 용이하다.
        * 
        *   연산자 우선순위가 애매하거나 조금 복잡해지는 경우,
        *   괄호를 고려하여 명확하고 단순하게 작성하는 것이 좋은 습관!
        * */

    }
}