package network.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ChatEnterActivity extends AppCompatActivity {
    EditText editText;
    Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatenter);
        enterButton = (Button)findViewById(R.id.enterButton);
        editText = (EditText)findViewById(R.id.editText);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ChatGroupActivity.class);
                String username = editText.getText().toString();
                intent.putExtra("username",username);
                startActivity(intent);
            }
        });

    }
}