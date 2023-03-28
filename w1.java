import java.util.Scanner;

//q1
public class w1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*float n =sc.nextFloat();
        double k = sc.nextDouble();
    System.out.println(String.format("%.3f",n));
    System.out.println(String.format("%.3f",k));
    */
    int n = sc.nextInt();
   // simple star
    /*for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if(i>=j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }*/
   //star inv
   /*int c = 2*n-1;
   for (int i = 0; i < n; i++) {
    for(int j=0;j<c;j++){
        System.out.print("*");
    }
    System.out.println();
    c=c-2;
   }*/
   //equi pattern
  /* for (int i = 1; i <= n; i++) {
    for (int j = n-i; j >=0 ; j--) {
        System.out.print(" ");

    }
    for (int j = 1; j <=i  ; j++) {
        System.out.print(" *");
    }
    
    System.out.println();
   }
*/
// numerical butterfly
/*for (int i = 1; i <= n; i++) { 
    for (int j = 1; j <=i ; j++) {
       System.out.print(j);
    }
    for (int j =2*(n-i) ; j > 0 ; j--) {
        System.out.print(" ");
    }
    for (int j =i ; j >0 ; j--) {
        System.out.print(j);
        
    }
System.out.println();*/


}



    }
}