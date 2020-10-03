/**
 * The purpose of the decorator pattern is to attach additional
 * responsibilities to an object dynamically. Decorators provide
 * a flexible alternative to composite for extending functionality.
 * 
 * @author Daniel Valle
 */

package decorator;

/**
 * Defines the interface for objects that can have responsibilities
 * added to them dynamically.
 */
interface Component {
  public abstract void doSomething();
}

/**
 * Defines an object to which additional responsibilities can be
 * attached.
 */
class ConcreteComponent implements Component {
  @Override
  public void doSomething() {
    System.out.println("ConcreteComponent: doSomething()");
  }
}

/**
 * Maintains a reference to a component object and defines
 * an interface to that component.
 */
abstract class Decorator implements Component {
  protected Component component;

  public void setComponent(Component component) {
    this.component = component;
  }

  @Override
  public void doSomething() {
    if (component != null) {
      component.doSomething();
    }
  }
}

/**
 * Adds responsibilities to the component
 */
class ConcreteDecoratorA extends Decorator {
  @Override
  public void doSomething() {
    System.out.println("ConcreteDecoratorA: doSomething()");
    super.doSomething();
  }
}

/**
 * Also adds more responsibilities to the component
 */
class ConcreteDecoratorB extends Decorator {
  @Override
  public void doSomething() {
    System.out.println("ConcreteDecoratorB: doSomething()");
    super.doSomething();
  }
}

class DecoratorPatter {
  public static void main(String[] args) {
    // Create a concrete component and also a couple of concrete
    // decorators to add some extra responsibilities
    ConcreteComponent concreteComponent = new ConcreteComponent();
    ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
    ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

    // Decorator A will add responsibilities to concrete component
    concreteDecoratorA.setComponent(concreteComponent);
    concreteDecoratorA.doSomething();

    // Decorator B will add responsibilities to concrete component
    concreteDecoratorB.setComponent(concreteComponent);
    concreteDecoratorB.doSomething();
  }
}