package transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class AService {
    @Autowired
    Trans tx;
    @Transactional
    public void tttt() {
        TransactionSynchronizationManager.registerSynchronization(tx);
    }
}
