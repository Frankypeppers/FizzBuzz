public class FizzBuzz {
    public static void main(String[] args) {
        int fizzCt = 0;
        int buzzCt = 0;
        
        for(int i = 1; i <= 100; i++) {
            fizzCt++;
            buzzCt++;
            
            if (fizzCt == 3 && buzzCt == 5) {
                System.out.println("FizzBuzz");
                fizzCt = 0;
                buzzCt = 0;
            } else if(fizzCt == 3) {
                System.out.println("Fizz");
                fizzCt = 0;
            } else if(buzzCt== 5) {
                System.out.println("Buzz");
                buzzCt = 0;
            } else {
                System.out.println(i);
            }
        }
    }
}