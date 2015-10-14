package com.shunjian.fruitlife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PositionActivity extends Activity {
    private TextView mReturnTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position);
        initWidget();
    }

    private void initWidget() {
        mReturnTextView = (TextView) findViewById(R.id.btn_return_position);
        mReturnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
