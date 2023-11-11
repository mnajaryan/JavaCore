package homework.fileutil;

import javax.security.auth.login.FailedLoginException;
import java.io.*;
import java.util.Scanner;

public class FileUtil {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Please input folder path");
        String folderPath = scanner.nextLine();
        System.out.println("Please input file Name, which you want to check exists or not");
        String fileName = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        System.out.println("Please input txt file path");
        String txtFilePath = scanner.nextLine();
        System.out.println("Please input new file name");
        String newFileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();

        fileSearch(folderPath, fileName);
        contentSearch(folderPath, keyword);
        findLines(txtFilePath, keyword);
        printSizeOfPackage(folderPath);
        createFileWithContent(folderPath, newFileName, content);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch(String folderPath, String fileName) {
        String filePath = folderPath + File.separator + fileName;
        File file = new File(filePath);
        System.out.println("File found ? " + file.exists());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch(String folderPath, String keyword) throws IOException {
        File file = new File(folderPath);
        if (file.isDirectory()){
            File[] list = file.listFiles();
            for (File s : list) {
                int dotIndex = s.getName().lastIndexOf(".");
                String fileFormat = s.getName().substring(dotIndex);
                if (fileFormat.equals(".txt")){
                    try (BufferedReader br = new BufferedReader(new FileReader(s))){
                        String line = "";
                        while ((line = br.readLine()) != null ){
                            if (line.contains(keyword)){
                                System.out.println(keyword + " contains is :" + s.getName() + " file.");
                            }
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines(String txtFilePath, String keyword) {
        File file = new File(txtFilePath);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                if (line.contains(keyword)){
                    System.out.println(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage(String folderPath) {
        File file = new File(folderPath);
        File[] files = file.listFiles();
        double sum = 0;
        for (File f : files) {
            sum += f.length();
        }
        System.out.println("Folder length is : " + sum);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent(String folderPath, String newFileName, String content) {
        File newFile = new File(folderPath + File.separator + newFileName);
        try {
            newFile.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
            bufferedWriter.write(content);
            bufferedWriter.close();
            System.out.println("File created");
        }catch (IOException e){
            System.out.println("file don't created" + e);
        }
    }

}
