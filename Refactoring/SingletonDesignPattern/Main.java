package SingletonDesignPattern;

public class Main {
  public static void main(String[] args) {
    Singleton s1 = Singleton.instance();
    Singleton s2 = Singleton.instance();

    System.out.println(s1.getValue());
    System.out.println(s2.getValue());

    s1.setValue(1);

    System.out.println(s1.getValue());
    System.out.println(s2.getValue());
    
    System.out.println(s1.getId());
    System.out.println(s2.getId());
  }
}
