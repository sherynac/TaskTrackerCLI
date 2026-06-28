
import java.time.LocalDate;

public class Task {
    private int id;
    private Status status;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Task(){
        id = TaskManager.getLastID() + 1;
        status= Status.todo;
        description="";
        createdAt = LocalDate.now();
        updatedAt = null;
    }

    public Task (String desc){
        this.id = TaskManager.getLastID() + 1;
        this.description= desc;
        this.status= Status.todo;
        this.createdAt = LocalDate.now();
        this.updatedAt = null;
    }

    public Task (int id, String desc, Status status, LocalDate createdAt, LocalDate updatedAt){
        this.id = id;
        this.description = desc;
        this.status = status;
        this.createdAt = createdAt;

    }

    public int getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public Status getStatus(){
        return status;
    }

    public LocalDate getCreatedAt(){
        return createdAt;
    }

    public LocalDate getUpdatedAt(){
        return updatedAt;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String toString(){
        return "\n{\"id\": " + this.id + "," +
                "\"description\": \"" + this.description + "\"," +
                "\"status\": \"" + this.status + "\","+
                "\"createdAt\": \"" + this.createdAt + "\"," +
                "\"updatedAt\": \"" + this.updatedAt + "\"}";
    }
}
