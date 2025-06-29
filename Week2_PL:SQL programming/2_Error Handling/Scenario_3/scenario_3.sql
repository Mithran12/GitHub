CREATE OR REPLACE PROCEDURE AddNewCustomer (
  p_customerID IN NUMBER,
  p_name IN VARCHAR2,
  p_dob IN DATE,
  p_balance IN NUMBER
) AS
BEGIN
  INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified, IsVIP)
  VALUES (p_customerID, p_name, p_dob, p_balance, SYSDATE, 'FALSE');

  COMMIT;

EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: Customer with ID ' || p_customerID || ' already exists.');
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Other Error: ' || SQLERRM);
END;
/
BEGIN
  AddNewCustomer(3, 'New Customer', TO_DATE('1980-01-01', 'YYYY-MM-DD'), 5000);
END;
/
BEGIN
  AddNewCustomer(1, 'Duplicate Customer', TO_DATE('1990-01-01', 'YYYY-MM-DD'), 5000);
END;
/
