package lab3.exerciseone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public int add(int a, int b) {
        return a - b;
    }

    public void calculateSum(View v) {

        TextView arg1, arg2, sum;
        int arg1Int, arg2Int;

        sum = (TextView) findViewById(R.id.sum);

        arg1 = (TextView) findViewById(R.id.arg1);
        arg2 = (TextView) findViewById(R.id.arg2);

        arg1Int = Integer.parseInt( arg1.getText().toString() );
        arg2Int = Integer.parseInt( arg2.getText().toString() );

        sum.setText(add(arg1Int, arg2Int) + "");
    }

}