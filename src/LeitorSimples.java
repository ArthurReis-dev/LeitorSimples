import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;

public class LeitorSimples{
    public static void main (String[] args){
        
        try{
            FileWriter escritor = new FileWriter("texto.txt");
            FileReader leitor = new FileReader("texto.txt");
            BufferedReader buffer = new BufferedReader(leitor);

            String linhas;

            escritor.write("O Clube Atletico Mineiroz \n");
            escritor.write("e sem comparacao o maior de minas");
             System.out.println("A frase foi escrita com sucesso!");

             escritor.close();

            while ((linhas = buffer.readLine()) != null) {
                System.out.println("A seguinte frase foi lida: " + linhas);
            }

            escritor.close();
            buffer.close();
            leitor.close();

        } catch (IOException e){
            System.out.println("Ocorreu um erro ao tentar ler o arquivo");
            e.printStackTrace();
        }
    }
}