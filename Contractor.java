/* William Turner. This is the Contractor class. It represents a contractor that can make bids on contracts. */
public class Contractor {
 
  // stores the name of a contractor.
  private String name;
  
  // stores the address of a contractor.
  private String address;
  
  // stores a personal contact for the contractor.
  private String contact;
  
  // stores the amount that a contractor has been paid so far.
  private  double balance;
  
  public Contractor(String name, String address, String contact, double balance){
    
    this.name = name;   
    this.address = address;
    this.contact = contact; 
    this.balance = balance;  
  }
  
  // gets the name of a contractor.
  public String getName() {
    
    return name;   
   }
  
  // changes the name of a contractor.
  public void setName(String n) {
       
    name = n;      
   }
     
  // gets the address of a contractor.
  public String getAddress() {
       
    return address;     
   }
     
  // changes the address of a contractor.
  public void setAddress(String a) {
       
    address = a;          
   }
     
  // gets the personal contact for a contractor.
  public String getContact() {
         
    return contact;            
  }
     
  // changes the personal contact for a contractor.
  public void setContact(String c) {
       
    contact = c;        
  }
     
  // gets the amount a contractor has been paid so far.
  public double getAmountPaid() {
       
    return balance;      
  }
     
  // pays the contractor the amount put in.
  public void pay(double p) {
       
    balance = balance + p;      
  }
     
  // gives name and address for a contractor.
  public String toString() {
       
    return name + ":" + address;       
  }  
}