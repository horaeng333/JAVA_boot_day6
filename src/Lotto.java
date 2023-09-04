import java.util.*;

public class Lotto {
    public static void main(String[]args){
        HashSet<Integer> lotto = new HashSet<>();
        while(lotto.size()<6) {
            int num=(int)(Math.random()*45)+1;
            lotto.add(num);
        }
        System.out.println(lotto);
        Object[] lottoArray = lotto.toArray();
        Arrays.sort(lottoArray);
        System.out.println(Arrays.toString(lottoArray));

    }
}
