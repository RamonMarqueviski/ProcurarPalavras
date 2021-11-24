public class ProcuraPalavras8Threads {
    public static void main(String[] args) throws InterruptedException {
        String palavra = "player";
        ComputaPalavrasThread t1 = new ComputaPalavrasThread(0,31,palavra);
        t1.start();
        ComputaPalavrasThread t2 = new ComputaPalavrasThread(32,63,palavra);
        t2.start();
        ComputaPalavrasThread t3 = new ComputaPalavrasThread(64,95,palavra);
        t3.start();
        ComputaPalavrasThread t4 = new ComputaPalavrasThread(96,127,palavra);
        t4.start();
        ComputaPalavrasThread t5 = new ComputaPalavrasThread(128,159,palavra);
        t5.start();
        ComputaPalavrasThread t6 = new ComputaPalavrasThread(160,191,palavra);
        t6.start();
        ComputaPalavrasThread t7 = new ComputaPalavrasThread(192,223,palavra);
        t7.start();
        ComputaPalavrasThread t8 = new ComputaPalavrasThread(224,249,palavra);
        t8.start();
    }
}
