package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    double num1 = 0, num2 = 0, result;
    int operatorDecider = -1;
    boolean num1Finalized = false, num2Finalized = false, num2Inputted = false, num1IsNegative = false;
    char[] operators = {'+', '-', '÷', '×'};
    String outPut = "";

    public JButton one, two, three, four, five, six, seven, eight, nine, zero;
    public JButton add, subtract, divide, multiply, equals, clear;
    public JLabel display = new JLabel();

    public Calculator() {

        ImageIcon icon = new ImageIcon("C:\\Users\\bajed\\IdeaProjects\\Calculator\\src\\icon.png");

        zero = new JButton();
        zero.setText("0");
        zero.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        zero.setFocusable(false);
        zero.setBounds(160, 520, 140, 60);
        zero.addActionListener(this);

        one = new JButton();
        one.setText("1");
        one.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        one.setFocusable(false);
        one.setBounds(10, 450, 140, 60);
        one.addActionListener(this);

        two = new JButton();
        two.setText("2");
        two.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        two.setFocusable(false);
        two.setBounds(160, 450, 140, 60);
        two.addActionListener(this);

        three = new JButton();
        three.setText("3");
        three.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        three.setFocusable(false);
        three.setBounds(310, 450, 140, 60);
        three.addActionListener(this);

        four = new JButton();
        four.setText("4");
        four.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        four.setFocusable(false);
        four.setBounds(10, 380, 140, 60);
        four.addActionListener(this);

        five = new JButton();
        five.setText("5");
        five.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        five.setFocusable(false);
        five.setBounds(160, 380, 140, 60);
        five.addActionListener(this);

        six = new JButton();
        six.setText("6");
        six.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        six.setFocusable(false);
        six.setBounds(310, 380, 140, 60);
        six.addActionListener(this);

        seven = new JButton();
        seven.setText("7");
        seven.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        seven.setFocusable(false);
        seven.setBounds(10, 310, 140, 60);
        seven.addActionListener(this);

        eight = new JButton();
        eight.setText("8");
        eight.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        eight.setFocusable(false);
        eight.setBounds(160, 310, 140, 60);
        eight.addActionListener(this);

        nine = new JButton();
        nine.setText("9");
        nine.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        nine.setFocusable(false);
        nine.setBounds(310, 310, 140, 60);
        nine.addActionListener(this);

        clear = new JButton();
        clear.setText("C");
        clear.setFont(new Font("Calibri (Body)", Font.PLAIN, 40));
        clear.setFocusable(false);
        clear.setBounds(10, 520, 140, 60);
        clear.addActionListener(this);

        equals = new JButton();
        equals.setText("=");
        equals.setFont(new Font("Calibri (Body)", Font.PLAIN, 20));
        equals.setFocusable(false);
        equals.setBounds(310, 520, 140, 60);
        equals.addActionListener(this);
        equals.setEnabled(false);

        add = new JButton();
        add.setText("+");
        add.setFont(new Font("Calibri (Body)", Font.PLAIN, 40));
        add.setFocusable(false);
        add.setBounds(10, 250, 100, 50);
        add.addActionListener(this);

        subtract = new JButton();
        subtract.setText("−");
        subtract.setFont(new Font("Calibri (Body)", Font.PLAIN, 40));
        subtract.setFocusable(false);
        subtract.setBounds(120, 250, 100, 50);
        subtract.addActionListener(this);

        divide = new JButton();
        divide.setText("÷");
        divide.setFont(new Font("Calibri (Body)", Font.PLAIN, 40));
        divide.setFocusable(false);
        divide.setBounds(240, 250, 100, 50);
        divide.addActionListener(this);

        multiply = new JButton();
        multiply.setText("×");
        multiply.setFont(new Font("Calibri (Body)", Font.PLAIN, 40));
        multiply.setFocusable(false);
        multiply.setBounds(350, 250, 100, 50);
        multiply.addActionListener(this);

        display.setBounds(10, 50, 440, 100);
        display.setBackground(Color.darkGray);
        display.setOpaque(true);
        display.setForeground(Color.white);
        display.setHorizontalAlignment(JLabel.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 80));

        this.setTitle("Calculator");
        this.setIconImage(icon.getImage());
        this.setSize(480, 640);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.lightGray);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(display);

        //buttons
        this.add(zero);
        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(six);
        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(equals);
        this.add(clear);
        this.add(add);
        this.add(subtract);
        this.add(divide);
        this.add(multiply);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        equals.setEnabled(operatorDecider != -1);

        if (!num1Finalized){

            if(e.getSource() == zero){
                num1 *= 10;
                num1 += 0;
                System.out.println(num1);
            }

            if(e.getSource() == one){
                num1 *= 10;
                num1 += 1;
                System.out.println(num1);
            }

            if(e.getSource() == two){
                num1 *= 10;
                num1 += 2;
                System.out.println(num1);
            }

            if(e.getSource() == three){
                num1 *= 10;
                num1 += 3;
                System.out.println(num1);
            }

            if(e.getSource() == four){
                num1 *= 10;
                num1 += 4;
                System.out.println(num1);
            }

            if(e.getSource() == five){
                num1 *= 10;
                num1 += 5;
                System.out.println(num1);
            }

            if(e.getSource() == six){
                num1 *= 10;
                num1 += 6;
                System.out.println(num1);
            }

            if(e.getSource() == seven){
                num1 *= 10;
                num1 += 7;
                System.out.println(num1);
            }

            if(e.getSource() == eight){
                num1 *= 10;
                num1 += 8;
                System.out.println(num1);
            }

            if(e.getSource() == nine){
                num1 *= 10;
                num1 += 9;
                System.out.println(num1);
            }

            if(num1IsNegative){
                num1 *= -1;
                num1IsNegative = false;
            }

            display.setText("" + num1);

        }

        if(e.getSource() == add){
            operatorDecider = 0;
            num1Finalized = true;
            outPut += " " + operators[operatorDecider];
        }

        if(e.getSource() == subtract && num1 == 0){
            display.setText("-");
            num1IsNegative = true;
        }

        if(e.getSource() == subtract && num1 != 0){
            operatorDecider = 1;
            num1Finalized = true;
            outPut += " " + operators[operatorDecider];
        }

        if(e.getSource() == divide){
            operatorDecider = 2;
            num1Finalized = true;
            outPut += " " + operators[operatorDecider];
        }

        if(e.getSource() == multiply){
            operatorDecider = 3;
            num1Finalized = true;
            outPut += " " + operators[operatorDecider];
        }

        if(e.getSource() == clear){
            num1 = 0;
            num2 = 0;
            num1Finalized = false;
            num2Finalized = false;
            num1IsNegative = false;
            equals.setEnabled(false);
            display.setText("");
        }

        if(e.getSource() == equals){
            switch(operatorDecider){
                case 0:
                    System.out.println(num1 + num2);
                    result = num1 + num2;
                    break;
                case 1:
                    System.out.println(num1 - num2);
                    result = num1 - num2;
                    break;
                case 2:
                    System.out.println(num1 / num2);
                    result = num1 / num2;
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    result = num1 * num2;
                    break;
            }
            num1 = 0;
            num2 = 0;
            num1Finalized = false;
            num2Finalized = false;
            equals.setEnabled(false);
            display.setText("" + result);
        }

        if(num1Finalized){

            if(e.getSource() == zero){
                num2 *= 10;
                num2 += 0;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == one){
                num2 *= 10;
                num2 += 1;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == two){
                num2 *= 10;
                num2 += 2;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == three){
                num2 *= 10;
                num2 += 3;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == four){
                num2 *= 10;
                num2 += 4;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == five){
                num2 *= 10;
                num2 += 5;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == six){
                num2 *= 10;
                num2 += 6;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == seven){
                num2 *= 10;
                num2 += 7;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == eight){
                num2 *= 10;
                num2 += 8;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(e.getSource() == nine){
                num2 *= 10;
                num2 += 9;
                num2Inputted = true;
                System.out.println(num2);
            }

            if(num2Inputted)
                display.setText(num1 + " " + operators[operatorDecider] + " " + num2);
            else
                display.setText(num1 + " " + operators[operatorDecider]);

            num2Finalized = true;

        }

    }
}
