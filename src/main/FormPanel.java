/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP PC
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    JPanel bottomPanel;
    
    public FormPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
        

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderRadioGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherGenderRadioButton = new javax.swing.JRadioButton();
        patientTypeLabel = new javax.swing.JLabel();
        patientTypeComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        photoUploadLabel = new javax.swing.JLabel();
        photoUploadTextField = new javax.swing.JTextField();
        registrationDateLabel = new javax.swing.JLabel();
        fileChooserButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        registrationDateChooser = new com.toedter.calendar.JDateChooser();

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        titleLabel.setText("FORM DETAILS");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        emailLabel.setText("Email");

        messageLabel.setText("Message");

        firstNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusLost(evt);
            }
        });
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusLost(evt);
            }
        });

        ageTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageTextFieldFocusLost(evt);
            }
        });
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyPressed(evt);
            }
        });

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender");

        genderRadioGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.setActionCommand("MALE");

        genderRadioGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.setActionCommand("FEMALE");

        genderRadioGroup.add(otherGenderRadioButton);
        otherGenderRadioButton.setText("Other");
        otherGenderRadioButton.setActionCommand("OTHER");

        patientTypeLabel.setText("Patient Type");

        patientTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OutPatient", "InPatient", "Guest", "Medical Representative" }));
        patientTypeComboBox.setSelectedIndex(-1);
        patientTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTypeComboBoxActionPerformed(evt);
            }
        });

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        photoUploadLabel.setText("Photo");

        photoUploadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoUploadTextFieldActionPerformed(evt);
            }
        });

        registrationDateLabel.setText("Registration Date");

        fileChooserButton.setText("Upload");
        fileChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserButtonActionPerformed(evt);
            }
        });

        registrationDateChooser.setDateFormatString("dd-MMM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel))
                                .addGap(18, 348, Short.MAX_VALUE)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(titleLabel)
                                    .addComponent(patientTypeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ageTextField)
                                    .addComponent(lastNameTextField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(otherGenderRadioButton))
                                    .addComponent(emailTextField)
                                    .addComponent(firstNameTextField)
                                    .addComponent(photoUploadTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fileChooserButton)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientTypeLabel)
                            .addComponent(photoUploadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registrationDateLabel))
                                .addGap(18, 18, 18)
                                .addComponent(registrationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 89, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(submitButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(titleLabel)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(otherGenderRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientTypeLabel)
                    .addComponent(patientTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(photoUploadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(photoUploadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fileChooserButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(registrationDateLabel))
                    .addComponent(registrationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(messageLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

   
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        if(patientTypeComboBox.getSelectedIndex() == -1)
                    
        {
            JOptionPane.showMessageDialog(this, "Please select Patient Type."  );
        }
        else if(genderRadioGroup.getSelection()== null)
        {
            JOptionPane.showMessageDialog(this, "Please select Patient Gender."  );
        }
        else
        {           
        
            Patient newUser = new Patient();
            newUser.setFirstName(firstNameTextField.getText());
            newUser.setLastName(lastNameTextField.getText());
            newUser.setAge(Integer.parseInt(ageTextField.getText()));
            newUser.setEmail(emailTextField.getText());
            newUser.setMessage(messageTextArea.getText());
            newUser.setPhoto(photoUploadTextField.getText());
            newUser.setGender(genderRadioGroup.getSelection().getActionCommand());
            newUser.setPatientType(patientTypeComboBox.getSelectedItem().toString());
            newUser.setRegistrationDate(registrationDateChooser.getCalendar().getTime().toString());
            ImageIcon imageIcon = new ImageIcon(newUser.getPhoto());
            Image image = imageIcon.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
            newUser.setUserPhoto(new ImageIcon(image));


           ViewPanel view = new ViewPanel(newUser,bottomPanel);
            bottomPanel.add(view);
            CardLayout layout = (CardLayout)bottomPanel.getLayout();
            layout.next(bottomPanel);
            
       
        }

        
    }//GEN-LAST:event_submitButtonActionPerformed

     public static boolean isValidName(String firstName) {
        // is null or empty
        if (firstName == null || firstName.trim().isEmpty()) {
            return false;
        }

        // input length 
        if (firstName.length() > 50) {
            return false;
        }

        // input validation using regular expression
        String regex = "^[a-zA-Z]+$"; 
        Pattern ipPattern = Pattern.compile(regex);
        Matcher ipMatcher = ipPattern.matcher(firstName);

        return ipMatcher.matches();
    }
    
    public static boolean isValidAge(int userAge) {
        try
        {
            int maxAge =100;
            int age = userAge;

            if(age < 0 || age > maxAge)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        catch (NumberFormatException ex) 
        {
            return false;
        }
        
    }
    
    public static boolean isValidEmail(String email) {
        // Define the regex pattern for a basic email address validation
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Compile the pattern
        Pattern ipPattern = Pattern.compile(regex);

        // Match the input email against the pattern
        Matcher ipMatcher = ipPattern.matcher(email);

        // Return true if the email matches the pattern, false otherwise
        return ipMatcher.matches();
    }
    
    private void patientTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientTypeComboBoxActionPerformed

    private void firstNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusLost
        // TODO add your handling code here:
        if(!isValidName(firstNameTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Invalid input for FirstName."  );
        }
    }//GEN-LAST:event_firstNameTextFieldFocusLost

    private void lastNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusLost
        // TODO add your handling code here:
        if(!isValidName(lastNameTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Invalid input for lastName."  );
        }
    }//GEN-LAST:event_lastNameTextFieldFocusLost

    private void ageTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageTextFieldFocusLost
        // TODO add your handling code here:
        if(!isValidAge(Integer.parseInt(ageTextField.getText())))
        {
            JOptionPane.showMessageDialog(this, "Invalid Age."  );
        }
    }//GEN-LAST:event_ageTextFieldFocusLost

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        // TODO add your handling code here:
        if (!isValidEmail(emailTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Invalid EmailId. Please enter a valid EmailId."  );
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void fileChooserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) 
        {
            try 
            {
                String fileName = file.getSelectedFile().getName().toLowerCase();
                if(fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png"))
                {
                
                    BufferedImage img = ImageIO.read(file.getSelectedFile());
                    Image edited_image = img.getScaledInstance(60, 80,
                    Image.SCALE_SMOOTH);
                    if (edited_image != null) 
                    {
                        photoUploadTextField.setText(file.getSelectedFile().getAbsolutePath());

                        imageLabel.setIcon(new ImageIcon(edited_image));
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Image should be jpg,jpeg or png format."  );
                }
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(this, "Please upload image correctly correctly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_fileChooserButtonActionPerformed

    private void photoUploadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoUploadTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photoUploadTextFieldActionPerformed

    private void ageTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyPressed
        // TODO add your handling code here:
        try
        {
            int age = Integer.parseInt(ageTextField.getText());
            ageTextField.setForeground(Color.black);
        }
        catch(Exception e)
        {
             ageTextField.setForeground(Color.red);       
        }
    }//GEN-LAST:event_ageTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JButton fileChooserButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioGroup;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JRadioButton otherGenderRadioButton;
    private javax.swing.JComboBox<String> patientTypeComboBox;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JLabel photoUploadLabel;
    private javax.swing.JTextField photoUploadTextField;
    private com.toedter.calendar.JDateChooser registrationDateChooser;
    private javax.swing.JLabel registrationDateLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
