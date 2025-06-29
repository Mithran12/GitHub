CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  deptName IN VARCHAR2,
  bonusPercent IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonusPercent / 100)
  WHERE Department = deptName;
  
  COMMIT;
END;
/
BEGIN
  UpdateEmployeeBonus('IT', 10);
END;
/
SELECT * FROM Employees WHERE Department = 'IT';
