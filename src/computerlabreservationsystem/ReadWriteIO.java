//This program is called "ComputerLabReservationSystemGUI".
//The purpose of this program is to provide a system in which computer labs may be reserverd.
//This program was made by Andrew Simon
//This program was made on 01/12/2013.
//This program was last edited on 02/01/2014.

//This class handels the reading and writing to a save file.

package computerlabreservationsystem;

//Write Imports
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
//Read Imports
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReadWriteIO {
 
    public static void WriteOut() throws FileNotFoundException, IOException{
        //Defines the save file as "save.txt". 
        File SavedInfo = new File ("save.txt");
        BufferedWriter SaveFile = null;
        //Try-Catch for save file.
        try{
            SaveFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(SavedInfo)));
        }catch(Exception e){
            //File not found.
        }
        //Loops the information throught the buffered writer and writes it to the text file.
        for(int i = 0; i < ComputerLabReservationSystemGUI.Bookings.size(); i++){
            String temp = 
            "*" + ComputerLabReservationSystemGUI.Bookings.get(i).Name +
            "*" + ComputerLabReservationSystemGUI.Bookings.get(i).Pass +
            "*" + ComputerLabReservationSystemGUI.Bookings.get(i).Room +
            "*" + ComputerLabReservationSystemGUI.Bookings.get(i).Date +                                                
            "*" + ComputerLabReservationSystemGUI.Bookings.get(i).Period + 
            "*" + ComputerLabReservationSystemGUI.Bookings.get(i).iRoom +         
            "*" + ComputerLabReservationSystemGUI.Bookings.get(i).iPeriod + "*";      
            //Write temp string.        
            SaveFile.write(temp);
            //Define new line.
            SaveFile.newLine();
        }
        //Write end and the admin password after all the information is written.
        String tempEnd = "END";
        SaveFile.write(tempEnd);
        SaveFile.newLine();
        String tempPass = ComputerLabReservationSystemGUI.AdminPass;
        SaveFile.write(tempPass);
        //Ends the stream.
        SaveFile.close();
    }
    
    public static void ReadIn(){
        //Reads the save file into the program.
        //Try to open up the 'save.txt' file.
        try {            
            FileInputStream SaveFile = new FileInputStream("save.txt");
            BufferedReader InputReader = new BufferedReader(new InputStreamReader(SaveFile));
            //Gets the first line of info.
            boolean run = true;
            //Levels: 
            //level = 0 (Reading user info).
            //level = 1 (Reading admin password).
            //Keep looping while run is true.
            int level = 0;
            while(run == true){ 
                String Line = InputReader.readLine();   
                if(level == 0){          
                    if(Line.equals("END")){
                        level++;
                    }else{
                        Intrepret(Line);
                    }
                }else if(level == 1){
                    //Reads the last item (the admin password):
                    ComputerLabReservationSystemGUI.AdminPass = Line;
                    level++;
                    run = false; 
                }  
            }
            //Close the reader.
            InputReader.close();         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadWriteIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadWriteIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Intrepret(String Line){
        //De-cpypers the information that is read in.
        //Defines some temporary storage.
        String sName = "", sPass = "", Room = "", sDate = "", Period = "", tmpIS_Room = "", tmpIS_Period = "";
        int iRoom = 0, iPeriod = 0;
        //Defines type of char, and a temporary char.
        char tempChar;
        int type = 0;
        //1 = Name, 2 = Pass, 3 = Room, 4 = Date, 5 = Period.
        tempChar = Line.charAt(0);
        for(int i = 0; i < Line.length() - 1; i++){
            //Re-routes information to diffrent types based on escape key.
            tempChar = Line.charAt(i);
            //Open the info stream.
            if(tempChar == '*'){
                type ++;
                i++;
                tempChar = Line.charAt(i);
            }
            //Sends the chars. to the cooresponding place.
            if(type == 1){
                sName += tempChar;
            }else if(type == 2){
                sPass += tempChar;
            }else if(type == 3){
                Room += tempChar;
            }else if(type == 4){
                sDate += tempChar;
            }else if(type == 5){
                Period += tempChar;
            }else if(type == 6){
                tmpIS_Room += tempChar;
            }else if(type == 7){
                tmpIS_Period += tempChar;
            }
        }
        //Send info to Array.
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            Date dDate = null;
        try {
            dDate = sdf.parse(sDate);
        } catch (ParseException ex) {
            Logger.getLogger(ReadWriteIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //tmpIS (temporary Integer that is in String form).
        iRoom = Integer.parseInt(tmpIS_Room);
        iPeriod = Integer.parseInt(tmpIS_Period);       
        //Makes the new user.
        Reserve newUser = new Reserve(sName, sPass, Room, dDate, Period, iRoom, iPeriod);
        ComputerLabReservationSystemGUI.Bookings.add(newUser);
    }
    
}