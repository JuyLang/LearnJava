/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maytinh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author langk
 */
public class Caldemo extends JPanel{
    private JLabel firstNumberLb;
    private JLabel secondNumberLb;
    private JLabel result;
    private JTextField firstNum;
    private JTextField secondNum;
    private JTextField resultTf;
    private JButton cong;
    private JButton tru;
    private JButton nhan;
    private JButton chia;
    public void addComps() {
        firstNumberLb = new JLabel("First Number:");
        firstNumberLb.setBounds(10, 20, 100, 30);
        firstNum = new JTextField();
        firstNum.setBounds(110, 20, 160, 30);

        secondNumberLb = new JLabel("Second Number:");
        secondNumberLb.setBounds(10, 60, 100, 30);
        secondNum = new JTextField();
        secondNum.setBounds(110, 60, 160, 30);

        result = new JLabel("Result");
        result.setBounds(10, 100, 100, 30);
        resultTf = new JTextField();
        resultTf.setBounds(110, 100, 160, 30);

        add(firstNumberLb);
        add(firstNum);

        add(secondNumberLb);
        add(secondNum);

        add(result);
        add(resultTf);

        cong = new JButton("+");
        cong.setBounds(20,150,  60, 40);
        cong.setFont(new Font("monospace", Font.BOLD,14));
        tru = new JButton("-");
        tru.setBounds(90, 150, 60, 40);
        tru.setFont(new Font("monospace", Font.BOLD,14));
        nhan = new JButton("*");
        nhan.setBounds(160, 150, 60, 40);
        nhan.setFont(new Font("monospace", Font.BOLD,14));
        chia = new JButton("/");
        chia.setBounds(230, 150, 60, 40);
        chia.setFont(new Font("monospace", Font.BOLD,14));
        add(cong);
        add(tru);
        add(nhan);
        add(chia);
    }
    public void addEvents() {
        ActionListener buttonClick = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float fNum = Float.parseFloat(firstNum.getText());
                    float sNum = Float.parseFloat(secondNum.getText());
                    String operator = ((JButton) e.getSource()).getText();
                    switch (operator) {
                        case "+":
                            resultTf.setText("" + (fNum + sNum));
                            break;
                        case "-":
                            resultTf.setText("" + (fNum - sNum));
                            break;
                        case "/":
                            resultTf.setText("" + (fNum / sNum));
                            break;
                        case "*":
                            resultTf.setText("" + (fNum * sNum));
                            break;
                    }
                }catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Chưa đủ số!!!!");
                    return;
                }
            }
        };
        cong.addActionListener(buttonClick);
        tru.addActionListener(buttonClick);
        nhan.addActionListener(buttonClick);
        chia.addActionListener(buttonClick);
    }


}
