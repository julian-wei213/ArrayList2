import java.util.ArrayList;
import java.io.*; 
import java.util.*; 

class Q3 {
    public static void main(String[] args){
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        
        for(int i = 0; i<10;i++){
            a.add((int)(Math.random()*10));
            b.add((int)(Math.random()*10));
        }
        
        System.out.println("The first array was " + a);
        System.out.println("The second array was " +b);
        System.out.println("Added together, the answer is " + add(a,b));
    }
    
    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b){
        int extra = 0;
        int sSize = 0;
        int count = 0;
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(a.size() > b.size()){
            sSize = b.size();
        }else{
            sSize = a.size();
        }
        
        
        for(int i = sSize-1; i >=0; i--){
           ans.add(a.get(i) + b.get(i) + extra);
           if(ans.get(count) > 10 && i!= 0){
               ans.set(count,(ans.get(count))%10);
               extra = 1;
            }else if(ans.get(count) == 10 && i!=0){
                extra = 1;
                ans.set(count,0);
            }else{
                extra = 0;
            }
            count++;
        }
        
        Collections.reverse(ans);
        int keep = ans.get(0);
        if(keep >= 10){
            ans.add(0,1);
            ans.set(1,keep%10);
        }
        return ans;
    }
}
