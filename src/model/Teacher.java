package model;

public class Teacher {
    private String id;
    private String name;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}