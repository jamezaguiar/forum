package app.jamerson.forum.controller.dto;

import app.jamerson.forum.model.Topic;

import java.time.LocalDateTime;

public class TopicDTO {

    private final Long id;
    private final String title;
    private final String message;
    private final LocalDateTime createdAt;

    public TopicDTO(Topic topic) {
        this.id = topic.getId();
        this.title = topic.getTitle();
        this.message = topic.getMessage();
        this.createdAt = topic.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
