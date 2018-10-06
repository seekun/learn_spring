package io.javabrains.springbootstarter.topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class TopicController {
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTipics() {
		return Arrays.asList(
				new Topic("spring", "Srping Framework", "Spring Framework Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("javascript", "javaSciprtt", "Javascript Description")				
				
				);
	}
	

}
