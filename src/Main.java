import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static String fileAttributes(File dir) {

        String attributes = "Имя файла: " + dir.getName() + " " + "Путь: " + dir.getPath() + " Последние изменения в файле: " + dir.lastModified() + " Размер: " + dir.length() + " байт";
        return attributes;
    }

    public static File dir(String dir) {
        File newDirectory = new File(dir);

        if (newDirectory.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Каталог не пуличилось создать");
        }
        return newDirectory;
    }

   public static File file(File dir, String file) {
        File newFile1 = new File(dir, file);

      try {
    if (newFile1.createNewFile()) System.out.println("Файл был создан");

    } catch (IOException ex) {
    System.out.println(ex.getMessage());
}
        return newFile1;
    }


    public static void main(String[] args) {
        File games = dir("Games");
        File src = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\src");
        File res = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\res");
        File savegames = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\savegames");
        File temp = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\temp");
        File main1 = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\src\\main");
        File test = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\src\\test");

        File newFile1 = file(main1, "Main.java");
        File newFile2 = file(main1, "Utils.java");
        File res1 = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\res\\drawables");
        File res2 = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\res\\vectors");
        File res3 = dir("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\res\\icons");
        File newFile3 = file(temp, "temp.txt");
        String a = fileAttributes(games);
        String b = fileAttributes(src);
        String c = fileAttributes(res);
        String d = fileAttributes(savegames);
        String e = fileAttributes(newFile3);


        try (FileWriter writer = new FileWriter("C:\\Users\\novoa\\IdeaProjects\\Core3.1\\Games\\temp\\temp.txt", false)) {
            writer.write(a);
            writer.append('\n');
            writer.write(b);
            writer.append('\n');
            writer.write(c);
            writer.append('\n');
            writer.write(d);
            writer.append('\n');
            writer.write(e);
            writer.append('\n');
            writer.flush();

        } catch (IOException ex) {System.out.println(ex.getMessage());}
    }
}
