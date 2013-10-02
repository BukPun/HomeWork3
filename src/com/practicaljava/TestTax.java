package com.practicaljava;
class TestTax{
    public static void main(String[] args){
    	int dependents = 0;
    	String state = "NJ";
 
    	if (args.length < 2){
    		
    		System.out.println("Sample usage of the programm: " + "java TestTax 50000 NJ 2");
    		
    		System.exit(0);
    	} else if (args.length == 2){

        	dependents = Integer.parseInt(args[1]);
    	} else{
    		state = args[1];
        	dependents = Integer.parseInt(args[2]); 		
    	}

    	double grossIncome = Double.parseDouble(args[0]); // local variables
    	
    	
    	Tax   t = new Tax(grossIncome, state, dependents);
    	
    	double yourTax = t.calcTax(); //calculating tax
    	
    	// Printing the result
    	System.out.println("Your tax is " + yourTax);
    } 
}
