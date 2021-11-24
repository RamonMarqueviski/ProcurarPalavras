public class ProcuraPalavras250Threads {
    public static void main(String[] args) throws InterruptedException {
        String palavra = "player";
        for (int i = 0; i <= 249; i++) {
            ComputaPalavrasThread t = new ComputaPalavrasThread(i, i, palavra);
            t.start();
        }
    }
}
