public class Statistics {
    
    private int count;
    private int sum;


    public Statistics() {  
        this.count = 0;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if(count !=0){
            double average = (double)sum/count;
            
            return average;
        } else{
            double average = 0.0;
            
            return average;
        }
             
    }

    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count++;
        // write code here
    }

    public int getCount() {
        return this.count;
    }
}
