/**
 * The purpose of the proxy pattern is to provide
 * a placeholder for another object to control
 * access to it.
 * 
 * @author Daniel Valle
 */

package proxy;

/**
 * Defines an interface for the real subject and the proxy
 * so that the proxy can be used anywhere a real subject is
 * expected.
 */
interface Subject {
  public abstract void doSomething();
}

/**
 * Defines the real object that the proxy represents
 */
class ConcreteSubject implements Subject {
  @Override
  public void doSomething() {
    System.out.println(this.getClass().getSimpleName() + ": Doing something...");
  }
}

/**
 * Maintains a reference to the real subject which this proxy is
 * representing, and provides an interface identical to the real
 * subject.
 */
class Proxy implements Subject {
  private ConcreteSubject concreteSubject;

  @Override
  public void doSomething() {
    System.out.println(this.getClass().getSimpleName() + ": Loading a subject on demand...");

    if (concreteSubject == null) {
      concreteSubject = new ConcreteSubject();
    }

    concreteSubject.doSomething();
  }
}

public class ProxyPattern {
  public static void main(String[] args) {
    // Suppose that your application is running and at this point, you need
    // to use some object that you never load before because you were saving
    // resource, now you can call your proxy to load that object on demand and
    // just when is required.
    Proxy proxy = new Proxy();
    proxy.doSomething();
  }
}