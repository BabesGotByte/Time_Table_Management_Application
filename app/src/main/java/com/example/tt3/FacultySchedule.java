package com.example.tt3;

public class FacultySchedule {

    private String class_room, section, sem, subject, time;

    public FacultySchedule(String class_room, String section, String sem, String subject, String time) {
        this.class_room = class_room;
        this.section = section;
        this.sem = sem;
        this.subject = subject;
        this.time = time;
    }

    public FacultySchedule() {
    }

    public String getClass_room() {
        return class_room;
    }

    public void setClass_room(String class_room) {
        this.class_room = class_room;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "FacultySchedule{" +
                "class_room='" + class_room + '\'' +
                ", section='" + section + '\'' +
                ", sem='" + sem + '\'' +
                ", subject='" + subject + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
