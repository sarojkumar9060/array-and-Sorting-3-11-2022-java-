public class missingNumber23 {
     public static void main(String []args){
        int[] a={1,2,3,4,6};
        int expected_no_elements=a.length+1;
        int total_sum=expected_no_elements*(expected_no_elements+1)/2;
        // System.out.println(total_sum);
        int sum=0;
        for(int i=0; i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(" missings number is"+(total_sum-sum));

     }
}
