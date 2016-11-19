package joseph.com.githubtest3;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.number);
        button = (Button) findViewById(R.id.test);

        button.setOnClickListener(this);

        rand = new Random();

        n = rand.nextInt(50) +1;



    }

    @Override
    public void onClick(View view) {
        textView.setText("" + n);
    }
}
