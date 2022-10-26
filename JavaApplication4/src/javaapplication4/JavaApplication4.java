
package javaapplication4;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;


public class JavaApplication4 {


    public static void main(String[] args) {

    JFrame ref = new JFrame();
    ref.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel l1 = new JLabel("üst taraf ");
    JLabel l2 = new JLabel("alt taraf");
    JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT,l1,l2);
    sp.setContinuousLayout(true);
    ref.add(sp);
    ref.setSize(500,400);
    ref.setVisible(true);
    }
}
