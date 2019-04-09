/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Classes.Admin;
import Classes.Customer;
import Classes.Item;
import Classes.Order;
import Classes.Staff;

/**
 *
 * @author weller
 */
public class AllOrderInterface extends javax.swing.JFrame {

    public AllOrderInterface() {
        initComponents();
        cat1.setSelected(true);
        cat1ActionPerformed(null);
        jPanel1.setVisible(false);
        position.setText(null);
    }
public AllOrderInterface(String username, String position)
{
    initComponents();
    jPanel2.setVisible(false);
    name.setText(username);
    cat1.setSelected(true);
    cat1ActionPerformed(null);
   this.position.setText(position);
   if(position.equals(("Staff")))
   {
	   cat1.setSelected(false);
	   cat3.setSelected(true);
       cat3ActionPerformed(null);
	   cat1.setVisible(false);
	   cat2.setVisible(false);
	   cat4.setVisible(false);
   }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        menuCat = new javax.swing.JLabel();
        cat1 = new javax.swing.JRadioButton();
        cat2 = new javax.swing.JRadioButton();
        cat3 = new javax.swing.JRadioButton();
        cat4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        position = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 650));
        setMinimumSize(new java.awt.Dimension(900, 650));
        setPreferredSize(new java.awt.Dimension(900, 650));
        setResizable(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/MCDEliverynew.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 0, 410, 148);

        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("LOGIN ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 10, 50, 17);

        jLabel9.setText("Username : ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 50, 60, 14);

        jLabel10.setText("Password :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 80, 60, 14);
        jPanel2.add(username);
        username.setBounds(80, 50, 80, 20);

        password.setText("     ");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel2.add(password);
        password.setBounds(80, 80, 80, 20);

        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login);
        login.setBounds(40, 110, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("No Account Yet? Register");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 150, 140, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 20, 180, 180);

        jPanel1.setLayout(null);

        jLabel6.setText("Welcome  ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 10, 60, 14);

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(50, 130, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/User.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 30, 90, 60);
        jPanel1.add(name);
        name.setBounds(10, 100, 160, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 180, 170);

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "username", "Total", "Days Received", "Status", "To be Delivered"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrderTable);
        if (OrderTable.getColumnModel().getColumnCount() > 0) {
            OrderTable.getColumnModel().getColumn(1).setResizable(true);
            OrderTable.getColumnModel().getColumn(2).setResizable(true);
            OrderTable.getColumnModel().getColumn(3).setResizable(true);
            OrderTable.getColumnModel().getColumn(4).setResizable(true);
            OrderTable.getColumnModel().getColumn(5).setResizable(true);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 180, 600, 410);

        menuCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuCat.setText("ORDERS RECORD");
        getContentPane().add(menuCat);
        menuCat.setBounds(430, 150, 229, 24);

        cat1.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(cat1);
        cat1.setForeground(new java.awt.Color(255, 255, 0));
        cat1.setText("All Orders");
        cat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat1ActionPerformed(evt);
            }
        });
        getContentPane().add(cat1);
        cat1.setBounds(20, 300, 170, 23);

        cat2.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(cat2);
        cat2.setForeground(new java.awt.Color(255, 255, 0));
        cat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat2ActionPerformed(evt);
            }
        });
        cat2.setText("Orders pending");
        getContentPane().add(cat2);
        cat2.setBounds(20, 340, 170, 23);

        cat3.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(cat3);
        cat3.setForeground(new java.awt.Color(255, 255, 0));
        cat3.setText("Orders to be delivered");
        cat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat3ActionPerformed(evt);
            }
        });
        getContentPane().add(cat3);
        cat3.setBounds(20, 380, 170, 23);

        cat4.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(cat4);
        cat4.setForeground(new java.awt.Color(255, 255, 0));
        cat4.setText("Orders completed");
        cat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat4ActionPerformed(evt);
            }
        });
        getContentPane().add(cat4);
        cat4.setBounds(20, 420, 170, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Straight Line.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(213, 0, 10, 700);

        position.setBackground(new java.awt.Color(255, 0, 0));
        position.setForeground(new java.awt.Color(255, 0, 0));
        position.setToolTipText("");
        position.setOpaque(true);
        position.setPreferredSize(new java.awt.Dimension(700, 472));
        getContentPane().add(position);
        position.setBounds(0, 0, 900, 670);

        pack();
    }// </editor-fold>                        

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        int decision=JOptionPane.showConfirmDialog(null,"Are you sure you want to log out ?");
        if(decision==JOptionPane.YES_OPTION)
        {
            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
            LoginInterface interface1 = new LoginInterface();
            interface1.setVisible(true);
            setVisible(false);
        }
    }                                      

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
            Admin admin1 = new Admin();
            Staff staff1 = new Staff();
            boolean result1 = admin1.Login(username.getText(),String.valueOf(password.getPassword()) ,"Admin");
            boolean result2 = staff1.Login(username.getText(),String.valueOf(password.getPassword()) ,"Staff");
            if(result1)
            {
            	jPanel2.setVisible(false);
            	jPanel1.setVisible(true);
            	name.setText(username.getText());
            }
            else if(result2)
            {
            	jPanel2.setVisible(false);
            	jPanel1.setVisible(true);
            	name.setText(username.getText());
            }
            else
            {
            	jPanel2.setVisible(true);
            	JOptionPane.showMessageDialog(null, "Mismatched username and password");
            }
        
    }                  
    
    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    	int row    =OrderTable.getSelectedRow();
    	int column =OrderTable.getSelectedColumn();
    	JButton butt = new JButton("Completed"); 
    	Admin admin1 = new Admin();
    	Staff staff1 = new Staff();
    	if(column==5)	//Changing status to WaitingForDelivery
    	{
    		Boolean result=false;
    		if(OrderTable.getValueAt(row, 4).equals("ProcessingOrder") && (this.position.getText().equals("Admin")))
    		{
    			result=admin1.approveForDelivery(Integer.parseInt(OrderTable.getValueAt(row, 0).toString()));
    			if(result==true)
        		{
        			JOptionPane.showMessageDialog(null,"Order added into delivery queue");
        			butt.setText("Completed");
        			OrderTable.setValueAt(butt, row, 5);
        			cat1ActionPerformed(null);
        			cat2ActionPerformed(null);
        			cat3ActionPerformed(null);
        			cat4ActionPerformed(null);
        		}
        		else
        		{
        			JOptionPane.showMessageDialog(null,"Error add order into delivery queue");
        		}	
    		}
    		else if(OrderTable.getValueAt(row, 4).equals("WaitingForDelivery") && (this.position.getText().equals("Staff")))
    		{
    			result=staff1.deliverOrder(Integer.parseInt(OrderTable.getValueAt(row, 0).toString()), this.name.getText());
    			if(result==true)
        		{
        			JOptionPane.showMessageDialog(null,"Order had been added into completed order list");
        			butt.setText("Completed");
        			OrderTable.setValueAt(butt, row, 5);
        			cat3ActionPerformed(null);
        		}
        		else
        		{
        			JOptionPane.showMessageDialog(null,"Error add order into delivery queue");
        		}	
    		}
    		else if(OrderTable.getValueAt(row, 4).equals("Completed"))
    		{
    			JOptionPane.showMessageDialog(null, "The order is already completed.");
    		}
    		else
    		{
    			JOptionPane.showMessageDialog(null,"No available action can be done with your position.");
    		}
    	}
    	else   //Display details of the order clicked........
    	{
    		ReceiptInterface interface1= new ReceiptInterface(Integer.parseInt(OrderTable.getValueAt(row, 0).toString()),this.position.getText());
    	}                                       
    }
    
    private void cat1ActionPerformed(java.awt.event.ActionEvent evt){                                      
    	if(cat1.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        	OrderTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        	OrderTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        	OrderTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        	OrderTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        	OrderTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        	OrderTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	OrderTable.getColumn("To be Delivered").setCellRenderer(new LabelRenderer());
        	/*Start Reading Menu into arrayList */
            ArrayList<Order> list =  new ArrayList<Order>();
        	Order order1;
        	try 
    		{
        		File f = new File("OrderList.txt");

                BufferedReader b = new BufferedReader(new FileReader(f));
                String readLine = "";
                System.out.println("Reading file using Buffered Reader");
                while ((readLine = b.readLine()) != null) {
                    System.out.println(readLine);
                	order1=new Order(readLine);
                    list.add(order1);
                }
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"OrderList.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[6];
            OrderTable.setRowHeight(100);
            
           for(int i=0;i<list.size();i++)
        	{
        		JButton jbutt = new JButton();
            	if(list.get(i).getStatus().equals("Completed"))
            		{
            			jbutt.setText("Completed");
            		}
            	else if(list.get(i).getStatus().equals("WaitingForDelivery"))
            		{
            			jbutt.setText("Deliver It");
            		}
            	else if(list.get(i).getStatus().equals("ProcessingOrder"))
            		{
            			jbutt.setText("Approve for delivery");
            		}
                rowData[0]= list.get(i).getOrder_ID();
                rowData[1]= list.get(i).getCustomerUsername();
                rowData[2]= list.get(i).getSum();
        		rowData[3]= list.get(i).getDateOrdered();
        		rowData[4]= list.get(i).getStatus();
        		rowData[5]= jbutt;
        		model.addRow(rowData);
        	}
        }
        
    }                                  

    private void cat2ActionPerformed(java.awt.event.ActionEvent evt){                                      
    	if(cat2.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	OrderTable.getColumn("To be Delivered").setCellRenderer(new LabelRenderer());
        	/*Start Reading Menu into arrayList */
            ArrayList<Order> list =  new ArrayList<Order>();
        	Order order1;
        	try 
    		{
        		File f = new File("OrderList.txt");

                BufferedReader b = new BufferedReader(new FileReader(f));
                String readLine = "";
                System.out.println("Reading file using Buffered Reader");
                while ((readLine = b.readLine()) != null) {
                    System.out.println(readLine);
                	order1=new Order(readLine);
                    list.add(order1);
                }
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"OrderList.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[6];
            OrderTable.setRowHeight(100);
           for(int i=0;i<list.size();i++)
        	{
        	   JButton jbutt = new JButton();
           	if(list.get(i).getStatus().equals("Completed"))
           		{
           			jbutt.setText("Completed");
           		}
           	else if(list.get(i).getStatus().equals("WaitingForDelivery"))
           		{
           			jbutt.setText("Deliver It");
           		}
           	else if(list.get(i).getStatus().equals("ProcessingOrder"))
           		{
           			jbutt.setText("Approve for delivery");
           		}
                rowData[0]= list.get(i).getOrder_ID();
                rowData[1]= list.get(i).getCustomerUsername();
                rowData[2]= list.get(i).getSum();
        		rowData[3]= list.get(i).getDateOrdered();
        		rowData[4]= list.get(i).getStatus();
        		rowData[5]= jbutt;
        		if(list.get(i).getStatus().equals("ProcessingOrder"))
        			model.addRow(rowData);
        	}
        }
        
    }                                  

    private void cat3ActionPerformed(java.awt.event.ActionEvent evt){                                      
    	if(cat3.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	OrderTable.getColumn("To be Delivered").setCellRenderer(new LabelRenderer());
        	/*Start Reading Menu into arrayList */
            ArrayList<Order> list =  new ArrayList<Order>();
        	Order order1;
        	try 
    		{
        		File f = new File("OrderList.txt");

                BufferedReader b = new BufferedReader(new FileReader(f));
                String readLine = "";
                System.out.println("Reading file using Buffered Reader");
                while ((readLine = b.readLine()) != null) {
                    System.out.println(readLine);
                	order1=new Order(readLine);
                    list.add(order1);
                }
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"OrderList.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[6];
            OrderTable.setRowHeight(100);
           for(int i=0;i<list.size();i++)
        	{
        	   JButton jbutt = new JButton();
           	if(list.get(i).getStatus().equals("Completed"))
           		{
           			jbutt.setText("Completed");
           		}
           	else if(list.get(i).getStatus().equals("WaitingForDelivery"))
           		{
           			jbutt.setText("Deliver It");
           		}
           	else if(list.get(i).getStatus().equals("ProcessingOrder"))
           		{
           			jbutt.setText("Approve for delivery");
           		}
                rowData[0]= list.get(i).getOrder_ID();
                rowData[1]= list.get(i).getCustomerUsername();
                rowData[2]= list.get(i).getSum();
        		rowData[3]= list.get(i).getDateOrdered();
        		rowData[4]= list.get(i).getStatus();
        		rowData[5]= jbutt;
        		if(list.get(i).getStatus().equals("WaitingForDelivery"))
        			model.addRow(rowData);
        	}
        }
    }                                  

    private void cat4ActionPerformed(java.awt.event.ActionEvent evt){                                      
    	if(cat4.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	OrderTable.getColumn("To be Delivered").setCellRenderer(new LabelRenderer());
        	/*Start Reading Menu into arrayList */
            ArrayList<Order> list =  new ArrayList<Order>();
        	Order order1;
        	try 
    		{
        		File f = new File("OrderList.txt");

                BufferedReader b = new BufferedReader(new FileReader(f));
                String readLine = "";
                System.out.println("Reading file using Buffered Reader");
                while ((readLine = b.readLine()) != null) {
                    System.out.println(readLine);
                	order1=new Order(readLine);
                    list.add(order1);
                }
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"OrderList.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[6];
            OrderTable.setRowHeight(100);
           for(int i=0;i<list.size();i++)
        	{
        	   JButton jbutt = new JButton();
           	if(list.get(i).getStatus().equals("Completed"))
           		{
           			jbutt.setText("Completed");
           		}
           	else if(list.get(i).getStatus().equals("WaitingForDelivery"))
           		{
           			jbutt.setText("Deliver It");
           		}
           	else if(list.get(i).getStatus().equals("ProcessingOrder"))
           		{
           			jbutt.setText("Approve for delivery");
           		}
                rowData[0]= list.get(i).getOrder_ID(); 
                rowData[1]= list.get(i).getCustomerUsername();
                rowData[2]= list.get(i).getSum();
        		rowData[3]= list.get(i).getDateOrdered();
        		rowData[4]= list.get(i).getStatus();
        		rowData[5]= jbutt;
        		if(list.get(i).getStatus().equals("Completed"))
        			model.addRow(rowData);
        	}
        }
    }                                   


    
    private void passwordFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:if(String.valueOf(password.getPassword()).equals("     "))
        {
            password.setText("");
        }
    }                                    

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        if(String.valueOf(password.getPassword()).equals("     "))
        {
            password.setText("");
        }
    }                                     

	private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
    	jLabel3.setForeground(new java.awt.Color(204, 0, 0));
    }                                    

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));

    }                                   

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
    	RegisterInterface interface1 = new RegisterInterface();
    	interface1.setVisible(true);
    	setVisible(false);
    }                                    

    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AllOrderInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllOrderInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllOrderInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllOrderInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllOrderInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTable OrderTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cat1;
    private javax.swing.JRadioButton cat2;
    private javax.swing.JRadioButton cat3;
    private javax.swing.JRadioButton cat4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton login;
    private javax.swing.JButton logout;
    private javax.swing.JLabel menuCat;
    private javax.swing.JLabel name;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel position;
    private javax.swing.JTextField username;
    // End of variables declaration                   
}