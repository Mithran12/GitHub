CREATE OR REPLACE PROCEDURE UpdateSalary (
  p_employeeID IN NUMBER,
  p_percent IN NUMBER
) AS
  v_count NUMBER;
BEGIN
  -- Check if employee exists
  SELECT COUNT(*)
  INTO v_count
  FROM Employees
  WHERE EmployeeID = p_employeeID;

  IF v_count = 0 THEN
    RAISE_APPLICATION_ERROR(-20002, 'Employee not found.');
  END IF;

  -- Update salary
  UPDATE Employees
  SET Salary = Salary + (Salary * p_percent / 100)
  WHERE EmployeeID = p_employeeID;

  COMMIT;

EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
BEGIN
  UpdateSalary(1, 5);
END;
/
BEGIN
  UpdateSalary(999, 10);
END;
/
