package J1SP0009.src;

public class Main {
    public static void main(String[] args) {
        // step 1: find 45 fibonacci sequence by recursion
        int fiboSeg[] = new int[45];
        findFiboSeg(fiboSeg, 0, false);
        // step 2: display 45 fibonacci sequence
        displayFiboSeg("The 45 sequence fibonacci:\n", fiboSeg);
    }

    private static void findFiboSeg(int[] fiboSeq, int currentCount, boolean test) {
        if(currentCount == fiboSeq.length)
            return;
        
        // check if current count <= 1
        if(currentCount <= 1)
            fiboSeq[currentCount] = currentCount;
        else   
            fiboSeq[currentCount] = fiboSeq[currentCount - 1] + fiboSeq[currentCount - 2];

        // check if test = true
        if(test)
            System.out.println("F(" + currentCount + ") = " + fiboSeq[currentCount]);

        findFiboSeg(fiboSeq, currentCount + 1, test);
    }

    private static void displayFiboSeg(String msg, int[] fiboSeg) {
        System.out.print(msg);
        // loops from first to last index of element
        for(int i = 0; i < fiboSeg.length; ++i) {
            // check if not reach last index
            if(i + 1 < fiboSeg.length)
                System.out.print(fiboSeg[i] + ", ");
            else    
                System.out.println(fiboSeg[i]);
        }
    }
}
