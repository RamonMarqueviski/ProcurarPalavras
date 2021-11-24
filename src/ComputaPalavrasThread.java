import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ComputaPalavrasThread extends Thread{
    private int fim;
    private int inicio;
    private String palavra;
    public int contador = 0;

    public ComputaPalavrasThread(int inicio, int fim,String palavra) {
        this.inicio = inicio;
        this.fim = fim;
        this.palavra = palavra;
    }

    public void run() {
        String thisLine = null;
        for(int i = inicio; i <= fim; i++) {
            try {

                InputStream inputStream = new FileInputStream("C:\\Users\\ramom\\Desktop\\dataset\\"+ i + ".txt");

                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String line = null;

                while ((line = bufferedReader.readLine()) != null) {
                    if(line.equals(this.palavra)){
                        contador++;
                    }
                }
                bufferedReader.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public boolean EhIgual(String comparacao) {
        if(this.palavra == comparacao) {
            return true;
        }
        return false;
    }

}
