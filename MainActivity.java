package com.example.madpractical2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("Hello World","Lorem ipsum dolor sit arnet consectetur adispiscing elit, sed do eoiusmod tempor incidiunt ut albore et dolore magna aliqua",123,true);
        TextView userText = findViewById(R.id.textView2);
        userText.setText(user.name);
        TextView userDescription = findViewById(R.id.textView3);
        userDescription.setText(user.description);

        Button message = findViewById(R.id.button2);
        message.setText("Message");
        Button following = findViewById(R.id.button);
        following.setText("Follow");

        following.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                user.toggle();
                if (user.followed == true){
                    following.setText("Follow");
                }
                else{
                    following.setText("Followed");
                }
                //DO SOMETHING! {RUN SOME FUNCTION ... DO CHECKS... ETC}
            }
        });



    }

}