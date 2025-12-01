import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int curr = 50;
        int password = 0;


        while (sc.hasNextLine()) {
            int temp = curr;
            String in = sc.nextLine();
            if (in.charAt(0) == 'L') {
                curr -= Integer.parseInt(in.substring(1));
            } else {
                curr += Integer.parseInt(in.substring(1));
            }

            int first, second;
            if (curr < 0) {
                first = (int) Math.floor(curr / 100) - 1;
            } else {
                first = (int) Math.floor(curr / 100);
            }
            if (temp < 0) {
                second = (int) Math.floor(temp / 100) - 1;
            } else {
                second = (int) Math.floor(temp / 100);
            }
            password += Math.abs(first - second);
            /*
             * L68 50 -68 -18 
             * L30
             * R48
             * L5
             * R60
             * L55
             * L1
             * L99
             * R14
             * L82
             * 
             * 
             */
            curr %= 100;

        }
        System.out.println(password);
    }
}
