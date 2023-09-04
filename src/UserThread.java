class UserA extends Thread {
    private int count;
    public void run() {
        while (true) {
            System.out.println(++count + " " + toString());
            if(count>=50) break;
        }
    }
}

public class UserThread {
    public static void main(String[] args) {
        UserA t1 = new UserA();
        UserA t2 = new UserA();
//        t1.run();
//        t2.run();
        t1.start();
        t2.start();
    }
}
