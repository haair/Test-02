import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class CustomLabelClickListener implements MouseListener {
    private JLabel label;
    private List<JLabel> labels;
    public CustomLabelClickListener(JLabel label) {
        this.label = label;
    }

    public CustomLabelClickListener(List<JLabel> labels) {
        this.labels = labels;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (JLabel label : labels) {
            if (e.getY() >= label.getY() && e.getY() <= label.getY() + label.getHeight()) {
                label.setOpaque(true);
                label.setBackground(Resources.leftPanelItemSelected);
                System.out.println(label.getText() + " was clicked");
            }
            else {
                label.setBackground(null);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        label.setBackground(null);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        label.setBackground(null);
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        label.setBackground(null);
    }
}
