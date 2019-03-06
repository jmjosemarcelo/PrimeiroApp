package com.example.jose.primeiroapp;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

                tts.setLanguage(Locale.GERMAN);
            }
        });

    }

    public void onclick(View V) {
        tts.speak("Livro infantil", TextToSpeech.QUEUE_FLUSH, null);

    }
    public void autor(View V) {
        tts.speak("Monteiro Lobato", TextToSpeech.QUEUE_FLUSH, null);

    } public void nome(View V) {
        tts.speak("Sitio Pica-Pau Amarelo", TextToSpeech.QUEUE_FLUSH, null);

    }


}
