import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcuraPalavrasSemThread {
    public static void main(String[] args) {
        String thisLine = null;
        int contador = 0;
        for(int i = 0; i < 250; i++) {
            try {

                InputStream inputStream = new FileInputStream("C:\\Users\\ramom\\Desktop\\dataset\\"+ i + ".txt");

                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String line = null;

                while ((line = bufferedReader.readLine()) != null) {
                    if(line.equals("player")){
                        contador++;
                    }
                }
                bufferedReader.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(contador);
    }

}
