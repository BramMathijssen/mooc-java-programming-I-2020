public class Multiplier {
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }
    
    public int multiply(int number){
        int total;
        
        total = this.number * number;
        
        return total;
    }
    
}
