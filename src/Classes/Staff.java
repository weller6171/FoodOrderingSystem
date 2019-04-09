package Classes;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Classes.Order;

public class Staff {
	private int userID;
	private String username;
	private String password;
	private String name;
	private String address;
	private int hp;
	private String position;
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

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
	
	
	public boolean deliverOrder(int order_ID,String staffUsername)
	{
		// TODO Auto-generated method stub
		ArrayList<String> orderTextForm = new ArrayList<String>();
		orderTextForm.clear();
		try 
		{
			Scanner x = new Scanner(new File("OrderList.txt"));
			while(x.hasNext())
			{
				orderTextForm.add(x.nextLine());
			}
			x.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"OrderList.txt not found");
		}
		for(int i=0;i<orderTextForm.size();i++)
		{
			String[] tempData = orderTextForm.get(i).split(" ");
			if(Integer.parseInt(tempData[0]) == order_ID)
			{
				tempData[5] = staffUsername;
				tempData[6] = "Completed";
				orderTextForm.set(i, tempData[0]+" "+tempData[1]+" "+tempData[2]+" "+tempData[3]+" "+tempData[4]+" "+tempData[5]+" "+tempData[6]+" "+tempData[7]+" "+tempData[8]);
			}
		}
		
		try {
			FileWriter writer1= new FileWriter("OrderList.txt");
			PrintWriter pw = new PrintWriter(writer1);
			pw.write("");
			for(int i=0;i<orderTextForm.size();i++)
			{
				pw.append(orderTextForm.get(i)       +"\n");
			}
			pw.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	}

