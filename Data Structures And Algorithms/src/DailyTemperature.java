public class DailyTemperature
{
    public static void main(String[] args) {

        DailyTemperature dailyTemperature = new DailyTemperature();
        int temperatures [] ={73,74,75,71,69,72,76,73};
        int res [] =dailyTemperature.dailyTemperatures(temperatures);
        
        for(int r:res){
            System.out.println(r);
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }

        return answer;
    }
    }
