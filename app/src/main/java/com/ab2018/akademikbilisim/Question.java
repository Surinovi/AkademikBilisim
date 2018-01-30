package com.ab2018.akademikbilisim;

/**
 * Created by ACAR on 30.01.2018.
 */

public class Question {
    int id;
    String question;
    String answers;

    public Question(int id, String question, String answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswers() {
        return answers;
    }
}
