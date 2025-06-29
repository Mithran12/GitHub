CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE Accounts
  SET Balance = Balance * 1.01
  WHERE AccountType = 'Savings';
  
  COMMIT;
END;
/
BEGIN
  ProcessMonthlyInterest;
END;
/
SELECT * FROM Accounts WHERE AccountType = 'Savings';
