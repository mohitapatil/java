package org.example.Repository;

import org.example.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicReopsitory extends JpaRepository<Topic,Integer> {

}
