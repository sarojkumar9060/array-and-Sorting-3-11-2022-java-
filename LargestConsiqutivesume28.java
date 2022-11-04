import java.util.HashSet;
public class LargestConsiqutivesume28{
    public static void main(String[]args){
        int[] a={2,4,8,7,1,0,6};
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        int long_leng=0;
        for(int i=0; i<a.length;i++){
            if(!hs.contains(a[i]-1)){
                int no=a[i];
                while(hs.contains(no)){
                    no++;
                }
                if(long_leng<no-a[i]){
                    long_leng=no-a[i];
                }
            }
        }
        System.out.println("longest sub sequece "+long_leng);
    }

     
}


