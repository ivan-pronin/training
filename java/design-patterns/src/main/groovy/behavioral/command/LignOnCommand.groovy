package behavioral.command

class LignOnCommand implements Command {

    Light receiver

    public LignOnCommand(Light receiver) {
        this.receiver = receiver
    }

    @Override
    public void execute() {
        receiver.turnOn()
    }
}
