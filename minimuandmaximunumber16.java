public class minimuandmaximunumber16 {
    public static void main(String[]args){
  int[] a={4,2,5,6,7,8,90};
  int max=a[0];
  for(int i=1; i<a.length;i++){
    if(max<a[i]){
         max=a[i];
    }
  }
  System.out.println("maximum element is"+max);

           




    }
}
