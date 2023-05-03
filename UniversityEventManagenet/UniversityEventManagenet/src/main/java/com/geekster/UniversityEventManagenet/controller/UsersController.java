package com.geekster.UniversityEventManagenet.controller;

import com.geekster.UniversityEventManagenet.model.Users;
import com.geekster.UniversityEventManagenet.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UsersService usersService;
// get All Student
    @GetMapping(value="/getAllStudents")
    public Iterable<Users> getUsers(){
        return usersService.getAllUsers();
    }
    //Add list of Student
    @PostMapping("/users")
    public String  insertUsers( @RequestBody List<Users> usersList){
        return usersService.addUsers(usersList) ;
    }
    //delete Student By id
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteUserById(@PathVariable Integer id){
        usersService.removeUserById(id);
    }
    //getStudent by last name
    @GetMapping(value="/users/{name}")
    public List<Users> getUsersByName(@PathVariable  String name){
        return usersService.fetchUserByName(name);
    }
    // update Student department by id

@PutMapping(value="updateDepartment/{department}/id/{id}")
    public void updateDepartmentById(@PathVariable String department, @PathVariable Integer id){
        usersService.updateDepartmentById(department,id);
}

}
