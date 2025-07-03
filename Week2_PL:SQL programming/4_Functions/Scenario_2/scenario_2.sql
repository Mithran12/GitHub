SET SERVEROUTPUT ON
DECLARE
    p_loan_amount NUMBER := 10000;
    p_annual_rate NUMBER := 5;
    p_years NUMBER := 5;
    v_monthly_rate NUMBER;
    v_num_payments NUMBER;
    v_installment NUMBER;
BEGIN
    v_monthly_rate := p_annual_rate / 12 / 100;
    v_num_payments := p_years * 12;

    IF v_monthly_rate = 0 THEN
        v_installment := p_loan_amount / v_num_payments;
    ELSE
        v_installment := p_loan_amount * v_monthly_rate / (1 - POWER(1 + v_monthly_rate, -v_num_payments));
    END IF;

    v_installment := ROUND(v_installment, 2);

    DBMS_OUTPUT.PUT_LINE('Monthly Installment: ' || v_installment);
END;
/
SELECT ROUND(
    10000 * (5/12/100) / (1 - POWER(1 + (5/12/100), -60))
, 2) AS Monthly_Installment FROM dual;
