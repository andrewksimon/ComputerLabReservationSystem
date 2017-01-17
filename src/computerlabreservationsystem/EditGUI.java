//This program is called "ComputerLabReservationSystemGUI".
//The purpose of this program is to provide a system in which computer labs may be reserverd.
//This program was made by Andrew Simon
//This program was made on 01/12/2013.
//This program was last edited on 02/01/2014.

//This form is called EditGUI, and edits the users.

package computerlabreservationsystem;

//Import statements. 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EditGUI extends javax.swing.JFrame {

    public EditGUI() {
        initComponents();
    }

    public static String Password;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmdClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jEditDate = new com.toedter.calendar.JDateChooser();
        cmbxRoom = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmdLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbxPeriod = new javax.swing.JComboBox();
        cmdChange = new javax.swing.JButton();
        cmdDel = new javax.swing.JButton();
        cmdCheck = new javax.swing.JButton();
        cmdLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name of Reservant:");

        jLabel2.setText("Room of Reservation:");

        jLabel3.setText("Date of Reservation:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edit Exisiting Reservation");

        cmdClose.setText("Close");
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        jEditDate.setEnabled(false);

        cmbxRoom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rm. 110", "Rm. 230", "Rm. 231", "Rm. 308", "Rm. 317" }));
        cmbxRoom.setEnabled(false);

        jLabel5.setText("Reservant's Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtName.setEnabled(false);

        cmdLogin.setText("Login");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        jLabel6.setText("Period of Reservation:");

        cmbxPeriod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Period 1 (Whole)", "Period 1 (First Half)", "Period 1 (Second Half)", "Period 2 (Whole)", "Period 2 (First Half)", "Period 2 (Second Half)", "Period 3 (Whole)", "Period 3 (First Half)", "Period 3 (Second Half)", "Period 4 (Whole)", "Period 4 (First Half)", "Period 4 (Second Half)" }));
        cmbxPeriod.setEnabled(false);

        cmdChange.setText("Change Reservation");
        cmdChange.setEnabled(false);
        cmdChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdChangeActionPerformed(evt);
            }
        });

        cmdDel.setText("Delete");
        cmdDel.setEnabled(false);
        cmdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDelActionPerformed(evt);
            }
        });

        cmdCheck.setText("Check...");
        cmdCheck.setEnabled(false);
        cmdCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCheckActionPerformed(evt);
            }
        });

        cmdLogout.setText("Logout");
        cmdLogout.setEnabled(false);
        cmdLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdLogout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbxPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(31, 31, 31)
                                            .addComponent(txtName))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(23, 23, 23)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jEditDate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbxRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmdClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmdChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmdDel, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(cmdCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdLogin)
                    .addComponent(cmdLogout))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbxRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jEditDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbxPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(cmdCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdDel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdChange, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        //Closes this window when exit is pressed.
        this.dispose();
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        //The login function.
        //Defines some vars.
        String Name = null, Room, Period;
        int iRoom = 0, iPeriod = 0;
        Date Date = null;
        boolean unlock = false;
        //Gets the password that the user has entered.
        Password = txtPassword.getText().trim();
        //Sees which entry has the matching password.
        for(int i = 0; i < ComputerLabReservationSystemGUI.Bookings.size(); i++){
            if(Password.equals(ComputerLabReservationSystemGUI.Bookings.get(i).Pass)){
                //If found, retrieve all of the information.
                Name = ComputerLabReservationSystemGUI.Bookings.get(i).Name;
                Room = ComputerLabReservationSystemGUI.Bookings.get(i).Room;
                Period = ComputerLabReservationSystemGUI.Bookings.get(i).Period;
                Date = ComputerLabReservationSystemGUI.Bookings.get(i).Date;
                iRoom = ComputerLabReservationSystemGUI.Bookings.get(i).iRoom;
                iPeriod = ComputerLabReservationSystemGUI.Bookings.get(i).iPeriod;        
                unlock = true;
            }
        }
        //If the size of the Array is is negligable, or the Array is
        //non exsistant, don't unlock the GUI.
        if(ComputerLabReservationSystemGUI.Bookings.size() < 1){
            unlock = false;
        }
        //Once validated, enable the form.
        if(unlock == true){
            //Enables the buttons, text fields, and date selectors.
            txtPassword.setEditable(false);
            txtName.setEnabled(true);
            cmbxRoom.setEnabled(true);
            jEditDate.setEnabled(true);
            cmbxPeriod.setEnabled(true);
            cmdDel.setEnabled(true);
            cmdCheck.setEnabled(true);
            cmdLogin.setEnabled(false);
            cmdLogout.setEnabled(true);
            txtName.grabFocus();
            //Displays the information from the selected user.
            txtName.setText(Name);
            txtPassword.setText(Password);
            cmbxRoom.setSelectedIndex(iRoom);
            cmbxPeriod.setSelectedIndex(iPeriod);
            jEditDate.setDate(Date);
            //Prints out a welcome message.
            txtOutput.setText("Welome. Please select an option. Note: If you choose to delete your infromation, " + "\n"
                    + "stored information displayed above will be removed. If you so choose to change your " + "\n"
                    + "reservation, you must click on 'Check' before you may select 'Change' to ensure that " + "\n"
                    + "no pre-exsisting reservation is at that date. PLEASE REMEBER YOUR PASSWORD!");
        }else{
            //Error output for the wrong password.
            txtOutput.setText("ERROR! Your password is incorrect. Please enter a correct password.");
            txtPassword.setText("");
            txtPassword.grabFocus();
            //Clears the form for a wrong password.
            txtName.setText("");
            txtPassword.setText("");
            cmbxRoom.setSelectedIndex(0);
            cmbxPeriod.setSelectedIndex(0);
            jEditDate.setDate(null); 
        }
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void cmdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDelActionPerformed
        //This is the Delete function for a reservation.
        //If the check to see what Index a password is at, then remove the
        //whole reservation at that Index.
        for(int i = 0; i < ComputerLabReservationSystemGUI.Bookings.size(); i++){   
            if(Password.equals(ComputerLabReservationSystemGUI.Bookings.get(i).Pass)){
                ComputerLabReservationSystemGUI.Bookings.remove(i);
            }
        }      
        //Closes the form.
        this.dispose();        
    }//GEN-LAST:event_cmdDelActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        VoidRes();
        cmdChange.setEnabled(false);
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cmdChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdChangeActionPerformed
        //Defines temporary storage.
        String Name, Password, sRoom, Date, sPeriod;
        int iRoom, iPeriod;
        Name = txtName.getText();
        Password = txtPassword.getText();
        iRoom = cmbxRoom.getSelectedIndex();
        iPeriod = cmbxPeriod.getSelectedIndex();
        sRoom = cmbxRoom.getSelectedItem().toString();
        sPeriod = cmbxPeriod.getSelectedItem().toString();
        //Gets the current date.
        Date selectedDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss zzz");
        selectedDate = jEditDate.getDate();
        Date = dateFormat.format(selectedDate);
        //Deleats the old reservation to make way for the new one.
        for(int i = 0; i < ComputerLabReservationSystemGUI.Bookings.size(); i++){   
            if(Password.equals(ComputerLabReservationSystemGUI.Bookings.get(i).Pass)){
                ComputerLabReservationSystemGUI.Bookings.remove(i);
            }
        }
        //Makes a new user then stores it to the Array to replace the old one.
        Reserve newUser = new Reserve(Name, Password, sRoom, selectedDate, sPeriod, iRoom, iPeriod);
        ComputerLabReservationSystemGUI.Bookings.add(newUser);
        this.dispose(); 
    }//GEN-LAST:event_cmdChangeActionPerformed

    private void cmdLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogoutActionPerformed
        //Handels the logout button.
        //Today's date.
        Date todayDate = new Date();
        //Disables buttons.
        txtPassword.setEditable(true);
        txtName.setEnabled(false);
        cmbxRoom.setEnabled(false);
        jEditDate.setEnabled(false);
        cmbxPeriod.setEnabled(false);
        cmdDel.setEnabled(false);
        cmdCheck.setEnabled(false);
        cmdLogout.setEnabled(false);
        cmdLogin.setEnabled(true);
        //Erases text.
        txtName.setText("");
        txtPassword.setText("");
        cmbxRoom.setSelectedIndex(0);
        cmbxPeriod.setSelectedIndex(0);
        jEditDate.setDate(todayDate);
        txtOutput.setText("Welome. Please select login to continue.");
    }//GEN-LAST:event_cmdLogoutActionPerformed

    private void cmdCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCheckActionPerformed
        //Handels the check function.
        //Defines some temporary variables.
        String Name, Password, Room, Date, Period;
        Name = txtName.getText();
        Password = txtPassword.getText();
        Room = cmbxRoom.getSelectedItem().toString();
        Period = cmbxPeriod.getSelectedItem().toString();
        //Gets and sets todays date in a proper format.
        Date selectedDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        selectedDate = jEditDate.getDate();
        Date = dateFormat.format(selectedDate);
        //Today's date in a string.
        Date todayDate = new Date();
        String sTodayDate = dateFormat.format(todayDate);     
        //Checks to make sure that the reservation is not in the past.    
        if(selectedDate.compareTo(todayDate) < 0){
            txtOutput.setText("Please pick a date that either is in the near future or tommrow.");
            return;
        }
        //Varification System.
        //Defines the counter and the vaciency boolean.
        boolean vacient = true;
        int counter = 0;
        //Goes (loop) through the entire User Array.
        for(int i = 0; i <= ComputerLabReservationSystemGUI.Bookings.size()-1; i++){
                //Reset the counter after loop.
                counter = 0;
                //Trys to see if the requested reservation is pre-exsitant in the system.
                if(Room.equals(ComputerLabReservationSystemGUI.Bookings.get(i).Room)){
                    counter ++;
                }
                String sStoreDate = dateFormat.format(ComputerLabReservationSystemGUI.Bookings.get(i).Date);
                if(Date.equals(sStoreDate)){
                    counter ++;
                }
                if(Period.equals(ComputerLabReservationSystemGUI.Bookings.get(i).Period)){
                    counter ++;
                }
                if(counter >= 3){
                        vacient = false;
                        txtOutput.setText("There is alread a reservation booked at the requested slot. Please pick again." + "\n" + "\n");
                }        
            }   
            //If the spot is vacient, allow the user to select the "Change Reservation"
            //button.
            if(vacient == true){
                cmdChange.setEnabled(true);
                cmdCheck.setEnabled(false);
                txtPassword.setEditable(false);
                txtName.setEnabled(false);
                cmbxRoom.setEnabled(false);
                jEditDate.setEnabled(false);
                cmbxPeriod.setEnabled(false);
                cmdDel.setEnabled(false);
                cmdCheck.setEnabled(false);
                cmdLogout.setEnabled(false);
                cmdLogin.setEnabled(false);
                txtOutput.setText("Please proceed to click 'Reserve' to finalize your reservation." + "\n" + "\n");
            }          
    }//GEN-LAST:event_cmdCheckActionPerformed
    
    public void VoidRes(){
        //Voids the any checked reservations if any of the text/date fields are
        //modified through the process.
        if(cmdChange.isEnabled() == true){
            cmdChange.setEnabled(false);
            cmdCheck.setEnabled(true);
        } 
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbxPeriod;
    private javax.swing.JComboBox cmbxRoom;
    private javax.swing.JButton cmdChange;
    private javax.swing.JButton cmdCheck;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDel;
    private javax.swing.JButton cmdLogin;
    private javax.swing.JButton cmdLogout;
    private com.toedter.calendar.JDateChooser jEditDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

}
