package am.cs322.presentation;

import am.cs322.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/transactions")
public class TransactionControllerImpl implements TransactionController {


    TransactionService transactionService;

    public TransactionControllerImpl(TransactionService tS) {
        this.transactionService = tS;
    }

    @PostMapping("credit")
    public void createCreditAccount() {
        transactionService.createCreditAccount();
    }

    @PostMapping("debit")
    public void createDebitAccount() {
        transactionService.createDebitAccount();
    }
}