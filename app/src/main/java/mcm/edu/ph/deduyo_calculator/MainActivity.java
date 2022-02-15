package mcm.edu.ph.deduyo_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{





    EditText var1,var2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo;
    TextView txtAnswer;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var1 = findViewById(R.id.txtVariable1);
        var2 = findViewById(R.id.txtVariable2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);

        txtAnswer = findViewById(R.id.txtAnswer);

        double variable1, variable2;

        variable1 = Double.parseDouble(String.valueOf(var1.getText()));
        variable2 = Double.parseDouble(String.valueOf(var2.getText()));
    }

    @Override
    public void onClick(View view) { var1 = findViewById(R.id.txtVariable1);
        var2 = findViewById(R.id.txtVariable2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);

        txtAnswer = findViewById(R.id.txtAnswer);

        double variable1, variable2;

        variable1 = Double.parseDouble(String.valueOf(var1.getText()));
        variable2 = Double.parseDouble(String.valueOf(var2.getText()));
        switch(view.getId()) {
            case R.id.btnAdd:
                    txtAnswer.setText(String.valueOf( variable1 + variable2));
                break;
            case R.id.btnSubtract:
                    txtAnswer.setText(String.valueOf( variable1 -variable2));
                break;
            case R.id.btnMultiply:
                    txtAnswer.setText(String.valueOf( variable1 * variable2));
                break;
            case R.id.btnDivide:
                     txtAnswer.setText(String.valueOf( variable1 / variable2));
                break;
            case R.id.btnModulo:
                txtAnswer.setText(String.valueOf( variable1 % variable2));

                break;
        }
    }}


