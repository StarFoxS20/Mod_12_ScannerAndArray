import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Mod_12_ScannerInArray
{

    public static void main(String args[])
    {
        ListaGenerosNomes();
    }

    public static void ListaGenerosNomes()
    {
        System.out.println("Escrava o nome e o genero (M ou F) separado por virgula");
        Scanner s = new Scanner(System.in);

        List<String>Nomes = new ArrayList();

        String pessoa0 = s.next();
        String pessoa1 = s.next();
        String pessoa2 = s.next();
        String pessoa3 = s.next();
        String pessoa4 = s.next();
        Nomes.add(pessoa0);
        Nomes.add(pessoa1);
        Nomes.add(pessoa2);
        Nomes.add(pessoa3);
        Nomes.add(pessoa4);
        System.out.println(Nomes);

        List<String> NomeDeHome = new ArrayList<>();
        List<String> NomeDeMuie = new ArrayList<>();

        for (String nome : Nomes)
        {
            String[]partes = Nomes.split(",");
            if (partes[1].equals("M"))
            {
            NomeDeHome.add(partes[0]);
            }else
              {
              NomeDeMuie.add(partes[0]);
              }
        }

        System.out.println("Nomes masculinos:");
        for (String nome : NomeDeHome) {
            System.out.println(nome);
        }

        System.out.println("Nomes femininos:");
        for (String nome : NomeDeMuie) {
            System.out.println(nome);
        }

    }

}
