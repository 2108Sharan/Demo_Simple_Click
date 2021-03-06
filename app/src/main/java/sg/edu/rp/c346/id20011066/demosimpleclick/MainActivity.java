package sg.edu.rp.c346.id20011066.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    Button btnClick;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if(tbtn.isChecked()) {
                    etInput.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);
                }*/
                etInput.setEnabled(tbtn.isChecked());
            }
        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = etInput.getText().toString();
                if(rgGender.getCheckedRadioButtonId() == R.id.radioButtonGenderMale){
                    userInput = "He says " + userInput;
                }
                else{
                    userInput = "She says " + userInput;
                }
                tvDisplay.setText(userInput);
            }
        });

    }
}