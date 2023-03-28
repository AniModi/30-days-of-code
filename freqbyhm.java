import java.util.HashMap;


public class freqbyhm {
    public static void fby(int arr[]){
        HashMap <Integer,Integer> hm  = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],(hm.get(arr[i]))+1);
            }
            else{
             hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
    }
    public static void main(String[] args) {
        
       int arr[]={20,20,40,40,30};
       fby(arr);
       
       
    }
}
