import java.util.ArrayList;
import java.util.List;

public class KthFactorOfN
{

    public static void main(String[] args) {

        KthFactorOfN kthFactorOfN = new KthFactorOfN();
        System.out.println(kthFactorOfN.kthFactor(4,4));
    }
    public int kthFactor(int n, int k)
    {
        List<Integer> li = new ArrayList<>();

        for(int i=1; i<=n; i++)

        {
            if(n%i==0)
            {
                li.add(i);
            }
        }

        if(k> li.size())
        {

            return -1;
        }
        else
        {
            return li.get(k-1);
        }
    }

}
