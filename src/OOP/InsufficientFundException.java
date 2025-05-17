package OOP;

class Account{
	private double balance;
	public Account(double balance) {
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount)  throws InsufficientFundException{ 
		 if (amount > balance) {
	            double shortfall = amount - balance;
	            throw new InsufficientFundException(shortfall);
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful! New balance: $" + balance);
	        }
	}
	
	
}

class InsufficientFundException extends Exception {
	double amount;
	
	InsufficientFundException(double amt){
		amount = amt;
	}
	
	public static void main(String[] args) {
        Account account = new Account(1000.0);  // Create an account with a balance of 1000
        
        try {
            account.withdraw(1200); // Attempt to withdraw more than the balance
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
        
        // Deposit some money and try again
        account.deposit(500);
        
        try {
            account.withdraw(800); // Withdraw within the balance
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
	
	
	 
}

