package model;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;




// DTO
public class Task {
    private int id;
    private int priority;
    private String title;
    private String category;
    private String description;
    private TaskStatus status;
    private Instant start;
    private Instant end;
    private Instant createdAt;
    private Instant updatedAt;
    private List<String> tags;


    @Override
    public String toString(){
        return "Task{" +
                "id=" + id +
                ", priority=" + priority +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", start=" + start +
                ", end=" + end +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", tags=" + tags +
                '}';
    }

    // Getter 和 Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public TaskStatus getStatus() { return status; }
    public void setStatus(TaskStatus status) { this.status = status; }

    public Instant getStart() { return start; }
    public void setStart(Instant start) { this.start = start; }

    public Instant getEnd() { return end; }
    public void setEnd(Instant end) { this.end = end; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }

    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }
}



