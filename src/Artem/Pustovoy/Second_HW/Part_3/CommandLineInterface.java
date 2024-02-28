package Artem.Pustovoy.Second_HW.Part_3;

import java.util.Scanner;

public class CommandLineInterface {
    private final CommandManager commandManager;

    public CommandLineInterface(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Введите команду: ");
            input = scanner.nextLine().trim();

            String[] parts = input.split("\\s+", 2);
            String command = parts[0].toLowerCase();

            switch (command) {
                case "add": System.out.print("сложение ");
                case "sub":
                case "mul":
                case "div":
                    if (parts.length == 2) {
                        int value;
                        try {
                            value = Integer.parseInt(parts[1]);
                            executeCommand(command, value);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный формат числа.");
                        }
                    } else {
                        System.out.println("Неверный формат команды.");
                    }
                    break;
                case "undo":
                    commandManager.undo();
                    break;
                case "redo":
                    commandManager.redo();
                    break;
                case "exit":
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверная команда.");
            }
            System.out.println("Текущее значение: " + commandManager.calculator.getCurrentValue());
        }
    }

    private void executeCommand(String operation, int value) {
        switch (operation) {
            case "add":
                commandManager.executeCommand(new AddCommand(commandManager.calculator, value));

                break;
            case "sub":
                commandManager.executeCommand(new SubtractCommand(commandManager.calculator, value));
                break;
            case "mul":
                commandManager.executeCommand(new MultiplyCommand(commandManager.calculator, value));
                break;
            case "div":
                commandManager.executeCommand(new DivideCommand(commandManager.calculator, value));
                break;
        }
        //System.out.println("Текущее значение: " + commandManager.calculator.getCurrentValue());
    }
}
