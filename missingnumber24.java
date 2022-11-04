public class missingnumber24 {
    public static void main(String[]args){
        int[] a={1,2,3,4,6};
        int XOR1=a[0];
        for(int i=1; i<a.length;i++){
            XOR1=XOR1^a[i];

        }
        int XOR2=1;
        for(int i=2; i<=(a.length+1);i++){
            XOR2=XOR2^i;
        }
        System.out.print("missing element is"+(XOR1^XOR2));
    }
}
