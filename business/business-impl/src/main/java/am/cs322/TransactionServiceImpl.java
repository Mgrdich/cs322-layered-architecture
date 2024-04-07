package am.cs322;

import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{
    @Override
    public void createDebitAccount() {
        System.out.println("Debit Account");
    }

    @Override
    public void createCreditAccount() {
        System.out.println("Credit Account");
    }
}
