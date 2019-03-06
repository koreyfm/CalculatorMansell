package com.introtoandroid.calculator_mansell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSubtract,btnDivide, btnDecimal, btnMultiply, btnPosNeg, btnEnter, btnC, btnCE;

    //EditText editText;
    TextView textView;

    float mValueOne;
    float mValueTwo;

    boolean add, subtract, multiply, divide, posNeg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnPosNeg = (Button) findViewById(R.id.btnPosNeg);
        btnEnter = (Button) findViewById(R.id.btnEnter);
        btnC = (Button) findViewById(R.id.btnC);
        btnCE = (Button) findViewById(R.id.btnCE);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText() + "9");

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(textView.getText().equals(""))){

                    mValueOne = Float.parseFloat(textView.getText() + "");
                    add = true;
                    textView.setText(null);
                }



            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(textView.getText().equals(""))) {

                    mValueOne = Float.parseFloat(textView.getText() + "");
                    subtract = true;
                    textView.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(textView.getText().equals(""))) {

                    mValueOne = Float.parseFloat(textView.getText() + "");
                    divide = true;
                    textView.setText(null);
                }
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(textView.getText().toString().contains("."))) {

                    textView.setText(textView.getText() + ".");
                }

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(textView.getText().equals(""))) {

                    mValueOne = Float.parseFloat(textView.getText() + "");
                    multiply = true;
                    textView.setText(null);
                }
            }
        });

        btnPosNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(!(textView.getText().equals(""))){

                    Float posNegVal = Float.valueOf((String) textView.getText());
                    Float finalPosNegVal = posNegVal*-1;

                    textView.setText(Float.toString(finalPosNegVal));

                }




            }
        });

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueTwo = Float.parseFloat(textView.getText() + "");


                if (add == true) {

                    textView.setText(mValueOne + mValueTwo + "");

                }


                if (subtract == true) {

                    textView.setText(mValueOne - mValueTwo + "");

                }


                if (multiply == true) {

                    textView.setText(mValueOne * mValueTwo + "");

                }


                if (divide == true) {

                    textView.setText(mValueOne / mValueTwo + "");

                }

                add = false;
                subtract = false;
                multiply = false;
                divide = false;


            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("");

            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });



    }









    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);



        savedInstanceState.putFloat("mValueOne",mValueOne);
        savedInstanceState.putFloat("mValueTwo",mValueTwo);

        savedInstanceState.putBoolean("add", add);
        savedInstanceState.putBoolean("subtract", subtract);
        savedInstanceState.putBoolean("multiply", multiply);
        savedInstanceState.putBoolean("divide", divide);

        savedInstanceState.putString("textView",(String)textView.getText());





    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


        add = savedInstanceState.getBoolean("add");
        subtract = savedInstanceState.getBoolean("subtract");
        multiply = savedInstanceState.getBoolean("multiply");
        divide = savedInstanceState.getBoolean("divide");

        mValueOne = savedInstanceState.getFloat("mValueOne");
        mValueTwo = savedInstanceState.getFloat("mValueTwo");



        textView.setText(savedInstanceState.getString("textView"));





    }
}
