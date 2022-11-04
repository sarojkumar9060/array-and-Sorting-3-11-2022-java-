public class findsingleRepetedNumber21 {
 
//  XOR GATE
 
    public static void main(String[]args){

        int[] a={5,3,4,5,2,2,1,3,4};
        int res=a[0];
        for(int i=1; i<a.length; i++){
            res=res^a[i];
        }
        System.out.println("single repeated element is"+res);
    }
}
