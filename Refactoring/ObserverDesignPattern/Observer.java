/**
 * Observer interface to support multiple subjects for
 * each observer, the subject passed to the update
 * operation lets the observer determine which subject
 * changed when it observes more than one.
 * 
 * @author Daniel Valle
 */

package ObserverDesignPattern;

interface Observer {
  public void updateObserver(Subject changedSubject);
}
