import java.io.File;
import java.util.Scanner;
public class filesearch {
    public static void searchfile(File dir,String filename){
        if(dir.isDirectory()){
            File[] files=dir.listFiles();
            for(File f: files){
                if(f.isDirectory()){
                    searchfile(f,filename);
                }
                else if(f.getName().equals(filename)){
                    System.out.println("File found at:"+f.getAbsolutePath());
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the directory path:");
        String path=sc.nextLine();
        File directory=new File(path);
        System.out.println("enter the file name to search:");
        String filename=sc.nextLine();
        searchfile(directory, filename);
        sc.close();
    }
}
