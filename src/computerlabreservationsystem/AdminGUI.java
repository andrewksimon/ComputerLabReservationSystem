//This program is called "ComputerLabReservationSystemGUI".
//The purpose of this program is to provide a system in which computer labs may be reserverd.
//This program was made by Andrew Simon
//This program was made on 01/12/2013.
//This program was last edited on 02/01/2014.

//This form is called AdminGUI, and removes the users by a super user..

package computerlabreservationsystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdminGUI extends javax.swing.JFrame {

    //Order array.
    Date[] DisplayOrder;
    //The password change step tracker.
    int changePass = 0;
    
    public AdminGUI() {
        //Does upon loading of the form.
        initComponents();
        txtOutputArea.setText("Please enter the main admin password, and login.");
    }
    
    public boolean Login(String pass){
        //Checks the password, and returns a boolean based on the result.
        if(pass.equals(ComputerLabReservationSystemGUI.AdminPass)){
            return true;
        }else{
            return false;
        }  
        
    }

    public void List(){
        //Date Array with the same size as the previous array.
        DisplayOrder = new Date[ComputerLabReservationSystemGUI.Bookings.size()];

        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        //Temporary holding string.
        String temp = txtOutputArea.getText();
          
        //Print the sample list. 
        temp += "\n" + "Reservation List:" + "\n" + "\n";
        temp += "Date:" + "\t" + "\t" +"Name:" + "\t" + "\t" + "Password:" + "\t" + "\t" + "Room:" + "\t" + "\t" + "Period:" + "\n" + "\n";
        
        //Sorts the wole thing.
        Sort();
        //Displays the users base on their position in the ordered date array.
        for(int x = 0; x <= DisplayOrder.length-1; x++){     
            Date tmpDt1 = DisplayOrder[x];   
            for(int i = 0; i <= ComputerLabReservationSystemGUI.Bookings.size()-1; i++){          
                Date tmpDt2 = ComputerLabReservationSystemGUI.Bookings.get(i).Date;
                if(tmpDt1 == tmpDt2){
                    temp += 
                    dateFormat.format(ComputerLabReservationSystemGUI.Bookings.get(i).Date) + "\t" + "\t"
                    + ComputerLabReservationSystemGUI.Bookings.get(i).Name + "\t" + "\t"
                    + ComputerLabReservationSystemGUI.Bookings.get(i).Pass + "\t" + "\t"
                    + ComputerLabReservationSystemGUI.Bookings.get(i).Room + "\t" + "\t"
                    + ComputerLabReservationSystemGUI.Bookings.get(i).Period + "\t" + "\t";
                    temp += "\n"; 
                }                                    
            } 
        }
        //Prints it out.
        txtOutputArea.setText(temp);
    }
    
    public void Sort(){
        //Handles the sorting for the dates.
        //Array for the order.
        Date[] DpOr = new Date[ComputerLabReservationSystemGUI.Bookings.size()];
        //Assigns the correlating vals. to the compare array.
        for(int i = 0; i < ComputerLabReservationSystemGUI.Bookings.size(); i++){
            DpOr[i] = ComputerLabReservationSystemGUI.Bookings.get(i).Date;
        //Lists all upcoming events.
        }
              
        int numItems = ComputerLabReservationSystemGUI.Bookings.size();
        int bottom = numItems - 1;
        boolean sw = true;
        //Do while swap "sw" is true.
        while(sw == true){
            sw = false;
            for(int a = 0; a <= bottom; a++){
                if(a+1 >= ComputerLabReservationSystemGUI.Bookings.size()){
                    //Do Nothing (Prevents a lookup request ouside 
                    //the array boundries).
                }else{
                    if(DpOr[a].compareTo(DpOr[a+1]) < 0){
                        //IF a is is before a+1, swap positions.
                    }else{
                        //IF a is is before a+1, swap positions.
                        Date tmpSwap1 = DpOr[a];
                        Date tmpSwap2 = DpOr[a+1];
                        DpOr[a] = tmpSwap2;
                        DpOr[a+1] = tmpSwap1;   
                        sw = true;
                    }
                }
            }
        }
        
        //New order list.
        for(int b = 0; b < DpOr.length; b++){
            DisplayOrder[b] = DpOr[b];
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutputArea = new javax.swing.JTextArea();
        cmdDelete = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmdLogin = new javax.swing.JButton();
        cmdAdminPass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdClose.setText("Close");
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        txtOutputArea.setEditable(false);
        txtOutputArea.setColumns(20);
        txtOutputArea.setRows(5);
        jScrollPane1.setViewportView(txtOutputArea);

        cmdDelete.setText("Delete");
        cmdDelete.setEnabled(false);
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservation System Administration");

        cmdLogin.setText("Login");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        cmdAdminPass.setText("Change Admin Password");
        cmdAdminPass.setEnabled(false);
        cmdAdminPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdminPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdAdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtLogin))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmdLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdAdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmdClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        //Closes this window.
        this.dispose();
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        
        //Checks the password validity.
        boolean allow = false;
        String password = txtLogin.getText().trim();
        allow = Login(password);
        //Either allows or denys the user based on password validity.
        if(allow == true){
            cmdDelete.setEnabled(true);
            cmdLogin.setEnabled(false);
            cmdAdminPass.setEnabled(true);
            txtLogin.setText("");
            txtOutputArea.setText("Welcome!" + "\n");
            List();
        }else{
            txtOutputArea.setText("ERROR! Password is incorrect.");
        }
        
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        //Handels deleation of users.
        boolean remove = false;
        String password = txtLogin.getText().trim();
        //Checks to see if there is a corresponding user with the entered password.
        //If the user exisits, remove them.
        for(int i = 0; i < ComputerLabReservationSystemGUI.Bookings.size(); i++){   
            if(password.equals(ComputerLabReservationSystemGUI.Bookings.get(i).Pass)){
                txtOutputArea.setText("User " + ComputerLabReservationSystemGUI.Bookings.get(i).Name + " was removed " 
                        + "@ " + ComputerLabReservationSystemGUI.Bookings.get(i).Date + "\n" + "\n");
                ComputerLabReservationSystemGUI.Bookings.remove(i);
                System.out.println("Array Updated: User @ " + (i+1) +" was removed.");
                remove = true;
            }
        }  
        //Notify the user if no user was removed.
        if(remove == false){
            txtOutputArea.setText("No user has been removed. Please check the password.");
        }
        //List the results.
        List();
    }//GEN-LAST:event_cmdDeleteActionPerformed
   
    private void cmdAdminPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdminPassActionPerformed
        //Handels the modification of the main administration password.
        txtLogin.grabFocus();
        //Based on a step counter system.
        //Changes the password if the text box isn't blank.
        if(changePass == 2){ 
            if(txtLogin.getText() == ""){
                //Returns if the text box is blank.
                txtOutputArea.setText("You cannot have a empty password!");
                changePass = 0;
                return;
            }   
            //Changes the old password to the new one, and displays the result,
            //then resets and re-lists the Users.
            String oldPass = ComputerLabReservationSystemGUI.AdminPass;
            String password = txtLogin.getText().trim();
            ComputerLabReservationSystemGUI.AdminPass = password;
            txtOutputArea.setText("");
            List();           
            String temp = txtOutputArea.getText();
                temp += "-----------------------------------------------------------------------------" +
                "\n" + "The the old Administration password, '" + oldPass + "', was change to '" + password + "'.";
            txtOutputArea.setText(temp);
            txtLogin.setText("");
            txtLogin.grabFocus();
            changePass = 5;
        }        
        if(changePass == 1){
            //Checks to see if the old admin password matches the one entered.
            boolean allow = false;
            String password = txtLogin.getText().trim();
            allow = Login(password);            
            txtLogin.setText("");
            txtLogin.grabFocus();
            //If the admin password is correct, it prompts the user for a new admin password.
            if(allow == true){
                txtOutputArea.setText("Please enter a new Administration password in the text box above.");
                changePass++;
            }else{
                //Resets the form with no changes made and displays an error.
                List();
                String temp = txtOutputArea.getText();
                temp += "-----------------------------------------------------------------------------" +
                "\n" + "The the old Administration password is incorrecet. Please try again.";
                txtOutputArea.setText(temp);
                txtLogin.grabFocus();
                changePass = 5;
            }   
        }
        //Prompts the user for the admin old password.
        if(changePass == 0){
            txtOutputArea.setText("Please enter the current Administration password in the text box above.");
            changePass++;
            cmdDelete.setEnabled(false);
            cmdLogin.setEnabled(false);
        }
        //Resets if no changes are made.
        if(changePass == 5){
            changePass = 0;
            cmdDelete.setEnabled(true);
            cmdLogin.setEnabled(true);
        }
    }//GEN-LAST:event_cmdAdminPassActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdminPass;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextArea txtOutputArea;
    // End of variables declaration//GEN-END:variables
}
