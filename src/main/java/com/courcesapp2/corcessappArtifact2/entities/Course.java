package com.courcesapp2.corcessappArtifact2.entities;

public class Course {
    private long id;
    private String title;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }

    public Course() {
        super();
    }



    private String discription;

    public Course(long id, String title, String discription) {
        super();
        this.id = id;
        this.title = title;
        this.discription = discription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
