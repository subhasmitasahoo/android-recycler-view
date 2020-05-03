package com.subha.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView descriptionTextView;
    private TextView ratingTextView;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        this.ratingTextView = (TextView) findViewById(R.id.ratingTextView);

        extras = getIntent().getExtras();

        if(extras != null) {
            descriptionTextView.setText(extras.getString("title") + "\n" + extras.getString("description"));
            ratingTextView.setText(extras.getString("rating"));
        }

    }
}
