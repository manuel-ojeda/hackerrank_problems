import java.util.Scanner;

/**
 *
 * @author manuelojeda
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        
        System.out.println("Hello, World.");
        System.out.println(line);
    }    
}
