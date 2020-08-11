package home_work908;

public class ThreadPool implements Runnable {

//todo create 200 thread, put it in a list,
// make them start check if they are blocking each other,
// not because they run synchornized,
// but because 200 threads not really can run simultaniosly,
// because we don't have so many cores

    private long i;
    int count = 0;

    public long getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }



    void increment() {
        count = count + 1;
    }


    public void print() throws InterruptedException {
        while (i<2000000000) {
            System.out.println("threads are working, count: " +count);
            i++;
            }
        count=0;
    }

        @Override
        public void run() {
            try {
                print();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}


