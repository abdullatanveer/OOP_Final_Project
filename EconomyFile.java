/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Princess Anayah K
 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EconomyFile {
    public static void writeToFile (Bus s)
    {
        ObjectOutputStream outputStream = null;

		try {
                   // Read old objects
			ArrayList<Bus> EconomyList = readAllData();
			// Append new object into existing list
			EconomyList.add(s);
			// Open Stream for writing
	outputStream = new ObjectOutputStream(new FileOutputStream("EconomyList.ser"));
			
			// Write all objects (old and new one) into the file
			for(int i = 0 ; i < EconomyList.size() ; i++) {
				outputStream.writeObject(EconomyList.get(i));
			}
		} catch(IOException e) {
			System.out.println("IO Exception while opening file");
		} finally { // cleanup code which closes output stream if its object was created
			try {
				if(outputStream != null) {
					outputStream.close();								
				}

			} catch (IOException e) {
				System.out.println("IO Exception while closing file");
			}
		}		
	}
	public static ArrayList <Bus>  readAllData ()
    {
		//  ArrayList initialized with size 0
		ArrayList<Bus> EconomyList = new ArrayList<Bus>(0);
		// Input stream
		ObjectInputStream inputStream = null;
		try
		{
			// open file for reading
			inputStream = new ObjectInputStream(new FileInputStream("EconomyList.ser"));
			// End Of File flag
			boolean EOF = false;
			// Keep reading file until file ends
			while(!EOF) {
				try {
					// read object and type cast into CarDetails object
					Bus myObj = (Bus) inputStream.readObject();
					// add object into ArrayList
					EconomyList.add(myObj);
					//System.out.println("Read: " + myObj.getName());
				} catch (ClassNotFoundException e) {
					//System.out.println("Class not found");
				} catch (EOFException end) {
					// EOFException is raised when file ends
					// set End Of File flag to true so that loop exits
					EOF = true;
}
    }
}
		 catch(FileNotFoundException e) {
				//System.out.println("Cannot find file");
			} catch (IOException e) {
				//System.out.println("IO Exception while opening stream");
				//e.printStackTrace();
			} finally { // cleanup code to close stream if it was opened
				try {
					if(inputStream != null)
						inputStream.close( );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("IO Exception while closing file");
				}
			}
	               
			// returns ArrayList
			return EconomyList;
		}


//function for searching bus by its number
public static boolean search (String No)
{
    ArrayList<Bus> list = readAllData();
    
    boolean found = false;
    
    for( int i=0; i< list.size();i++)
    {
      
        if (list.get(i).getBus_Number()==No)
          
        {
            
            found = true;
       
            break;
        }
    }
    return found; 
}
//function for updating bus number
public static void UpdateBus(String Old_Number,String  New_Number) {
    ArrayList<Bus> Economylist = readAllData();
    for(int i=0;i<Economylist.size();i++) {
    	if(Economylist.get(i).getBus_Number().equals(Old_Number)) {
        	Economylist.get(i).setBus_Number(New_Number);
            break;
        }
    
        
    
    
}

ObjectOutputStream outputStream = null;


try {
	outputStream = new ObjectOutputStream(new FileOutputStream("EconomyList.ser"));

	// Write all objects (old and new one) into the file
	for(int i = 0 ; i < Economylist.size() ; i++) {
		outputStream.writeObject(Economylist.get(i));
}
} catch(IOException e) {
	System.out.println("IO Exception while opening file");
} finally { // cleanup code which closes output stream if its object was created
try {
	if(outputStream != null) {
		outputStream.close();								
	}

} catch (IOException e) {
	System.out.println("IO Exception while closing file");

}		
}
}
public static void deleteBus(String Bus_No) {
    ArrayList<Bus> Economylist = readAllData();
    //int index=0;
    for(int i=0;i<Economylist.size();i++) {
    	if(Economylist.get(i).getBus_Number().equals(Bus_No)) {
            int index=i;
            Economylist.remove(index);    
            System.out.println("\nIndex:"+index);
        }
    //list.remove(index);    
    //System.out.println("\nIndex:"+index);
        
    }
    
    ObjectOutputStream outputStream = null;


    try {
outputStream = new ObjectOutputStream(new FileOutputStream("EconomyList.ser"));
        
        // Write all objects (old and new one) into the file
        for(int i = 0 ; i < Economylist.size() ; i++) {
            outputStream.writeObject(Economylist.get(i));
        }
    } catch(IOException e) {
        System.out.println("IO Exception while opening file");
    } finally { // cleanup code which closes output stream if its object was created
        try {
            if(outputStream != null) {
                outputStream.close();                                
            }


        } catch (IOException e) {
            System.out.println("IO Exception while closing file");
        }
    }        
}
//public static void add(Bus b) {
//	// TODO Auto-generated method stub

	
    
}
