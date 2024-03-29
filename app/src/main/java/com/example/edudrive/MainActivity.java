package com.example.edudrive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView home_work_card = findViewById(R.id.card_homework);
        CardView drive_card = findViewById(R.id.card_drive);
        Button btnWebsite = findViewById(R.id.websiteOpen);
        drive_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_LINK_HERE" with your actual Google Drive link
                String googleDriveLink = "https://drive.google.com/drive/folders/18gvim-6hGHrY2UReqTINihC4rrVEErO-";


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleDriveLink));
//                intent.setPackage("com.google.android.apps.docs");
                startActivity(intent);
                // Check if there's an app to handle the intent
            }
        });


        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://edudrive.netlify.app/"));
//                intent.setPackage("com.google.android.apps.docs");
                startActivity(intent);
            }
        });

        home_work_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(MainActivity.this, Website.class);

                // Optionally, you can pass data to SecondActivity using putExtra
                intent.putExtra("key", "<iframe src=\"https://rb.gy/v1cr8?widget=true&amp;headers=false\" width=\"652\" height=\"1150\" style=\"border:1px\"></iframe>\n" +
                        "            <h3>&ensp;⬆\uFE0F<mark>Change the months from here.</mark></h3>");

                // Start SecondActivity
                startActivity(intent);
            }
        });
    }
}