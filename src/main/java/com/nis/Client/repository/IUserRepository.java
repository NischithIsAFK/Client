package com.nis.Client.repository;

import com.nis.Client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    default User addNewUser(User user){
        Assert.isNull(user.getId(),"User ID should be null");
        return save(user);
    }
    default User updateUser(User user) {
        Assert.notNull(user.getId(),"User ID should not be null");
        return  save(user);
    }
    default void deleteUser(Long id) {
        Assert.notNull(id, "User ID should not be null");
        deleteById(id);
    }
}
