package app.jamerson.forum.controller;

import app.jamerson.forum.controller.dto.TopicDTO;
import app.jamerson.forum.model.Course;
import app.jamerson.forum.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<TopicDTO> list() {
        Topic topic = new Topic(
                "Dúvida",
                "Dúvida com Spring Boot",
                new Course("Spring Boot", "Programação Back-end")
        );

        TopicDTO topicDTO = new TopicDTO(topic);

        return Arrays.asList(topicDTO, topicDTO, topicDTO);
    }

}
