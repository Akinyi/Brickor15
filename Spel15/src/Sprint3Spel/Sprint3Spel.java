package Sprint3Spel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.swing.*;

/* 
    Vi behöver 
    4. Akinyi: 

    5. Anna:  jag la till några metoder som räknar ut om man har vunnit och då
                skriver ut det som meddelande :) OBS - jag ändrade i startNewGame
                för att testa metoden, när du testat kan vi ändra tillbaka

 */
public class Sprint3Spel extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JPanel game = new JPanel();
    JButton newGame = new JButton("Nytt spel");
    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button four = new Button("4");
    Button five = new Button("5");
    Button six = new Button("6");
    Button seven = new Button("7");
    Button eight = new Button("8");
    Button nine = new Button("9");
    Button ten = new Button("10");
    Button eleven = new Button("11");
    Button twelve = new Button("12");
    Button thirteen = new Button("13");
    Button fourteen = new Button("14");
    Button fifteen = new Button("15");
    Button sixteen = new Button("16");
    Button tempEmpty = new Button("");
    protected int emptyValue;
    protected boolean hasWon = false;
    protected String allNumbers = "";
    List<Button> buttonList = new ArrayList<>();

    public Sprint3Spel() {
        this.setLayout(new BorderLayout());
        this.setLocation(1000, 50);
        this.add(panel, BorderLayout.SOUTH);
        this.add(game, BorderLayout.NORTH);
        panel.add(newGame);

        game.setLayout(new GridLayout(4, 4));
        startNewGame();
        newGame.addActionListener(this);

        for (Button b : buttonList) {
            b.addActionListener(this);
        }

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    public void checkIfWon() {  // Kollar att knapparna ligger i ordning
        allNumbers = "";
        for (Button b : buttonList) {
            allNumbers += b.getText();
        }
        if (allNumbers.trim().equals("123456789101112131415")) {
            hasWon = true;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGame) {
            newGame.setText("Nytt spel");
            startNewGame();
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        } else if (e.getSource().equals(one)) {
            checkIfWon();     // Anropar den nya metoden
            if (hasWon) {
                changeButtonText();  // anropar metod som ändrar texten på newGame
            }
            tempEmpty.setText(one.getText());
            tempEmpty.setBackground(one.getBackground());
            one.setBackground(Color.BLACK);
            one.setText(" "); 
            tempEmpty = one;

        } else if (e.getSource().equals(two)) {
            tempEmpty.setText(two.getText());
            tempEmpty.setBackground(two.getBackground());
            two.setBackground(Color.BLACK);
            two.setText(" ");
            tempEmpty = two;
        } else if (e.getSource().equals(three)) {
            tempEmpty.setText(three.getText());
            tempEmpty.setBackground(three.getBackground());
            three.setBackground(Color.BLACK);
            three.setText(" ");
            tempEmpty = three;
        } else if (e.getSource().equals(four)) {
            tempEmpty.setText(four.getText());
            tempEmpty.setBackground(four.getBackground());
            four.setBackground(Color.BLACK);
            four.setText(" ");
            tempEmpty = four;
        } else if (e.getSource().equals(five)) {
            tempEmpty.setText(five.getText());
            tempEmpty.setBackground(five.getBackground());
            five.setBackground(Color.BLACK);
            five.setText(" ");
            tempEmpty = five;
        } else if (e.getSource().equals(six)) {
            tempEmpty.setText(six.getText());
            tempEmpty.setBackground(six.getBackground());
            six.setBackground(Color.BLACK);
            six.setText(" ");
            tempEmpty = six;
        } else if (e.getSource().equals(seven)) {
            tempEmpty.setText(seven.getText());
            tempEmpty.setBackground(seven.getBackground());
            seven.setBackground(Color.BLACK);
            seven.setText(" ");
            tempEmpty = seven;
        } else if (e.getSource().equals(eight)) {
            tempEmpty.setText(eight.getText());
            tempEmpty.setBackground(eight.getBackground());
            eight.setBackground(Color.BLACK);
            eight.setText(" ");
            tempEmpty = eight;
        } else if (e.getSource().equals(nine)) {
            tempEmpty.setText(nine.getText());
            tempEmpty.setBackground(nine.getBackground());
            nine.setBackground(Color.BLACK);
            nine.setText(" ");
            tempEmpty = nine;
        } else if (e.getSource().equals(ten)) {
            tempEmpty.setText(ten.getText());
            tempEmpty.setBackground(ten.getBackground());
            ten.setBackground(Color.BLACK);
            ten.setText(" ");
            tempEmpty = ten;
        } else if (e.getSource().equals(eleven)) {
            tempEmpty.setText(eleven.getText());
            tempEmpty.setBackground(eleven.getBackground());
            eleven.setBackground(Color.BLACK);
            eleven.setText(" ");
            tempEmpty = eleven;
        } else if (e.getSource().equals(twelve)) {
            tempEmpty.setText(twelve.getText());
            tempEmpty.setBackground(twelve.getBackground());
            twelve.setBackground(Color.BLACK);
            twelve.setText(" ");
            tempEmpty = twelve;
        } else if (e.getSource().equals(thirteen)) {
            tempEmpty.setText(thirteen.getText());
            tempEmpty.setBackground(thirteen.getBackground());
            thirteen.setBackground(Color.BLACK);
            thirteen.setText(" ");
            tempEmpty = thirteen;
        } else if (e.getSource().equals(fourteen)) {
            tempEmpty.setText(fourteen.getText());
            tempEmpty.setBackground(fourteen.getBackground());
            fourteen.setBackground(Color.BLACK);
            fourteen.setText(" ");
            tempEmpty = fourteen;
        } else if (e.getSource().equals(fifteen)) {
            tempEmpty.setText(fifteen.getText());
            tempEmpty.setBackground(fifteen.getBackground());
            fifteen.setBackground(Color.BLACK);
            fifteen.setText(" ");
            tempEmpty = fifteen;
        } else if (e.getSource().equals(sixteen)) {
            tempEmpty.setText(sixteen.getText());
            tempEmpty.setBackground(sixteen.getBackground());
            sixteen.setBackground(Color.BLACK);
            sixteen.setText(" ");
            tempEmpty = sixteen;
        }

    }

    public void changeButtonText(){
        newGame.setText("Grattis! Du har vunnit!");
    }
    public void startNewGame() {
        buttonList = createButtonList();
        //  Collections.shuffle(buttonList);
        for (Button b : buttonList) {
            game.add(b);
        }
        tempEmpty = sixteen;
    }

    public List<Button> createButtonList() {
        buttonList = new ArrayList<>();
        buttonList.add(one);
        one.setText("1");
        one.setBackground(Color.CYAN);
        buttonList.add(two);
        two.setText("2");
        two.setBackground(Color.CYAN);
        buttonList.add(three);
        three.setText("3");
        three.setBackground(Color.CYAN);
        buttonList.add(four);
        four.setText("4");
        four.setBackground(Color.CYAN);
        buttonList.add(five);
        five.setText("5");
        five.setBackground(Color.CYAN);
        buttonList.add(six);
        six.setText("6");
        six.setBackground(Color.CYAN);
        buttonList.add(seven);
        seven.setText("7");
        seven.setBackground(Color.CYAN);
        buttonList.add(eight);
        eight.setText("8");
        eight.setBackground(Color.CYAN);
        buttonList.add(nine);
        nine.setText("9");
        nine.setBackground(Color.CYAN);
        buttonList.add(ten);
        ten.setText("10");
        ten.setBackground(Color.CYAN);
        buttonList.add(eleven);
        eleven.setText("11");
        eleven.setBackground(Color.CYAN);
        buttonList.add(twelve);
        twelve.setText("12");
        twelve.setBackground(Color.CYAN);
        buttonList.add(thirteen);
        thirteen.setText("13");
        thirteen.setBackground(Color.CYAN);
        buttonList.add(fourteen);
        fourteen.setText("14");
        fourteen.setBackground(Color.CYAN);
        buttonList.add(fifteen);
        fifteen.setText("15");
        fifteen.setBackground(Color.CYAN);
        buttonList.add(sixteen);
        sixteen.setText(" ");
        sixteen.setBackground(Color.BLACK);

        return buttonList;
    }

    public static void main(String[] args) {
        Sprint3Spel sp = new Sprint3Spel();
    }
}
