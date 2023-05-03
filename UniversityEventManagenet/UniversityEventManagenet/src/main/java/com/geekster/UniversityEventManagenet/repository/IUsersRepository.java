package com.geekster.UniversityEventManagenet.repository;

import com.geekster.UniversityEventManagenet.model.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUsersRepository extends CrudRepository<Users,Integer> {
    // delete by id
    @Modifying
    @Query(value="delete from USERS where id= :id",nativeQuery = true)
    public void deleteById(Integer id);

@Query(value ="select * from Users where Last_Name =:name ",nativeQuery = true)
   public  List<Users> findByLastName(String name);

   @Modifying
    @Query(value="update USERS set DEPARTMENT =:department where ID =:id",nativeQuery = true)
    public void updateDepartmentById(String department, Integer id);
}
