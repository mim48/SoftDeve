package fahad.com.bd.simpleservy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
private Button start_btn;
private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
start_btn=findViewById(R.id.startbtn);
next=findViewById(R.id.next);
next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent catagoryIntent =new Intent(MainActivity.this,secondpage.class);
        startActivity(catagoryIntent);
    }
});
start_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent catagoryIntent =new Intent(MainActivity.this,servycontain.class);
        startActivity(catagoryIntent);
    }
});
    }
}