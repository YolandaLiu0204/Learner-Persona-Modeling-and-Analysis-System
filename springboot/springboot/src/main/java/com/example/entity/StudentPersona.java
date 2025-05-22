package com.example.entity;

import javax.persistence.*;

@Table(name="studentpersona")
public class StudentPersona {
    @Column(name = "name")
    private String name;
    @Column(name="stno")
    private String stno;
    @Column(name = "studentid")
    private String studentid;
    @Column(name = "learningtime")
    private Integer learningtime;
    @Column(name = "resourcepreference")
    private Integer resourcepreference;
    @Column(name = "interaction")
    private Integer interaction;
    @Column(name = "timepreference")
    private Integer timepreference;
    @Column(name = "dedication")
    private Integer dedication;
    @Column(name = "grades")
    private Integer grades;
    @Column(name = "finalexam")
    private Integer finalexam;
    @Column(name = "warninglevel")
    private Integer warninglevel;
    @Transient
    private String learningtimetypeName;
    @Transient
    private String resourcepreferencetypeName;
    @Transient
    private String interactiontypeName;
    @Transient
    private  String timepreferencetypeName;
    @Transient
    private String dedicationtypeName;
    @Transient
    private String gradestypeName;

    public String getResourcepreferencetypeName() {
        return resourcepreferencetypeName;
    }

    public void setResourcepreferencetypeName(String resourcepreferencetypeName) {
        this.resourcepreferencetypeName = resourcepreferencetypeName;
    }

    public String getInteractiontypeName() {
        return interactiontypeName;
    }

    public void setInteractiontypeName(String interactiontypeName) {
        this.interactiontypeName = interactiontypeName;
    }

    public String getTimepreferencetypeName() {
        return timepreferencetypeName;
    }

    public void setTimepreferencetypeName(String timepreferencetypeName) {
        this.timepreferencetypeName = timepreferencetypeName;
    }

    public String getDedicationtypeName() {
        return dedicationtypeName;
    }

    public void setDedicationtypeName(String dedicationtypeName) {
        this.dedicationtypeName = dedicationtypeName;
    }

    public String getGradestypeName() {
        return gradestypeName;
    }

    public void setGradestypeName(String gradestypeName) {
        this.gradestypeName = gradestypeName;
    }

    public String getLearningtimetypeName() {
        return learningtimetypeName;
    }

    public void setLearningtimetypeName(String learningtimetypeName) {
        this.learningtimetypeName = learningtimetypeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStno() {
        return stno;
    }

    public void setStno(String stno) {
        this.stno = stno;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public Integer getLearningtime() {
        return learningtime;
    }

    public void setLearningtime(Integer learningtime) {
        this.learningtime = learningtime;
    }

    public Integer getResourcepreference() {
        return resourcepreference;
    }

    public void setResourcepreference(Integer resourcepreference) {
        this.resourcepreference = resourcepreference;
    }

    public Integer getInteraction() {
        return interaction;
    }

    public void setInteraction(Integer interaction) {
        this.interaction = interaction;
    }

    public Integer getTimepreference() {
        return timepreference;
    }

    public void setTimepreference(Integer timepreference) {
        this.timepreference = timepreference;
    }

    public Integer getDedication() {
        return dedication;
    }

    public void setDedication(Integer dedication) {
        this.dedication = dedication;
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }

    public Integer getFinalexam() {
        return finalexam;
    }

    public void setFinalexam(Integer finalexam) {
        this.finalexam = finalexam;
    }

    public Integer getWarninglevel() {
        return warninglevel;
    }

    public void setWarninglevel(Integer warninglevel) {
        this.warninglevel = warninglevel;
    }
}
