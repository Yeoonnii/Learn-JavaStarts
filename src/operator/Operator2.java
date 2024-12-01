package operator;

public class Operator2 {

    public static void main(String[] args) {
        /*
        * Java는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다.
        * 결과적으로 문자열에 더하는 것은 다 문자열이 된다.
        * */
        
        // 1. 문자열과 문자열 더하기 (1)
        String result1 = "hello" + "world";
        System.out.println(result1);
        
        // 2. 문자열과 문자열 더하기 (2)
        String str1 = "str1";
        String str2 = "str2";
        String result2 = str1 + str2;
        System.out.println(result2);

        // 3. 문자열과 숫자 더하기 (1)
        /* Java 에서 문자열과 숫자를 더하면 숫자를 문자열로 변경한 후 더한다. 결과값으로 문자열이 출력된다. */
        String result3 = "add num + " + 10;
        System.out.println(result3);

        // 4. 문자열과 숫자 더하기 (2)
        int num = 20;
        String str3 = "num1 + num2 = ";
        String result4 = str3 + num;
        System.out.println(result4);
    }
}
