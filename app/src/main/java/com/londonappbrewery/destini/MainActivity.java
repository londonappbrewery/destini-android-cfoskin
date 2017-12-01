package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTopView, mButtonBottomView;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonBottomView = (Button) findViewById(R.id.buttonBottom);
        mButtonTopView = (Button) findViewById(R.id.buttonTop);
        mButtonTopView.setText(R.string.T1_Ans1);
        mButtonBottomView.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTopView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTopView.setText(R.string.T3_Ans1);
                    mButtonBottomView.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTopView.setVisibility(View.GONE);
                    mButtonBottomView.setVisibility(View.GONE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottomView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1){
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTopView.setText(R.string.T2_Ans1);
                    mButtonBottomView.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTopView.setVisibility(View.GONE);
                    mButtonBottomView.setVisibility(View.GONE);
                } else {
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTopView.setVisibility(View.GONE);
                    mButtonBottomView.setVisibility(View.GONE);
                }
            }
        });
    }


}
