import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class CustomPanelClickListener implements MouseListener {
    private List<JLabel> labels;
    private IScreen screen;
    public CustomPanelClickListener(List<JLabel> labels, IScreen screen) {
        this.labels = labels;
        this.screen = screen;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (JLabel label : labels) {
            if (label.getBounds().contains(e.getPoint())) {
                label.setOpaque(true);
                label.setBackground(Resources.leftPanelItemSelected);
                if (label.getText().equals("Recents")) {
                   screen.setVisibleRecentPanel(true);
                }
                else {
                    screen.setVisibleRecentPanel(false);
                }
//                System.out.println(label.getText() + " was clicked");
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

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
