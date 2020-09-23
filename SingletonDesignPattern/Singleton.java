/**
 * Singleton design pattern
 * 
 * @author Daniel Valle
 */

package SingletonDesignPattern;

public class Singleton {
  private static Singleton instance = null;

  private int value;
  private int id = -1;

  private Singleton() {
    this.value = 0;
    this.id += 1;
  }

  public static Singleton instance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public int getId() {
    return id;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
