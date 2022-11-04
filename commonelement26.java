import java.util.HashSet;

public class commonelement26 {
 public static void main(String[] args) {
        

    
    // int[] arr1={4,3,7,9,2,4};
    // int[] arr2={5,1,4,8,3};
    // for(int i=0; i<arr1.length;i++){
    //     for(int j=0; j< arr2.length; j++){
    //         if(arr1[i]==arr2[j]){
    //             System.out.print(arr1[i]);
    //             break;
    //         }
    //     }
    // }

// HAS SET METHODE 
int[] arr1={4,3,7,9,2};
int[] arr2={5,1,4,8,3};
// HashSet<Integer>hs=new HashSet<>();
// for(int no:arr1){
//     hs.add(no);
// }
// for(int no:arr2){
//     boolean b=hs.add(no);
//     if(b==false){
//         System.out.println(no);
//     }
// }
HashSet<Integer>hs1=new HashSet<>();
HashSet<Integer>hs2=new HashSet<>();
for(int no:arr1){
    hs1.add(no);

}
for(int no:arr2){
    hs2.add(no);
}
for(int no:hs2){
    boolean b=hs1.add(no);
    if(b==false){
        System.out.println(no);
    }
}


 }}
 