public class week3 {
  
     public static int fac (int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
     }
     public static int fib(int n){
        if(n==1||n==0){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
     }
     public static int sum5(int n){
        int sumyy = 0;
        if(n==0){
            return sumyy;
        }
       else{
        int k = n%10;
         n=n/10;
        sumyy = sumyy + k + sum5(n);
        return sumyy;  
       }       
     }
     public static int sumc(int n){
        int summ = 0; 
        if(n==0){
            return 0; 
        }
        else{
            
            return n+sumc(n-1); 
            
        }
     }
     public static int gcd(int a,int b){
      if(b==0){
        return a;
      }
      else{
        return gcd(b, a%b);
      }
     }
     public static int arr(int ar[],int n){
     
     int sum = 0;
     if(n<0){
        return sum;
     }
     else{
        return ar[n]+arr(ar,n-1);
        
     }
     }
     public static int  palin(String str, int start,int end){
        int p = 0;
       if(start < end){
          if(str.charAt(start)==str.charAt(end)){
             p = 1;
             return palin(str, start+1, end-1);
          }
          else{
            p = 0;
          } 
       }
       else if(start==end){
        p = 1;
       }
       return p;
     }
    static StringBuilder sb = new StringBuilder("");
    public static String rev(String str,int end){
    
     if(end>=0){
        sb.append(str.charAt(end)+"");
        return rev(str,end-1);
      }
       return sb.toString();
    }
    public static int per(String str){
        
    }
    public static void main(String[] args) {
     int start =0;
     String str="arorjfewohflehfklwe";
     int end = str.length()-1;

      System.out.println(rev(str, end));
     
    }
    
}
