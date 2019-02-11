/* William Turner. This is the GovernmentContract class. It represents a contract that can only be bid on by
 * government contractors.*/
public class GovernmentContract extends Contract {
  
  // says whether or not a government contract is currently accepting bids.
  private boolean isacceptingbids;
  
  // stores the bid with the highest value that has been made so far.
  private Bid bestbid;
  
  // says whether or not a government contract is currently completed.
  private boolean complete;
  
  // stores the date on which a government contract was completed.
  private Date completedate;
  
  public GovernmentContract(String id, double minvalue, double maxvalue, Date deadline, double bonus, double penalty) {
    
    super(id, minvalue, maxvalue, deadline, bonus, penalty);  
  }
  
  /* sets the given bid as the bestbid for a contract if the contract is accepting bids, the bid is associated with the
   * contract, the bid value is within the appropriate values for the contract, the Contractor associated with the bid
   * is government contractor, and the bid is either the first bid to be made or has a greater value than the
   * current first bid. Otherwise returns false. */
  public boolean makeBid(Bid bd) {
   
    if (this.isAcceptingBids() 
          && this.equals(bd.getContract()) 
          && bd.getValue() <= this.getMaxValue() 
          && bd.getValue() >= this.getMinValue() 
          && bd.getContract() instanceof GovernmentContract) {
      
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
}