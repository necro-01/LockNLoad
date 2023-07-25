package GUI;

import CryptographyAlgorithm.AES;
import CryptographyAlgorithm.RSA;

import javax.swing.JOptionPane;

public class Decrypt extends javax.swing.JPanel {

    /**
     * Creates new form Encrypt
     */
    public Decrypt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encryptedMessageLabel = new javax.swing.JLabel();
        encryptedMessageError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        encryptedMessageTextArea = new javax.swing.JTextArea();
        cryptoLabel = new javax.swing.JLabel();
        cryptoError = new javax.swing.JLabel();
        cryptoComboBox = new javax.swing.JComboBox<>();
        secretKeyPasswordField = new javax.swing.JPasswordField();
        secretKeyLabel = new javax.swing.JLabel();
        secretKeyError = new javax.swing.JLabel();
        originalMessageLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        originalMessageTextArea = new javax.swing.JTextArea();
        decryptButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        encryptedMessageLabel.setText("Enter Encrypted message");

        encryptedMessageError.setForeground(new java.awt.Color(255, 0, 0));

        encryptedMessageTextArea.setColumns(20);
        encryptedMessageTextArea.setRows(5);
        jScrollPane1.setViewportView(encryptedMessageTextArea);

        cryptoLabel.setText("Choose Decrypt method");

        cryptoError.setForeground(new java.awt.Color(255, 0, 0));

        cryptoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AES", "RSA" }));

        secretKeyLabel.setText("Enter Secret Key / Private Key");

        secretKeyError.setForeground(new java.awt.Color(255, 0, 0));

        originalMessageLabel.setText("Original Message");

        originalMessageTextArea.setEditable(false);
        originalMessageTextArea.setColumns(20);
        originalMessageTextArea.setRows(5);
        jScrollPane2.setViewportView(originalMessageTextArea);

        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cryptoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(encryptedMessageLabel)
                                .addGap(18, 18, 18)
                                .addComponent(encryptedMessageError))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cryptoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cryptoError)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(secretKeyLabel)
                                .addGap(18, 18, 18)
                                .addComponent(secretKeyError)
                                .addGap(0, 274, Short.MAX_VALUE))
                            .addComponent(secretKeyPasswordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(originalMessageLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decryptButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptedMessageLabel)
                    .addComponent(encryptedMessageError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cryptoLabel)
                    .addComponent(cryptoError)
                    .addComponent(secretKeyLabel)
                    .addComponent(secretKeyError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cryptoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secretKeyPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(originalMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decryptButton)
                    .addComponent(backButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        //Get Values
        String message = encryptedMessageTextArea.getText();
        String secretKey = new String(secretKeyPasswordField.getPassword());
        String cryptoMethod = String.valueOf(cryptoComboBox.getSelectedItem());

        //Validation
        boolean validate = true;
        if (message == null || message.isEmpty()) {
            encryptedMessageError.setText("Message is required");
            validate = false;
        } else {
            encryptedMessageError.setText("");
        }

        if (secretKey.isEmpty()) {
            secretKeyError.setText("Key is required");
            validate = false;
        } else {
            secretKeyError.setText("");
        }

        if (cryptoMethod == null || cryptoMethod.isEmpty()) {
            cryptoError.setText("Select Decrypting method");
            validate = false;
        } else {
            cryptoError.setText("");
        }

        if (!validate) {
            return;
        }

        //Message Encryption
        String originalMessage = message;
        try {
            originalMessage = switch (cryptoMethod) {
                case "AES" -> AES.decrypt(message, secretKey);
                case "RSA" ->
                    //originalMessage = RSAUtil.decrypt(message, secretKey);
                        RSA.decrypt(message, secretKey);
                default -> message;
            };
        } catch (Exception e) {
            System.out.println("Something went wrong in Decryption");
            JOptionPane.showMessageDialog(this, "Something went wrong in Decryption", "Alert", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }

        //Display Message
        if (originalMessage != null && !originalMessage.isEmpty()) {
            System.out.println("Message has been encrypted successfully");
            originalMessageTextArea.setText(originalMessage);
            JOptionPane.showMessageDialog(this, "Message has been encrypted successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Message couldn't be encrypted");
            JOptionPane.showMessageDialog(this, "Message couldn't be encrypted", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_decryptButtonActionPerformed

    public void setActionListenerBackButton(java.awt.event.ActionListener actionListener) {
        backButton.addActionListener(actionListener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> cryptoComboBox;
    private javax.swing.JLabel cryptoError;
    private javax.swing.JLabel cryptoLabel;
    private javax.swing.JButton decryptButton;
    private javax.swing.JLabel encryptedMessageError;
    private javax.swing.JLabel encryptedMessageLabel;
    private javax.swing.JTextArea encryptedMessageTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel originalMessageLabel;
    private javax.swing.JTextArea originalMessageTextArea;
    private javax.swing.JLabel secretKeyError;
    private javax.swing.JLabel secretKeyLabel;
    private javax.swing.JPasswordField secretKeyPasswordField;
    // End of variables declaration//GEN-END:variables
}
