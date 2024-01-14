package view;

import res.Resources;

import javax.swing.*;
import java.awt.*;

public class AdminView extends JFrame {
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel jPanel_icon;
    private JPanel jPanel_home;
    private JPanel jPanel_qls;
    private JPanel jPanel_qlnd;
    private JPanel jPanel_tkiem;
    private JPanel jPanel_home2;
    private JPanel jPanel_tcuu;

    private JLabel jLabel_home;
    private JLabel jLabel_qls;
    private JLabel jLabel_qlnd;
    private JLabel jLabel_tcuu;

    public AdminView() {
        this.setTitle("");
        this.setSize(800, 450);
        this.setLocationRelativeTo(null);
        this.setLocationByPlatform(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createLeftPanel();
        createRightPanel();

        this.add(leftPanel);
        this.add(rightPanel);

        this.setVisible(true);

    }

    public void createLeftPanel() {
        leftPanel = new JPanel();
//        ArrayList<JLabel> labelList = new ArrayList<>();
        leftPanel.setBounds(0, 0, 200, this.getHeight());
        leftPanel.setBackground(Resources.leftPanel);
        leftPanel.setLayout(null);

        jLabel_home = new JLabel("  Trang Chủ", SwingConstants.LEFT);
        jLabel_home.setFont(Resources.leftPanelFont);
        jLabel_home.setSize(200, 50);
        jLabel_home.setForeground(Color.BLACK);


        jLabel_qls = new JLabel("  Quản Lý Sách", SwingConstants.LEFT);
        jLabel_qls.setFont(Resources.leftPanelFont);
        jLabel_qls.setSize(200, 50);
        jLabel_qls.setForeground(Color.BLACK);

        jLabel_qlnd = new JLabel("  Quản lý người đọc", SwingConstants.LEFT);
        jLabel_qlnd.setFont(Resources.leftPanelFont);
        jLabel_qlnd.setSize(200, 50);
        jLabel_qlnd.setForeground(Color.BLACK);

        jLabel_tcuu = new JLabel("  Quản lý mượn/trả sách", SwingConstants.LEFT);
        jLabel_tcuu.setFont(Resources.leftPanelFont);
        jLabel_tcuu.setSize(200, 50);
        jLabel_tcuu.setForeground(Color.BLACK);


        jPanel_icon = new JPanel();
        jPanel_icon.setBounds(0, 50, leftPanel.getWidth(), 50);
        jPanel_icon.setBackground(new Color(0, 255, 0));

        //home
        jPanel_home = new JPanel();
        jPanel_home.setBounds(0, jPanel_icon.getY() + jPanel_icon.getHeight(), 200, 50);
//        jPanel_home.setBackground(new Color(255, 255, 0));
        jPanel_home.setLayout(null);
        jPanel_home.add(jLabel_home);

        //quan ly sach
        jPanel_qls = new JPanel();
        jPanel_qls.setBounds(0, jPanel_home.getY() + jPanel_home.getHeight(), 200, 50);
//        jPanel_qls.setBackground(new Color(255, 0, 255));
        jPanel_qls.setLayout(null);
        jPanel_qls.add(jLabel_qls);

        //quan ly nguoi doc
        jPanel_qlnd = new JPanel();
        jPanel_qlnd.setBounds(0, jPanel_qls.getY() + jPanel_qls.getHeight(), 200, 50);
//        jPanel_qlnd.setBackground(new Color(238, 238, 238));
        jPanel_qlnd.setLayout(null);
        jPanel_qlnd.add(jLabel_qlnd);

        //quanly muon tra
        jPanel_tcuu = new JPanel();
        jPanel_tcuu.setBounds(0, jPanel_qlnd.getY() + jPanel_qlnd.getHeight(), 200, 50);
//        jPanel_tcuu.setBackground(new Color(238, 238, 238));
        jPanel_tcuu.setLayout(null);
        jPanel_tcuu.add(jLabel_tcuu);

        leftPanel.add(jPanel_icon);
        leftPanel.add(jPanel_home);
        leftPanel.add(jPanel_qls);
        leftPanel.add(jPanel_qlnd);
        leftPanel.add(jPanel_tcuu);

    }

    public void createRightPanel() {
        rightPanel = new JPanel();
        rightPanel.setBounds(200, 0, 600, 450);
        rightPanel.setBackground(new Color(0, 0, 0));

        panel_home();
        rightPanel.add(jPanel_home2);

    }

    public void panel_home() {
        jPanel_home2 = new JPanel();
        jPanel_home2.setBounds(202, 0, 600, 450);
        jPanel_home2.setLayout(null);
        jPanel_home2.setBackground(new Color(0, 250, 250));
    }
}
