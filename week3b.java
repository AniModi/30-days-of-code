public class week3b {
    public static int set(int a){
        int  p = 1;
        int count = 0;
        while(p<=a){
          int m = a&p;
          if(m!=0){
           count++;
          }
          p=p<<1;
        }
        return count;

    }
    public static Boolean pow(int a){
        int  p = 1;
        Boolean b = true;
        int count = 0;
        while(p<=a){
          int m = a&p;
          if(m!=0){
           count++;
          }
          p=p<<1;
        }
       if (count==1){
        b=true;
       }
       else{
        b = false;
       }
return b;

    }
    //q3
    public static int us(int a,int b){
      int p = 1;
      p=p<<b;
      int m = a|p;
      return m;
    }
    //q4
    public static int clear(int a,int b){
        int p = 1;
        p=p<<b;
        int m = a^p;
        return m;
      }
    //q5
    public static int toggle(int a,int b){
        int  p = 1;
        p=p<<b;
        int o;
        int t = a&p;
        if(t==0){
            o = us(a,b);
        }
        else{
           o = clear(a, b);
        }
        return o;    
    }
    //q6
    public static void srr(int arr[]){
        int mrr[]=new int[100];int p =0;
    //vo find kar jo double bari hai and arr mein store kar
      for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            int y = arr[i]^arr[j];
            if(y==0){
              mrr[p]=arr[i];
              p++;
            }
        }
      }
      //jo naye arr mein store kiye hain vo element purane mein 0 kar de
     for (int i = 0; i < p; i++) {
        for (int j = 0; j < arr.length; j++) {
            if(mrr[i]==arr[j]){
                arr[j]=0;
            }
        }
     }
     //non zero elements print kar 
     for (int i = 0; i < arr.length; i++) {
        if (arr[i]!=0) {
            System.out.println(arr[i]);
        }
     }
    }
    public static int rev(int a){
    
      int arr[]=new int[77];
      int i = 0;
      while(a!=0){
        int rem = a%2;
        arr[i] = rem;
        a=a/2; 
        i++;
      }
      System.out.println(i);
      int sum = 0;
      int m =0;
      for (int j = i-1; j >= 0; j--) {
        sum =sum + (int)(arr[j]*Math.pow(2, m));
        m++;
      }
      return sum;
    }
    public static int nobit(int a , int b){
      int p = 1;
      int q = 1;
      int c = 0;
      do{
       int rem1 = a&p;
       int rem2 = b&q;
       if(rem1!=rem2){    //just to get the last bits of each
        c++;
       }
       p=p<<1;
       q=q<<1; 
      }while(p<=Math.max(a, b));
      return c;
    }
   
public static int my(int a){
  int p=1;
  while(p<=a){
   a=a^p;
   p=p<<1;
  }
  return a;
}
public static int finnl(int n){
      int m = set(n);
      int p = n+1;
      int q = 0;
      while(q!=m){
        q = set(p);
        p++;
      }
    
      return p-1;
}
public static int small(int n){
  int m = set(n);
      int p = n-1;
      int q = 0;
      while(q!=m&&p>=0){
        q = set(p);
        p--;                     //calling set bit fxn
      }
     if(p<0){
      return 0;
     }
     else{
      return p+1;
     }
}
public static int count(int n){
  int c = 0;
while(n>0){
  n=n>>1;
  c++;
}
return c;
}
    public static void main(String[] args) {
System.out.println(count(10));
    
  }
}
