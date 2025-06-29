CREATE OR REPLACE PROCEDURE TransferFunds (
  p_fromAccountID IN NUMBER,
  p_toAccountID IN NUMBER,
  p_amount IN NUMBER
) AS
  v_balance NUMBER;
BEGIN
  -- Check balance
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_fromAccountID
  FOR UPDATE;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
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
END;
/
BEGIN
  TransferFunds(1, 2, 200);
END;
/
