import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeShopGUI extends JFrame {

    private JLabel imgLabel;
    private JTextField nameTextField;
    private JComboBox<String> orderComboBox;
    private JTextField quantityTextField;
    private DefaultTableModel model;
    private JTable table;

    public CoffeeShopGUI() {
        super("Marlie's Brew Haven");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 450));
        setLocationRelativeTo(null);

        ImageIcon backgroundImage = new ImageIcon("bg.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setLayout(new FlowLayout());
        setContentPane(backgroundLabel);

        ImageIcon logoIcon = new ImageIcon("logo1.png");
        Image scaledLogo = logoIcon.getImage().getScaledInstance(130, -1, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledLogo);
        imgLabel = new JLabel(scaledIcon);

        JPanel textFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        textFieldPanel.setBorder(new EmptyBorder(0, 10, -75, 0));
        textFieldPanel.setOpaque(false);
        textFieldPanel.add(new JLabel("Name:"));
        nameTextField = new JTextField(15);
        textFieldPanel.add(nameTextField);
        textFieldPanel.add(imgLabel);
        imgLabel.setBorder(new EmptyBorder(0, 90, 70, 5));

        JPanel orderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        orderPanel.setBorder(new EmptyBorder(0, 10, 10, 10));
        orderPanel.setOpaque(false);
        orderPanel.add(new JLabel("Order:"));
        String[] orders = {"Iced coffee", "Frappe", "Espresso", "Latte", "Cappuccino", "Mocha", "Americano"};
        orderComboBox = new JComboBox<>(orders);
        orderComboBox.setPreferredSize(new Dimension(170, orderComboBox.getPreferredSize().height));
        orderPanel.add(orderComboBox);
        orderPanel.add(Box.createHorizontalStrut(70));
        orderPanel.add(new JLabel("Quantity:"));
        quantityTextField = new JTextField(5); 
        orderPanel.add(quantityTextField);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setOpaque(false); 
        mainPanel.add(textFieldPanel, BorderLayout.NORTH);
        mainPanel.add(orderPanel, BorderLayout.CENTER);

        model = new DefaultTableModel();
        model.addColumn("NAME");
        model.addColumn("ORDER");
        model.addColumn("QUANTITY");

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(520, 160));

        JButton addButton = new JButton("ADD");
        addButton.setFont(addButton.getFont().deriveFont(Font.BOLD,15));
        addButton.addActionListener(new AddButtonHandler());

        JTableHeader header = table.getTableHeader();
        header.setFont(header.getFont().deriveFont(Font.BOLD,15));
        header.setBackground(new Color(218, 160, 109));

        JPanel buttonPanel = new JPanel(new GridLayout(1, 1));
        addButton.setBackground(new Color(92, 64, 51)); 
        addButton.setForeground(Color.WHITE);
        buttonPanel.add(addButton);
        buttonPanel.setBorder(new EmptyBorder(0, 350, 0, 0));
        buttonPanel.setOpaque(false);


        backgroundLabel.add(mainPanel, BorderLayout.NORTH);
        backgroundLabel.add(scrollPane, BorderLayout.CENTER);
        backgroundLabel.add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private class AddButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameTextField.getText();
            String order = (String) orderComboBox.getSelectedItem();
            String quantity = quantityTextField.getText();

            model.addRow(new Object[]{name, order, quantity});

            nameTextField.setText("");
            quantityTextField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CoffeeShopGUI());
    }
}
