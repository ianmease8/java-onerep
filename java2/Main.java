import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        ArrayList<String> value  = new ArrayList<String>();
        String x;
        diction d = new diction();
        value = d.lister();
        System.out.println("please note that this is an estimate, and we are not liable for any injuries from attempting this max");
        System.out.println("would you like to see a print out of your one rep maxes for your chosen lifts? ");
        System.out.println("please enter y or n: ");
        x = myObj.nextLine();
        if (x.equals("y")){
            for (String values : value) {
                System.out.println(values);
            }

        }
            else if (x.equals("n")){
                System.out.println("not awesome");
        }    
    }
}
