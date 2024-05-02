import java.util.ArrayList;
import java.util.List;

public class CheckSentenceSorted
{
    public static void main(String[] args) {

        CheckSentenceSorted sentenceSorted = new CheckSentenceSorted();
        System.out.println(sentenceSorted.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
    }
    public boolean areNumbersAscending(String s) {
        List<Integer> ls= new ArrayList<>();


        String[] str=s.split(" ");
        for(String word: str){

            try{
                int num= Integer.parseInt(word);
                ls.add(num);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }

        }

        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i)>=ls.get(i+1)) return false;
        }
        return true;
    }
}
