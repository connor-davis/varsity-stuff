package za.edu.vcconnect.st10068305;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question2 {
    private boolean canSaveOrder = false;
    private String foodChosen = "None";
    private String drinkChosen = "None";
    private String specialRequests = "None";
    private String wantsWater = "No Water";
    private double amountDue = 0.0;

    private JPanel mainPanel;
    private JTextField textField1;
    private JCheckBox waterCheckBox;
    private JList list1;
    private JRadioButton milkshakeRadioButton;
    private JRadioButton freshJuiceRadioButton;
    private JRadioButton coolDrinkRadioButton;
    private JRadioButton teaRadioButton;
    private JRadioButton coffeeRadioButton;
    private JTextArea textArea1;

    public Question2(JFrame frame) {
        createMenuBar(frame);

        list1.addListSelectionListener(e -> {
            foodChosen = list1.getSelectedValue().toString();
        });
        milkshakeRadioButton.addActionListener(e -> {
            drinkChosen = "Milk Shake";

            freshJuiceRadioButton.setSelected(false);
            coolDrinkRadioButton.setSelected(false);
            teaRadioButton.setSelected(false);
            coffeeRadioButton.setSelected(false);
        });
        freshJuiceRadioButton.addActionListener(e -> {
            drinkChosen = "Fresh Juice";

            milkshakeRadioButton.setSelected(false);
            coolDrinkRadioButton.setSelected(false);
            teaRadioButton.setSelected(false);
            coffeeRadioButton.setSelected(false);
        });
        coolDrinkRadioButton.addActionListener(e -> {
            drinkChosen = "Cool Drink";

            freshJuiceRadioButton.setSelected(false);
            milkshakeRadioButton.setSelected(false);
            teaRadioButton.setSelected(false);
            coffeeRadioButton.setSelected(false);
        });
        teaRadioButton.addActionListener(e -> {
            drinkChosen = "Tea";

            freshJuiceRadioButton.setSelected(false);
            coolDrinkRadioButton.setSelected(false);
            milkshakeRadioButton.setSelected(false);
            coffeeRadioButton.setSelected(false);
        });
        coffeeRadioButton.addActionListener(e -> {
            drinkChosen = "Coffee";

            freshJuiceRadioButton.setSelected(false);
            coolDrinkRadioButton.setSelected(false);
            teaRadioButton.setSelected(false);
            milkshakeRadioButton.setSelected(false);
        });
    }

    private void createMenuBar(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu();

        fileMenu.setText("File");

        JMenuItem placeOrderMenuItem = new JMenuItem();
        JMenuItem saveOrderMenuItem = new JMenuItem();
        JMenuItem exitMenuItem = new JMenuItem();

        placeOrderMenuItem.setText("Place Order");
        placeOrderMenuItem.setEnabled(true);
        placeOrderMenuItem.addActionListener(event -> {
            specialRequests = textField1.getText();
            if (waterCheckBox.isSelected()) {
                wantsWater = "Wants Water";
            } else {
                wantsWater = "No Water";
            }

            canSaveOrder = true;
            saveOrderMenuItem.setEnabled(true);

            JOptionPane.showMessageDialog(null, foodChosen + "\n" + drinkChosen + "\n" + wantsWater + "\n" + specialRequests, "Current Order", JOptionPane.INFORMATION_MESSAGE);
        });

        saveOrderMenuItem.setText("Save Order");
        saveOrderMenuItem.setEnabled(false);
        saveOrderMenuItem.addActionListener(event -> {
            if (textField1.getText().isEmpty() || textField1.getText().isBlank()) specialRequests = "None";
            else specialRequests = textField1.getText();

            File newOrderFile = new File("./NewOrder.txt");

            if (!newOrderFile.exists()) {
                try {
                    newOrderFile.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                FileWriter fileWriter = new FileWriter(newOrderFile);

                fileWriter.write("Menu Choice: " + foodChosen + "\n" + "Special Request: " + specialRequests + "\n" + "Drink: " + drinkChosen + "\n" + wantsWater + "\n\n" + "Amount Due: R" + amountDue);
                fileWriter.close();

                JOptionPane.showMessageDialog(null, "The order has been saved.", "Save Successful", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        exitMenuItem.setText("Exit");
        exitMenuItem.setEnabled(true);
        exitMenuItem.addActionListener(event -> {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit and submit the file?", "File Submission", JOptionPane.YES_NO_OPTION);

            if (choice == 0) System.exit(0);
        });

        fileMenu.add(placeOrderMenuItem);
        fileMenu.add(saveOrderMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        JMenu printOrderMenu = new JMenu();

        printOrderMenu.setText("Print Order");

        JMenuItem amountDueMenuItem = new JMenuItem();

        amountDueMenuItem.setText("Amount Due");
        amountDueMenuItem.setEnabled(true);
        amountDueMenuItem.addActionListener(event -> {
            amountDue = 0.0;

            switch (foodChosen) {
                case "Chicken Salad" -> amountDue += 20;
                case "Club Sandwich" -> amountDue += 17;
                case "Burger" -> amountDue += 28;
                case "Vegetable Wrap" -> amountDue += 12;
                case "Pie" -> amountDue += 15;
                default -> {
                }
            }

            switch (drinkChosen) {
                case "Milk Shake" -> amountDue += 17;
                case "Fresh Juice" -> amountDue += 7;
                case "Cool Drink" -> amountDue += 12;
                case "Tea", "Coffee" -> amountDue += 10;
                default -> {
                }
            }

            JOptionPane.showMessageDialog(null, "The total amount due is: R" + amountDue, "Save Successful", JOptionPane.INFORMATION_MESSAGE);
        });

        JMenuItem printOrderMenuItem = new JMenuItem();

        printOrderMenuItem.setText("Print Order");
        printOrderMenuItem.setEnabled(true);
        printOrderMenuItem.addActionListener(event -> {
            textArea1.setText("");

            if (textField1.getText().isEmpty() || textField1.getText().isBlank()) specialRequests = "None";
            else specialRequests = textField1.getText();

            textArea1.append("Menu Choice: " + foodChosen + "\n" + "Special Request: " + specialRequests + "\n" + "Drink: " + drinkChosen + "\n" + wantsWater + "\n\n" + "Amount Due: R" + amountDue);
        });

        printOrderMenu.add(amountDueMenuItem);
        printOrderMenu.add(printOrderMenuItem);

        menuBar.add(printOrderMenu);

        frame.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");

        frame.setContentPane(new Question2(frame).mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
