public class CountTournament
{

    public static void main(String[] args) {

        CountTournament countTournament = new CountTournament();
        System.out.println(countTournament.numberOfMatches(7));
    }
    public int numberOfMatches(int n) {

        int count=0;

        int matches=0;
        int teams=n;

        while (teams!=1)
        {
            matches=teams/2;
            teams=teams-matches;
            count+=matches;
        }

        return count;
    }
}
