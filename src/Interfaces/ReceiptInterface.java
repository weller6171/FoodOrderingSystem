/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Classes.Admin;
import Classes.Customer;
import Classes.Order;
/**
 *
 * @author weller
 */
public class ReceiptInterface extends javax.swing.JFrame {
	Order tempOrder=null;
    /**
     * Creates new form ReceiptInterface
     */
    public ReceiptInterface() {
        initComponents();
        setVisible(true);
    }
    public ReceiptInterface(Order order,String position) {
        initComponents();
        this.position.setText(position);
        if(this.position.getText().equals("Admin") || this.position.getText().equals("Staff"))
        {
        	confirm.setText("CloseWindow");
        }
        if(order.getPayMethod()==null)
        {
        	
        }
        else if(order.getPayMethod().equals("PayByCard"))
       	{
        			payByCard.setSelected(true);
        			this.cardsNumber.setText(order.getCardNumber());
     	}
        else if(order.getPayMethod().equals("PayByCash"))
        {
        	payByCash.setSelected(true);
        }
        tempOrder=order;
        customerName.setText(order.getCustomerUsername());
        orderDate.setText(order.getDateOrdered());
        address.setText(order.getDeliverAddress());
        DefaultTableModel model = (DefaultTableModel) orderList.getModel();
        Object rowData[] = new Object[4];
        orderList.setRowHeight(30);
        for(int i=0; i<order.getItemList().size();i++)
        {
        	rowData[0]=order.getQuantityList().get(i);
        	rowData[1]=order.getItemList().get(i).getItem_Name();
        	rowData[2]=order.getItemList().get(i).getItem_Price();
        	rowData[3]=  Float.parseFloat(rowData[0].toString())* order.getItemList().get(i).getItem_Price();
        	model.addRow(rowData);
        }
        rowData[0]="";
    	rowData[1]="";
    	rowData[2]="Total :";
    	rowData[3]=order.getSum();
        model.addRow(rowData);
        setVisible(true);
    }
               
    public ReceiptInterface(int order_ID, String position) {
    	initComponents();
    	this.position.setText(position);
    	if(this.position.getText().equals("Admin") || this.position.getText().equals("Staff"))
        {
        	confirm.setText("CloseWindow");
        }    	
    	ArrayList<String> orderTextForm = new ArrayList<String>();
    	ArrayList<String> productTextForm = new ArrayList<String>();
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
				this.customerName.setText(tempData[1]);
				this.orderDate.setText(tempData[2]);
				this.address.setText(tempData[3]);
				if(tempData[4].substring(0,8).equals("PayByCash"))
				{
					this.payByCash.setSelected(true);
					this.payByCard.setSelected(false);
				}
				else
				{
					this.payByCard.setSelected(true);
					this.payByCash.setSelected(false);
					this.cardsNumber.setText(tempData[4].substring(10));
				}
				String[] tempItemWithQuantity = tempData[7].split("-");
				String[] price = new String[tempItemWithQuantity.length/2];
				try 
				{
					Scanner x = new Scanner(new File("ProductDetails.txt"));
					while(x.hasNext())
					{
						productTextForm.add(x.nextLine());
					}
					x.close();
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"OrderList.txt not found");
				}
				
				for(int k=0;k<productTextForm.size();k++)
				{
					for(int l=0;l<productTextForm.size();l++)
					{
						String[] tempProductDetails = productTextForm.get(l).split(" ");
						if(tempItemWithQuantity[k*2].equals(tempProductDetails[3]))
						{
							price[k]=tempProductDetails[5];
						}
					}
				}
				
				DefaultTableModel model = (DefaultTableModel) orderList.getModel();
		        Object rowData[] = new Object[4];
		        orderList.setRowHeight(30);
		        for(int j=0; j<price.length;j++)
		        {
		        	rowData[0]=tempItemWithQuantity[1+(j*2)];
		        	rowData[1]=tempItemWithQuantity[0+(j*2)];
		        	rowData[2]=price[j];
		        	rowData[3]=Float.parseFloat(rowData[0].toString())* Float.parseFloat(rowData[2].toString());
		        	model.addRow(rowData);
		        }
		        rowData[0]="";
		    	rowData[1]="";
		    	rowData[2]="Total :";
		    	rowData[3]=tempData[8];
		        model.addRow(rowData);
		        setVisible(true);
			}
		}
		this.addMore.setEnabled(false);
	}

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        changeAddress = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        orderDate = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addMore = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        address = new javax.swing.JLabel();
        payByCash = new javax.swing.JRadioButton();
        payByCard = new javax.swing.JRadioButton();
        cardsNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        position = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        setPreferredSize(new java.awt.Dimension(600, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        changeAddress.setText("Change Address");
        changeAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAddressActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer Name :");

        orderDate.setText("DateUnknown");

        customerName.setText("usernameUnknown");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PURCHASE RECEIPT");

        jLabel4.setText("Order Date        :");

        orderList.setBackground(new java.awt.Color(255, 0, 0));
        orderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Item", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderList.setGridColor(new java.awt.Color(255, 0, 0));
        orderList.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(orderList);
        if (orderList.getColumnModel().getColumnCount() > 0) {
            orderList.getColumnModel().getColumn(0).setResizable(false);
            orderList.getColumnModel().getColumn(1).setResizable(false);
            orderList.getColumnModel().getColumn(2).setResizable(false);
            orderList.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("THANK YOU AND HOPE TO SEE YOU AGAIN !");

        jLabel7.setText("Address             :");

        addMore.setText("Add More");
        addMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoreActionPerformed(evt);
            }
        });

        confirm.setText("ConfirmOrder");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        address.setText("addressUnknown");

        buttonGroup1.add(payByCash);
        payByCash.setText("Cash on Delivery");

        payByCard.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(payByCard);
        payByCard.setText("Cards / Internet Banking");
        payByCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payByCardActionPerformed(evt);
            }
        });

        cardsNumber.setText("CardsNumber");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(orderDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(532, 532, 532))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(payByCash)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(cardsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(payByCard, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changeAddress)
                                .addGap(145, 145, 145))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(addMore, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(changeAddress)
                    .addComponent(address))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payByCard, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payByCash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardsNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMore, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 590, 620);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/MCDEliverynew.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 0, 400, 90);

        position.setBackground(new java.awt.Color(255, 0, 0));
        position.setForeground(new java.awt.Color(255, 0, 0));
        position.setOpaque(true);
        getContentPane().add(position);
        position.setBounds(0, 0, 590, 480);

        pack();
    }// </editor-fold>                      

        private void changeAddressActionPerformed(java.awt.event.ActionEvent evt) {                                              
            // TODO add your handling code here:
        	address.setText(JOptionPane.showInputDialog("Enter New Address",address.getText()));
        }                                             


        private void confirmActionPerformed(java.awt.event.ActionEvent evt) 
        {                                        
            // TODO add your handling code here:
        	if(this.confirm.getText().equals("ConfirmOrder"))
        	{
        		if(address.getText().equals("") )
            	{
            		JOptionPane.showMessageDialog(null, "Please fill in address to be sent");
            		address.setText(JOptionPane.showInputDialog("Enter address to be sent",address.getText()));
            	}
            	else if(!payByCash.isSelected() &&!payByCard.isSelected())
            	{
            		JOptionPane.showMessageDialog(null, "Please choose your pay method");
            	}
            	else if(payByCard.isSelected() && cardsNumber.getText().equals("CardsNumber"))
            	{
            		JOptionPane.showMessageDialog(null, "Please fill in card number for payment");
            		cardsNumber.setText(JOptionPane.showInputDialog("Enter card number : ",""));
            	}
            	else
            	{
            		if(payByCash.isSelected())
            			tempOrder.setPayMethod("PayByCash-0");
            		else
            			{
            				tempOrder.setPayMethod("PayByCard-"+cardsNumber.getText());
            			}
            		if(position.getText().equals("Staff")|| this.position.getText().equals("Admin"))
    				{
    					JOptionPane.showMessageDialog(null,"Please approve order using the button in the order list.");
    					setVisible(false);
    				}
    	        	else if(this.position.getText().equals(("Customer")))
    	        	{
    	        		Customer cust1 =  new Customer();
    	        		Boolean result=cust1.placeOrder(tempOrder);
    	        		if(result)
    	        		{
    	        			JOptionPane.showMessageDialog(null,"Thank you, your order will be ready in a moment");
    	        			setVisible(false);
    	        		}
    	        		else
    	        		{
    	        			JOptionPane.showMessageDialog(null,"Error in placing order.");
    	        		}
    	        	}
    			}

        	}
        	else if(this.confirm.getText().equals("CloseWindow"))
        	{
        		setVisible(false);
        		
        	}
        }
                          

        private void addMoreActionPerformed(java.awt.event.ActionEvent evt) {                                        
            // TODO add your handling code here:
        	if(this.position.getText().equals("Customer"))
        	{
        		JOptionPane.showMessageDialog(null,"Thank you, please take your time to choose.");
        		setVisible(false);
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null,"You are not allowed to add in this order. Please create a new one.");
        	}
        }                               

        private void payByCardActionPerformed(java.awt.event.ActionEvent evt) {                                          
            // TODO add your handling code here:
        	cardsNumber.setText(JOptionPane.showInputDialog("Please enter your card number : ", ""));
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
                java.util.logging.Logger.getLogger(ReceiptInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ReceiptInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ReceiptInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ReceiptInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ReceiptInterface().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify                     
        private javax.swing.JTable orderList;
        private javax.swing.JButton addMore;
        private javax.swing.JLabel address;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JLabel cardsNumber;
        private javax.swing.JButton changeAddress;
        private javax.swing.JButton confirm;
        private javax.swing.JLabel customerName;
        private javax.swing.JLabel position;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel orderDate;
        private javax.swing.JRadioButton payByCard;
        private javax.swing.JRadioButton payByCash;
        // End of variables declaration                   
    }

