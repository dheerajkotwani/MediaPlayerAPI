package project.dheeraj.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.harry_potter);

        Button playButton=(Button)findViewById(R.id.play);
        playButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Play",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });
        Button pauseButton=(Button)findViewById(R.id.pause);
        pauseButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Pause",Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });
    }
}
