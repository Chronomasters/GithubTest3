package joseph.com.githubtest3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Random rand;
    private TextView textView;
    private Button button;
    private int n;


    Button toastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastButton = (Button)findViewById(R.id.toastButton);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "TOASTTOAWSTTOAST", Toast.LENGTH_SHORT).show();
            }
        });


        textView = (TextView) findViewById(R.id.number);
        button = (Button) findViewById(R.id.test);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        rand = new Random();
        textView.setText("" + rand.nextInt(50) +1);
    }
}
