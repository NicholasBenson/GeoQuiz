package com.bignerdranch.android.geoquiz;

/**
 * Created by nbens_000 on 2/12/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public Question(int textResId, boolean answerTrue) {




        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
