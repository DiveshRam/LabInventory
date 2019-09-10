public class Item {
              /*attributes*/
	
              private int quantity;
              private int contactNum;
              private String name;
              private String itemID;
              private String description; 
              private String category; 
              private String supplierName;
              private double price;
              
              /*constructors*/
              
              public Item(int quantity,int supplierContact,String name,String itemID,String description,String category,String supplierName,double price) {
                           super();
              
                           this.name = name;
                           this.itemID = itemID;
                           this.description = description;
                           this.quantity = quantity;
                           this.contactNum = contactNum;
                           this.category = category;
                           this.supplierName = supplierName;
                           this.price = price;
              }
              
              
              public Item(String itemID2, String name2, String description2, String category2, String supplierName2,
                                         int contactNum2, double price2, int quantity2) {
                           // TODO Auto-generated constructor stub
              }
              
              /*getters*/
              
              public int getQuantity() {
                           return quantity;
              }

              public int getcontactNum() {
                           return contactNum;
              }

              public String getName() {
                           return name;
              }

              public String getItemID() {
                           return itemID;
              }

              public String getDescription() {
                           return description;
              }

              public String getCategory() {
                           return category;
              }

              public String getSupplierName() {
                           return supplierName;
              }

              public double getPrice() {
                           return price;
              }
              
              /*setters*/
              
              public void setQuantity(int quantity) {
                           this.quantity = quantity;
              }

              public void setcontactNum(int contactNum) {
                           this.contactNum = contactNum;
              }

              public void setName(String name) {
                           this.name = name;
              }

              public void setItemid(String itemID) {
                           this.itemID = itemID;
              }

              public void setDescription(String description) {
                           this.description = description;
              }

              public void setCategory(String category) {
                           this.category = category;
              }

              public void setSupplierName(String supplierName) {
                           this.supplierName = supplierName;
              }

              public void setPrice(double price) {
                           this.price = price;
              }

              @Override
              public String toString() {
                           return (this.itemID + " " + this.name + " " + this.description+" "+this.category+" "
              +this.supplierName+" "+this.contactNum+" "+this.price+" "+this.quantity+" ");
              }

}
