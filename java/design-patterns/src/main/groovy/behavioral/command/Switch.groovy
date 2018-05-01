package behavioral.command

/** The Invoker class */
class Switch {

    List<Command> history = new ArrayList<>()

    public void storeAndExecute(final Command cmd) {
        history.add(cmd) // optional
        cmd.execute()
    }
}