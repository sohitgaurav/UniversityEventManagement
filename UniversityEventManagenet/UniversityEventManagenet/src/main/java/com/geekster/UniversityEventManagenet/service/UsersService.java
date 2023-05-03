package com.geekster.UniversityEventManagenet.service;

import com.geekster.UniversityEventManagenet.model.Users;
import com.geekster.UniversityEventManagenet.repository.IUsersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    IUsersRepository usersRepository;


    public Iterable<Users> getAllUsers() {
        Iterable<Users> allUsers=   usersRepository.findAll();
        return allUsers;
    }
    public String  addUsers(List<Users> usersList) {
        Iterable<Users> addedUsers= usersRepository.saveAll(usersList);
        if(addedUsers!=null)
            return "yes";
        else
            return "no";

    }
  @Transactional
    public void removeUserById(Integer id) {
        usersRepository.deleteById(id);
    }
    public List<Users> fetchUserByName(String name) {
        return usersRepository.findByLastName(name);
    }

   @Transactional
    public void updateDepartmentById(String department, Integer id) {
        usersRepository.updateDepartmentById(department,id);
    }
}
