/**
 * Subject interface that uses an array list from
 * Java collection to store the observers attached
 * to each subject, also provides a notify method
 * which tells the observers from which subject
 * are receiving the notification.
 * 
 * @author Daniel Valle
 */

package ObserverDesignPattern;

import java.util.ArrayList;

abstract class Subject {
  private ArrayList<Observer> observersList;

  protected Subject() {
    this.observersList = new ArrayList<>();
  }

  public void attachObserver(Observer subjectObserver) {
    observersList.add(subjectObserver);
  }

  public void detachObserver(Observer subjectObserver) {
    observersList.remove(subjectObserver);
  }

  public void notifyObservers() {
    for (Observer o : observersList) {
      o.updateObserver(this);
    }
  }
}
