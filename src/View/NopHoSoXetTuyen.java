package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NopHoSoXetTuyen extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField txtName, txtYearOfBirth, txtDescription, txtInterviewDate;
    private JComboBox<String> cmbGender, cmbEducationLevel;

    public NopHoSoXetTuyen() {
        setTitle("Nộp hồ sơ xét tuyển");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tạo bảng và data cho bảng
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Họ và tên");
        tableModel.addColumn("Năm sinh");
        tableModel.addColumn("Giới tính");
        tableModel.addColumn("Trình độ học vấn");
        tableModel.addColumn("Mô tả");
        tableModel.addColumn("Ngày phỏng vấn");
        table = new JTable(tableModel);

        // Tạo một panel chứa TextField 
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(new JLabel("Họ và tên:"));
        txtName = new JTextField();
        inputPanel.add(txtName);
        inputPanel.add(new JLabel("Năm sinh:"));
        txtYearOfBirth = new JTextField();
        inputPanel.add(txtYearOfBirth);
        inputPanel.add(new JLabel("Giới tính:"));
        cmbGender = new JComboBox<>();
        cmbGender.addItem("Nam");
        cmbGender.addItem("Nữ");
        inputPanel.add(cmbGender);
        inputPanel.add(new JLabel("Trình độ học vấn:"));
        cmbEducationLevel = new JComboBox<>();
        cmbEducationLevel.addItem("Cao đẳng");
        cmbEducationLevel.addItem("Đại học");
        cmbEducationLevel.addItem("Thạc sĩ");
        cmbEducationLevel.addItem("Tiến sĩ");
        inputPanel.add(cmbEducationLevel);
        inputPanel.add(new JLabel("Mô tả:"));
        txtDescription = new JTextField();
        inputPanel.add(txtDescription);
        inputPanel.add(new JLabel("Ngày phỏng vấn:"));
        txtInterviewDate = new JTextField();
        inputPanel.add(txtInterviewDate);

        // Tạo một panel chứa các button
        JPanel buttonPanel = new JPanel();
        JButton btnAdd = new JButton("Thêm");
        JButton btnDelete = new JButton("Xoá");
        JButton btnEdit = new JButton("Sửa");
        JButton btnBack = new JButton("Quay lại"); // Back button
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnBack); // Add the back button to the panel

        // Action nút thêm
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String yearOfBirth = txtYearOfBirth.getText();
                String gender = cmbGender.getSelectedItem().toString();
                String educationLevel = cmbEducationLevel.getSelectedItem().toString();
                String description = txtDescription.getText();
                String interviewDate = txtInterviewDate.getText();

                // Check for empty data
                if (name.isEmpty() || yearOfBirth.isEmpty() || description.isEmpty() || interviewDate.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin.");
                    return;
                }

                // Add candidate information to the table
                tableModel.addRow(new Object[]{name, yearOfBirth, gender, educationLevel, description, interviewDate});

                // Clear input fields
                clearFields();
            }
        });

        // Action nút xoá
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn một ứng viên để xoá.");
                    return;
                }
                tableModel.removeRow(selectedRow);
            }
        });

        // Action nút sửa
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn một ứng viên để sửa.");
                    return;
                }

                // Lấy thông tin từ bảng
                String name = table.getValueAt(selectedRow, 0).toString();
                String yearOfBirth = table.getValueAt(selectedRow, 1).toString();
                String gender = table.getValueAt(selectedRow, 2).toString();
                String educationLevel = table.getValueAt(selectedRow, 3).toString();
                String description = table.getValueAt(selectedRow, 4).toString();
                String interviewDate = table.getValueAt(selectedRow, 5).toString();

                // In thông tin ra bảng
                txtName.setText(name);
                txtYearOfBirth.setText(yearOfBirth);
                cmbGender.setSelectedItem(gender);
                cmbEducationLevel.setSelectedItem(educationLevel);
                txtDescription.setText(description);
                txtInterviewDate.setText(interviewDate);
                tableModel.removeRow(selectedRow);
            }
        });

        // Action nút quay lại
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Main_Screen mainScreen = new Main_Screen();
                mainScreen.setLocationRelativeTo(null);
                mainScreen.setVisible(true);
            }
        });

        // Tạo một panel cho bảng
        JScrollPane scrollPane = new JScrollPane(table);
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    private void clearFields() {
        txtName.setText("");
        txtYearOfBirth.setText("");
        cmbGender.setSelectedIndex(0);
        cmbEducationLevel.setSelectedIndex(0);
        txtDescription.setText("");
        txtInterviewDate.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NopHoSoXetTuyen().setVisible(true);
            }
        });
    }
}
