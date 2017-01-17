//This program is called "ComputerLabReservationSystemGUI".
//The purpose of this program is to provide a system in which computer labs may be reserverd.
//This program was made by Andrew Simon
//This program was made on 01/12/2013.
//This program was last edited on 02/01/2014.

//This form is called AddGUI, and adds the users.

package computerlabreservationsystem;

//Import statements.
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddGUI extends javax.swing.JFrame {
    
    public AddGUI() {
        initComponents();
        //Grab focus of txtName.
        txtName.grabFocus();
    }

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
        jAddDate = new com.toedter.calendar.JDateChooser();
        cmbxRoom = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmdGen = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbxPeriod = new javax.swing.JComboBox();
        cmdReserve = new javax.swing.JButton();
        cmdCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name of Reservant:");

        jLabel2.setText("Room of Reservation:");

        jLabel3.setText("Date of Reservation:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add New Reservation");

        cmdClose.setText("Close");
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        txtOutput.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtOutput);

        jAddDate.setDateFormatString("d/MMM/yyyy");
        jAddDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAddDateMouseClicked(evt);
            }
        });

        cmbxRoom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rm. 110", "Rm. 230", "Rm. 231", "Rm. 308", "Rm. 317" }));
        cmbxRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbxRoomMouseClicked(evt);
            }
        });

        jLabel5.setText("Reservant's Password:");

        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });

        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });

        cmdGen.setText("Generate");
        cmdGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGenActionPerformed(evt);
            }
        });

        jLabel6.setText("Period of Reservation:");

        cmbxPeriod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Period 1 (Whole)", "Period 1 (First Half)", "Period 1 (Second Half)", "Period 2 (Whole)", "Period 2 (First Half)", "Period 2 (Second Half)", "Period 3 (Whole)", "Period 3 (First Half)", "Period 3 (Second Half)", "Period 4 (Whole)", "Period 4 (First Half)", "Period 4 (Second Half)" }));
        cmbxPeriod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbxPeriodMouseClicked(evt);
            }
        });
        cmbxPeriod.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbxPeriodPropertyChange(evt);
            }
        });

        cmdReserve.setText("Reserve");
        cmdReserve.setEnabled(false);
        cmdReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdReserveActionPerformed(evt);
            }
        });

        cmdCheck.setText("Check...");
        cmdCheck.setToolTipText("");
        cmdCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword)
                                    .addComponent(txtName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)
                                .addComponent(cmbxRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdGen))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbxPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(jAddDate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdReserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmdClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdGen))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbxRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jAddDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbxPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        //Closes this window when exit is pressed.
        this.dispose();
        //ComputerLabReservationSystemGUI.List();
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGenActionPerformed
        VoidRes();
        //Generates the random numeric password.
        int randomPass = 1234567 + (int)(Math.random()*1234567891);
        txtPassword.setText(Integer.toString(randomPass));
    }//GEN-LAST:event_cmdGenActionPerformed

    private void cmdCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCheckActionPerformed
        
        //Gets the user information and stores it in vars.
        String Name, Password, Room, Date, Period;
        Name = txtName.getText();
        Password = txtPassword.getText();
        Room = cmbxRoom.getSelectedItem().toString();
        Period = cmbxPeriod.getSelectedItem().toString();
        //This code gets the user selected date, and parses it to a string.
        Date selectedDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        selectedDate = jAddDate.getDate();
        Date = dateFormat.format(selectedDate);
        //Today's date in a string.
        Date todayDate = new Date();
        //Checks for duplicate passwords, then informs the user if there is.
        for(int i = 0; i < ComputerLabReservationSystemGUI.Bookings.size(); i++){
            if(Password.equals(ComputerLabReservationSystemGUI.Bookings.get(i).Pass)){
                txtOutput.setText("This password is alread being used, please pick again.");
                return;
            }
        }
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
            if(Password.equals(ComputerLabReservationSystemGUI.Bookings.get(i).Pass)){
                txtOutput.setText("Please generate a new password. The one you have "
                + "selected already exists in the system.");
                return;
            }
            if(counter >= 3){
                    //If the counter is tripped, display an error showing that there already is a reservation at that time.
                    vacient = false;
                    txtOutput.setText("There is alread a reservation booked at the requested slot. Please pick again." + "\n" + "\n");
            }
        }
        //Allow the user to select the "Reserve" button if there are no matching reservations.
        if(vacient == true){
            cmdReserve.setEnabled(true);
            cmdCheck.setEnabled(false);
            txtOutput.setText("Please proceed to click 'Reserve' to finalize your reservation." + "\n" + "\n");
        }
    }//GEN-LAST:event_cmdCheckActionPerformed

    private void cmdReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdReserveActionPerformed
        //Allows for reservation to be done.
        //Temporary variables.
        String Name, Password, sRoom, Date, sPeriod;
        int iRoom, iPeriod;
        Name = txtName.getText();
        Password = txtPassword.getText();
        iRoom = cmbxRoom.getSelectedIndex();
        iPeriod = cmbxPeriod.getSelectedIndex();
        sRoom = cmbxRoom.getSelectedItem().toString();
        sPeriod = cmbxPeriod.getSelectedItem().toString();
        //This code gets the user selected date, and parses it to a string.
        Date selectedDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss zzz");
        selectedDate = jAddDate.getDate();
        Date = dateFormat.format(selectedDate);
        //Makes a new user, and adds it to the Array.
        Reserve newUser = new Reserve(Name, Password, sRoom, selectedDate, sPeriod, iRoom, iPeriod);
        ComputerLabReservationSystemGUI.Bookings.add(newUser);
        //Closes this window.
        this.dispose();
    }//GEN-LAST:event_cmdReserveActionPerformed

    //Voids the Reserve button if the user changes their information before booking.
    public void VoidRes(){
        //Disables the Reserve button if infomation is change, and
        //re-enables the check button so the user must re-check 
        //the entered information.
        if(cmdReserve.isEnabled() == true){
            cmdReserve.setEnabled(false);
            cmdCheck.setEnabled(true);
        } 
    }
    
    //All buttons with the VoidRes(); method being called have one general goal:
    //void the reservation before the user makes them, so important information is not changed.
    private void jAddDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddDateMouseClicked
        VoidRes();
    }//GEN-LAST:event_jAddDateMouseClicked

    private void cmbxPeriodPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbxPeriodPropertyChange
        VoidRes();
    }//GEN-LAST:event_cmbxPeriodPropertyChange

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        VoidRes();
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        VoidRes();
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void cmbxRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbxRoomMouseClicked
        VoidRes();
    }//GEN-LAST:event_cmbxRoomMouseClicked

    private void cmbxPeriodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbxPeriodMouseClicked
        VoidRes();
    }//GEN-LAST:event_cmbxPeriodMouseClicked
      
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
            java.util.logging.Logger.getLogger(AddGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbxPeriod;
    private javax.swing.JComboBox cmbxRoom;
    private javax.swing.JButton cmdCheck;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdGen;
    private javax.swing.JButton cmdReserve;
    private com.toedter.calendar.JDateChooser jAddDate;
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
