package entity;

public abstract class BaseEntity {
    // Semua entity pasti butuh ID atau timestamp
    protected String id; 

    public BaseEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}