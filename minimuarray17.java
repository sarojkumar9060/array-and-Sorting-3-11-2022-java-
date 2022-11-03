public class minimuarray17 {
    public static void main(String []args){
        int[] a={4,5,2,3,8,7,1,67};
        int min=a[0];
        for(int i=0; i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.print("minimum element"+min);
    }
}
