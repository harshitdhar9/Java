import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoList extends JFrame implements ActionListener {
    private JTextField taskField;
    private JButton addButton;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;
    private JButton completeButton;
    private JButton removeButton;

    public TodoList() {
        setTitle("To-Do List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel inputPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());

        taskField = new JTextField(20);
        addButton = new JButton("Add Task");
        completeButton = new JButton("Mark as Complete");
        removeButton = new JButton("Remove Task");

        addButton.addActionListener(this);
        completeButton.addActionListener(this);
        removeButton.addActionListener(this);

        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        JScrollPane scrollPane = new JScrollPane(taskList);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        inputPanel.add(taskField, BorderLayout.NORTH);
        inputPanel.add(scrollPane, BorderLayout.CENTER);

        buttonPanel.add(addButton);
        buttonPanel.add(completeButton);
        buttonPanel.add(removeButton);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TodoList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a task.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == completeButton) {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.setElementAt("[Completed] " + listModel.getElementAt(selectedIndex), selectedIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a task to mark as complete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == removeButton) {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a task to remove.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
