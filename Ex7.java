import java.util.ArrayList;

public class Ex7 {
public static void main(String[] args) {
    System.out.println(returnPrime(4));
}  

static int returnPrime(int nth_prime){
    int n = 1;
    int cont = 0;
    int index = 0;
    ArrayList<Integer> primes = new ArrayList<Integer>();
    while(true){
        if(nth_prime == cont)
            return primes.get(primes.size()-1);
        else if( n == 2 || n == 3){
            primes.add(index, n);
            index++;
            cont++;
        }
        else{
            boolean flag = true;
            for(int x:primes){
                if(n % x == 0){
            
                    flag = false;
                    break;
                }
            }
            if(flag){
            index++;
            primes.add(primes.size(), n);
            cont++;
            }
        }
        n++;
        }
    }
    }


