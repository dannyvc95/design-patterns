/**
 * The purpose of the observer pattern is to define one-to-many
 * dependency between objects so that when one object change all
 * its dependents are notified and updated automatically.
 * 
 * @author Daniel Valle
 */

package observer;

import java.util.ArrayList;

/**
 * Defines an update interface for objects
 * that should be notified on a subject change.
 */
interface Observer {
  public abstract void update(String s, int i);
}

/**
 * Maintains a reference to a concrete subject
 * object, store the state that should stay
 * consistent with the subject state.
 */
class ConcreteObserverA implements Observer {
  @Override
  public void update(String subject, int value) {
    System.out.println(this.getClass().getSimpleName() + ": " + subject + ", " + value);
  }
}

/**
 * Maintains a reference to a concrete subject
 * object, store the state that should stay
 * consistent with the subject state.
 */
class ConcreteObserverB implements Observer {
  @Override
  public void update(String subject, int value) {
    System.out.println(this.getClass().getSimpleName() + ": " + subject + ", " + value);
  }
}

/**
 * Maintains a reference to a concrete subject
 * object, store the state that should stay
 * consistent with the subject state.
 */
class ConcreteObserverC implements Observer {
  @Override
  public void update(String subject, int value) {
    System.out.println(this.getClass().getSimpleName() + ": " + subject + ", " + value);
  }
}

/**
 * Provides an interface for attaching and deleting
 * observers and notify them on changes when
 * is required.
 */
interface Subject {
  public abstract void register(Observer observer);
  public abstract void unregister(Observer observer);
  public abstract void notifyObservers(int value);
}

/**
 * Knows its observers and send update notifications
 * to them.
 */
class ConcreteSubjectA implements Subject {
  private int value;
  private ArrayList<Observer> observersList = new ArrayList<>();

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
    notifyObservers(value);
  }

  @Override
  public void register(Observer observer) {
    observersList.add(observer);
  }

  @Override
  public void unregister(Observer observer) {
    observersList.remove(observer);
  }

  @Override
  public void notifyObservers(int value) {
    System.out.println(this.getClass().getSimpleName() + ": Change produced in value, notifiying subscribed observers...");
    for (Observer o : observersList) {
      String subjectName = this.getClass().getSimpleName();
      o.update(subjectName, value);
    }
  }
}

/**
 * Knows its observers and send update notifications
 * to them.
 */
class ConcreteSubjectB implements Subject {
  private int value;
  private ArrayList<Observer> observersList = new ArrayList<>();

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
    notifyObservers(value);
  }

  @Override
  public void register(Observer observer) {
    observersList.add(observer);
  }

  @Override
  public void unregister(Observer observer) {
    observersList.remove(observer);
  }

  @Override
  public void notifyObservers(int value) {
    System.out.println(this.getClass().getSimpleName() + ": Change produced in value, notifiying subscribed observers...");
    for (Observer o : observersList) {
      String subjectName = this.getClass().getSimpleName();
      o.update(subjectName, value);
    }
  }
}

public class ObserverPattern {
  public static void main(String[] args) {
    ConcreteSubjectA subjectA = new ConcreteSubjectA();
    ConcreteSubjectB subjectB = new ConcreteSubjectB();

    ConcreteObserverA observerA = new ConcreteObserverA();
    ConcreteObserverB observerB = new ConcreteObserverB();
    ConcreteObserverC observerC = new ConcreteObserverC();

    subjectA.register(observerA);
    subjectA.register(observerB);

    subjectB.register(observerB);
    subjectB.register(observerC);

    subjectA.setValue(5);
    subjectB.setValue(10);
    
    subjectA.unregister(observerB);

    subjectA.setValue(15);
    subjectB.setValue(20);
  }
}
