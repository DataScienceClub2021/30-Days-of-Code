//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer>di=new HashMap<String,Integer>();
    
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            di.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
          
           if(di.get(s)==null){
                System.out.println("Not found");   
           }else{
                 System.out.println(s+"="+di.get(s));   

           }
            
        }
        in.close();
    }
}

