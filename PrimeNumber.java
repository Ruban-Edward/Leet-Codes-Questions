public class PrimeNumber {
    public static void main(String[] args) {
        int n = 30;
        PrimeNumber obj = new PrimeNumber();
        int ans = obj.countPrimes(n);
        System.out.println(ans);
    }
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n+1];
        int count =0;
        for(int i = 2;i<Math.sqrt(n);i++){
            if(!arr[i]){
                for(int j =i*i;j<=n;j=j+i){
                    arr[j] = true;
                }
            }
        }
        for(int i = 2;i<n;i++){
            if(!arr[i]){
                count++;
            }
        }
        return count;
    }
}