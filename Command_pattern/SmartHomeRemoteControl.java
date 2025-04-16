package Command_pattern;

class SmartHomeRemoteControl {
    private java.util.Map<String, Command> commands = new java.util.HashMap<>();
    private Command lastCommand;

    public void setCommand(String slot, Command command) {
        commands.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commands.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("[Remote] No command for " + slot);
        }
    }

    public void undoButton() {
        if (lastCommand != null) {
            lastCommand.undo();
            lastCommand = null;
        } else {
            System.out.println("[Remote] Nothing to undo.");
        }
    }
}
