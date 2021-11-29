package Command.RemoteController;

public class Application {

  public static void main(String ... args) {
    RemoteController controller = new RemoteController();
    controller.pressButton(0);
    controller.pressButton(1);
    controller.undo();

    controller.pressButton(2);
    controller.undo();
    controller.pressButton(3);

    controller.pressButton(7);
    controller.pressButton(4);
    controller.undo();
  }

}
