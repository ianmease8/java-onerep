import java.util.ArrayList;
public class diction{
    
    
    public ArrayList<String> lister() {
        rep l1 = new rep();
        String steve;
        System.out.println("hello welcome to your one rep max calculator");

        System.out.println("first lets start by getting to know your name");

        steve = l1.name();

        System.out.println("hi "+ steve);

        System.out.println("this is a calulator that will determine your one rep max from a weight you do and how many reps you can do with it");

        System.out.println("this calculator can only handle three calucations before you need to run the program again");
        
        ArrayList<String> maxes = new ArrayList<String>();
        
        maxes.add(l1.lift() + ": " + l1.onerep());
        maxes.add(l1.lift() + ": " + l1.onerep());
        maxes.add(l1.lift() + ": " + l1.onerep());

        System.out.println(maxes);
        return maxes;
      }
}