BEGIN
  FOR loan_rec IN (
    SELECT 
      l.LoanID, 
      l.CustomerID, 
      c.Name, 
      l.EndDate
    FROM 
      Loans l
      JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE 
      l.EndDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ID ' || loan_rec.LoanID ||
      ' for customer ' || loan_rec.Name ||
      ' is due on ' || TO_CHAR(loan_rec.EndDate, 'YYYY-MM-DD')
    );
  END LOOP;
END;
/
