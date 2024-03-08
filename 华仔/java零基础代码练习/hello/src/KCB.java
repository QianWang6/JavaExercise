import javax.swing.*;

/**
 * @author Qian Wang
 * @version 1.0
 */
public class KCB {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTable table = new JTable(new KCBData());
        JScrollPane pane = new JScrollPane(table);
        frame.add(pane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
