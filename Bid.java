/* William Turner. This is the Bid class. This class represents the bid that a contractor is able to make for a 
 * contract.*/
public class Bid {
  
  // stores the Contract that is associated with this bid.
  private Contract bidcontract;
  
  // stores the Contractor that is associated with this bid.
  private Contractor bidcontractor;
  
  // represents the value of the contract so that it can be compared to other contracts.
  private double value;
  
  public Bid (Contract bidcontract, Contractor bidcontractor, double value) {
    
    this.bidcontract = bidcontract; 
    this.bidcontractor = bidcontractor;  
    this.value = value;  
  }
   
  // gets the Contract that is associated with this bid.
  public Contract getContract() { 
	  
    return bidcontract;   
  }
  
  // gets the Contractor that is associated with this bid.
  public Contractor getContractor() {
	  
    return bidcontractor;  
  }
  
  // gets the value for this bid
  public double getValue() {
    
    return value;  
  } 
}