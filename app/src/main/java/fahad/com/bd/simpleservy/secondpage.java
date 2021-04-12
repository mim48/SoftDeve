package fahad.com.bd.simpleservy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class secondpage extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);
        Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();


    }
}

