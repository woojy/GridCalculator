package woojy.kr.hs.emirim.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button[] butNums = new Button[10];
    EditText editFirst, editSecond;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       editFirst = (EditText) findViewById(R.id.editText1);
        editSecond = (EditText) findViewById(R.id.editText2);
        Button Plus = (Button) findViewById(R.id.plus);
        Button Minus = (Button) findViewById(R.id.minus);
        Button Multiply = (Button) findViewById(R.id.multiply);
        Button Division = (Button) findViewById(R.id.division);
        textResult = (TextView) findViewById(R.id.result);

        Plus.setOnClickListener(butHandler);
        Minus.setOnClickListener(butHandler);
        Multiply.setOnClickListener(butHandler);
        Division.setOnClickListener(butHandler);
    }

    View.OnClickListener butHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = Integer.parseInt(editFirst.getText().toString());
            int num2 = Integer.parseInt(editSecond.getText().toString());
            int result = 0;

            switch (view.getId()){
                case R.id.plus:
                    result = num1+num2;
                    break;
                case R.id.minus:
                    result = num1-num2;
                    break;
                case R.id.multiply:
                    result = num1*num2;
                    break;
                case R.id.division:
                    result = num1/num2;
                    break;
            }
            textResult.setText("결과 : " + result);
        }
    };
}
