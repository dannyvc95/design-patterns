/**
 * Text editor application observer which automatically
 * saves a back up of the open unsaved files in the editor
 * after reach a critical battery level.
 * 
 * @author Daniel Valle
 */

package ObserverDesignPattern;

public class TextEditorApp implements Observer {

  private BatteryLevel subject;

  public TextEditorApp(BatteryLevel subject) {
    this.subject = subject;
    subject.attachObserver(this);
  }

  @Override
  public void updateObserver(Subject changedSubject) {

    if (changedSubject == subject) {

      if (subject.getBatteryLevel() == BatteryLevel.EMPTY_BATTERY) {
        System.out.println("TextEditorApp: Saving a backup for your unsaved files");
      }
    }
  }
}
