import java.util.Scanner;
import java.util.TreeSet;

public class Cyber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<Integer> result = new TreeSet<>();     
 
        System.out.print("You values: ");
        String source = scan.next();                  
 
        String[] items = source.split(",");     
 
        for (String item : items) {                      
            if (item.contains("-")) {                  
                String[] range = item.split("-"); 
                
                for (int i = Integer.parseInt(range[0]); i <= Integer.parseInt(range[1]); i++) {
                    result.add(i);                   
                }
            } else {
                
                result.add(Integer.parseInt(item));
            }
        }
 
 
        
        for(int value: result){
            System.out.print(value + " ");
        }
    }
}