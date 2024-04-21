package patterns;

public class ttttttt {
    public static int playSegments(int[] coins) {
        int n = coins.length;
        int score = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                score -= coins[i];
            } else {
                score += coins[i];
            }
        }
        int segmentsToPlay = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (score + coins[i] > 0) {
                    segmentsToPlay--;
                }
            } else {
                if (score - coins[i] >= 0) {
                    segmentsToPlay++;
                }
            }
        }
        return segmentsToPlay;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,0,1};
        System.out.println(playSegments(arr));
    }    
}
    

    