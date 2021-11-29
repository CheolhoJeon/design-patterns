package Command.RemoteController.command;

import Command.RemoteController.receiver.Game;

public class GameStartCommand implements Command {

  private final Game game;

  public GameStartCommand(final Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.start();
  }

  @Override
  public void undo() {
    game.end();
  }

}
