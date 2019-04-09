package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Customer {
	private int userID;
	private String username;
	private String password;
	private String name;
	private String address;
	private int hp;
	private String position;
	
	public Boolean Login(String username, String password, String position)
	{
		Boolean result=false;
		try 
		{
			Scanner x = new Scanner(new File("UserAcc.txt"));
			while(x.hasNext() && !result)
			{
				x.next();								//USERID
				String temp = x.next();					//username
				String temp2= x.next();					//password
				String temp3= x.next();					//position
				System.out.println(temp);
				System.out.println(temp2);
				System.out.println(temp3);
				x.nextLine();
				if(temp.equals(username))
				{
					if(temp2.equals(password) && temp3.equals(position))
					{
						JOptionPane.showMessageDialog(null, "Login Success\nWelcome ! "+username);
						result=true;
					}
				}
			}
				return result;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"UserAcc.txt not found");
			return false;
		}
	}


	public boolean Register(String username, String password,  String name, String address, String hp) 
	{
		String digits[] = {"0","1","2","3","4","5","6","7","8","9"};
		Boolean result=true;
		int userID=0;
		String id="0";
		/*Checking if blank field found*/
		if(username.equals("") || password.equals("") ||name.equals("") || hp.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Please fill in your username, password, name and phone number");
			return false;
		}
		/*Checking Password lenghth and spaces*/
		else if(password.length()<8 )
		{
			JOptionPane.showMessageDialog(null,"Password should be at least 8 characters.");
			return false;
		}
		else if(password.length()>8)
		{
			if(password.contains(" "))
			{
				JOptionPane.showMessageDialog(null,"Password should not contain space (' ')");
				return false;
			}
		}
		/*Checking username spaces*/
		else if(username.contains(" "))
		{
			JOptionPane.showMessageDialog(null,"Username should not contain space (' ')");
			return false;
		}
		/*Checking hp spaces and length and involvement of any alphabet*/
		else if(hp.length()>11 && hp.length()<10)
		{
			JOptionPane.showMessageDialog(null,"Please fill in a valid handphone number");
			return false;
		}
		else if(hp.length()<=11 && hp.length()>=10)
		{
			for(int i=0;i<hp.length();i++)
			{
				if(hp.charAt(i)=='0' ||hp.charAt(i)=='1' ||hp.charAt(i)=='2' ||hp.charAt(i)=='3' ||hp.charAt(i)=='4' 
				                     ||hp.charAt(i)=='8' ||hp.charAt(i)=='7' ||hp.charAt(i)=='6' ||hp.charAt(i)=='5' ||hp.charAt(i)=='9')
				{
					continue;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please fill in a valid handphone number");
					return false;
				}
				
			}
		}
		/*	Checking username Redundant			*/
		String temp=null, temp3=null;
		try 
		{
			Scanner x = new Scanner(new File("UserAcc.txt"));
			while(x.hasNext() && temp!=username)
			{
				id=x.next();						//USERID
				temp = x.next();					//username
				x.next();
				temp3=x.next();						//position
				x.nextLine();
				if(temp.equals(username) || username==null)
				{
						JOptionPane.showMessageDialog(null, "username had existed");
						return false;
				}
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"UserAcc.txt not found");
			return result;
		}
		
		
		
		/* Replacing space with '_' to prevent reading error 
		 * Preparing variables for recording into file
		 */
		userID = Integer.valueOf(id);
		userID++;
		//username
		//password
		String position = "Customer";
		name=name.replace(' ', '_');
		address=address.replace(' ','_');
		
		/*Checking into text file exist or not*/
		try {
 		   File file2 = new File("UserAcc.txt"); 
 		   if (file2.createNewFile()) 
 		   {
 			 System.out.println("Filecreated.");
 		   }
 		   else 
 		   {
 	        System.out.println("File already exists.");
 	       }
 	       } 
 	   catch (IOException e) 
 	   	  {
 		   System.out.println("An error occurred.");
 		   e.printStackTrace();
 	      }
		
		/*Writing user details into the text file*/
		try {
			FileWriter writer1= new FileWriter("UserAcc.txt",true);
			PrintWriter pw = new PrintWriter(writer1);
			pw.append(Integer.toString(userID)   +" ");
			pw.append(username +" ");
			pw.append(password +" ");
			pw.append(position +" ");
			pw.append(name     +" ");
			pw.append(address  +" ");
			pw.append(hp       +"\n");
			pw.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		/*END of Writing to text file*/
	}
	
	public Boolean placeOrder(Order order)     //When Confirm order is pressed
	{
		//Checking Txt file existence
		try {
	 		   File file2 = new File("OrderList.txt"); 
	 		   if (file2.createNewFile()) 
	 		   {
	 			 System.out.println("Filecreated.");
	 		   }
	 		   else 
	 		   {
	 	        System.out.println("File already exists.");
	 	       }
	 	       } 
	 	   catch (IOException e) 
	 	   	  {
	 		   System.out.println("An error occurred.");
	 		   e.printStackTrace();
	 	      }
			
		int tempId=0;
		/*Preparing variable for writing into text file*/
		//Preparing value for orderID
		try 
		{
			Scanner x = new Scanner(new File("OrderList.txt"));
			while(x.hasNext())
			{
				tempId=Integer.parseInt(x.next());						//orderID
				x.nextLine();
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"OrderList.txt not found");
			return false;
		}
		order.setOrder_ID(++tempId);			// ID, username, Date, address, payMethod,Status, ItemName , Quantity Sum
		//order.getUsername();
		//order.getDateOrdered();
		String tempAddress=order.getDeliverAddress().replace(" ", "_");
		//order.getPayMethod();
		order.setStatus("ProcessingOrder");
		String tempOrders="";
		for(int i=0;i<order.getItemList().size();i++)
		{
			if(!(tempOrders==""))
			{
				tempOrders=tempOrders+"-";
			}
			tempOrders=tempOrders+order.getItemList().get(i).getItem_Name().replace(" ", "_")+"-"+order.getQuantityList().get(i);
		}
		//order.getSum();
		//Finish preparation
		/*Writing orders into the text file*/
		try {
			FileWriter writer1= new FileWriter("OrderList.txt",true);
			PrintWriter pw = new PrintWriter(writer1);
			pw.append(order.getOrder_ID()         +" ");
			pw.append(order.getCustomerUsername() +" ");
			pw.append(order.getDateOrdered()      +" ");
			pw.append(tempAddress                 +" ");
			pw.append(order.getPayMethod()        +" ");
			pw.append(order.getStaffUsername()    +" ");
			pw.append(order.getStatus()           +" ");
			pw.append(tempOrders                  +" ");
			pw.append(order.getSum()              +"\n");
			pw.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		/*END of Writing to text file*/
	
	}
}
