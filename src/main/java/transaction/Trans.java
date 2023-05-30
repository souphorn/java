package transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronization;

@Service
public class Trans implements TransactionSynchronization {

    @Override
    public void afterCommit() {
        System.out.println("kkkkkkkkkkk");
    }
}
