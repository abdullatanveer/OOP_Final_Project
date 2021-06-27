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

public class CustomerFile {
    public static void writeToFile (Customer s)
    {
        ObjectOutputStream outputStream = null;

		try {
                   // Read old objects
			ArrayList<Customer> CustomerList = readAllData();
			// Append new object into existing list
			CustomerList.add(s);
			// Open Stream for writing
	outputStream = new ObjectOutputStream(new FileOutputStream("CustomerList.ser"));
			
			// Write all objects (old and new one) into the file
			for(int i = 0 ; i < CustomerList.size() ; i++) {
				outputStream.writeObject(CustomerList.get(i));
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
	public static ArrayList <Customer>  readAllData ()
    {
		//  ArrayList initialized with size 0
		ArrayList<Customer> CustomerList = new ArrayList<Customer>(0);
		// Input stream
		ObjectInputStream inputStream = null;
		try
		{
			// open file for reading
			inputStream = new ObjectInputStream(new FileInputStream("CustomerList.ser"));
			// End Of File flag
			boolean EOF = false;
			// Keep reading file until file ends
			while(!EOF) {
				try {
					// read object and type cast into CarDetails object
					Customer myObj = (Customer) inputStream.readObject();
					// add object into ArrayList
					CustomerList.add(myObj);
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
			return CustomerList;
		}


//function for searching customer by its name
	public static String search (String No)
	{
	    ArrayList<Customer> list = readAllData();
	    
	    boolean found = false;
	    
	    for( int i=0; i< list.size();i++)
	    {
	      
	        if (list.get(i).getName()==No)
	          
	        {
	            
	            found = true;
	       
	            break;
	        }
	    }
	    return "Customer is present in the list"; 
	}

//function for updating customer email
public static void UpdateContact(String Old_mail,String  New_mail) {
    ArrayList<Customer> Customerlist = readAllData();
    for(int i=0;i<Customerlist.size();i++) {
    	if(Customerlist.get(i).getEmail().equals(Old_mail)) {
    		Customerlist.get(i).setEmail(New_mail);
            break;
        }
    
        
    
    
}

ObjectOutputStream outputStream = null;


try {
	outputStream = new ObjectOutputStream(new FileOutputStream("CustomerList.ser"));

	// Write all objects (old and new one) into the file
	for(int i = 0 ; i < Customerlist.size() ; i++) {
		outputStream.writeObject(Customerlist.get(i));
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
public static void deleteCustomer(String Name) {
    ArrayList<Customer> Customerlist = readAllData();
    //int index=0;
    for(int i=0;i<Customerlist.size();i++) {
    	if(Customerlist.get(i).getName().equals(Name)) {
            int index=i;
            Customerlist.remove(index);    
            System.out.println("\nIndex:"+index);
        }
    //list.remove(index);    
    //System.out.println("\nIndex:"+index);
        
    }
    
    ObjectOutputStream outputStream = null;


    try {
outputStream = new ObjectOutputStream(new FileOutputStream("CustomerList.ser"));
        
        // Write all objects (old and new one) into the file
        for(int i = 0 ; i < Customerlist.size() ; i++) {
            outputStream.writeObject(Customerlist.get(i));
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
