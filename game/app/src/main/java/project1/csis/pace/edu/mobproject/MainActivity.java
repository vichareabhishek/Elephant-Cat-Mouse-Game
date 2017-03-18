package project1.csis.pace.edu.mobproject;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgView;
    private ImageButton r_imgBtn, p_imgBtn, s_imgBtn;
    private TextView result_tv, count_tv;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_imgBtn = (ImageButton) findViewById(R.id.btnRock);
        p_imgBtn = (ImageButton) findViewById(R.id.btnPaper);
        s_imgBtn = (ImageButton) findViewById(R.id.btnScissor);

        imgView = (ImageView) findViewById(R.id.viewCmp);

        result_tv = (TextView) findViewById(R.id.textResult);
        count_tv = (TextView) findViewById(R.id.textCount);

        MyOnClickListener myOnClickListener = new MyOnClickListener();
        r_imgBtn.setOnClickListener(myOnClickListener);
        p_imgBtn.setOnClickListener(myOnClickListener);
        s_imgBtn.setOnClickListener(myOnClickListener);
    }

    private class MyOnClickListener implements DialogInterface.OnClickListener, View.OnClickListener {
        @Override
        public void onClick(View v) {
// TODO Auto-generated method stub
            int rand = (int) (Math.random() * 3 + 1);
            count++;//
            switch (rand) { /**
            * rand = 1 means computer is Rock, * 2 represents Paper,
            * 3 represents scissors
            */
            case 1:
            imgView.setImageResource(R.drawable.elephant1);
            switch (v.getId()) {
                case R.id.btnRock: //player choose Rock
                    result_tv.setText("Result: " + "Tied!");
                    count_tv.setText("Round: " + count);
                    break;

                case R.id.btnPaper: //player choose Paper
                    result_tv.setText("Result: " + "Win!");
                    count_tv.setText("Round: " + count);
                    break;

                case R.id.btnScissor:  //player choose Scissors
                    result_tv.setText("Result: " + "Lose!");
                    count_tv.setText("Round: " + count);
                    break;
                }
                break;

                case 2:

                    imgView.setImageResource(R.drawable.mouse1);
                    switch (v.getId()) {

                        case R.id.btnRock:
                        result_tv.setText("Result: " + "Lose!");
                        count_tv.setText("Round: " + count);
                            break;

                case R.id.btnPaper:
                    result_tv.setText("Result: " + "Tie!");
                    count_tv.setText("Round: " + count);
                    break;

                case R.id.btnScissor:
                    result_tv.setText("Result: " + "Win!");
                    count_tv.setText("Round: " + count);
                    break;
                    }

                    break;

                case 3:

                    imgView.setImageResource(R.drawable.cat1);

                    switch (v.getId()) {

                        case R.id.btnRock:
                result_tv.setText("Result: " + "Win!");
                count_tv.setText("Round: " + count);
                break;

                        case R.id.btnPaper:
                    result_tv.setText("Result: " + "Lose!");
                    count_tv.setText("Round: " + count);
                    break;

                        case R.id.btnScissor:
                    result_tv.setText("Result: " + "Tie!");
                    count_tv.setText("Round: " + count);
                    break; }
            break; }
    }

        @Override
        public void onClick(DialogInterface dialog, int which) {

        }
    }

}
