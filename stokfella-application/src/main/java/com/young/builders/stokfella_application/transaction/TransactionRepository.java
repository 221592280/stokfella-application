package com.young.builders.stokfella_application.transaction;

import com.young.builders.stokfella_application.account.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
    List<Transaction> findByAccount(Account account);
}
