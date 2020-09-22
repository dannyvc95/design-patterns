/**
 * Battery level holds the current battery percentage
 * of a computer in a decimal number from 0 to 100
 * 
 * @author Daniel Valle
 */

package ObserverDesignPattern;

public class BatteryLevel extends Subject {

  public final static int FULL_BATTERY = 100;
  public final static int LOW_BATTERY = 15;
  public final static int EMPTY_BATTERY = 0;

  private int batteryLevel;

  public BatteryLevel() {
    this.batteryLevel = FULL_BATTERY;
  }

  public int getBatteryLevel() {
    return batteryLevel;
  }

  public void setBatteryLevel(int batteryLevel) {
    if (batteryLevel >= EMPTY_BATTERY && batteryLevel <= FULL_BATTERY) {
      // Update battery level
      this.batteryLevel = batteryLevel;
      System.out.println("Battery level " + batteryLevel + "%");
      // Notify observers when on a battery charge level
      notifyObservers();
    }
  }
}
