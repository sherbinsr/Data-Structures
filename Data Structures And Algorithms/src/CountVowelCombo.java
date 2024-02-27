public class CountVowelCombo {

    public static void main(String[] args) {

        CountVowelCombo vowelCombo =new CountVowelCombo();
        System.out.println(vowelCombo.countVowelStrings(2));
    }
    public int countVowelStrings(int n) {

        int res=(n+4)*(n+3)*(n+2)*(n+1)/24;

        return res;
    }
}
