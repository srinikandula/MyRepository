package com.samples.meenakshi;
public class InsufficientBalanceException extends Exception {
	public static void main(String[] args) {
		
		
		InsufficientBalanceException e = new InsufficientBalanceException();
		int i = 10;
		System.out.println(e);
	}
	
	@Override
	public String toString() {
		return "Insufficient Balance";
	}
}

<<<<<<< .mine
	private static final long (account number) {
    private String account;
    
	}
    	
    public InsufficientBalanceException( String account ) {
        super();
        this.account = account;
    }
    
    public String getMessage() {
        return "The account "+account+" is not sufficiently balanced.";
    }
}=======
>>>>>>> .r41
