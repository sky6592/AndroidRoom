package com.example.androidroom;

import androidx.room.PrimaryKey;

public class TodoJava {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;

    public TodoJava(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Todo{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return "TodoJava{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
