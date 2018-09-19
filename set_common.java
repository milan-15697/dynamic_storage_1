import java.util.*;
class set_common {
  public static void main(String[] args) {

    Scanner Scan= new Scanner (System.in);
    HashSet<Integer> hash1= new HashSet<Integer>();
    HashSet<Integer> hash2= new HashSet<Integer>();

hash1.add(20);
hash1.add(30);
hash1.add(40);
hash1.add(1611981222);
hash1.add(69);

hash2.add(200);
hash2.add(300);
hash2.add(1611981222);
hash2.add(50);
hash2.add(69);

hash1.retainAll(hash2);
    System.out.println(hash1);
  }
}
