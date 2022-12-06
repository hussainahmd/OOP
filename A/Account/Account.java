public class Account {
   private String name; // instance variable 
   private double balance; // instance variable 

   public Account(String name, double balance) {
      this.name = name; // assign name to instance variable name

      if (balance > 0.0) { // if the balance is valid
         this.balance = balance; // assign it to instance variable balance
      }
   }
   public void deposit(double moreMoney) {      
      if (moreMoney > 0.0) { // if the moreMoney is valid
         balance = balance + moreMoney; // add it to the balance 
      }
   }
   public double getBalance() {
      return balance; 
   } 
   public void setName(String name) {
      this.name = name; 
   } 
   public String getName() {
      return name; 
   } 
}
