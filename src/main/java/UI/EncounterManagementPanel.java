/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Beans.City;
import Beans.CityDirectory;
import Beans.Community;
import Beans.Doctor;
import Beans.Encounter;
import Beans.EncounterDirectory;
import Beans.Hospital;
import Beans.Patient;
import Beans.PatientDirectory;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author preks
 */
public class EncounterManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterManagementPanel
     */
    CityDirectory cityDirectory;
    PatientDirectory patientDirectory;
    String selectedPatientName;
    public EncounterManagementPanel() {
        initComponents();
    }

    EncounterManagementPanel(CityDirectory cityDirectory, PatientDirectory patientDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
        this.patientDirectory = patientDirectory;
        
        ArrayList<Patient> pat = patientDirectory.getPatientDirectory();
        
        ArrayList<String> patNames = new ArrayList<>();
        for(Patient patient:pat){
            patNames.add(patient.getName());
        }
        jComboBox1.setModel(new DefaultComboBoxModel<String>(patNames.toArray(new String[0])));
        
        
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_doctor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_final_Comments = new javax.swing.JTextField();
        txt_vitalSign = new javax.swing.JTextField();
        bt_view2 = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_update = new javax.swing.JButton();
        bt_create = new javax.swing.JButton();
        bt_view1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Encounter Management");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr.no", "Date", "Doctor", "Final Comment"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Date");

        jLabel6.setText("Final Comments");

        jLabel2.setText("ID");

        jLabel4.setText("Vital Sign");

        jLabel5.setText("Doctor");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        bt_view2.setText("View");
        bt_view2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_view2ActionPerformed(evt);
            }
        });

        bt_delete.setText("Delete");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        bt_update.setText("Update");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

        bt_create.setText("Create");
        bt_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_createActionPerformed(evt);
            }
        });

        bt_view1.setText("Reload");
        bt_view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_view1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_vitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_final_Comments, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt_create)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_view2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_delete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_update)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_view1))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_view2)
                    .addComponent(bt_create)
                    .addComponent(bt_update)
                    .addComponent(bt_delete)
                    .addComponent(bt_view1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_vitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_final_Comments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        selectedPatientName = jComboBox1.getSelectedItem().toString();

        populatTable();
        System.out.println("############### ItemState"+selectedPatientName);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void bt_view2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_view2ActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = jTable1.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to View");
            return;   
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Encounter encounterInfo = (Encounter) model.getValueAt(selectedRowIndex, 0);
        txt_id.setText(String.valueOf(encounterInfo.getId()));
        
//        jDateChooser1.setDate(Date.from(encounterInfo.getDate()).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jDateChooser1.setDate(Date.from(encounterInfo.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        //txt_date.setDate(String.valueOf(encounterInfo.getDate()));
        txt_doctor.setText(encounterInfo.getDoctor().getName());
        txt_final_Comments.setText(encounterInfo.getFinalComments());
        
        
    }//GEN-LAST:event_bt_view2ActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = jTable1.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
           
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selected_row = jTable1.getSelectedRow();
        Encounter encounterInfo = (Encounter)model.getValueAt(selected_row, 0);
        for(Patient patient: patientDirectory.getPatientDirectory())
        {
            if(patient.getName().equals(selectedPatientName))
            {
                EncounterDirectory encDirector = patient.getEncounter();
                encDirector.deleteEncounter(encounterInfo);
                JOptionPane.showMessageDialog(this, "Encounter deleted");
                break;
            }
        }
        
        populatTable();
        
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_createActionPerformed
        // TODO add your handling code here:
        CreateEncounterFrame encounter = new CreateEncounterFrame(patientDirectory, cityDirectory );
        encounter.show();
    }//GEN-LAST:event_bt_createActionPerformed

    private void bt_view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_view1ActionPerformed
        // TODO add your handling code here:
        
        populatTable();
    }//GEN-LAST:event_bt_view1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        selectedPatientName = jComboBox1.getSelectedItem().toString();

        populatTable();
        System.out.println("############### ItemState"+selectedPatientName);
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selected_row = jTable1.getSelectedRow();
        Encounter encounterSelected = (Encounter)model.getValueAt(selected_row, 0);
        int flag = 0;
        if(jTable1.getSelectedRowCount() == 1) {
            for(Patient patient:patientDirectory.getPatientDirectory())
            {
                if(patient.getName().equals(selectedPatientName))
                {
                    int index = patient.getEncounter().getEncounterHistory().indexOf(encounterSelected);
                    {
                        
                        
                        for(City city: cityDirectory.getCityDirectory())
                        {
                                for(Community com: city.getCommunityDir())
                                {
                                   for(Hospital hospital: com.getHospitalDirectory().getHospitalDirectory())
                                   {
                                       for(Doctor doctor: hospital.getDocterDirector().getDocterDirectory())
                                       {
                                           if(doctor.getName().equals(txt_doctor.getText()))
                                           {
                                                patient.getEncounter().getEncounterHistory().get(index).setDoctor(doctor);
                                                patient.getEncounter().getEncounterHistory().get(index).setId(Integer.parseInt(txt_id.getText()));
                                                patient.getEncounter().getEncounterHistory().get(index).setFinalComments(txt_final_Comments.getText());

                                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                                String date1 = sdf.format(jDateChooser1.getDate());
                                                LocalDate date = LocalDate.parse(date1);
                                                patient.getEncounter().getEncounterHistory().get(index).setDate(date);
                                                flag = 1;
                                                break;
                                            }
                                       }
                                       if(flag ==1)
                                           break;
                                   }
                                   if(flag ==1)
                                        break;   
                                }
                                
                                if(flag ==1)
                                    break;
                        }    
                        
                        
                        
                    }
                }
                if(flag == 1)
                    break;
            }
        }
        
        else
            JOptionPane.showMessageDialog(this, "please select a row");
        
        
        if(flag ==1)
            JOptionPane.showMessageDialog(this, "Encounter updated");
        else
            JOptionPane.showMessageDialog(this, "Invalid inputs");
        
        populatTable();   
        
    }//GEN-LAST:event_bt_updateActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public void populatTable()
    {
        //jComboBox1.setModel(new DefaultComboBoxModel<String>(patientDirectory.toArray(new String[0])));
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        System.out.println("###############populate table 1");

        for(Patient patient: patientDirectory.getPatientDirectory())
        {
            System.out.println("###############populate table 2 "+patient.getName()+" "+selectedPatientName);
            if(patient.getName().equals(selectedPatientName))
            {
                System.out.println("###############populate table 3");
                EncounterDirectory encounterDir = patient.getEncounter();
                for(Encounter encounter: encounterDir.getEncounterHistory())
                {
                    System.out.println("###############populate table 4");
                    Object[] row = new Object[4];
                    row[0] = encounter;
                    row[1] = encounter.getDate();
                    row[2] = encounter.getDoctor().getName();
                    row[3] = encounter.getFinalComments();
                    model.addRow(row);
                }
            }
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_create;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_update;
    private javax.swing.JButton bt_view1;
    private javax.swing.JButton bt_view2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_doctor;
    private javax.swing.JTextField txt_final_Comments;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_vitalSign;
    // End of variables declaration//GEN-END:variables
}
