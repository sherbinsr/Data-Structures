import java.util.HashMap;
import java.util.Map;

public class ReformatDate
{

    public static void main(String[] args) {

        ReformatDate reformatDate = new ReformatDate();
        System.out.println(reformatDate.reformatDate("20th Oct 2052"));
    }
    public String reformatDate(String date) {

        Map<String,String>map =new HashMap<>();
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");

        String[] d = date.split(" "); // length = 3
        StringBuilder s = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            if (i == 2)
                s.append(d[i]).append("-");
            if (i == 1)
                s.append(map.get(d[i])).append("-");
            if (i == 0) {
                if (d[0].length() == 3) {
                    s.append("0").append(d[0].charAt(0));
                } else {
                    s.append(d[0].charAt(0));
                    s.append(d[0].charAt(1));
                }
            }
        }
        return s.toString();

    }
}
