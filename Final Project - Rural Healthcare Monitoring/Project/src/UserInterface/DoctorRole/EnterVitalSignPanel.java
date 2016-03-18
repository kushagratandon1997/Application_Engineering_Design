/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Patient.Patient;
import Business.Patient.VitalSign;
import Business.Patient.VitalSignHistory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.UserPriviligeWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hpanjwani
 */
public class EnterVitalSignPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private WorkRequest request;
    private Enterprise enterprise;
    private Business business;

    private Patient patient;
    private int age;
    private VitalSignHistory vitalSignHistory;
    private VitalSign vitalSign;

    /**
     * Creates new form VitalSign
     */
    public EnterVitalSignPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Business business, WorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.request = request;
        this.enterprise = enterprise;
        this.business = business;

        patient = (Patient) ((UserPriviligeWorkRequest) request).getPatient();

        hospitalName.setText("Hospital Name: "  + enterprise.getName());
        docLabel.setText("Doctor Name  Dr. " + userAccount.getUsername());
        patientLabel.setText("Patient Name: " + patient.getName());

        age = patient.getAge();
        vitalSignHistory = patient.getVitalSignList();

        populateBloodGroup();
    }

    public void populateBloodGroup() {
        bloodGroupComboBox.removeAllItems();

        bloodGroupComboBox.addItem("A");
        bloodGroupComboBox.addItem("B");
        bloodGroupComboBox.addItem("AB");
        bloodGroupComboBox.addItem("O");
        bloodGroupComboBox.addItem("B-");
        bloodGroupComboBox.addItem("A-");
        bloodGroupComboBox.addItem("AB-");
        bloodGroupComboBox.addItem("A+");
        bloodGroupComboBox.addItem("B+");
        bloodGroupComboBox.addItem("AB+");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timeTextField = new javax.swing.JLabel();
        hemoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        respRateTextField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        glucoseTextField = new javax.swing.JTextField();
        pulseTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bpTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        plateletsTextField = new javax.swing.JTextField();
        docLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hospitalName = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bp = new javax.swing.JLabel();
        heartRate = new javax.swing.JLabel();
        tempTextField = new javax.swing.JTextField();
        heartRateTextField = new javax.swing.JTextField();
        respRate = new javax.swing.JLabel();
        bloodGroupComboBox = new javax.swing.JComboBox();
        weight = new javax.swing.JLabel();
        Hint = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveBtn.setText("Save");
        saveBtn.setToolTipText("Record the Vital Sign");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 390, -1, -1));

        jButton1.setText("Medical History");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 96, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("/Users/hpanjwani/Documents/NEU/1st Sem/5100 AED Lab/panjwani_hari_001664735/Project/images/back.png")); // NOI18N
        jButton2.setToolTipText("Go to Previous Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("RECORD VITAL SIGN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 6, -1, -1));

        jLabel6.setText("Time of detail entered:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 449, -1, -1));

        timeTextField.setText("time");
        add(timeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 445, 170, 24));
        add(hemoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 224, 100, -1));

        jLabel5.setText("Weight (in pounds):");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 313, -1, -1));
        add(weightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 308, 100, -1));

        jLabel4.setText("Systolic Blood Pressure:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 267, -1, -1));

        respRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respRateTextFieldActionPerformed(evt);
            }
        });
        add(respRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 179, 100, -1));
        add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 137, 100, 24));
        add(glucoseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 179, 100, -1));
        add(pulseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 308, 100, -1));

        jLabel2.setText("Respiration Rate:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 184, -1, -1));
        add(bpTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 262, 99, -1));

        jLabel15.setText("Blood Group");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 267, -1, -1));

        jLabel17.setText("Body Temperature");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 351, -1, -1));

        jLabel14.setText("Blood Platelets");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 351, -1, -1));
        add(plateletsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 346, 99, -1));

        docLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        docLabel.setText("<doctorName>");
        add(docLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 59, -1, -1));

        jLabel12.setText("Blood Glucose Level");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 182, -1, 20));

        hospitalName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        hospitalName.setText("<hospitalName>");
        add(hospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 99, -1, -1));

        patientLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        patientLabel.setText("<patientName>");
        add(patientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 139, -1, -1));

        jLabel13.setText("Hemoglobin Level");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 229, -1, -1));

        jLabel16.setText("Pulse");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 313, -1, -1));

        jLabel3.setText("Heart Rate:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 229, -1, -1));
        add(bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 262, 83, 19));
        add(heartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 232, 83, 18));
        add(tempTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 346, 100, -1));
        add(heartRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 224, 100, -1));
        add(respRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 187, 83, 18));

        bloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(bloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 263, -1, -1));
        add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 316, 83, 18));

        Hint.setText("Hint");
        Hint.setToolTipText("Normal Range");
        Hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintActionPerformed(evt);
            }
        });
        add(Hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        Timestamp timeStamp = new Timestamp(new Date().getTime());
        String time = String.valueOf(timeStamp);
        timeTextField.setText(String.valueOf(time));

        if (age == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter Patient details!!", "Error", JOptionPane.OK_OPTION);
            resetFields();
        } else {
            if (glucoseTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Glucose Level cannot be blank!", "Error", JOptionPane.OK_OPTION);
                glucoseTextField.setBackground(Color.yellow);
            } else if (!glucoseTextField.getText().matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")) {
                JOptionPane.showMessageDialog(this, "Glucose Level can only have digits!", "Error", JOptionPane.OK_OPTION);
                glucoseTextField.setBackground(Color.yellow);
            } else if (hemoTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hemoglobin Level cannot be blank!", "Error", JOptionPane.OK_OPTION);
                hemoTextField.setBackground(Color.yellow);
            } else if (!hemoTextField.getText().matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")) {
                JOptionPane.showMessageDialog(this, "Hemoglobin Level can only have digits!", "Error", JOptionPane.OK_OPTION);
                hemoTextField.setBackground(Color.yellow);
            } else if (pulseTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pulse cannot be blank!", "Error", JOptionPane.OK_OPTION);
                pulseTextField.setBackground(Color.yellow);
            } else if (!pulseTextField.getText().matches("[1-9]+[0-9]*")) {
                JOptionPane.showMessageDialog(this, "Pulse can only have digits!", "Error", JOptionPane.OK_OPTION);
                pulseTextField.setBackground(Color.yellow);
            } else if (plateletsTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Blood Platelets Level cannot be blank!", "Error", JOptionPane.OK_OPTION);
                plateletsTextField.setBackground(Color.yellow);
            } else if (!plateletsTextField.getText().matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")) {
                JOptionPane.showMessageDialog(this, "Blood Platelets Level can only have digits!", "Error", JOptionPane.OK_OPTION);
                plateletsTextField.setBackground(Color.yellow);
            } else if (respRateTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Respiration Rate cannot be blank!", "Error", JOptionPane.OK_OPTION);
                respRateTextField.setBackground(Color.yellow);
            } else if (!respRateTextField.getText().matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")) {
                JOptionPane.showMessageDialog(this, "Respiration Rate can only have digits!", "Error", JOptionPane.OK_OPTION);
                respRateTextField.setBackground(Color.yellow);
            } else if (heartRateTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Heart Rate cannot be blank!", "Error", JOptionPane.OK_OPTION);
                heartRateTextField.setBackground(Color.yellow);
            } else if (!heartRateTextField.getText().matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")) {
                JOptionPane.showMessageDialog(this, "Heart Rate can only have digits!", "Error", JOptionPane.OK_OPTION);
                heartRateTextField.setBackground(Color.yellow);
            } else if (bpTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Blood Pressure cannot be blank!", "Error", JOptionPane.OK_OPTION);
                bpTextField.setBackground(Color.yellow);
            } else if (!bpTextField.getText().matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")) {
                JOptionPane.showMessageDialog(this, "Blood Pressure can only have digits!", "Error", JOptionPane.OK_OPTION);
                bpTextField.setBackground(Color.yellow);
            } else if (weightTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Weight cannot be blank!", "Error", JOptionPane.OK_OPTION);
                weightTextField.setBackground(Color.yellow);
            } else if (!weightTextField.getText().matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")) {
                JOptionPane.showMessageDialog(this, "Weight can only have digits!", "Error", JOptionPane.OK_OPTION);
                weightTextField.setBackground(Color.yellow);
            } else if (tempTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Bod Temperature cannot be blank!", "Error", JOptionPane.OK_OPTION);
                tempTextField.setBackground(Color.yellow);
            } else if (!tempTextField.getText().matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")) {
                JOptionPane.showMessageDialog(this, "Body Temperature can only have digits!", "Error", JOptionPane.OK_OPTION);
                tempTextField.setBackground(Color.yellow);
            }
            else {

                vitalSign = vitalSignHistory.addVitalSign();

                vitalSign.setRespRate(Float.parseFloat(respRateTextField.getText()));
                vitalSign.setHeartRate(Float.parseFloat(heartRateTextField.getText()));
                vitalSign.setBp(Float.parseFloat(bpTextField.getText()));
                vitalSign.setWeight(Float.parseFloat(weightTextField.getText()));
                vitalSign.setGlucose(Float.parseFloat(glucoseTextField.getText()));
                vitalSign.setHemo(Float.parseFloat(hemoTextField.getText()));
                vitalSign.setBloodGroup((String) bloodGroupComboBox.getSelectedItem());
                vitalSign.setPulse(Integer.parseInt(pulseTextField.getText()));
                vitalSign.setPlatelets(Float.parseFloat(plateletsTextField.getText()));
                vitalSign.setTemp(Float.parseFloat(tempTextField.getText()));
                vitalSign.setTime(time);

                JOptionPane.showMessageDialog(this, "VitalSign Record is successfully saved!", "Information", JOptionPane.INFORMATION_MESSAGE);
                resetFields();

                SymptonsPanel symptonsPanel = new SymptonsPanel(userProcessContainer, userAccount, enterprise, business, request);
                userProcessContainer.add("SymptonsPanel", symptonsPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            }
        }

    

    public void resetFields() {
        respRateTextField.setText("");
        respRateTextField.setBackground(Color.white);
        heartRateTextField.setText("");
        heartRateTextField.setBackground(Color.white);
        bpTextField.setText("");
        bpTextField.setBackground(Color.white);
        weightTextField.setText("");
        weightTextField.setBackground(Color.white);
        glucoseTextField.setText("");
        glucoseTextField.setBackground(Color.white);
        hemoTextField.setText("");
        hemoTextField.setBackground(Color.white);
        bloodGroupComboBox.setSelectedIndex(0);
        pulseTextField.setText("");
        pulseTextField.setBackground(Color.white);
        plateletsTextField.setText("");
        plateletsTextField.setBackground(Color.white);
        tempTextField.setText("");
        tempTextField.setBackground(Color.white);

        //timeTextField.setText(String.valueOf(vs.getTime()));
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PatientMedicalHistoryPanel patientMedicalHistory = new PatientMedicalHistoryPanel(userProcessContainer, userAccount, enterprise, patient);
        userProcessContainer.add("PatientMedicalHistoryPanel", patientMedicalHistory);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WaitingPatientPanel waitingPanel = (WaitingPatientPanel) component;
        request.setStatus("Added to Queue");
        request.setReceiver(null);
        waitingPanel.populateWaitingListTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void respRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respRateTextFieldActionPerformed

    private void HintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HintActionPerformed
        // TODO add your handling code here:

        statusLabel.setText("Normal Status");

        if ((age >= 1) && (age <= 3)) {
            respRate.setText("20-30");
            heartRate.setText("80-130");
            weight.setText("80-110");
            bp.setText("22-31");
        } else if ((age >= 4) && (age <= 5)) {
            respRate.setText("20-30");
            heartRate.setText("80-120");
            weight.setText("80-110");
            bp.setText("31-40");
        } else if ((age >= 6) && (age <= 12)) {
            respRate.setText("20-30");
            heartRate.setText("70-110");
            weight.setText("80-120");
            bp.setText("41-92");
        } else {
            respRate.setText("12-20");
            heartRate.setText("55-105");
            weight.setText("110-120");
            bp.setText("> 110");
        }
    }//GEN-LAST:event_HintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hint;
    private javax.swing.JComboBox bloodGroupComboBox;
    private javax.swing.JLabel bp;
    private javax.swing.JTextField bpTextField;
    private javax.swing.JLabel docLabel;
    private javax.swing.JTextField glucoseTextField;
    private javax.swing.JLabel heartRate;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JTextField hemoTextField;
    private javax.swing.JLabel hospitalName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JTextField plateletsTextField;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JLabel respRate;
    private javax.swing.JTextField respRateTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JLabel timeTextField;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
