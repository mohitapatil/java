package org.example.Service;

import org.example.exception.TopicNotFoundException;
import org.example.model.Topic;
import org.example.Repository.TopicReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicReopsitory topicReopsitory;

//    private List<Topic> topics =  new ArrayList<>( Arrays.asList(
//            new Topic(1,"Topic1","Description1"),
//                new Topic(2,"Topic2","Description2"),
//                new Topic(3,"Topic3","Description3"),
//                new Topic(4,"Topic4","Description4")
//                ));

    public List<Topic> getListOfTopics(){
//        return topics;
        List<Topic> topics=new ArrayList<>();
        topicReopsitory.findAll().forEach(t->topics.add(t));
        return  topics;
    }

    public Optional<Topic> getTopic(String id) throws TopicNotFoundException{
//        return topics.stream().filter(t->(t.getId]()==Integer.parseInt(id))).findAny().orElse(new Topic());
        Optional<Topic> topic=topicReopsitory.findById(Integer.parseInt(id));
        if(topic.isPresent())
            {return topic;}
        else{
            throw new TopicNotFoundException("Topic of id " +id+ " does not exist");
        }
    }

    public Topic addTopic(Topic topic) {
//        topics.add(topic);
        topicReopsitory.save(topic);
        System.out.println(topic.toString());
        return topic;
    }

    public Topic updateTopic(String id, Topic topic) {
//        for(int i=0;i<topics.size();i++){
//            if(topics.get(i).getId()== Integer.parseInt(id)){
//                topics.set(i,topic);
//            }
//        }
        topicReopsitory.save(topic);
        return topic;
    }

    public boolean deleteTopic(String id) {
//        topics.removeIf(t-> t.getId()== Integer.parseInt(id));
        if(!getTopic(id).isPresent()){
            throw new TopicNotFoundException("Topic cannot be deleted with given id"+ id);
        }
        else{
            topicReopsitory.deleteById(Integer.parseInt( id));
            return true;
        }
    }
}
