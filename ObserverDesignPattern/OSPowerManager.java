/**
 * OS Power manager observer that inform the user
 * when a important battery level status is reached.
 * 
 * @author Daniel Valle
 */

package ObserverDesignPattern;

public class OSPowerManager implements Observer{
  
  private BatteryLevel subject;

  public OSPowerManager(BatteryLevel subject) {
    this.subject = subject;
    subject.attachObserver(this);
  }

  @Override
  public void updateObserver(Subject changedSubject) {

    if (changedSubject == subject) {

      if (subject.getBatteryLevel() <= BatteryLevel.LOW_BATTERY && subject.getBatteryLevel() != BatteryLevel.EMPTY_BATTERY) {
        System.out.println("OSPowerManager: Low battery plug your computer");

      } else if (subject.getBatteryLevel() == BatteryLevel.FULL_BATTERY) {
        System.out.println("OSPowerManager: Battery charged unplug your computer");

      } else if (subject.getBatteryLevel() == BatteryLevel.EMPTY_BATTERY) {
        System.out.println("OSPowerManager: Empty battery shuting down computer");
      }
    }
  }
}
