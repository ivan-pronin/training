package behavioral.command

class CommandDemo {
    public static void main(final String[] arguments){

        final Light lamp = new Light()

        List<Command> commands = [
            new LignOnCommand(lamp),
            new LignOffCommand(lamp)
        ]
        final Switch mySwitch = new Switch()

        mySwitch.storeAndExecute(commands[new Random().nextInt(2)])
    }
}
