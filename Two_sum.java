import java.util.*;
class Two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] a =new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        if (a.length == 2) {
            System.out.println("["+a[0]+","+a[1]+"]");
        } else {
            System.out.println("No solution found.");
        }
        sc.close();
    }
}