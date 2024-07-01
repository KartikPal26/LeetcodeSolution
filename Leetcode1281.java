public class Leetcode1281 {
    public static void main(String[] args) {

    }
    public int subtractProductAndSum(int n) {
        int a=n;
        int rem;

        int sum =0;
        int product =1;
        while(a!=0){
            rem = a%10;
            a /=10;
            sum += rem;
            product *= rem;
        }
        return product-sum;
    }
}
