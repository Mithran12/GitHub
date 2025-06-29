CREATE OR REPLACE PROCEDURE SafeTransferFunds (
  p_fromAccountID IN NUMBER,
  p_toAccountID IN NUMBER,
  p_amount IN NUMBER
) AS
  v_balance NUMBER;
BEGIN
  -- Lock and check balance
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_fromAccountID
  FOR UPDATE;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds.');
  END IF;

  -- Deduct from source
  UPDATE Accounts
  SET Balance = Balance - p_amount
  WHERE AccountID = p_fromAccountID;

  -- Add to destination
  UPDATE Accounts
  SET Balance = Balance + p_amount
  WHERE AccountID = p_toAccountID;

  COMMIT;

EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
BEGIN
  SafeTransferFunds(1, 2, 100);
END;
/
BEGIN
  SafeTransferFunds(1, 2, 100000);
END;
/
