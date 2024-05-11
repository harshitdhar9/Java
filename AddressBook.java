import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddressBook extends JFrame implements ActionListener {
    private JTextField nameField, phoneField, emailField;
    private JButton addButton, deleteButton;
    private JList<String> contactList;
    private DefaultListModel<String> listModel;

    private ArrayList<Contact> contacts;

    public AddressBook() {
        setTitle("Address Book");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 8, 10));

        JLabel nameLabel = new JLabel("Name:");
        JLabel phoneLabel = new JLabel("Phone:");
        JLabel emailLabel = new JLabel("Email:");

        nameField = new JTextField();
        phoneField = new JTextField();
        emailField = new JTextField();

        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        listModel = new DefaultListModel<>();
        contactList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(contactList);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(addButton);
        panel.add(deleteButton);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        contacts = new ArrayList<>();

        setVisible(true);
    }

    public static void main(String[] args) {
        new AddressBook();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();

            if (!name.isEmpty() && !phone.isEmpty() && !email.isEmpty()) {
                Contact contact = new Contact(name, phone, email);
                contacts.add(contact);
                updateContactList();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == deleteButton) {
            int selectedIndex = contactList.getSelectedIndex();
            if (selectedIndex != -1) {
                contacts.remove(selectedIndex);
                updateContactList();
            } else {
                JOptionPane.showMessageDialog(this, "Please select a contact to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void updateContactList() {
        listModel.clear();
        for (Contact contact : contacts) {
            listModel.addElement(contact.getName() + " - " + contact.getPhone() + " - " + contact.getEmail());
        }
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        emailField.setText("");
    }

    private static class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }
    }
}
