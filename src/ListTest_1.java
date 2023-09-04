import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class ListTest_1 {
    public static Collection getCollection(Collection c) { //고객이 어떤 API를 원할 지 모르니까 따로 만들어놓기
        //Collection c = new HashSet(); 
        System.out.println(c.add(1234));
        System.out.println(c.add("hello"));
        System.out.println(c.add(new Date()));
        System.out.println(c.add(1234));
        System.out.println(c.add("hello"));
        System.out.println(c.add(new Date())); 
        System.out.println(c); 
        return c;
    }
    public static void main(String[] args) {
        System.out.println(getCollection(new ArrayList()));
        System.out.println(getCollection(new HashSet()));
    }
}
