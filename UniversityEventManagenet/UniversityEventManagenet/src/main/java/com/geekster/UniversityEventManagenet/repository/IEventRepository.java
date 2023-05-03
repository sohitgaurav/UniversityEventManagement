package com.geekster.UniversityEventManagenet.repository;

import com.geekster.UniversityEventManagenet.model.Event;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepository extends CrudRepository<Event,Integer> {
    @Modifying
    @Query(value="update EVENT set EVENT_NAME =:event where EVENT_ID =:id",nativeQuery = true)
    void updateEventById(String event, Integer id);



    @Modifying
    @Query(value="delete from Event where EVENT_ID =:id",nativeQuery = true)
    void deleteEventById(Integer id);
   @Query(value="select * from Event where DATE =:myDate",nativeQuery = true)
    public List<Event> getEventById(LocalDate myDate);
}
