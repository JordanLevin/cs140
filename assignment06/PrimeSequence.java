package assignment06;

public class PrimeSequence implements Sequence{
    
    public PrimeSequence(){
    
    }
    
    private int n = 2;
    public int next(){
        while(!isPrime(n)){
            n++;
        }
        return n++;
    }
    public boolean isPrime(int p){
        for(int i = 2;i<p;i++){
            if(p%i==0)
                return false;
        }
        return true;
    }

}
