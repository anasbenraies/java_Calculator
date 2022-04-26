import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    private JPanel JavaCalculator;
    private JTextField InputField;
    private JButton DOT;
    private JButton Num8;
    private JButton Num2;
    private JButton Plus;
    private JButton times;
    private JButton DIV;
    private JButton Result;
    private JButton Num1;
    private JButton Num4;
    private JButton Num7;
    private JButton Num0;
    private JButton Num5;
    private JButton minus;
    private JButton CLEAR;
    private JButton Num3;
    private JButton Num6;
    private JButton Num9;
    private JButton DEL;
    private double champ1 ;
    private double champ2 ;
    private String operatorS ;
    private int etat ;




    public Calculator() {
        this.operatorS="" ;
        this.etat=1 ;
        champ1=0;
        champ2=0 ;
        System.out.println(etat);
        Num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               InputField.setText(InputField.getText()+Num1.getText());
            }
        });

        Num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num2.getText());
            }
        });

        Num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num3.getText());
            }
        });

        Num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num4.getText());
            }
        });

        Num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num5.getText());
            }
        });

        Num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num6.getText());
            }
        });

        Num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num7.getText());
            }
        });

        Num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num8.getText());
            }
        });

        Num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num9.getText());
            }
        });

        Num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText(InputField.getText()+Num0.getText());
            }
        });


        CLEAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputField.setText("");
                champ1=0;
                champ2=0;
                etat=1;
            }
        });

        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // InputField.setText(InputField.getText()+"+");
                if(etat==1){
                    champ1=Double.parseDouble(InputField.getText());
                    etat=2 ;
                    InputField.setText("");
                    operatorS="+";
                }
                else{
                    champ2=Double.parseDouble(InputField.getText());
                    InputField.setText("");
                    operatorS="+";
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(etat==1){
                    champ1=Double.parseDouble(InputField.getText());
                    etat=2 ;
                    InputField.setText("");
                    operatorS="-";
                }
                else{
                    champ2=Double.parseDouble(InputField.getText());
                    InputField.setText("");
                    operatorS="-";
                }
            }
        });

        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(etat==1){
                    champ1=Double.parseDouble(InputField.getText());
                    etat=2 ;
                    InputField.setText("");
                    operatorS="*";
                }
                else{
                    champ2=Double.parseDouble(InputField.getText());
                    InputField.setText("");
                    operatorS="*";
                }
            }
        });

        DEL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String S = "";
                for (int i=0 ; i<InputField.getText().length()-1 ;i++){
                    S=S+InputField.getText().charAt(i);
                }
                InputField.setText(S);
            }
        });

        Result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    champ2=Double.parseDouble(InputField.getText());
                    System.out.print(champ2);
                    if(operatorS.equals("+")){
                        InputField.setText("");
                        InputField.setText(Double.toString(champ1+champ2));
                        champ1=champ2+champ1;
                        champ2=0 ;
                        }
                    else if(operatorS.equals("*")){
                        InputField.setText("");
                        InputField.setText(Double.toString(champ1*champ2));
                        champ1=champ2*champ1;
                        champ2=0 ;
                        }
                    else if(operatorS.equals("-")){
                        InputField.setText("");
                        InputField.setText(Double.toString(champ1-champ2));
                        champ1=champ2-champ1;
                        champ2=0 ;
                    }
                    else if(operatorS.equals("/")){
                        InputField.setText("");
                        InputField.setText(Double.toString(champ1/champ2));
                        champ1=champ2/champ1;
                        champ2=0 ;
                    }

                    }

        });


        DIV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(etat==1){
                    champ1=Double.parseDouble(InputField.getText());
                    etat=2 ;
                    InputField.setText("");
                    operatorS="/";
                }
                else{
                    champ2=Double.parseDouble(InputField.getText());
                    InputField.setText("");
                    operatorS="/";
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }


}
