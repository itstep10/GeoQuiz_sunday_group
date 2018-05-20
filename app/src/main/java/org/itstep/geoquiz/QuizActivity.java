package org.itstep.geoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class QuizActivity extends Activity
{
    private static final String TAG = "Debug_QuizActivity";

    List<Question> questions;
    private View buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_layout);

        //FragmetnTransaction


//        createDemoData();
//
//        TextView question = findViewById(R.id.tv_question);
//        Button buttonYes = findViewById(R.id.button_yes);
//        Button buttonNo = findViewById(R.id.button_no);
//        buttonNext = findViewById(R.id.button_next);
//        question.setText("sdfsdfsdf");
//
//        buttonYes.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                boolean userAnswer = true;
////                Log.d(TAG, "onClickButton: ");
//                //TODO check answer
//                boolean answer = true;
//
//                Toast.makeText(QuizActivity.this, "Answere is false", Toast.LENGTH_LONG).show();
//                Log.d(TAG, String.valueOf(R.string.log_on_create));
//                buttonNext.setVisibility(View.VISIBLE);
//            }
//        });
    }

//    private void createDemoData()
//    {
////            Canberra is the capital of Australia. The Pacific Ocean is larger than the Atlantic Ocean. The Suez Canal connects the Red Sea and the Indian Ocean. The source of the Nile River is in Egypt. The Amazon River is the longest river in the Americas. Lake Baikal is the world\’s oldest and deepest freshwater lake. True.
////            The Pacific Ocean is larger than the Atlantic Ocean. True.
////            The Suez Canal connects the Red Sea and the Indian Ocean. False.
////            The source of the Nile River is in Egypt. False.
////            The Amazon River is the longest river in the Americas. True.
////            Lake Baikal is the world\’s oldest and deepest freshwater lake. True.
//
//        Question question = new Question();
//        question.setExpression("Canberra is the capital of Australia. The Pacific Ocean is larger than the Atlantic Ocean. The Suez Canal connects the Red Sea and the Indian Ocean. The source of the Nile River is in Egypt. The Amazon River is the longest river in the Americas. Lake Baikal is the world\\’s oldest and deepest freshwater lake.");
//        question.setAnswer(true);
//        questions.add(question);
//    }
}
