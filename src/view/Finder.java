package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import res.Resources;
import iFace.IScreen;
import controller.CustomPanelClickListener;

public class Finder implements IScreen {
    private final JFrame jr;
    private JMenu editMenu;
    private JMenu fileMenu;
    private JMenuBar menuBar;
    private JMenuItem newItem;
    private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem cutItem;
    private JMenuItem copyItem;
    private JMenuItem pasteItem;

    private JPanel leftPanel;
    private JLabel recentLabel;
    private JLabel applicationLabel;
    private JLabel desktopLabel;
    private JLabel documentLabel;
    private JLabel downloadLabel;

    private JPanel recentPanel;
    private JTable recentTable;
    private DefaultTableModel tableModel;
    private JScrollPane scrollPane;

    private JPanel applicationPanel;
    private JPanel headerText;
    private JLabel labelKeyboard;
    private JLabel labelText;
    private JLabel labelShortcuts;
    private String[] leftMenu = {"1", "2", "3", "4", "5", "dau buoi", "cc"};

    public Finder() {
        jr = new JFrame();
        jr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jr.setSize(800, 450);
//        jr.setUndecorated(true);
        jr.setLocationByPlatform(true);
        jr.setLocationRelativeTo(null);
        jr.setLayout(null);

        createMenuBar();

        createLeftPanel2();
        createRecentPanel();

        jr.add(menuBar);
        jr.add(leftPanel);
        jr.add(recentPanel);
        jr.setVisible(true);
    }

    private void createLeftPanel2() {
        leftPanel = new JPanel();
        List<JLabel> labels = new ArrayList<>();

        leftPanel.setBounds(0, menuBar.getHeight(), 200, jr.getHeight());
        leftPanel.setBackground(Resources.leftPanel);
        leftPanel.setLayout(null);
        JLabel[] lbs = new JLabel[leftMenu.length];
        for (int i = 0; i < lbs.length; i++) {
            JLabel lb = new JLabel(leftMenu[i], Resources.leftPanelTextAlign);
//            lb.setBackground(Color.green);
            lb.setForeground(Color.white);
            lbs[i] = lb;
            labels.add(lb);
        }

        for (int i = 0; i < lbs.length; i++) {
            if (i == 0) {
                lbs[i].setBounds(0, 0, leftPanel.getWidth(), Resources.leftPanelLabelHeight);
            } else {
                lbs[i].setBounds(0, lbs[i - 1].getY() + lbs[i - 1].getHeight(), leftPanel.getWidth(), Resources.leftPanelLabelHeight);
            }
        }
        for (JLabel lb : lbs) {
            leftPanel.add(lb);
        }
        leftPanel.addMouseListener(new CustomPanelClickListener(labels, this));
    }

    private void createLeftPanel() {
        leftPanel = new JPanel();
        List<JLabel> labels = new ArrayList<>();

        leftPanel.setBounds(0, menuBar.getHeight(), 200, jr.getHeight());
        leftPanel.setBackground(Resources.leftPanel);
        leftPanel.setLayout(null);

        recentLabel = new JLabel("Recents", Resources.leftPanelTextAlign);
        recentLabel.setBounds(0, 0, leftPanel.getWidth(), Resources.leftPanelLabelHeight);
        recentLabel.setForeground(Resources.white);

        applicationLabel = new JLabel("Applications", Resources.leftPanelTextAlign);
        applicationLabel.setBounds(0, recentLabel.getY() + recentLabel.getHeight(), leftPanel.getWidth(), Resources.leftPanelLabelHeight);
        applicationLabel.setForeground(Resources.white);

        desktopLabel = new JLabel("Desktop", Resources.leftPanelTextAlign);
        desktopLabel.setBounds(0, applicationLabel.getY() + applicationLabel.getHeight(), leftPanel.getWidth(), Resources.leftPanelLabelHeight);
        desktopLabel.setForeground(Resources.white);

        documentLabel = new JLabel("Documents", Resources.leftPanelTextAlign);
        documentLabel.setBounds(0, desktopLabel.getY() + desktopLabel.getHeight(), leftPanel.getWidth(), Resources.leftPanelLabelHeight);
        documentLabel.setForeground(Resources.white);

        downloadLabel = new JLabel("Downloads", Resources.leftPanelTextAlign);
        downloadLabel.setBounds(0, documentLabel.getY() + documentLabel.getHeight(), leftPanel.getWidth(), Resources.leftPanelLabelHeight);
        downloadLabel.setForeground(Resources.white);

        labels.add(recentLabel);
        labels.add(applicationLabel);
        labels.add(desktopLabel);
        labels.add(documentLabel);
        labels.add(downloadLabel);

        leftPanel.add(recentLabel);
        leftPanel.add(applicationLabel);
        leftPanel.add(desktopLabel);
        leftPanel.add(documentLabel);
        leftPanel.add(downloadLabel);
        leftPanel.addMouseListener(new CustomPanelClickListener(labels, this));
    }

    private void createRecentPanel() {
        recentPanel = new JPanel();
        recentPanel.setBounds(leftPanel.getX() + leftPanel.getWidth(), leftPanel.getY(), jr.getWidth() - leftPanel.getWidth(), leftPanel.getHeight());
        recentPanel.setBackground(Resources.rightPanel);
        recentPanel.setLayout(null);

        String[] columnNames = {"Name", "Age", "City"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});
        tableModel.addRow(new Object[]{"John Doe", 25, "New York"});

        recentTable = new JTable(tableModel);
        recentTable.setBounds(0, 0, recentPanel.getWidth(), recentPanel.getHeight());
        scrollPane = new JScrollPane(recentTable);
        scrollPane.setBounds(0, 0, recentPanel.getWidth(), recentPanel.getHeight());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        recentPanel.add(scrollPane);
    }

    private void createEditMenu() {
        editMenu = new JMenu("Edit");
        cutItem = new JMenuItem("Cut");
        editMenu.add(cutItem);
        copyItem = new JMenuItem("Copy");
        editMenu.add(copyItem);
        pasteItem = new JMenuItem("Paste");
        editMenu.add(pasteItem);
    }

    private void createFileMenu() {
        fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        fileMenu.add(newItem);
        openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> {
            System.exit(0);
        });
        fileMenu.add(saveItem);
        fileMenu.add(new JSeparator());
        fileMenu.add(exitItem);
    }

    private void createMenuBar() {
        createFileMenu();
        createEditMenu();
        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, jr.getWidth(), 30);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
    }

    @Override
    public void setVisibleRecentPanel(boolean value) {
        recentPanel.setVisible(value);
    }
}
