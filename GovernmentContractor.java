/* William Turner. This is the GovernmentContractor class. It represents a government contractor that is allowed
 * to bid on government contracts. */
public class GovernmentContractor extends Contractor {
  
  public GovernmentContractor(String name, String address, String contact, double balance) {
    
    super(name, address, contact, balance);    
  }
  
  /* returns the name and address of a government contractor, as well as a confirmation that they are an approved 
   * government contractor*/
  public String toString() {
       
    return (this.getName()) + ":" + (this.getAddress()) + ": approved government contractor";      
  } 
}