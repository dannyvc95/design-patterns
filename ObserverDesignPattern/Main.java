package ObserverDesignPattern;

public class Main {
  public static void main(String[] args) {
    
    BatteryLevel subject = new BatteryLevel();

    OSPowerManager observer1 = new OSPowerManager(subject);
    TextEditorApp observer2 = new TextEditorApp(subject);

    subject.setBatteryLevel(100);
    subject.setBatteryLevel(90);
    subject.setBatteryLevel(50);
    subject.setBatteryLevel(15);
    subject.setBatteryLevel(10);
    subject.setBatteryLevel(0);
  }
}
