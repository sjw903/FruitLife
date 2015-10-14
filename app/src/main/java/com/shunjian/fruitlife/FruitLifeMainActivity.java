package com.shunjian.fruitlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FruitLifeMainActivity extends Activity {
    private TextView mTextView;
    private ImageButton mImageButton;
    private String mOldText;
    private Button mResetBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_life_main);
        initWidget();
    }

    private void initWidget() {
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruitLifeMainActivity.this, PositionActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        mOldText = mTextView.getText().toString();
        mImageButton = (ImageButton) findViewById(R.id.imageButton);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("you change the content!");
            }
        });
        mResetBtn = (Button) findViewById(R.id.buttonReset);
        mResetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText(mOldText);
            }
        });
    }
}
