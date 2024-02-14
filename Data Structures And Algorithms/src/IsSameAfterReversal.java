public class IsSameAfterReversal {

    public static void main(String[] args) {

        IsSameAfterReversal sameAfterReversal = new IsSameAfterReversal();
        System.out.println(sameAfterReversal.isSameAfterReversals(10));
    }

    public boolean isSameAfterReversals(int num) {

        boolean res =true;

        String n=""+num;


        if(n.charAt(n.length()-1)=='0' && n.length()>=2)
        {
            res=false;
        }

        return res;
    }
}
