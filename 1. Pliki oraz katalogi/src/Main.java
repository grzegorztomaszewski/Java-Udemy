import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            File katalog = new File("video kursy"+File.separator+"php"+File.separator+"mySql");

            katalog.mkdirs(); //tworzenie katalogu


            File plik2 = new File("video kursy"+File.separator+"php"+File.separator+"mySql", "lekcja1.txt");
            if(!plik2.exists())
            {
                plik2.createNewFile();
            }

            File plik = new File("test.txt");

            if (!plik.exists())
            {
                plik.createNewFile(); //tworzenie pliku
            }

            System.out.println("-----------------");
            System.out.println(plik.getCanonicalPath()); //kanoniczna, zawsze prawdziwa
            System.out.println(plik.getAbsolutePath()); //absolutna dosłowna ścieżka
            System.out.println("-----------------");

            System.out.println("Czy mogę pisać? :"+plik.canWrite());
            System.out.println("Czy mogę odpalić? :"+plik.canExecute());
            System.out.println("Czy mogę czytać? :"+plik.canRead());
            System.out.println("Czy jest ukryty? :"+plik.isHidden());
            System.out.println("Czy jest plikiem? :"+plik.isFile());
            System.out.println("Ostatnia modyfikacja? :"+new Date(plik.lastModified()));
            System.out.println("Długość pliku w bajtach (ilość znaków)? :"+plik.length());
            System.out.println("-----------------");
            Main.wypiszSciezki(new File(System.getProperty("user.dir")));
            //plik.delete();
        }

                catch (IOException e)
                {
                    System.out.println(e.getMessage());
                }

            //System.out.println(System.getProperty("user.dir"));
    }
       public static void wypiszSciezki(File nazwaSciezki)
        {
            String [] nazwyPlikowIKatalogow = nazwaSciezki.list();

            for (int i = 0; i < nazwyPlikowIKatalogow.length; i++)
            {
                File p = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i]);

                //if(p.isFile()) //znajduje tylko pliki
                //{
                //    System.out.println(p.getPath());
                //}

                if(p.isDirectory())
                {
                    System.out.println(p.getPath());
                    wypiszSciezki(new File(p.getPath()));
                }
            }
        }
    }
