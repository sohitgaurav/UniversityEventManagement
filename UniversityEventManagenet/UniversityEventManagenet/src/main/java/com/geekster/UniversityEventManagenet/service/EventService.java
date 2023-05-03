package com.geekster.UniversityEventManagenet.service;

import com.geekster.UniversityEventManagenet.model.Event;
import com.geekster.UniversityEventManagenet.repository.IEventRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepository eventRepository;

    public String insertEvent(List<Event> eventList) {
        Iterable<Event> list= eventRepository.saveAll(eventList);
        if(list!=null){
            return "added list ......!!!!";
        }
        else{
            return " not added.....!!!";
        }
    }
@Transactional
    public void updateEventById(String event, Integer id) {
        eventRepository.updateEventById(event,id);
    }
 @Transactional
    public void deleteEventById(Integer id) {
        eventRepository.deleteEventById(id);
    }

    public List<Event> getEventByDate(String date) {
        LocalDate myDate=LocalDate.parse(date);
        return eventRepository.getEventById(myDate);

    }
}
