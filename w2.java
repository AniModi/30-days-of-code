import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class w2 {
    public static  int binsearch(int arr[],int key){
          int start = 0;
          int end = arr.length-1;
          for (int i = 0; i < arr.length; i++) {
            int mid = (start+end)/2;
            if(arr[mid]==key){
               return mid;
            }
            else if(arr[mid]>key){
                end = mid - 1;
            }
            else{
                 start = mid+1;
            }
          }
          return -1;

    } 
    public static void odd(String str){
            for (int i = 0; i < str.length(); i++) {
                if(i%2!=0){
                    System.out.println(str.charAt(i));
                }
            }
    }
    public static void largest3(int arr[]){
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=arr.length-3; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void bubblesortd(int arr[]){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<=arr[j+1]){
                    int  x = arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=x;
                 }
            }
        }
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
        }
    }
    public static void bubblea(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>=arr[j+1]){
                    int x = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
 public static void selectionsort(int arr[]){
          for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[min]>=arr[j]){
                        min=j;
                    }
                    int x =arr[min];
                    arr[min]=arr[j];
                    arr[j]=x;
            }
          }     
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
    }
    public static void insertionsort(int arr[]){
          for (int i = 1; i < arr.length; i++) {
              int start = arr[i];
              int prev  = i - 1;
            while(prev>=0&&(arr[prev]<=start)){
                arr[prev+1]=arr[prev];
                arr[prev] = start;
                prev--;  //makes prev = -1
                  

            }

          }
          for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int freq(int arr[],int n){
        Arrays.sort(arr);
        int counter =0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==n){
            counter++;
           }

        }
        return counter;
    }
    public static void fbyhashmap(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm.entrySet());
    }
    public static void fbyhm(String s,int n){
     HashMap<Character,Integer> hm = new HashMap<>();
     for (int i = 0; i < n; i++) {
        if(hm.containsKey(s.charAt(i))){
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        else{
            hm.put(s.charAt(i), 1);
        }
        
     }
     System.out.println(hm);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int arr[]=new int[4];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }*/
        // System.out.println(sum);
        // System.out.println(binsearch(arr, 4));
        String str ="helloguys";

    //    odd(str);
    //    largest3(arr);
    //    bubblesortd(arr);
    //    bubblea(arr);
    //    selectionsort(arr);
    //    insertionsort(arr);
    //    System.out.println("enter number you want freq off");
    //    int n = sc.nextInt();
    //    System.out.println(freq(arr, n));
    int arr1[]={10,20,20,30,50,60,60};
        fbyhashmap(arr1);
    int k = str.length();
    fbyhm(str, k);



    }
}
