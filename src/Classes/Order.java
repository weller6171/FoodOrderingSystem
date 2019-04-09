package Classes;
import Classes.Item;
import java.util.ArrayList;

public class Order {
	private int order_ID;
	private String customerUsername;
	private String dateOrdered;
	private ArrayList<Item> itemList = new ArrayList<Item>();
	private ArrayList<Integer> quantityList = new ArrayList<Integer>();
	private String status;          //Pending for payment, Preparing, Delivered
	private float sum;
	private String payMethod;		// COD or BankTransfer
	private String cardNumber;
	private String deliverAddress;
	private String staffUsername;
	
	public int getOrder_ID() {
		return order_ID;
	}

	public void setOrder_ID(int order_ID) {
		this.order_ID = order_ID;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String username) {
		this.customerUsername = username;
	}

	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

	public ArrayList<Integer> getQuantityList() {
		return quantityList;
	}

	public void setQuantityList(ArrayList<Integer> quantityList) {
		this.quantityList = quantityList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDeliverAddress() {
		return deliverAddress;
	}

	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
	}


	public String getStaffUsername() {
		return staffUsername;
	}

	public void setStaffUsername(String staffUsername) {
		this.staffUsername = staffUsername;
	}
	
	public Order() {
		// TODO Auto-generated constructor stub
		itemList.clear();
		quantityList.clear();
		sum=0f;
		cardNumber=null;
		staffUsername="Not_Yet_Decided";
		deliverAddress=null;
	}

	public Order(String username, String dateOrdered, ArrayList<Item> itemList, ArrayList<Integer> quantityList, String address) {
		//orderID is set only when order is confirmed
		sum=0f;
		this.customerUsername=username;
		this.dateOrdered=dateOrdered;
		this.itemList=itemList;
		this.quantityList=quantityList;
		this.staffUsername="Not_Yet_Decided";
		this.status="Pending for Payment";
		/* payMethod   is set when order is confirmed */
		for(int i=0;i<itemList.size();i++)
		{
			sum+= ((Item) itemList.get(i)).getItem_Price() * (float)quantityList.get(i) ;
		}
		this.cardNumber=null;
		this.deliverAddress=address;
	}

	public Order(int order_ID, String customerUsername, String dateOrdered, String deliverAddress, 
			     String payMethod, String staffUsername, String status, String Item, float sum)
	{
		ArrayList<Item> itemList= new ArrayList<Item>();
		ArrayList<Integer> quantityList= new ArrayList<Integer>();
		String tempCardNumber=null;
		itemList.clear();
		quantityList.clear();
		String[] tempData=payMethod.split("+");
		this.order_ID=order_ID;
		this.customerUsername=customerUsername;
		this.dateOrdered=dateOrdered;
		
		tempData=Item.split("+");
		for(int i=0;i<tempData.length;i++)
		{
			String[] tempData2=tempData[i].split("*");
			Item item1 = new Item();
			item1.setItem_Name(tempData2[0].replace("_", " "));
			itemList.add(item1);
			quantityList.add(Integer.parseInt(tempData2[1]));
		}
		this.setItemList(itemList);
		this.setQuantityList(quantityList);
		this.status = status;          //Pending for payment, Preparing, Delivered
		this.payMethod=payMethod;		// COD or BankTransfer
		if(tempData[0]=="PayByCard")
			this.cardNumber=tempData[1];
		else
			cardNumber="Unknown";
		deliverAddress.replace("_", " ");
		this.deliverAddress=deliverAddress;
		this.staffUsername=staffUsername;
		this.sum=sum;
	}

	public Order(String orderTxt) {
		// TODO Auto-generated constructor stub
		ArrayList<Item> itemList= new ArrayList<Item>();
		ArrayList<Integer> quantityList= new ArrayList<Integer>();
		String tempCardNumber=null;
		itemList.clear();
		quantityList.clear();
		
		String[] tempData = orderTxt.split(" ");
		for(int i=0;i<tempData.length;i++)
			System.out.println(i+"   "+tempData[i]);
		//orderID  CustUsername  date address payMethod Staffusername status item*quantity sum   
		this.setOrder_ID(Integer.parseInt(tempData[0]));
		this.setCustomerUsername(tempData[1]);
		this.setDateOrdered(tempData[2]);
		this.setDeliverAddress(tempData[3]);
		String[] tempCard = tempData[4].split("-");
			this.setPayMethod(tempCard[0]);
			this.setCardNumber(tempCard[1]);
		this.setStaffUsername(tempData[5]);
		this.setStatus(tempData[6]);
				String[] tempITEMWITHQUANTITY = tempData[7].split("-");
				for(int i=0;i<tempITEMWITHQUANTITY.length/2;i++)
				{
					Item item1=new Item(tempITEMWITHQUANTITY[0+(i*2)]);
					itemList.add(item1);
					quantityList.add(Integer.parseInt(tempITEMWITHQUANTITY[1+(i*2)]));
				}
		this.setSum(Float.parseFloat(tempData[8]));
		
	}
	
	
	
	
	
	

}
