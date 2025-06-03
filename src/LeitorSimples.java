import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LeitorSimples{
    public static void main (String[] args){
        
        try{
            FileReader leitor = new FileReader("texto.txt");
            BufferedReader buffer = new BufferedReader(leitor);

            String linhas;

            while ((linhas = buffer.readLine()) != null) {
                System.out.println("A seguinte frase foi lida: " + linhas);
            }

            buffer.close();
            leitor.close();

        } catch (IOException e){
            System.out.println("Ocorreu um erro ao tentar ler o arquivo");
            e.printStackTrace();
        }
    }
}