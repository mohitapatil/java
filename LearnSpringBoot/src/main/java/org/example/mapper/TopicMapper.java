package org.example.mapper;

import org.example.model.Topic;
import org.example.request.TopicRequest;
import org.example.response.TopicResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

//import java.awt.print.Topic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TopicMapper {
    ModelMapper mapper=new ModelMapper();
    public TopicMapper() {
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        mapper.typeMap(Topic.class, TopicRequest.class);
    }

    public Topic topicRequestToTopic(TopicRequest request)
    {
        return mapper.map(request, Topic.class);
    }


    public TopicResponse topicToTopicResponse(Topic topic) {
        return mapper.map(topic, TopicResponse.class);
    }

    public List<TopicResponse> topicListToTopicResponseList(List<Topic> topicList){
        return topicList.stream().map(this::topicToTopicResponse).collect(Collectors.toList());
    }

    public TopicResponse intToBooleanResponse(Boolean isTopicDeleted) {
        return mapper.map(isTopicDeleted,TopicResponse.class);
    }
}
