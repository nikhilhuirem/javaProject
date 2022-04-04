import java.util.ArrayList;
import java.util.Collections;

public class Otp {
    public static void main(String[] args)  {
        System.out.println(otp());
    }

    public static String otp() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        int otp = 0;
        otp = (list.get(0) * 1000) + (list.get(1) * 100) + (list.get(2) * 10) + list.get(3);
        return "Your otp is: " + Integer.toString(otp);
    }
}
