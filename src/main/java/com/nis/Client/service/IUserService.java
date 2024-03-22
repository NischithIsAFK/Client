package com.nis.Client.service;

import com.nis.Client.entity.User;

public interface IUserService {
    public User addNewUser(User user);
    public User updateUser(User user);
    public User login(User user);
    public  Boolean logOut();

}
