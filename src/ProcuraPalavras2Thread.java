public class ProcuraPalavras2Thread {
    public static void main(String[] args) throws InterruptedException {
        String palavra = "player";

        ComputaPalavrasThread t1 = new ComputaPalavrasThread(0,125,palavra);
        t1.start();
        ComputaPalavrasThread t2 = new ComputaPalavrasThread(126,249,palavra);
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.contador + t2.contador);
    }
}
