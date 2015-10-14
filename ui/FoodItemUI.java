/*
 * All rights reserved
 * CIsSharp
 */
package restaurant.ui;

import restaurant.businesslogic.FoodItem;

/**
 *
 * @author Pradip Shrestha <pradip.shrestha@nih.gov>
 */
public class FoodItemUI extends javax.swing.JDialog {

  FoodItem foodItem;

  /**
   * Creates new form NewFoodItem
   */
  public FoodItemUI(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    jLabelFormError.setVisible(false);
  }

  public FoodItem getFoodItem() {
    return foodItem;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTextFieldName = new javax.swing.JTextField();
    jLabelName = new javax.swing.JLabel();
    jLabelPrice = new javax.swing.JLabel();
    jTextFieldNamePrice = new javax.swing.JTextField();
    jLabelQuantity = new javax.swing.JLabel();
    jTextFieldNameQuantity = new javax.swing.JTextField();
    jLabelDescription = new javax.swing.JLabel();
    jLabelSize = new javax.swing.JLabel();
    jTextFieldNameSize = new javax.swing.JTextField();
    jCheckBoxSpecialOrder = new javax.swing.JCheckBox();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    jButtonOk = new javax.swing.JButton();
    jButtonCancel = new javax.swing.JButton();
    jLabelInstruction = new javax.swing.JLabel();
    jLabelFormError = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(398, 350));

    jLabelName.setText("Name");

    jLabelPrice.setText("Price");

    jLabelQuantity.setText("Quantity");

    jLabelDescription.setText("Description");

    jLabelSize.setText("Size");

    jCheckBoxSpecialOrder.setText("Special Order");

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);

    jButtonOk.setText("OK");
    jButtonOk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonOkActionPerformed(evt);
      }
    });

    jButtonCancel.setText("Cancel");
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCancelActionPerformed(evt);
      }
    });

    jLabelInstruction.setText("Please fill the form and submit.");

    jLabelFormError.setForeground(new java.awt.Color(255, 0, 0));
    jLabelFormError.setText("Please correct the values");
    jLabelFormError.setToolTipText("");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButtonCancel))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelInstruction)
            .addGap(37, 37, 37)
            .addComponent(jLabelFormError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCheckBoxSpecialOrder)
              .addComponent(jLabelDescription))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelName)
              .addComponent(jLabelPrice)
              .addComponent(jLabelQuantity)
              .addComponent(jLabelSize))
            .addGap(23, 23, 23)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTextFieldNameSize)
              .addComponent(jTextFieldNameQuantity)
              .addComponent(jTextFieldNamePrice)
              .addComponent(jTextFieldName))))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelFormError))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelName))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelPrice)
          .addComponent(jTextFieldNamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelQuantity)
          .addComponent(jTextFieldNameQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelSize)
          .addComponent(jTextFieldNameSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jCheckBoxSpecialOrder)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabelDescription)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonOk)
          .addComponent(jButtonCancel))
        .addContainerGap(18, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
    if (isFormValid()) {
      jLabelFormError.setVisible(false);
      foodItem = new FoodItem(jTextFieldName.getText(), Double.parseDouble(jTextFieldNamePrice.getText()),
              Integer.parseInt(jTextFieldNameQuantity.getText()), jTextArea1.getText(), jCheckBoxSpecialOrder.isSelected());
      this.setVisible(false);
      this.dispose();
    } else {
      jLabelFormError.setVisible(true);
    }
  }//GEN-LAST:event_jButtonOkActionPerformed

  private Boolean isFormValid() {
    try {
      if (jTextFieldName.getText().trim().equals("")) {
        return false;
      }
      if (Double.parseDouble(jTextFieldNamePrice.getText()) < 0) {
        return false;
      }
      if (Integer.parseInt(jTextFieldNameQuantity.getText()) <= 0) {
        return false;
      }
    } catch (Exception ex) {
      return false;
    }
    return true;
  }

  private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
    this.setVisible(false);
    this.dispose();
  }//GEN-LAST:event_jButtonCancelActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonCancel;
  private javax.swing.JButton jButtonOk;
  private javax.swing.JCheckBox jCheckBoxSpecialOrder;
  private javax.swing.JLabel jLabelDescription;
  private javax.swing.JLabel jLabelFormError;
  private javax.swing.JLabel jLabelInstruction;
  private javax.swing.JLabel jLabelName;
  private javax.swing.JLabel jLabelPrice;
  private javax.swing.JLabel jLabelQuantity;
  private javax.swing.JLabel jLabelSize;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JTextField jTextFieldName;
  private javax.swing.JTextField jTextFieldNamePrice;
  private javax.swing.JTextField jTextFieldNameQuantity;
  private javax.swing.JTextField jTextFieldNameSize;
  // End of variables declaration//GEN-END:variables
}
