// 231RDC181 George Bolkvadze Grupa 8
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

     static final String developerInfo = ("231RDC181 George Bolkvadze 8 Grupa");

       public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in); 
        
            System.out.println(developerInfo);
        
        
        System.out.println("input file name:");
        String fileName = sc.nextLine();
        sc.close();
        
        // laasa failu
        FileReader fr = new FileReader(fileName);
        Scanner fileScanner = new Scanner(fr);

        
        System.out.println("result:");
        while (fileScanner.hasNextLine()) {
             String line = fileScanner.nextLine();
             String[] tokens = line.split(" ");
             String name = tokens[0] + " " + tokens[1];
             int sum = 0;
             int count = 0;
        for (int i = 2; i < tokens.length; i++) {
                 int grade = Integer.parseInt(tokens[i]);
                 sum += grade;
                 count++;
            }
                 double average = (double) sum / count;
            
                 if (average <= 5) {
                 System.out.println(name + " " + sum / count);
                }
              }
             fileScanner.close();
      }
}
