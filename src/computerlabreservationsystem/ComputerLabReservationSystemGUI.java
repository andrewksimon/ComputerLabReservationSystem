//This program is called "ComputerLabReservationSystemGUI".
//The purpose of this program is to provide a system in which computer labs may be reserverd.
//This program was made by Andrew Simon
//This program was made on 01/12/2013.
//This program was last edited on 02/01/2014.

//This form is the Main form for the program.

package computerlabreservationsystem;

//Imports various bits and bobs for the program.
//Mainly here for the calander stuff.
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComputerLabReservationSystemGUI extends javax.swing.JFrame {
  
    public static ArrayList <Reserve> Bookings = new ArrayList();
    //Stores the administration password.
    public static String AdminPass;
    
    Date[] DisplayOrder;

    public ComputerLabReservationSystemGUI() {
        initComponents();
        //Runs on startup.
        OnStartup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new java.awt.Label();
        txtOutputArea = new java.awt.TextArea();
        cmdAdmin = new javax.swing.JButton();
        cmdAdd = new javax.swing.JButton();
        cmdEdit = new javax.swing.JButton();
        cmdList = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jDateMain = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        lblTitle.setAlignment(java.awt.Label.CENTER);
        lblTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitle.setText("Computer Lab Reservation System");

        txtOutputArea.setEditable(false);

        cmdAdmin.setText("Administration");
        cmdAdmin.setToolTipText("");
        cmdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdminActionPerformed(evt);
            }
        });

        cmdAdd.setText("Add New Reservation");
        cmdAdd.setToolTipText("");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdEdit.setText("Edit/Modify Reservation");
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdList.setText("List Reservations");
        cmdList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdListActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        jDateMain.setDateFormatString("d/MMM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOutputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(cmdAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdList, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOutputArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Does when the window first opens, or when the program first runs.
    public void OnStartup(){
        //Opens the save file.
        ReadWriteIO.ReadIn();
        //Define the sort array.
        DisplayOrder = new Date[Bookings.size()];
        //List the users.
        List(); 
    }  
    //Subprocedure for exit command.
    public void OnExit(){
        
        //Trys to save the file.
        try {
            ReadWriteIO.WriteOut();
        } catch (IOException ex) {
            Logger.getLogger(ComputerLabReservationSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //When the Exit is selected.
    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        //Run sub. on exit.
        OnExit();
        //Ends the program.
        System.exit(1);
    }//GEN-LAST:event_cmdExitActionPerformed
    //When the Add Reservation button is selected.
    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        //Opens up the AddGUI window.
        AddGUI wndAdd = new AddGUI();
        wndAdd.setVisible(true); 
    }//GEN-LAST:event_cmdAddActionPerformed
    //When the Edit Reservation button is selected is selected.
    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        //Opens up the AddGUI window.
        EditGUI wndEdit = new EditGUI();
        wndEdit.setVisible(true);
    }//GEN-LAST:event_cmdEditActionPerformed
    //Lists the upcoming events.    
    public void List(){
        //Cleans up old events.
        DisplayOrder = new Date[Bookings.size()];
        CleanUp();
        Sort();
        //Gets the date.
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        Date date = new Date();
        String todayDate = dateFormat.format(date);
        jDateMain.setDate(date);
        //Temporary holding string.
        String temp = txtOutputArea.getText();;
        //Print the sample list. 
        temp += "Reservation List:" + "\n" + "\n";
        temp += "Date:" + "\t" + "\t" + "\t" +"Name:" + "\t" + "\t" + "Room:" + "\t" + "\t" + "Period:" + "\n" + "\n";
        //Sorts the Date Array.
        Sort();
        //Prints out the User Array based on the order of the Date Array.
        for(int x = 0; x <= DisplayOrder.length-1; x++){     
            Date tmpDt1 = DisplayOrder[x];   
            for(int i = 0; i <= Bookings.size()-1; i++){          
                Date tmpDt2 = Bookings.get(i).Date;
                if(tmpDt1 == tmpDt2){
                    temp += 
                    dateFormat.format(Bookings.get(i).Date) + "\t" + "\t"
                    + Bookings.get(i).Name + "\t" + "\t"
                    + Bookings.get(i).Room + "\t" + "\t"
                    + Bookings.get(i).Period + "\t" + "\t";
                    temp += "\n"; 
                }                                    
            } 
        }
        //Prints out the results.
        txtOutputArea.setText(temp);
    }
    //Sorts the objects in order of date.
    public void Sort(){ 
        //Array for the order.
        Date[] DpOr = new Date[Bookings.size()];
        //Assigns the correlating vals. to the compare array.
        for(int i = 0; i < Bookings.size(); i++){
            DpOr[i] = Bookings.get(i).Date;
        //Lists all upcoming events.
        }      
        int numItems = Bookings.size();
        int bottom = numItems - 1;
        boolean sw = true; 
        while(sw == true){   
            sw = false;
            for(int a = 0; a <= bottom; a++){
                if(a+1 >= Bookings.size()){
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
    //Cleans up all older/expired entries.
    public void CleanUp(){
        //Defines todays date, and a counter that counts removed events.
        Date todayDate = new Date();   
        int removed = 0;
        //Compares all dates in the Array to todays date.
        for(int i = 0; i <= Bookings.size()-1; i++){          
            if(Bookings.get(i).Date.compareTo(todayDate) < 0){
                //If the date is in the past, remove the whole entry.
                Bookings.remove(i);
                //Add one to the counter.
                removed ++;
            }
        }
        if(removed > 0){
            String temp = txtOutputArea.getText();
            //Display to the user that an event has been removed.
            txtOutputArea.setText(temp + "\n" +  removed + " old booking(s) from the past was removed." + "\n");
        }
 
    }
    //List button.
    private void cmdListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdListActionPerformed
        //Lists all the upcoming events.
        txtOutputArea.setText("");
        List();           
    }//GEN-LAST:event_cmdListActionPerformed
    //Admin button.
    private void cmdAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdminActionPerformed
        //Opens up the AdminGUI window.
        AdminGUI wndAdmin = new AdminGUI();
        wndAdmin.setVisible(true);        
    }//GEN-LAST:event_cmdAdminActionPerformed

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
            java.util.logging.Logger.getLogger(ComputerLabReservationSystemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComputerLabReservationSystemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComputerLabReservationSystemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComputerLabReservationSystemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComputerLabReservationSystemGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdAdmin;
    private javax.swing.JButton cmdEdit;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdList;
    private com.toedter.calendar.JDateChooser jDateMain;
    private java.awt.Label lblTitle;
    private java.awt.TextArea txtOutputArea;
    // End of variables declaration//GEN-END:variables
}
