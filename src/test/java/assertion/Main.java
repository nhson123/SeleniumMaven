package assertion;

import org.testng.annotations.Test;

/**
 * Package: assertion
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 11.04.2018 2018
 */
public class Main {
    public static void main(String args[]) {
        continues();
    }

    public static void continues() {
        first:
        for (int i = 0; i < 4; ++i) {
            second:
            for (int j = 0; j < 4; ++j) {
                third:
                for (int k = 0; k < 4; ++k) {
                    System.out.println("inner start: i+j+k " + (i + j + k));
                    if (i + j + k == 5)
                        continue third;
                    if (i + j + k == 7)
                        continue second;
                    if (i + j + k == 8)
                        break second;
                    if (i + j + k == 9)
                        break first;
                    System.out.println("inner stop:  i+j+k " + (i + j + k));
                }
            }
        }
    }
}
