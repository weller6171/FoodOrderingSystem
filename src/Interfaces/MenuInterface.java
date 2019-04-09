package Interfaces;
import Classes.Order;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import Classes.Customer;
import Classes.Item;

/**
 *
 * @author weller
 */
public class MenuInterface extends javax.swing.JFrame {

	Order order1= new Order();  //Initialise order Object
	Boolean statusLogin=false;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd����HH:mm:ss");
	Date orderDate = new Date();
	ArrayList<Item> itemList = new ArrayList<Item>();
	ArrayList<Integer> quantityList = new ArrayList<Integer>();
	ReceiptInterface interface2 = new ReceiptInterface();
	
    /**
     * Creates new form Menu
     */
    public MenuInterface() {
        initComponents();
        cat1.setSelected(true);
        cat1ActionPerformed(null);
        statusLogin=false;
        jPanel1.setVisible(false);
        quantityList.clear();
        itemList.clear();
        
    }
public MenuInterface(String username)
{
    initComponents();
    cat1.setSelected(true);
    cat1ActionPerformed(null);
    jPanel2.setVisible(false);
    name.setText(username);
    statusLogin=true;
    quantityList.clear();
    itemList.clear();
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
            jPanel1 = new javax.swing.JPanel();
            jLabel6 = new javax.swing.JLabel();
            logout = new javax.swing.JButton();
            jLabel4 = new javax.swing.JLabel();
            name = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            username = new javax.swing.JTextField();
            password = new javax.swing.JPasswordField();
            login = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            MenuTable = new javax.swing.JTable();
            jLabel5 = new javax.swing.JLabel();
            cat1 = new javax.swing.JRadioButton();
            cat2 = new javax.swing.JRadioButton();
            cat3 = new javax.swing.JRadioButton();
            cat4 = new javax.swing.JRadioButton();
            cat5 = new javax.swing.JRadioButton();
            cat6 = new javax.swing.JRadioButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setMinimumSize(new java.awt.Dimension(900, 700));
            setSize(new java.awt.Dimension(800, 600));
            getContentPane().setLayout(null);

            jPanel1.setMaximumSize(new java.awt.Dimension(130, 170));
            jPanel1.setMinimumSize(new java.awt.Dimension(130, 170));
            jPanel1.setLayout(null);

            jLabel6.setText("Welcome  ");
            jPanel1.add(jLabel6);
            jLabel6.setBounds(40, 10, 60, 14);

            logout.setText("LOGOUT");
            logout.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    logoutActionPerformed(evt);
                }
            });
            jPanel1.add(logout);
            logout.setBounds(20, 130, 90, 30);

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/User.png"))); // NOI18N
            jPanel1.add(jLabel4);
            jLabel4.setBounds(30, 30, 80, 60);
            jPanel1.add(name);
            name.setBounds(10, 100, 130, 20);

            getContentPane().add(jPanel1);
            jPanel1.setBounds(20, 20, 130, 170);

            jPanel2.setMaximumSize(new java.awt.Dimension(130, 170));
            jPanel2.setMinimumSize(new java.awt.Dimension(130, 170));
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
            jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel3MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel3MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel3MouseExited(evt);
                }
            });
            jPanel2.add(jLabel3);
            jLabel3.setBounds(20, 150, 150, 20);

            getContentPane().add(jPanel2);
            jPanel2.setBounds(20, 20, 130, 180);

            MenuTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "ID", "Picture", "Name", "Content", "Price", "Quantity", "Place Order"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, true, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            MenuTable.getTableHeader().setReorderingAllowed(false);
            MenuTable.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    MenuTableMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(MenuTable);
            if (MenuTable.getColumnModel().getColumnCount() > 0) {
                MenuTable.getColumnModel().getColumn(0).setResizable(false);
            }
            MenuTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            MenuTable.getColumnModel().getColumn(1).setPreferredWidth(240);
            MenuTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            MenuTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            MenuTable.getColumnModel().getColumn(4).setPreferredWidth(80);
            MenuTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            MenuTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            

            getContentPane().add(jScrollPane1);
            jScrollPane1.setBounds(200, 120, 670, 540);

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Straight Line.png"))); // NOI18N
            jLabel5.setMaximumSize(new java.awt.Dimension(16, 690));
            jLabel5.setMinimumSize(new java.awt.Dimension(16, 690));
            jLabel5.setPreferredSize(new java.awt.Dimension(16, 690));
            jLabel5.setRequestFocusEnabled(false);
            jLabel5.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jLabel5);
            jLabel5.setBounds(180, 0, 20, 690);


            cat1.setBackground(new java.awt.Color(255, 0, 0));
            buttonGroup1.add(cat1);
            cat1.setForeground(new java.awt.Color(255, 255, 0));
            cat1.setText("All");
            cat1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cat1ActionPerformed(evt);
                }
            });
            getContentPane().add(cat1);
            cat1.setBounds(10, 220, 170, 23);

            cat2.setBackground(new java.awt.Color(255, 0, 0));
            buttonGroup1.add(cat2);
            cat2.setForeground(new java.awt.Color(255, 255, 0));
            cat2.setText("AlarCarte");
            cat2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cat2ActionPerformed(evt);
                }
            });
            getContentPane().add(cat2);
            cat2.setBounds(10, 260, 170, 23);

            cat3.setBackground(new java.awt.Color(255, 0, 0));
            buttonGroup1.add(cat3);
            cat3.setForeground(new java.awt.Color(255, 255, 0));
            cat3.setText("Set");
            cat3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cat3ActionPerformed(evt);
                }
            });
            getContentPane().add(cat3);
            cat3.setBounds(10, 300, 170, 23);

            cat4.setBackground(new java.awt.Color(255, 0, 0));
            buttonGroup1.add(cat4);
            cat4.setForeground(new java.awt.Color(255, 255, 0));
            cat4.setText("Deesert");
            cat4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cat4ActionPerformed(evt);
                }
            });
            getContentPane().add(cat4);
            cat4.setBounds(10, 340, 170, 23);

            cat5.setBackground(new java.awt.Color(255, 0, 0));
            buttonGroup1.add(cat5);
            cat5.setForeground(new java.awt.Color(255, 255, 0));
            cat5.setText("Beverages");
            cat5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cat5ActionPerformed(evt);
                }
            });
            getContentPane().add(cat5);
            cat5.setBounds(10, 390, 170, 23);

            cat6.setBackground(new java.awt.Color(255, 0, 0));
            buttonGroup1.add(cat6);
            cat6.setForeground(new java.awt.Color(255, 255, 0));
            cat6.setText("Happy Meal");
            cat6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cat6ActionPerformed(evt);
                }
            });
            getContentPane().add(cat6);
            cat6.setBounds(10, 430, 170, 23);

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/MCDEliverynew.png"))); // NOI18N
            getContentPane().add(jLabel2);
            jLabel2.setBounds(340, 0, 400, 120);

            jLabel1.setBackground(new java.awt.Color(255, 0, 0));
            jLabel1.setForeground(new java.awt.Color(255, 0, 0));
            jLabel1.setFocusable(false);
            jLabel1.setMaximumSize(new java.awt.Dimension(790, 590));
            jLabel1.setMinimumSize(new java.awt.Dimension(790, 590));
            jLabel1.setOpaque(true);
            jLabel1.setPreferredSize(new java.awt.Dimension(790, 590));
            jLabel1.setRequestFocusEnabled(false);
            getContentPane().add(jLabel1);
            jLabel1.setBounds(0, 0, 900, 700);

            pack();
        }// </editor-fold>                        


    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        if(String.valueOf(password.getPassword()).equals("     "))
        {
            password.setText("");
        }
    }                                     

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        int decision=JOptionPane.showConfirmDialog(null,"Are you sure you want to log out ?\n You will be redirected to Login Page.");
        if(decision==JOptionPane.YES_OPTION)
        {
        	statusLogin=false;
        	LoginInterface interface1 = new LoginInterface(name.getText());
        	interface1.setVisible(true);
           setVisible(false);
        }
    }                                      

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:if(String.valueOf(password.getPassword()).equals("     "))
        {
            password.setText("");
        }
    }     
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        
            Customer customer1 = new Customer();
            boolean result = customer1.Login(username.getText(),String.valueOf(password.getPassword()) ,"Customer");
            if(result)
            {
            	jPanel2.setVisible(false);
            	jPanel1.setVisible(true);
            	name.setText(username.getText());
            	statusLogin=true;
            }
            else
            {
            	jPanel2.setVisible(true);
            	JOptionPane.showMessageDialog(null, "Mismatched username and password");
            }
        
    }                                     
                          
    private void cat1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(cat1.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	MenuTable.getColumn("Picture").setCellRenderer(new LabelRenderer());
        	MenuTable.getColumn("Place Order").setCellRenderer(new LabelRenderer());
        	
        	/*Start Reading Menu into arrayList */
            ArrayList<Item> list =  new ArrayList<Item>();
        	Item item1;
        	try 
    		{
    			Scanner x = new Scanner(new File("ProductDetails.txt"));
    			while(x.hasNext())
    			{
    				item1 = new Item(Integer.parseInt(x.next()),x.next(),x.next(),x.next(),x.next(),Float.parseFloat(x.next()));
    				System.out.println("Item1Details : "+item1.getItem_Pic()+"\n"+item1.getItem_Name() + "\n");
    				list.add(item1);
    			}
    			x.close();
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"ProductDetails.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[7];
            MenuTable.setRowHeight(100);
        	for(int i=0;i<list.size();i++)
        	{
        		JButton jbutt = new JButton();
            	jbutt.setText("Place Order");
        		JLabel labelPic = new JLabel();
        		labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(list.get(i).getItem_Pic()))); // NOI18N
                rowData[0]=list.get(i).getItem_ID();
                rowData[1]= labelPic;
                String temp=list.get(i).getItem_Name();
                temp=temp.replace("_", " ");
                rowData[2] = temp;
                temp=list.get(i).getItem_Content();
                temp=temp.replace("_", " ");
        		rowData[3] = temp;
        		rowData[4] = list.get(i).getItem_Price();
        		rowData[5] = 0;
        		rowData[6] = jbutt;
        		model.addRow(rowData);
        	}
        }
    } 
    
    private void cat2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(cat2.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	MenuTable.getColumn("Picture").setCellRenderer(new LabelRenderer());
        	MenuTable.getColumn("Place Order").setCellRenderer(new LabelRenderer());
        	
        	/*Start Reading Menu into arrayList */
            ArrayList<Item> list =  new ArrayList<Item>();
        	Item item1;
        	try 
    		{
    			Scanner x = new Scanner(new File("ProductDetails.txt"));
    			while(x.hasNext())
    			{
    				item1 = new Item(Integer.parseInt(x.next()),x.next(),x.next(),x.next(),x.next(),Float.parseFloat(x.next()));
    				System.out.println("Item1Details : "+item1.getItem_Pic()+"\n"+item1.getItem_Name() + "\n");
    				list.add(item1);
    			}
    			x.close();
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"ProductDetails.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[7];
            MenuTable.setRowHeight(100);
        	for(int i=0;i<list.size();i++)
        	{
        		JButton jbutt = new JButton();
            	jbutt.setText("Place Order");
        		JLabel labelPic = new JLabel();
        		
        		labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(list.get(i).getItem_Pic()))); // NOI18N
                rowData[0]=list.get(i).getItem_ID();
                rowData[1]= labelPic;
                String temp=list.get(i).getItem_Name();
                temp=temp.replace("_", " ");
                rowData[2] = temp;
                temp=list.get(i).getItem_Content();
                temp=temp.replace("_", " ");
        		rowData[3] = temp;
        		rowData[4] = list.get(i).getItem_Price();
        		rowData[5] = 0;
        		rowData[6] = jbutt;
        		if(list.get(i).getItem_Type().equals("ALaCarte"))
        			model.addRow(rowData);
        	}
        }
    } 
    
    
    private void cat3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(cat3.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	MenuTable.getColumn("Picture").setCellRenderer(new LabelRenderer());
        	MenuTable.getColumn("Place Order").setCellRenderer(new LabelRenderer());
        	
        	/*Start Reading Menu into arrayList */
            ArrayList<Item> list =  new ArrayList<Item>();
        	Item item1;
        	try 
    		{
    			Scanner x = new Scanner(new File("ProductDetails.txt"));
    			while(x.hasNext())
    			{
    				item1 = new Item(Integer.parseInt(x.next()),x.next(),x.next(),x.next(),x.next(),Float.parseFloat(x.next()));
    				System.out.println("Item1Details : "+item1.getItem_Pic()+"\n"+item1.getItem_Name() + "\n");
    				list.add(item1);
    			}
    			x.close();
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"ProductDetails.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[7];
            MenuTable.setRowHeight(100);
        	for(int i=0;i<list.size();i++)
        	{
        		JButton jbutt = new JButton();
            	jbutt.setText("Place Order");
        		JLabel labelPic = new JLabel();
        		
        		labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(list.get(i).getItem_Pic()))); // NOI18N
                rowData[0]=list.get(i).getItem_ID();
                rowData[1]= labelPic;
                String temp=list.get(i).getItem_Name();
                temp=temp.replace("_", " ");
                rowData[2] = temp;
                temp=list.get(i).getItem_Content();
                temp=temp.replace("_", " ");
        		rowData[3] = temp;
        		rowData[4] = list.get(i).getItem_Price();
        		rowData[5] = 0;
        		rowData[6] = jbutt;
        		if(list.get(i).getItem_Type().equals("Set"))
        		model.addRow(rowData);
        	}
        }
    } 
    
    
    private void cat4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(cat4.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	MenuTable.getColumn("Picture").setCellRenderer(new LabelRenderer());
        	MenuTable.getColumn("Place Order").setCellRenderer(new LabelRenderer());
        	
        	/*Start Reading Menu into arrayList */
            ArrayList<Item> list =  new ArrayList<Item>();
        	Item item1;
        	try 
    		{
    			Scanner x = new Scanner(new File("ProductDetails.txt"));
    			while(x.hasNext())
    			{
    				item1 = new Item(Integer.parseInt(x.next()),x.next(),x.next(),x.next(),x.next(),Float.parseFloat(x.next()));
    				System.out.println("Item1Details : "+item1.getItem_Pic()+"\n"+item1.getItem_Name() + "\n");
    				list.add(item1);
    			}
    			x.close();
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"ProductDetails.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[7];
            MenuTable.setRowHeight(100);
        	for(int i=0;i<list.size();i++)
        	{
        		JButton jbutt = new JButton();
            	jbutt.setText("Place Order");
        		JLabel labelPic = new JLabel();
        		
        		labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(list.get(i).getItem_Pic()))); // NOI18N
                rowData[0]=list.get(i).getItem_ID();
                rowData[1]= labelPic;
                String temp=list.get(i).getItem_Name();
                temp=temp.replace("_", " ");
                rowData[2] = temp;
                temp=list.get(i).getItem_Content();
                temp=temp.replace("_", " ");
        		rowData[3] = temp;
        		rowData[4] = list.get(i).getItem_Price();
        		rowData[5] = 0;
        		rowData[6] = jbutt;
        		if(list.get(i).getItem_Type().equals("Dessert"))
        		model.addRow(rowData);
        	}
        }
    } 
    
    
    private void cat5ActionPerformed(java.awt.event.ActionEvent evt) {                               
        // TODO add your handling code here:
        if(cat5.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	MenuTable.getColumn("Picture").setCellRenderer(new LabelRenderer());
        	MenuTable.getColumn("Place Order").setCellRenderer(new LabelRenderer());
        	
        	/*Start Reading Menu into arrayList */
            ArrayList<Item> list =  new ArrayList<Item>();
        	Item item1;
        	try 
    		{
    			Scanner x = new Scanner(new File("ProductDetails.txt"));
    			while(x.hasNext())
    			{
    				item1 = new Item(Integer.parseInt(x.next()),x.next(),x.next(),x.next(),x.next(),Float.parseFloat(x.next()));
    				System.out.println("Item1Details : "+item1.getItem_Pic()+"\n"+item1.getItem_Name() + "\n");
    				list.add(item1);
    			}
    			x.close();
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"ProductDetails.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[7];
            MenuTable.setRowHeight(100);
        	for(int i=0;i<list.size();i++)
        	{
        		JButton jbutt = new JButton();
            	jbutt.setText("Place Order");
        		JLabel labelPic = new JLabel();
        		
        		labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(list.get(i).getItem_Pic()))); // NOI18N
                rowData[0]=list.get(i).getItem_ID();
                rowData[1]= labelPic;
                String temp=list.get(i).getItem_Name();
                temp=temp.replace("_", " ");
                rowData[2] = temp;
                temp=list.get(i).getItem_Content();
                temp=temp.replace("_", " ");
        		rowData[3] = temp;
        		rowData[4] = list.get(i).getItem_Price();
        		rowData[5] = 0;
        		rowData[6] = jbutt;
        		if(list.get(i).getItem_Type().equals("Beverages"))
        			model.addRow(rowData);
        	}
        }
    } 
    
    
    private void cat6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(cat6.isSelected())
        {
        	/*Clear table contents*/
        	DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        	for( int i = model.getRowCount() - 1; i >= 0; i-- )
        	{
        		model.removeRow(i);
        	}
        	/*Render table picture and button*/
        	MenuTable.getColumn("Picture").setCellRenderer(new LabelRenderer());
        	MenuTable.getColumn("Place Order").setCellRenderer(new LabelRenderer());
        	
        	/*Start Reading Menu into arrayList */
            ArrayList<Item> list =  new ArrayList<Item>();
        	Item item1;
        	try 
    		{
    			Scanner x = new Scanner(new File("ProductDetails.txt"));
    			while(x.hasNext())
    			{
    				item1 = new Item(Integer.parseInt(x.next()),x.next(),x.next(),x.next(),x.next(),Float.parseFloat(x.next()));
    				System.out.println("Item1Details : "+item1.getItem_Pic()+"\n"+item1.getItem_Name() + "\n");
    				list.add(item1);
    			}
    			x.close();
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(null,"ProductDetails.txt not found");
    		}
            
            /*Preparing table for display*/
        	Object rowData[] = new Object[7];
            MenuTable.setRowHeight(100);
        	for(int i=0;i<list.size();i++)
        	{
        		JButton jbutt = new JButton();
            	jbutt.setText("Place Order");
        		JLabel labelPic = new JLabel();
        		
        		labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(list.get(i).getItem_Pic()))); // NOI18N
                rowData[0]=list.get(i).getItem_ID();
                rowData[1]= labelPic;
                String temp=list.get(i).getItem_Name();
                temp=temp.replace("_", " ");
                rowData[2] = temp;
                temp=list.get(i).getItem_Content();
                temp=temp.replace("_", " ");
        		rowData[3] = temp;
        		rowData[4] = list.get(i).getItem_Price();
        		rowData[5] = 0;
        		rowData[6] = jbutt;
        		if(list.get(i).getItem_Type().equals("HappyMeal"))
        			model.addRow(rowData);
        	}
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
        	RegisterInterface inter1 =new RegisterInterface();
        	inter1.setVisible(true);
        	setVisible(false);
        }                                    
             
        private void receiptButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
            // TODO add your handling code here:
        	ReceiptInterface interface1 = new ReceiptInterface(order1,"Customer");
        	interface1.setVisible(true);
        }                                             

        protected void MenuTableMouseClicked(MouseEvent evt) {
    		// TODO Auto-generated method stub
        	int column = MenuTable.getColumnModel().getColumnIndexAtX(evt.getX());
        	int row = MenuTable.getSelectedRow();
        	System.out.println(column   +"                   " +  row);
        		if(column==6)
            	{
        			if(!statusLogin)
        			{
        				JOptionPane.showMessageDialog(null,"Please login first to place order.");
            			column=-1;	
        			}
        			else if(statusLogin && !(username.getText()==("")))
        			{
        				String itemName1 = (String) MenuTable.getValueAt(row, 2);
                		float price1 = (float) MenuTable.getValueAt(row, 4);
                		String temp = MenuTable.getValueAt(row,5).toString();
                		for(int j=0;j<temp.length();j++)
                		{
                			if(temp.charAt(j)=='0'||temp.charAt(j)=='1' ||temp.charAt(j)=='2' ||temp.charAt(j)=='3' ||temp.charAt(j)=='4' 
    			                     ||temp.charAt(j)=='8' ||temp.charAt(j)=='7' ||temp.charAt(j)=='6' ||temp.charAt(j)=='5' ||temp.charAt(j)=='9')
                			{
                					continue;
                			}
                			else if(Integer.parseInt(temp)<1)
                			{
                					JOptionPane.showMessageDialog(null,"Please fill in positive number only in quantity.");
                					break;
                			}
                		}
                		int quantity1 = Integer.parseInt(temp);
                		String tempAddress=null;
                		String tempName=null;
                		/*TRY setting into order1*/
                		Item tempItem = new Item(Integer.parseInt(MenuTable.getValueAt(row, 0).toString()), "", "", MenuTable.getValueAt(row, 2).toString(), MenuTable.getValueAt(row, 3).toString(),Float.parseFloat(MenuTable.getValueAt(row, 4).toString()));
                		itemList.add(tempItem);
                		quantityList.add(Integer.parseInt(MenuTable.getValueAt(row, 5).toString()));
                		/*Searching for address from userDetails.txt*/
                		System.out.println("795 Cleared");
                		try 
                		{
                			Scanner x = new Scanner(new File("UserAcc.txt"));
                			while(x.hasNext() && !(tempName==name.getText()))
                			{
                				x.next();
                				tempName=x.next();
                				if(tempName.equals(name.getText()))
                				{
                					x.next();x.next();x.next();
                					tempAddress=x.next();
                					x.next();
                					break;
                				}
                				else
                					x.nextLine();
                				System.out.println("username in the frame : "+name.getText()+"\n"+tempName);
                			}
                		}
                		catch(Exception e)
                		{
                			System.out.println("Error occured in getting user address \n"+e.toString() );
                		}
                		if(tempName.equals(name.getText()))
                		{
                			tempAddress = tempAddress.replace("_", " ");	
                			order1 = new Order(name.getText(),dateFormat.format(orderDate),itemList,quantityList,tempAddress);
                			interface2=new ReceiptInterface(order1,"Customer");
                		}
                		else
                		{
                			JOptionPane.showMessageDialog(null, "Cannot find user address in the UserAcc\n Please register before you place order.");
                		}
        			}
            	}
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
                java.util.logging.Logger.getLogger(MenuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(MenuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(MenuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(MenuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MenuInterface().setVisible(true);
                }
            });
        }
        // Variables declaration - do not modify                     
        private javax.swing.JTable MenuTable;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JRadioButton cat1;
        private javax.swing.JRadioButton cat2;
        private javax.swing.JRadioButton cat3;
        private javax.swing.JRadioButton cat4;
        private javax.swing.JRadioButton cat5;
        private javax.swing.JRadioButton cat6;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private static javax.swing.JPanel jPanel1;
        private static javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JButton login;
        private javax.swing.JButton logout;
        private javax.swing.JLabel name;
        private javax.swing.JPasswordField password;
        private javax.swing.JTextField username;
        // End of variables declaration                   
    }