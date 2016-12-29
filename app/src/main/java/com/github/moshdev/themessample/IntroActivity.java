package com.github.moshdev.themessample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.moshdev.themessample.style_vs_theme.StyleVsTheme1Activity;
import com.github.moshdev.themessample.style_vs_theme.StyleVsTheme2Activity;

public class IntroActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_intro);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }


  public void styleVsTheme1(View view) {
    startActivity(new Intent(this, StyleVsTheme1Activity.class));
  }

  public void styleVsTheme2(View view) {
    startActivity(new Intent(this, StyleVsTheme2Activity.class));
  }
}