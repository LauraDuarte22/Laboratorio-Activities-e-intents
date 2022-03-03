package co.edu.unipiloto.mymessanger;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_message);
        Intent intent = getIntent();
        TextView messageView = findViewById(R.id.messageView);
        String text = intent.getStringExtra(EXTRA_MESSAGE);
        messageView.setText(text);
    }
    public void onSendMessage(View view) {
        EditText messageView=findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, CreateMessageActivity.class);
        intent.putExtra("message",messageText);
        startActivity(intent);
    }
}