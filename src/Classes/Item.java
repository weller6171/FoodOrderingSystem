package Classes;

public class Item {
	
	private int item_ID;
	private String item_Type;			//Beverage/ Dessert / Food
	private String item_Pic;
	private String item_Name;			//Name
	private String item_Content;
	private float item_Price;
	
	public Item(int item_ID, String item_Type, String item_Pic, String item_Name, String item_Content,float item_Price) {
		// TODO Auto-generated constructor stub
		this.item_ID=item_ID;
		this.item_Type=item_Type;
		this.item_Pic=item_Pic;
		this.item_Name=item_Name;
		this.item_Content= item_Content;
		this.item_Price=item_Price;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(String item_Name) {
		this.setItem_Name(item_Name);
		
		// TODO Auto-generated constructor stub
	}

	public int getItem_ID() {
		return item_ID;
	}
	public String getItem_Type() {
		return item_Type;
	}
	public String getItem_Pic() {
		return item_Pic;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public String getItem_Content() {
		return item_Content;
	}
	public float getItem_Price() {
		return item_Price;
	}
	public void setItem_ID(int item_ID) {
		this.item_ID = item_ID;
	}

	public void setItem_Type(String item_Type) {
		this.item_Type = item_Type;
	}

	public void setItem_Pic(String item_Pic) {
		this.item_Pic = item_Pic;
	}

	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}

	public void setItem_Content(String item_Content) {
		this.item_Content = item_Content;
	}

	public void setItem_Price(float item_Price) {
		this.item_Price = item_Price;
	}
	
	
	
	
	

}
