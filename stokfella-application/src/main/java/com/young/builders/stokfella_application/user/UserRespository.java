package com.young.builders.stokfella_application.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository<User, Integer> {
    User findByUsernameAndPassword(String username, String password);
}
