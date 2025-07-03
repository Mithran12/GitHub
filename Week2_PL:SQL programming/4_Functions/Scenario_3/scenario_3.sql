SET SERVEROUTPUT ON
DECLARE
    p_account_id NUMBER := 1;
    p_amount NUMBER := 500;
    v_balance NUMBER := 1000;  
    v_result VARCHAR2(10);
BEGIN
    IF v_balance >= p_amount THEN
        v_result := 'TRUE';
    ELSE
        v_result := 'FALSE';
    END IF;

    DBMS_OUTPUT.PUT_LINE('Has Sufficient Balance? ' || v_result);
END;
/
SELECT CASE
         WHEN 1000 >= 500 THEN 'TRUE'
         ELSE 'FALSE'
       END AS Has_Sufficient
FROM dual;
