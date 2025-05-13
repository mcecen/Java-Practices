import java.time.LocalTime;
import java.util.Arrays;

public class Static04 {

    public static void main(String[] args) {


        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(time);

        String str = "";


        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        System.out.println(time);

    }
}

