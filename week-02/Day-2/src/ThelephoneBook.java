import java.util.HashMap;

public class ThelephoneBook {
  public static void main(String[] args) {
    HashMap<String, String> pb = new HashMap<>();
    pb.put("William", "405-709-1865");
    pb.put("John", "402-247-856");
    pb.put("Hortensia", "606-481-6467");
    pb.put("Amanda", "319- 243- 5613");
    pb.put("Brooke", "307-687-2982");

    System.out.println("Johns no. is: " + pb.get("John"));
    
    System.out.println("Johns no. is: " + pb.getKey("307-687-2982"));

  }
}
