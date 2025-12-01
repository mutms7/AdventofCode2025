import java.util.*;

public class q1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int curr = 50;
        int password = 0;
        while (sc.hasNextLine()) {
            String in = sc.nextLine();
            if (in.charAt(0) == 'L') {
                curr -= Integer.parseInt(in.substring(1));
            } else {
                curr += Integer.parseInt(in.substring(1));
            }
            curr %= 100;
            if (curr == 0) {
                password++;
            }
        }
        System.out.println(password);
    }
}
