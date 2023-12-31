package network.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudyMatching extends AppCompatActivity {

    ImageButton btnStudyGroup, btnStudyRoom, btnChatting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_detail);

        btnStudyGroup = findViewById(R.id.studyGroupB);
        btnStudyRoom = findViewById(R.id.studyRoomB);
        btnChatting = findViewById(R.id.chattingB);

        Intent intent = getIntent();
        if (intent != null) {
            String selectedDate1 = intent.getStringExtra("selectedDate1");
            String selectedTime1 = intent.getStringExtra("selectedTime1");
            String selectedDate2 = intent.getStringExtra("selectedDate2");
            String selectedTime2 = intent.getStringExtra("selectedTime2");

            // 사용 예시: TextView에 데이터 설정
            TextView dateTextView1 = findViewById(R.id.dateTextView1);
            TextView timeTextView1 = findViewById(R.id.timeTextView1);
            TextView dateTextView2 = findViewById(R.id.dateTextView2);
            TextView timeTextView2 = findViewById(R.id.timeTextView2);

            dateTextView1.setText(selectedDate1);
            timeTextView1.setText(selectedTime1);
            dateTextView2.setText(selectedDate2);
            timeTextView2.setText(selectedTime2);
        }

        btnStudyGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyMatching.this, StudyCategoryActivity.class);
                startActivity(intent);
            }
        });
        btnStudyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyMatching.this, StudyRoomSetActivity.class);
                startActivity(intent);
            }
        });
        btnChatting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyMatching.this, Chatting.class);
                startActivity(intent);
            }
        });
    }
}
