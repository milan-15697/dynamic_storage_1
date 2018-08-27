class employee {
 int salary = 50000;
}

class invoke_instance extends employee {
 void display() {
  System.out.println(super.salary);
 }

 public static void main(String args[]) {
  invoke_instance c = new invoke_instance();
  c.display();
 }
}
