import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class ListTest {

    public static void main(String[] args) {
        Collection c = new HashSet(); //Hashset() : 중복 체크
        System.out.println(c.add(1234));
        System.out.println(c.add("hello"));
        System.out.println(c.add(new Date()));
        System.out.println(c.add(1234));
        System.out.println(c.add("hello"));
        System.out.println(c.add(new Date())); //false로 나올수도, true로 나올수도! 여기까지 오는동안 초(sec)가 바뀌면 true 된다.
        System.out.println(c); //toString으로 출력됨!
    }
}
