public class RemoveStars
{

    public static void main(String[] args) {

        RemoveStars removeStars = new RemoveStars();
        System.out.println(removeStars.removeStars("leet**cod*e"));
    }
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}
