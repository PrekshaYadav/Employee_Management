/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author preks
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    
    EmployeeHistory history;
    String filename= null;
    byte[] person_image = null;
    
    
    public ViewPanel(EmployeeHistory history) {
        initComponents();
        this.history = history;
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_employee = new javax.swing.JTable();
        bt_view = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        employee_id = new javax.swing.JTextField();
        team_info1 = new javax.swing.JTextField();
        emailD_text = new javax.swing.JTextField();
        employee_id_text = new javax.swing.JTextField();
        position_title_text = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        age_text = new javax.swing.JTextField();
        start_date = new javax.swing.JTextField();
        start_date_text = new javax.swing.JTextField();
        Level_text = new javax.swing.JTextField();
        level = new javax.swing.JTextField();
        contact_number = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        team_info = new javax.swing.JTextField();
        contact_number_text = new javax.swing.JTextField();
        name_text = new javax.swing.JTextField();
        team_info_text = new javax.swing.JTextField();
        emialID = new javax.swing.JTextField();
        bt_update = new javax.swing.JButton();
        photo_label = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        gender_text = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Employees");

        tb_employee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_employeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_employee);

        bt_view.setText("View");
        bt_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_viewActionPerformed(evt);
            }
        });

        bt_delete.setText("Delete");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        employee_id.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        employee_id.setText("EmployeeID");

        team_info1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        team_info1.setText("Position Title");
        team_info1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team_info1ActionPerformed(evt);
            }
        });

        age.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        age.setText("Age: ");
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        start_date.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        start_date.setText("Start Date");

        level.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        level.setText("Level");

        contact_number.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        contact_number.setText("Contact number");
        contact_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_numberActionPerformed(evt);
            }
        });

        name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        name.setText("Name: ");

        team_info.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        team_info.setText("Team info: ");

        emialID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        emialID.setText("Email ID:");
        emialID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emialIDActionPerformed(evt);
            }
        });

        bt_update.setText("Update");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

        gender.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        gender.setText("Gender");
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(level)
                        .addGap(18, 18, 18)
                        .addComponent(Level_text, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(team_info)
                            .addComponent(team_info1)
                            .addComponent(contact_number)
                            .addComponent(emialID)
                            .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(team_info_text, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(position_title_text, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact_number_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(emailD_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gender_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(employee_id)
                            .addComponent(name)
                            .addComponent(start_date)
                            .addComponent(age))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employee_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start_date_text, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(411, Short.MAX_VALUE)
                        .addComponent(bt_update)
                        .addGap(18, 18, 18)
                        .addComponent(bt_delete)
                        .addGap(18, 18, 18)
                        .addComponent(bt_view)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_update)
                    .addComponent(bt_delete)
                    .addComponent(bt_view))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employee_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start_date_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Level_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(team_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(team_info_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(team_info1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position_title_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact_number_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emialID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailD_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        
        int selected_row = tb_employee.getSelectedRow();
        if(selected_row < 0)
        {
            JOptionPane.showMessageDialog( this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tb_employee.getModel();
        Employee emp_Selected = (Employee)model.getValueAt(selected_row, 0);
        history.deleteEmployee(emp_Selected);
        JOptionPane.showMessageDialog( this, "Employee deleted");
        populateTable();

    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_viewActionPerformed
        int selected_row = tb_employee.getSelectedRow();
        if(selected_row < 0)
        {
            JOptionPane.showMessageDialog( this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tb_employee.getModel();
        Employee emp_Selected = (Employee)model.getValueAt(selected_row, 0);
        
        name_text.setText(String.valueOf(emp_Selected.getName()));
        employee_id_text.setText(String.valueOf(emp_Selected.getId()));
        age_text.setText(String.valueOf(emp_Selected.getAge()));
        start_date_text.setText(String.valueOf(emp_Selected.getDate()));
        Level_text.setText(String.valueOf(emp_Selected.getLevel()));
        team_info_text.setText(String.valueOf(emp_Selected.getTeam_info()));
        position_title_text.setText(String.valueOf(emp_Selected.getPosition()));
        contact_number_text.setText(String.valueOf(emp_Selected.getPhone_no()));
        emailD_text.setText(String.valueOf(emp_Selected.getEmail()));
        gender_text.setText(emp_Selected.getGender());
        byte[] img = emp_Selected.getPicture();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(photo_label.getWidth(), photo_label.getHeight(),Image.SCALE_SMOOTH));
        photo_label.setIcon(imageIcon);
    }//GEN-LAST:event_bt_viewActionPerformed

    private void team_info1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team_info1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_team_info1ActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void contact_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_numberActionPerformed

    private void emialIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emialIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emialIDActionPerformed

    private void tb_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_employeeMouseClicked
        // TODO add your handling code here:
        int selected_row = tb_employee.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) tb_employee.getModel();
        Employee emp_Selected = (Employee)model.getValueAt(selected_row, 0);
        
        name_text.setText(String.valueOf(emp_Selected.getName()));
        employee_id_text.setText(String.valueOf(emp_Selected.getId()));
        age_text.setText(String.valueOf(emp_Selected.getAge()));
        start_date_text.setText(String.valueOf(emp_Selected.getDate().toString()));
        Level_text.setText(String.valueOf(emp_Selected.getLevel()));
        team_info_text.setText(String.valueOf(emp_Selected.getTeam_info()));
        position_title_text.setText(String.valueOf(emp_Selected.getPosition()));
        contact_number_text.setText(String.valueOf(emp_Selected.getPhone_no()));
        emailD_text.setText(String.valueOf(emp_Selected.getEmail()));
        gender_text.setText(emp_Selected.getGender());
        byte[] img = emp_Selected.getPicture();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(photo_label.getWidth(), photo_label.getHeight(),Image.SCALE_SMOOTH));
        photo_label.setIcon(imageIcon);       
    }//GEN-LAST:event_tb_employeeMouseClicked

    
    
    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tb_employee.getModel();
        int selected_row = tb_employee.getSelectedRow();
        Employee emp_Selected = (Employee)model.getValueAt(selected_row, 0);

        if(tb_employee.getSelectedRowCount() == 1) {


            int index = history.getHistory().indexOf(emp_Selected);
            String name = name_text.getText();
            int id = Integer.parseInt(employee_id_text.getText());
            int age = Integer.parseInt(age_text.getText());
            String date = start_date_text.getText();
            int level = Integer.parseInt(Level_text.getText());
            String team_info = team_info_text.getText();
            String position_title = position_title_text.getText();
            Long contact_no = Long.parseLong(contact_number_text.getText());
            String email= emailD_text.getText(); 
            
            history.getHistory().get(index).setId(id);
            history.getHistory().get(index).setName(name);
            history.getHistory().get(index).setAge(age);
            
            Date date1 = new Date();
            try {  
                date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);
            } catch (ParseException ex) {
                Logger.getLogger(CreatePanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            history.getHistory().get(index).setDate(date1);
            history.getHistory().get(index).setLevel(level);
            history.getHistory().get(index).setTeam_info(team_info);
            history.getHistory().get(index).setPosition(position_title);
            history.getHistory().get(index).setPhone_no(contact_no);
            history.getHistory().get(index).setEmail(email);
            
            JOptionPane.showMessageDialog( this, "Employee Updated");
            populateTable();
        }
    }//GEN-LAST:event_bt_updateActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Level_text;
    private javax.swing.JTextField age;
    private javax.swing.JTextField age_text;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_update;
    private javax.swing.JButton bt_view;
    private javax.swing.JTextField contact_number;
    private javax.swing.JTextField contact_number_text;
    private javax.swing.JTextField emailD_text;
    private javax.swing.JTextField emialID;
    private javax.swing.JTextField employee_id;
    private javax.swing.JTextField employee_id_text;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField gender_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField level;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name_text;
    private javax.swing.JLabel photo_label;
    private javax.swing.JTextField position_title_text;
    private javax.swing.JTextField start_date;
    private javax.swing.JTextField start_date_text;
    private javax.swing.JTable tb_employee;
    private javax.swing.JTextField team_info;
    private javax.swing.JTextField team_info1;
    private javax.swing.JTextField team_info_text;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb_employee.getModel();
        model.setRowCount(0);
        for(Employee e: history.getHistory())
        {
            Object[] row = new Object[4];
            row[0] = e;
            row[1] = e.getName();
            row[2] = e.getAge();
            row[3] = e.getLevel();
            model.addRow(row);
        }
        
    }
}
