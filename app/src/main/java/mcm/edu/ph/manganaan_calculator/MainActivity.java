package mcm.edu.ph.manganaan_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        EditText var1txt, var2txt; //declared the edit text boxes
        Button addition, minus, multiplication, division, percentage; //declared the 5 buttons
        TextView output;

        double var1, var2;


        @Override
        protected void onCreate(Bundle savedInstanceState) { //this method is responsible for creating the display we can see in our app
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //buttons
            addition = findViewById(R.id.addition);
            minus = findViewById(R.id.minus);
            multiplication = findViewById(R.id.multiplication);
            division = findViewById(R.id.division);
            percentage = findViewById(R.id.percentage);


            //Answer text view
            output =findViewById(R.id.output);



            addition.setOnClickListener(this);
            minus.setOnClickListener(this);
            multiplication.setOnClickListener(this);
            division.setOnClickListener(this);
            percentage.setOnClickListener(this);


        }
        @Override
        public void onClick(View v) {


            //variable text boxes
            var1txt = findViewById(R.id.firstinput);
            var2txt = findViewById(R.id.secondinput);

            //RAW text --> String --Double

            var1 =Double.parseDouble(var1txt.getText().toString());
            var2 =Double.parseDouble(var2txt.getText().toString());



            switch (v.getId()){
                case R.id.addition:
                    output.setText(Double.toString(var1+var2));

                    break;
                case R.id.minus:
                    output.setText(Double.toString(var1-var2));

                    break;
                case R.id.multiplication:
                    output.setText(Double.toString(var1*var2));

                    break;
                case R.id.division:
                    output.setText(Double.toString(var1/var2));

                    break;
                case R.id.percentage:
                    output.setText(Double.toString(var1%var2));

                    break;

            }



        }
    }
