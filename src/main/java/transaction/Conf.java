package transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class Conf {
    @Autowired
    DataSource dataSource;
    @Bean
    public TransactionManager transactionManager() {

        return new DataSourceTransactionManager(dataSource);
    }
}
