package com.bank.account;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {
        return new Account(number, "savings", 234343);
    }

    record Account(String number, String type, double balance) {}
}
