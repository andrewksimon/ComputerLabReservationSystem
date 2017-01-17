//This program is called "ComputerLabReservationSystemGUI".
//The purpose of this program is to provide a system in which computer labs may be reserverd.
//This program was made by Andrew Simon
//This program was made on 01/12/2013.
//This program was last edited on 02/01/2014.

//This class handels the reservation creations.


package computerlabreservationsystem;

import java.util.Date;

public class Reserve {
    
        //Defines some temporary variables.
        Date Date;
        String Name, Pass, Room, Period;
        int iRoom, iPeriod;
        
        //The method "Reserve" is a constructor to create User objects.
        public Reserve(String _Name, String _Pass, String _Room, Date _Date, String _Period, int _iRoom, int _iPeriod){
            Name = _Name;
            Pass = _Pass;
            Room = _Room;
            Date = _Date;
            Period = _Period;  
            iRoom = _iRoom;
            iPeriod = _iPeriod;
        }
}

