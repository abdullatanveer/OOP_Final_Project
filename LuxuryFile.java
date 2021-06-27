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
public class LuxuryFile {
    public static void writeToFile (LuxuryBus s)
    {
        ObjectOutputStream outputStream = null;

		try {
                   // Read old objects
			ArrayList<LuxuryBus> LuxuryList = readAllData();
			// Append new object into existing list
			LuxuryList.add(s);
			// Open Stream for writing
	outputStream = new ObjectOutputStream(new FileOutputStream("LuxuryList.ser"));
			
			// Write all objects (old and new one) into the file
			for(int i = 0 ; i < LuxuryList.size() ; i++) {
				outputStream.writeObject(LuxuryList.get(i));
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
	public static ArrayList <LuxuryBus>  readAllData ()
    {
		//  ArrayList initialized with size 0
		ArrayList<LuxuryBus> LuxuryList = new ArrayList<LuxuryBus>(0);
		// Input stream
		ObjectInputStream inputStream = null;
		try
		{
			// open file for reading
			inputStream = new ObjectInputStream(new FileInputStream("LuxuryList.ser"));
			// End Of File flag
			boolean EOF = false;
			// Keep reading file until file ends
			while(!EOF) {
				try {
					// read object and type cast into CarDetails object
					LuxuryBus myObj = (LuxuryBus) inputStream.readObject();
					// add object into ArrayList
					LuxuryList.add(myObj);
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
					if(inputStream != null) {
                                            inputStream.close( );
                                        }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("IO Exception while closing file");
				}
			}
	               
			// returns ArrayList
			return LuxuryList;
		}


//function for searching bus by its number
public static boolean search (String No)
{
    ArrayList<LuxuryBus> Luxurylist = readAllData();
    
    boolean found = false;
    
    for( int i=0; i< Luxurylist.size();i++)
    {
      
        if (Luxurylist.get(i).getBus_Number()==No)
          
        {
            
            found = true;
       
            break;
        }
    }
    return found; 
}
//function for updating bus number
public static void UpdateBus(String Old_Number,String  New_Number) {
    ArrayList<LuxuryBus> Luxurylist = readAllData();
    for(int i=0;i<Luxurylist.size();i++) {
    	if(Luxurylist.get(i).getBus_Number().equals(Old_Number)) {
    		Luxurylist.get(i).setBus_Number(New_Number);
            break;
        }
    
        
    
    
}

ObjectOutputStream outputStream = null;


try {
	outputStream = new ObjectOutputStream(new FileOutputStream("LuxuryList.ser"));

	// Write all objects (old and new one) into the file
	for(int i = 0 ; i < Luxurylist.size() ; i++) {
		outputStream.writeObject(Luxurylist.get(i));
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
    ArrayList<LuxuryBus> Luxurylist = readAllData();
    //int index=0;
    for(int i=0;i<Luxurylist.size();i++) {
    	if(Luxurylist.get(i).getBus_Number().equals(Bus_No)) {
            int index=i;
            Luxurylist.remove(index);    
            System.out.println("\nIndex:"+index);
        }
    //list.remove(index);    
    //System.out.println("\nIndex:"+index);
        
    }
    
    ObjectOutputStream outputStream = null;


    try {
outputStream = new ObjectOutputStream(new FileOutputStream("LuxuryList.ser"));
        
        // Write all objects (old and new one) into the file
        for(int i = 0 ; i < Luxurylist.size() ; i++) {
            outputStream.writeObject(Luxurylist.get(i));
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




    
}
