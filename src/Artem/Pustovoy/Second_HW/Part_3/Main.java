package Artem.Pustovoy.Second_HW.Part_3;

class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        CommandManager cm = new CommandManager(c);
       CommandLineInterface coli = new CommandLineInterface(cm);
       coli.start();
    }
}