import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlternatingDigitSum {
    public static void main(String[] args) {

        AlternatingDigitSum digitSum = new AlternatingDigitSum();
        System.out.println(digitSum.alternateDigitSum(521));
    }

    public int alternateDigitSum(int n) {


        List<Integer> li = new ArrayList<>();
        while (n > 0) {
            li.add(n % 10);
            n = n / 10;
        }
        Collections.reverse(li);
        int ans = 0;
        for (int i = 0; i < li.size(); i++) {
            if (i % 2 == 0) {
                ans += li.get(i);
            } else {
                ans -= li.get(i);
            }
        }
        return ans;
    }
}
