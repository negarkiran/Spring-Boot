package com.example.spring.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> Topics = new ArrayList<>();
		topicRepository.findAll().forEach(Topics::add);
		return Topics;
	}

	public void saveTopic(Topic Topic) {
		topicRepository.save(Topic);
	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void updateTopic(String id,Topic Topic) {
		topicRepository.save(Topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
