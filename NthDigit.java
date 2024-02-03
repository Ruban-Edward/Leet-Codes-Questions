import java.util.Scanner;

class NthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NthDigit obj = new NthDigit();
        int result = obj.findNthDigit(n);
        System.out.println(result);
        sc.close();
    }

    public int findNthDigit(int n) {
        int digit =1;
        int digitInterval = 9;
        while(n - digitInterval > 0){
            n = n-digitInterval;
            digit++;
            digitInterval = 9* ((int)Math.pow(10,digit-1))*digit;
            if(digitInterval < 0){
                break;
            }
        }
        int base = (int)Math.pow(10,digit-1);
        int num = base + (n-1)/digit;
        char ans = String.valueOf(num).charAt((n-1)%digit);
        return ans - '0';
    }
}