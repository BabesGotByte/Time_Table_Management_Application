package com.example.tt3;

public class DaySchedule {

    private String Faculty,Subject,Time;

    public DaySchedule(String faculty, String subject, String time) {
        Faculty = faculty;
        Subject = subject;
        Time = time;
    }



    public DaySchedule() {
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        this.Subject = subject;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        this.Faculty = faculty;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        this.Time = time;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "Subject='" + Subject + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", Time='" + Time + '\'' +
                '}';
    }


}
