/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DiabeteRole;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Patient.Patient;
import Business.Patient.VitalSign;
import Business.Patient.VitalSignHistory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hpanjwani
 */
public class DiabeteSymptoms extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    private Patient patient;    
    private VitalSignHistory vitalSignHistory;
    
    String diabeteLevel;
    /**
     * Creates new form DiabeteSymptoms
     */
    public DiabeteSymptoms(JPanel userProcessContainer, UserAccount userAccount,Enterprise enterprise, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.patient = patient;
        
        vitalSignHistory = patient.getVitalSignList();
        
        hospitalName.setText("Hospital Name: "  + enterprise.getName());
        docLabel.setText("Doctor Name: " + userAccount.getUsername());
        patientLabel.setText("Patient Name: " + patient.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        docLabel = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        type1 = new javax.swing.JRadioButton();
        type2 = new javax.swing.JRadioButton();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        hospitalName = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("PATIENT SYMPTOMS");

        docLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        docLabel.setText("<doctorName>");

        patientLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        patientLabel.setText("<patientName>");

        buttonGroup1.add(type1);
        type1.setText("Urinating a lot, Losing weight, Blurry vision, Feeling very tired");

        buttonGroup1.add(type2);
        type2.setText("Slow-healing sores or cuts, Frequent yeast infections, Impotency");

        backBtn.setIcon(new javax.swing.ImageIcon("/Users/hpanjwani/Documents/NEU/1st Sem/5100 AED Lab/panjwani_hari_001664735/Project/images/back.png")); // NOI18N
        backBtn.setToolTipText("Go to Previous Page");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("Next >>");
        nextBtn.setToolTipText("Go to next Page");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Medical History");
        jButton1.setToolTipText("Review Medical History of Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hospitalName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        hospitalName.setText("<hospitalName>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hospitalName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(docLabel)
                                .addComponent(type2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(backBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nextBtn))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(patientLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(type1, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(docLabel)
                .addGap(30, 30, 30)
                .addComponent(hospitalName)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLabel)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(type1)
                .addGap(18, 18, 18)
                .addComponent(type2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(nextBtn))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        diabeteLevel = null;
        
        VitalSignHistory vitalSignHistory = patient.getVitalSignList();
        int size = vitalSignHistory.getVitalSignList().size();

        VitalSign vs = vitalSignHistory.getVitalSignList().get(size - 1);

        vitalSignHistory.getVitalSignList().remove(vs);
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        
        if(type1.isSelected())  {
            diabeteLevel = "Type 1";
        } else  if(type2.isSelected())  {
            diabeteLevel = "Type 2";
        } else  {
            JOptionPane.showMessageDialog(this, "Please select atlease one symptom!", "WARNING", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        

        MedicationPanel medicationPanel = new MedicationPanel(userProcessContainer, userAccount,enterprise, patient, diabeteLevel);
        userProcessContainer.add("MedicationPanel", medicationPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MedicalHistory patientMedicalHistory = new MedicalHistory(userProcessContainer, userAccount, enterprise, patient);
        userProcessContainer.add("PatientMedicalHistoryPanel", patientMedicalHistory);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel docLabel;
    private javax.swing.JLabel hospitalName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JRadioButton type1;
    private javax.swing.JRadioButton type2;
    // End of variables declaration//GEN-END:variables
}
