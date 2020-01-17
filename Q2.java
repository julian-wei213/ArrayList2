import java.util.ArrayList;

class Q2 extends Q1{
    public static void main(int n){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int i = 2; i<=n; i++){
            numbers.add(i);
        }
        
        Primed(numbers);
        System.out.println("The ArrayList after is " + numbers);
        add(numbers,n);
    }
    public static void add(ArrayList<Integer> prime, int n){
        int a = prime.get(0);
        for(int i = 0; i < prime.size();i++){
         if(a + prime.get(i) == n){
             System.out.println(a+" + "+prime.get(i)+" = "+ n);
             break;
           }else{
             a = prime.get(i);
            }
        }
    }
}
