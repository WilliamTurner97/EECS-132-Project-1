/*William Turner. This is the Contract class. It represents a Contract that can be bid on.*/
public class Contract {
  
  // stores the ID number for this contract
  private String id;
  
  // stores the minimum value a bid for this contract can have.
  private double minvalue;
  
  // stores the maximum value a bid for this contract can have.
  private double maxvalue;
  
  // stores a deadline that the contract should be completed by.
  private Date deadline;
  
  // stores the bonus, which will later determine how much a contractor is paid.
  private double bonus;
  
  // stores a penalty, which will also be used in determining how much a contractor is paid.
  private double penalty;
  
  // represents whethor or not it is possible to make a bid for this contract.
  private boolean isacceptingbids;
  
  // stores the bid with the highest value that has been made so far.
  private Bid bestbid;
  
  // represents whether or not the contract has been completed.
  private boolean complete;
  
  // stores the date on which the contract was completed.
  private Date completedate;
  
  public Contract( String id, double minvalue, double maxvalue, Date deadline, double bonus,
		  			double penalty) {
    
    this.id = id;
    this.minvalue = minvalue;
    this.maxvalue = maxvalue;
    this.deadline = deadline; 
    this.bonus = bonus;
    this.penalty = penalty;
    this.isacceptingbids = true;
    this.complete = false;
    this.bestbid = null;   
  }
    
  // gets the ID for the contract
  public String getID() {
    
    return id;  
  }
  
  
  // gets the minimum value a bid for the contract can be.
  public double getMinValue() {
    
    return minvalue;   
  }
  
  //  sets a new minimum value that a bid for the contract can have.
  public void setMinValue(double minv) {
    
    minvalue = minv;  
  }
  
  // gets the maximum value a bid for the contract can have.
  public double getMaxValue() {
    
    return maxvalue;    
  }
  
  // sets a new maximum value that a bid for the contract can have.
  public void setMaxValue(double maxv) {
    
    maxvalue = maxv;  
  }
  
  // gets the date a contract should be completed by.
  public Date getDeadline() {
    
    return deadline; 
  }
  
  // changes the date a contract should be completed by.
  public void setDeadline(Date d) {
    
    deadline = d;  
  }
  
  // gets the bonus for a contract.
  public double getBonus() {
    
    return bonus;    
  }
  
  // changes the bonus for a contract.
  public void setBonus(double b) {
    
    bonus = b;   
  }
  
  // gets the penalty for a contract.
  public double getPenalty() {
    
    return penalty;   
  }
  
  // changes the penalty for a contract.
  public void setPenalty(double p) {
    
    penalty = p;   
  }
  
  // tests if two Contracts are equal by comparing their ID numbers
  public boolean equals(Contract c) {
    
    if ( (this.id).equals(c.getID()) )
      return true;
    else
      return false;   
  }
  
  // tells whether or not a contract is accepting bids
  public boolean isAcceptingBids() {
    
    if (isacceptingbids)
      return true;
    else
      return false;  
  }
  
  // returns the Bid with the highest value that has been made so far.
  public Bid getBestBid() {
    
    return bestbid;   
  }
  
  /* sets the given bid as the bestbid for a contract if the contract is accepting bids, the bid is associated with the
   * contract, the bid value is within the appropriate values for the contract, and the bid is either the first
   bid to be made or has a greater value than the current first bid. Otherwise returns false. */
  public boolean makeBid(Bid bd) {
    
    if (isacceptingbids 
        && this.equals(bd.getContract()) 
        && bd.getValue() <= maxvalue 
        && bd.getValue() >= minvalue ) {
      
      if (bestbid == null) {
        
        bestbid = bd;
        return true; 
      }
      
      else
        if (bd.getValue() > bestbid.getValue() ) {
           
        bestbid = bd;
        return true; 
        }
        
        else
          return false; 
    }
    
    else 
      return false;
  }
  

  // makes a contract unable to accept bids.
  public void awardContract() {
    
    isacceptingbids = false;    
  }
  
  // checks whether or not a contract has been completed.
  public boolean isComplete() {
    
    if (complete)
      return true;
    else 
      return false;  
  }
  
  // gets the date a contract was completed if it has been completed. Otherwise returns null.
  public Date completeDate() {
    
    if (complete)
      return completedate; 
    else
      return null;    
  }
  
  /* Makes a contract complete, gives it a complete date, and pays the contractor the value of the bid plus or minus the
   * bonus or penalty times the number of days early or late, respectively.*/
  public void setComplete(Date dd) {
    
    complete = true;
   
    completedate = dd; 
    
    isacceptingbids = false;
   
    // stores number of days from the deadline the contract was completed
    double difference = (deadline.daysFromJan1() - completedate.daysFromJan1());
   
    // stores the modifier to the value of the contract. Contractor is paid value + mod. 
    double mod;
   
    if (difference > 0)
      mod = (difference * bonus);
    else
      mod = (difference * penalty);
   
    ( bestbid.getContractor() ).pay( (bestbid.getValue()) + mod );   
  }  
}