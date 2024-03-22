package com.nis.Client.repository;

import com.nis.Client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    public User addNewUser(User user);
    public  User updateUser(User user);
    public Boolean deleteUser(long id);
}
