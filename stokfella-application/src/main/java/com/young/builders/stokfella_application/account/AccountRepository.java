package com.young.builders.stokfella_application.account;

import com.young.builders.stokfella_application.user.User;
import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account, Integer> {
    Account findByCreatedBy(User user);

}
