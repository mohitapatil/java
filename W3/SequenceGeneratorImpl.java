package W3;

public class SequenceGeneratorImpl {
    private static final int NUMBER_OF_THREADS = 3;
    private static final int TOTAL_NUMBERS_IN_SEQ = 10;

    public static void main(String[] args) {
     SequenceOfNumber numbersGenerator = new SequenceOfNumber(NUMBER_OF_THREADS, TOTAL_NUMBERS_IN_SEQ);

        Thread t1 = new Thread(new SequenceGenerator(numbersGenerator, 1), "THREAD-1");
        Thread t2 = new Thread(new SequenceGenerator(numbersGenerator, 2), "THREAD-2");
        Thread t3 = new Thread(new SequenceGenerator(numbersGenerator, 0), "THREAD-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class SequenceOfNumber {
    private int currNumber = 1;
    private int countOfT;
    private int n;

    public SequenceOfNumber(final int countOfT, final int n) {
        this.countOfT = countOfT;
        this.n = n;
    }

    public void printNumber(int index) {
        synchronized (this) {
            while(currNumber < n-1) {
                while (currNumber % countOfT != index) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + " : " + currNumber++);
                notifyAll();
            }
        }
    }
}

class SequenceGenerator implements Runnable {

    private SequenceOfNumber sequenceOfNumber;
    private int index;

    public SequenceGenerator(SequenceOfNumber sequenceOfNumber, int index) {
        this.sequenceOfNumber = sequenceOfNumber;
        this.index = index;
    }

    @Override
    public void run() {
        sequenceOfNumber.printNumber(this.index);
    }
}

