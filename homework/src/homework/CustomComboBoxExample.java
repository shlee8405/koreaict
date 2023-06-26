package homework;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class CustomComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JComboBox
        JComboBox<String> comboBox = new JComboBox<>();

        // Set a custom renderer for the JComboBox
        comboBox.setRenderer(new CustomComboBoxRenderer());

        // Add items to the JComboBox
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        // Add the JComboBox to the frame
        frame.add(comboBox, BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
    }

    // Custom renderer for the JComboBox
    static class CustomComboBoxRenderer extends JPanel implements ListCellRenderer<String> {
        private JLabel label;

        public CustomComboBoxRenderer() {
            setOpaque(true);
            label = new JLabel();
            add(label);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
            label.setText(value);

            // Customize the panel based on the selection
            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            return this;
        }
    }
}