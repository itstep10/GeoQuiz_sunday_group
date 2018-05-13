package org.itstep.geoquiz;

/**
 * Created by Koren Vitalii on 13.05.2018.
 */
public class Question
{
    private String expression;
    private boolean answer;

    public String getExpression()
    {
        return expression;
    }

    public void setExpression(String expression)
    {
        this.expression = expression;
    }

    public boolean isAnswer()
    {
        return answer;
    }

    public void setAnswer(boolean answer)
    {
        this.answer = answer;
    }
}
