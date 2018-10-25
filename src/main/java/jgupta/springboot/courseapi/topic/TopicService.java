package jgupta.springboot.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> allTopics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework desc")
			, new Topic("java", "Core Java", "Core Java Desc")
			, new Topic("javascript", "Javascript", "Javascript Desc")
			));
	
	public List<Topic> getAllTopics() {
		return allTopics;
	}
	
	public Topic getTopic(String id) {
		return allTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		allTopics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		int i = 0;
		
		for (Topic ctTopic : allTopics) {
			if (ctTopic.getId().equals(id)) {
				allTopics.set(i, topic);
			}
			i++;
		}
	}
	
	public void deleteTopic(String id) {
		allTopics.removeIf(t -> t.getId().equals(id));
	}

}
