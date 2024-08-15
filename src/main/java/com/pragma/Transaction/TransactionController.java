package com.pragma.Transaction;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @GetMapping()
    public String getTransactions() {
        return "Hola Mundo";
    }
    @GetMapping("/:{id}")
    public String getTransaction(@PathVariable String id) {
        return "";
    }
    @PostMapping()
    public String postTransaction() {
        return "";
    }
    @DeleteMapping()
    public String deleteTransaction() {
        return "";
    }
    @PutMapping("/:{id}")
    public String putTransaction(@PathVariable String id) {
        return "";
    }
}
