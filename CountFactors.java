public class CountFactors {
    public static int solution(int N) {
        int factorCount = 0;
        int sqrtN = ((Double)Math.sqrt(N)).intValue();
        int candidate;

        while(sqrtN > 0){
            if(N%sqrtN == 0){
                candidate = N/sqrtN;
                if(candidate == sqrtN){
                    factorCount++;
                }
                else{
                    factorCount += 2;
                }
            }
            sqrtN--;
        }

        return factorCount;
    }
}
