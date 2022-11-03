public class DublicateNumber20 {
    public static void main(String[]args){
        int[] a={3,5,4,3,2,2,1,1,1};
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]==a[j])&&(i!=j)){
                    System.out.print(a[j]+" ");
                }
            }
        }
    }
}
