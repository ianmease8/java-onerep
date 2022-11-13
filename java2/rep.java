import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;
public class rep {
    public String onerep() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        int x, y;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("weight:");
        x = myObj.nextInt(); // Read user input

        System.out.println("reps:");
        y = myObj.nextInt(); // Read user input

        double max = (x*(y*.033+1));
        System.out.println("one Rep is: " + max); // Output user input
        
        return (df.format(max));
    }   
    public String lift(){
        String name;
        Scanner myObj = new Scanner(System.in);
        System.out.println("lift: ");
        name = myObj.nextLine();
        return name;
    }
    public String name(){
        String name;
        Scanner myObj = new Scanner(System.in);
        System.out.println("name: ");
        name = myObj.nextLine();
        return name;
    }
}
