import java.io.File;
public class Main {
    public static void main(String[] args) {
        // тема урока Files
        // Windows работаем с backsflash '\'
        // Linux работаем с slash '/'
        File fileOnLinux = new File(pathname:)"/home/username/Documents");
        // диркетория в UNIX системе
        File fireOnWindows = new File(pathname:)"C:\\Users\\user\\documents.pdf");
        // файл в Windows
        System.out.println(File.separator);
        if (File.separator.equals("\\")) {
        System.out.println("Windows");
    } else {
        System.out.println("Linux");
    }
        File file = new File(pathname:"C:\\Users\\user\\IdeaProjects\\Files\\test.txt");
        File file2 = new File(pathname:".\\test.tst");
        System.out.println(file.getPath());
        System.out.println(fileonWindows.getName());
        System.out.println(file.getName());
}       System.out.println(file2.getName());


        