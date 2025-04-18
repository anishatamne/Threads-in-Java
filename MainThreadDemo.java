/* 
Name: Anisha Tamne
PRN: 23070126014
Batch: A1
*/

public class MainThreadDemo {
    public static void main(String[] args) {
        // Creating threads
        PrintNumbersThread t1 = new PrintNumbersThread();
        PrintAlphabetsThread t2 = new PrintAlphabetsThread();
        PrintEvenNumbersThread t3 = new PrintEvenNumbersThread();

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
