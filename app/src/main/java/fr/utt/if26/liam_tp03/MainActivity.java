package fr.utt.if26.liam_tp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx= (TextView)findViewById(R.id.message);
        String message = "Bonjour IF26 !!";
        tx.setText(message);
    }
}
