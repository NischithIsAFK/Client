package com.nis.Client.repository;

import com.nis.Client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    default User addNewUser(User user){
        return save(user);
    }
    default User updateUser(User user) {
        return  save(user);
    }
    default void deleteUser(long id) {
        deleteById(id);
    }
}
