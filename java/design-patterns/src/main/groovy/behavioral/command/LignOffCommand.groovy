package behavioral.command

class LignOffCommand implements Command {

    Light receiver

    public LignOffCommand(Light receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff()
    }
}
