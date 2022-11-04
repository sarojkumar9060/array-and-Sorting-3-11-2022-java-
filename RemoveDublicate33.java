import java.util.HashSet;
public class RemoveDublicate33 {
    public static void main(String[]args){
        int[] a={1,8,9,2,3,2,4,5,5};
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0; i<a.length;i++){
            hs.add(a[i]);

        }
        for(int no:hs){
            System.out.print(no+" ");


        }
    }
}
