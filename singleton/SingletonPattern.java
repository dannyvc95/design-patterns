/**
 * The purpose of the singletong pattern is to ensure
 * that a class only has one instance, and provide a
 * global point of access to it.
 * 
 * @author Daniel Valle
 */

package singleton;

class Singleton {
  private Singleton() { }

  private static class SingletonInstance {
    public static Singleton singleton = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonInstance.singleton;
  }
}

public class SingletonPattern {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    Singleton singleton3 = Singleton.getInstance();

    // Nice try, but of course this will print the reference
    // to the exact same instance
    System.out.println(singleton1);
    System.out.println(singleton2);
    System.out.println(singleton3);
  }
}
