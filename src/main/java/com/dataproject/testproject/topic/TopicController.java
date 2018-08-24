package com.dataproject.testproject.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    // mark that something needs a dependancy
    private TopicService topicService;

    //get
    @RequestMapping("/topics")
    // mapuje funkcje na HTML urls
    // creates pretty JSON file on the web
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    //get
    @RequestMapping("/topics/{topic}")
    // default method=RequestMethod.GET
    // np. /topics/spring
    public Optional<Topic> getTopic(@PathVariable("topic") String id) {
        return topicService.getTopic(id);
    }

    // post request
    // needed to specify a method rather than path and the post path
    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    // put request
    // needed to specify a method rather than path and the post path
    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    // delete request
    // needed to specify a method rather than path and the post path
    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
