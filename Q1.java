import java.util.ArrayList;

class Q1{
    public static void main(int n){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int i = 2; i<=n; i++){
            numbers.add(i);
        }
        
        System.out.println("The ArrayList before is " + numbers);
        Primed(numbers);
        System.out.println("The ArrayList after is " + numbers);
    }
    
    public static void Primed( ArrayList<Integer> numbers){
        int p = 2;
        int count = 1;
        
        for(int i = 0; i<numbers.size()-1; i++){
            for(int j = numbers.size()-1; j>=0; j--){
                if(numbers.get(j) % p == 0 && numbers.get(j) > p) {
                    numbers.remove(j);
                }
            }
            p = numbers.get(i+1);
            
        }
    }
}
