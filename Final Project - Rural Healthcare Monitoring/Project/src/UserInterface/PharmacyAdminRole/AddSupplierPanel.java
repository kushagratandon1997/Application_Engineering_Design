/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyAdminRole;

import Business.Pharmacy.Drug.Supplier;
import Business.Pharmacy.Drug.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author hpanjwani
 */
public class AddSupplierPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierdirectory;
    int flag = 0;
    
    /**
     * Creates new form AddSupplierPanel
     */
    public AddSupplierPanel(JPanel userProcessContainer, SupplierDirectory supplierdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierdirectory = supplierdirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setText("NEW SUPPLIER");

        jLabel1.setText("Name");

        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        backBtn.setText("<<BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addBtn.setText("ADD SUPPLIER");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/hpanjwani/Documents/NEU/1st Sem/5100 AED Lab/panjwani_hari_001664735/Project/images/Medicine Inventory.jpg")); // NOI18N
        jLabel6.setToolTipText("Pharmacy Banner");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(nameTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backBtn)
                                    .addGap(26, 26, 26)
                                    .addComponent(addBtn)))))
                    .addComponent(jLabel6))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(293, 293, 293))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn)
                            .addComponent(backBtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageSupplierPanel manageSuplierPanel = (ManageSupplierPanel) component;
        manageSuplierPanel.populateSupplierTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(nameTextField.getText().trim().isEmpty())  {
            JOptionPane.showMessageDialog(this, "Supplier Name cannot be empty!", "WARNING", JOptionPane.WARNING_MESSAGE);
            nameTextField.setBackground(Color.yellow);
        }
        else if (!nameTextField.getText().matches("[a-zA-Z ]*")){
            JOptionPane.showMessageDialog(this, "Please enter valid Supplier Name!", "Error", JOptionPane.OK_OPTION);
            nameTextField.setBackground(Color.yellow);
        }
        else    {
            Supplier supplier = supplierdirectory.addSupplier(nameTextField.getText());
            JOptionPane.showMessageDialog(this, "Supplier added successfully!!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);

            nameTextField.setText("");
            nameTextField.setBackground(Color.white);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        // TODO add your handling code here:
        final JTextComponent c = (JTextComponent) evt.getSource();
        String s = c.getText();

        if (evt.isTemporary()) {
            return;
        }
        if (!(s.matches("[a-zA-Z]+"))) {
            name.setText("Name  will only have alphabets");
            nameTextField.setBackground(Color.yellow);
        } else if (s.trim().isEmpty()) {
            name.setText("First Name cannot be blank");
            nameTextField.setBackground(Color.yellow);
        } else {
            nameTextField.setBackground(Color.white);
        }
    }//GEN-LAST:event_nameTextFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables
}
