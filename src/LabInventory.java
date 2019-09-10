import java.util.Scanner;
/**
 * author Divesh
 */
public class LabInventory {
	
	/**
	 * @param args
	 */

   public LabInventory() {
  // TODO Auto-generated constructor stub
              }

       public static void main(String[] args) {
         // TODO Auto-generated method stub
                           
          Scanner myKeyboard = new Scanner(System.in);
                  
          String password = "DitProg123";
                           
          String itemID;
          String name;
          String description;
          String category;
          String supplierName;
          double price;
          int quantity;
          int contactNum;
                                                       
          System.out.println("Hello: Welcome To The  Electronics Lab Store");
                           
               int choice = 0, n = 0;
               int arr, i, index;
               System.out.println("Enter maximum number of item:");
               arr = myKeyboard.nextInt();
                           
               Item itemDatabase[] = new Item[arr];
                           
          System.out.println("Please fill in the corresponding values: ");
                           
                for(i = 0; i < arr; i++)
                  {
          System.out.println("Item ID: ");
                    itemID = myKeyboard.next();
                                         
          System.out.println("Name: ");
                 name = myKeyboard.next();
                                         
          System.out.println("Description: ");
                  description = myKeyboard.next();
                                         
          System.out.println("Category: ");
                 category = myKeyboard.next();
                                         
          System.out.println("Supplier Name: ");
                 supplierName = myKeyboard.next();
                                         
          System.out.println("Contact Number: ");
                 contactNum = myKeyboard.nextInt();
                                         
          System.out.println("Price: ");
                 price = myKeyboard.nextDouble();
                                         
          System.out.println("Quantity: ");
                 quantity = myKeyboard.nextInt();
                                         
                 itemDatabase[i] = new Item(itemID, name, description, category, supplierName, contactNum, price, quantity);
                 itemDatabase[i].setItemid(itemID);
                 itemDatabase[i].setName(name);
                 itemDatabase[i].setDescription(description);
                 itemDatabase[i].setCategory(category);
                 itemDatabase[i].setSupplierName(supplierName);
                 itemDatabase[i].setcontactNum(contactNum);
                 itemDatabase[i].setPrice(price);
                 itemDatabase[i].setQuantity(quantity);
                                         
                 System.out.println(itemDatabase[i].toString());
                                         
                 System.out.println("Item ID:"+"Name:"+"Description:"+"Category:"+"Supplier name:"+"Contact Number:"+"Price:"+"Available Qty:");
                 for (int j = 0; j < n; j++)
                 {
                 System.out.println(itemDatabase[j]);
                }
                                         
                 while (true)
                {
                 int attmpt = 0;
                 for(attmpt = 0;attmpt>=0;attmpt++)
                {
                 System.out.println("What do you want to do?");
                                                                    
                 System.out.println("1.Enter a new item to the inventory(password required) \n2"
                 + ".Change information of an existing Item(Password required)"
                 + "\n3.Display all the items with the specified category\n4.Display all items to re-ordered\n5"
                 + ".Number of items currently in store\n6.Quit");
                  
                 System.out.println("Please enter your choice >");
                 choice = myKeyboard.nextInt();
                                                                    
                 if (choice == 1){
                 int count = 0;
                                                                                  
                 for(count=0;count<=3;count+=1){
                 System.out.println("Enter Password:");
                 password = myKeyboard.next();
                                                                                                
                 if(password.equals(password)){
                 System.out.println("How many items do you want to add?");
                 int nItem = myKeyboard.nextInt();
                                                                                                             
                 if (nItem <= arr){
                 for (i = (n);i<(n+nItem);i++){
                 System.out.println("Item ID: ");
                 itemID = myKeyboard.next();
                                                                                                                                         
                 System.out.println("Name: ");
                 name = myKeyboard.next();
                                                                                                                                         
                 System.out.println("Description: ");
                 description = myKeyboard.next();
                                                                                                                                         
                 System.out.println("Category: ");
                 category = myKeyboard.next();
                                                                                                                                         
                 System.out.println("Supplier Name: ");
                 supplierName = myKeyboard.next();
                                                                                                                                         
                 System.out.println("Contact: ");
                 contactNum = myKeyboard.nextInt();
                                                                                                                                         
                 System.out.println("Price: ");
                 price = myKeyboard.nextDouble();
                                                                                                                                         
                 System.out.println("Quantity: ");
                 quantity = myKeyboard.nextInt();
                                                                                                                                         
                 itemDatabase[i].toString();
                 }
                                                                                                                           
                 System.out.println( itemDatabase[i] + "/t");
                  break;
                 }
                                                                                                             
                 else if(!password.equals(password)){
                 System.out.println("Invalid password!");
                                                                                                                           
                 if (count==2){
                 continue;
                 }
                 
                 else if (count == 3){
                 System.out.println("Program detected suspicious activity and terminating!");
                 break;
               	 }
            }
         }
     }
 }
                if (choice == 2){
                int count = 0;
                for(count=0;count<=3;count+=1){
                System.out.println("Enter Password:");
                password = myKeyboard.next();
                                                                                                
                if(password.equals(password)){
                System.out.println("Enter the item ID to update: ");
                String id_input = myKeyboard.next();
                                                                                                             
                for(i = 0; i < n; i++){
                String item_id_selected = itemDatabase[i].getItemID();
                                                                                                                           
                if(item_id_selected.equals(id_input)){
                index =i;
                                                                                                                                         
                System.out.println("Item:");
                System.out.println(itemDatabase[index]);
                                                                                                                                         
                System.out.println("Item ID: " + itemDatabase[index].getItemID());
                System.out.println("Name: " + itemDatabase[index].getName());
                System.out.println("Description: " + itemDatabase[index].getDescription());
                System.out.println("Category: " + itemDatabase[index].getCategory());
                System.out.println("Supplier Name: " + itemDatabase[index].getSupplierName());
                System.out.println("Contact: " + itemDatabase[index].getcontactNum());
                System.out.println("Price: " + itemDatabase[index].getPrice());
                System.out.println("Quantity: " + itemDatabase[index].getQuantity());
                                                                                                                                         
                break;
                }
                else{
                                                                                                                                         
                 				}
                                                                                                                           
                		}
                  }
               else if(!password.equals(password))
               {
               System.out.println("Incorrect Password");
                }
                                                                                  
                }
               if (count==2)
                                                                                                
               {
              break;
              }            
         }
       }            
     }
   }
                           
             myKeyboard.close();
      }


}