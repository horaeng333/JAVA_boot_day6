public class StringTest {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        String s1="hi";
        String s2="hi";
        String s3 = new String("hi");   //new를 한 String과 하지 않은 String은 메모리가 다르다.
        String s4 = new String("hi");
        System.out.println(num1==num2);
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        String s5=s4;
        System.out.println(s5==s4);
    }

}
