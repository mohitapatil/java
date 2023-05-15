package org.example.Controller;

import org.example.exception.TopicNotFoundException;
import org.example.mapper.TopicMapper;
import org.example.model.Topic;
import org.example.Service.TopicService;
import org.example.request.TopicRequest;
import org.example.response.TopicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    public TopicService topicService;

    @Autowired
    private TopicMapper topicMapper;

    @RequestMapping("/topics")
    public ResponseEntity<List<TopicResponse>> getTopics() {
        return new ResponseEntity<>(topicMapper.topicListToTopicResponseList(topicService.getListOfTopics()), HttpStatus.OK);
    }

    @RequestMapping("/topics/{id}")
    public ResponseEntity<TopicResponse> getTopic(@PathVariable String id)throws TopicNotFoundException {
        Optional<Topic> optionalTopic= topicService.getTopic(id);
            return new ResponseEntity<>(topicMapper.topicToTopicResponse(optionalTopic.get()),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public ResponseEntity<TopicResponse> addTopic(@RequestBody TopicRequest topicRequest){
        Topic topic= topicService.addTopic(topicMapper.topicRequestToTopic(topicRequest));
        return new ResponseEntity<>(topicMapper.topicToTopicResponse(topic),HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
    public ResponseEntity<TopicResponse> updateTopic(@RequestBody TopicRequest topicRequest,@PathVariable String id){
        Topic topic= topicService.updateTopic(id,topicMapper.topicRequestToTopic(topicRequest));
        return new ResponseEntity<>(topicMapper.topicToTopicResponse(topic),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
    public ResponseEntity<TopicResponse> deleteTopic(@PathVariable String id) throws TopicNotFoundException {
        Boolean toicIsDeleted= topicService.deleteTopic(id);
        return new ResponseEntity<>(topicMapper.intToBooleanResponse(toicIsDeleted),HttpStatus.OK);
    }

}
