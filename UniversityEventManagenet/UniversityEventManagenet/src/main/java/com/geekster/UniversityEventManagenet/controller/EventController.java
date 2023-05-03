package com.geekster.UniversityEventManagenet.controller;

import com.geekster.UniversityEventManagenet.model.Event;
import com.geekster.UniversityEventManagenet.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;
/// adding list of events
@PostMapping(value="/addEvent")
    public String addEvent(@RequestBody List<Event> eventList){
     return eventService.insertEvent(eventList);
}

/// update event by id
    @PutMapping(value="/updateEvent/{event}/id/{id}")
    public void updateEventById(@PathVariable String event, @PathVariable Integer id){
      eventService.updateEventById(event,id);
    }
  // delete event by id
    @DeleteMapping(value="/deleteEvent/id/{id}")
    public Void deleteEventById(@PathVariable Integer id){
       eventService.deleteEventById(id);
        return null;
    }

    //get Event by date
    @GetMapping(value ="/getEvent/date/{date}")
    public List<Event> getEventByDate(@PathVariable String date){
    return eventService.getEventByDate(date);

    }
}
