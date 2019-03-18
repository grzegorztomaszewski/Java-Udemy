import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            File plik = new File("test.txt");

            if (!plik.exists())
            {
                plik.createNewFile();
            }

            System.out.println("Czy mogę pisać? :"+plik.canWrite());
            System.out.println("Czy mogę odpalić? :"+plik.canExecute());
            System.out.println("Czy mogę czytać? :"+plik.canRead());
            System.out.println("Czy jest ukryty? :"+plik.isHidden());
            System.out.println("Czy jest plikiem? :"+plik.isFile());
            System.out.println("Ostatnia modyfikacja? :"+new Date(plik.lastModified()));
            System.out.println("Długość pliku w bajtach (ilość znaków)? :"+plik.length());

            //plik.delete();
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        }

    }
