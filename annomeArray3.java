import java.lang.reflect.AnnotatedArrayType;

public class annomeArray3 {
    public static void main(String args[]){
        annomeArray3.sum(new int[]{10,20,30} );


    }
    static void sum(int[]no){
        int total=0;
        for(int i:no){
            total=total+i;

        }
        System.out.println("sum is :"+total );
    }
}
