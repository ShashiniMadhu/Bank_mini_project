Part 1 

The bank contains account holders and intends to store their full name, birthday, and address.
Using the user details, bank accounts can be created. A bank account comprises the account holder's details, account number, balance, and account type (which could be either Savings or Fixed Deposit). 
Savings accounts can be indicated by the string "sa" and Fixed Deposits as "FD". 
Withdrawals and deposits can be performed with this bank account. 
  1. Create the relevant classes to represent the real-world data. 
  2. Create a few instances of users and bank accounts associated with them. 
  3. Perform a few deposits and withdrawals by calling bank account instances. 
  4. Add a method to check the balance and retrieve the current balance.

Part 2 

A user should be able to determine the total value he/she could get back for a given period (in years) considering the current available balance. 
The interest rate should be determined based on the following factors: 

    • If it's a savings account, then a flat rate of 2% per annum. 
  
    • If it's an FD account and the interest rate is being calculated for less than 2 years, then the rate would be 12.5% per annum. 
  
    • If it's an FD account and the interest rate is being calculated for less than 5 years, then the rate would be 16.5% per annum. 
  
    • If it's an FD account and the interest rate is being calculated for equal to or more than 5 years, then the rate would be 20% per annum. 
  
Eg: if the user's current balance is 1000 and the given period is 2 and if the bank account is a savings account, then for 2 years the total value the user can get back is 1040

Part 3 

Think about a situation where a user enters an amount that is greater than the balance. In that sort of situation, the system should display a message saying not enough balance and display balance. Further users should be able to re-enter the amount after a failed attempt. (Use a while loop for implementation)

Part 4 

Account holder details in the bank account are duplicated as the data for those fields were passed manually using account holder details. Instead, The Account Holder details should be passed directly as an object 
The deposits and withdrawal history need to be retrieved. As the 1st step, record and query all the past withdrawal and deposit amounts in ascending order from the past 
Also, write another method to query the withdrawals starting from the most recent withdrawal to the past. 
