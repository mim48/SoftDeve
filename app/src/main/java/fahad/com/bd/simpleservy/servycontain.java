package fahad.com.bd.simpleservy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class servycontain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servycontain);
        Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();


    }
}
