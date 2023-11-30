package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView gradientTextView = findViewById(R.id.gradientTextView);
//
//        SpannableString spannableString = new SpannableString(gradientTextView.getText());
//        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.gradient_text)), 0, spannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        gradientTextView.setText(spannableString);
//        gradientTextView.setTextColor(Color.TRANSPARENT);
    }
}