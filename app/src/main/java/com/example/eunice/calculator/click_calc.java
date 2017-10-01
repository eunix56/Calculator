package com.example.eunice.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.*;

import static com.example.eunice.calculator.R.id.editText;
import static com.example.eunice.calculator.R.id.square_root;


public class click_calc extends AppCompatActivity implements View.OnClickListener {

    private Button turn_off, square_root, find_square,turn_on,log, raise_power, root, anti_log,tangent, sine, cosine,hypotenus, delete, inverse, factorial,
    absolute_value,minus, plus, pi, nine, eight, seven, divide, multiply, percent, six, five, four, equal_to, exponential, answer, three, two, one, negative,
            negate, right_bracket, left_bracket, dot, zero;
    private TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_calc);
        turn_off = (Button)findViewById(R.id.turn_off);
        editText = (TextView) findViewById(R.id.editText);
        square_root = (Button)findViewById(R.id.square_root);
         find_square = (Button)findViewById(R.id.find_square);
         turn_on = (Button)findViewById(R.id.turn_on);
         log = (Button)findViewById(R.id.log);
         raise_power = (Button)findViewById(R.id.raise_power);
         root = (Button)findViewById(R.id.root);
         anti_log = (Button)findViewById(R.id.anti_log);
         tangent = (Button)findViewById(R.id.tangent);
         sine = (Button)findViewById(R.id.sine);
         cosine = (Button)findViewById(R.id.cosine);
         hypotenus = (Button)findViewById(R.id.hypotenus);
         delete = (Button)findViewById(R.id.delete);
         inverse = (Button)findViewById(R.id.inverse);
         factorial = (Button)findViewById(R.id.factorial);
         absolute_value = (Button)findViewById(R.id.absolute_value);
         minus = (Button)findViewById(R.id.minus);
         plus = (Button)findViewById(R.id.plus);
         pi = (Button)findViewById(R.id.pi);
         nine = (Button)findViewById(R.id.nine);
         eight = (Button)findViewById(R.id.eight);
         seven = (Button)findViewById(R.id.seven);
         divide = (Button)findViewById(R.id.divide);
         multiply = (Button)findViewById(R.id.multiply);
         percent = (Button)findViewById(R.id.percent);
         six = (Button)findViewById(R.id.six);
         five = (Button)findViewById(R.id.five);
         four = (Button)findViewById(R.id.four);
         equal_to = (Button)findViewById(R.id.equal_to);
         exponential = (Button)findViewById(R.id.exponential);
         answer = (Button)findViewById(R.id.answer);
         three = (Button)findViewById(R.id.three);
         two = (Button)findViewById(R.id.two);
         one = (Button)findViewById(R.id.one);
         negative = (Button)findViewById(R.id.negative);
         negate = (Button)findViewById(R.id.negate);
         right_bracket = (Button)findViewById(R.id.right_bracket);
         left_bracket = (Button)findViewById(R.id.left_bracket);
         dot = (Button)findViewById(R.id.dot);
         zero = (Button)findViewById(R.id.zero);

//       instantiating View.OnClickListener for Buttons.
        turn_off.setOnClickListener(this);
        square_root.setOnClickListener(this);
        find_square.setOnClickListener(this);
        turn_on.setOnClickListener(this);
        log.setOnClickListener(this);
        raise_power.setOnClickListener(this);
        root.setOnClickListener(this);
        anti_log.setOnClickListener(this);
        tangent.setOnClickListener(this);
        sine.setOnClickListener(this);
        cosine.setOnClickListener(this);
        hypotenus.setOnClickListener(this);
        delete.setOnClickListener(this);
        inverse.setOnClickListener(this);
        factorial.setOnClickListener(this);
        absolute_value.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
        pi.setOnClickListener(this);
        nine.setOnClickListener(this);
        eight.setOnClickListener(this);
        seven.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        percent.setOnClickListener(this);
        six.setOnClickListener(this);
        five.setOnClickListener(this);
        four.setOnClickListener(this);
        equal_to.setOnClickListener(this);
        exponential.setOnClickListener(this);
        answer.setOnClickListener(this);
        three.setOnClickListener(this);
        two.setOnClickListener(this);
        one.setOnClickListener(this);
        negative.setOnClickListener(this);
        negate.setOnClickListener(this);
        right_bracket.setOnClickListener(this);
        left_bracket.setOnClickListener(this);
        dot.setOnClickListener(this);
        zero.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.turn_off:
                editText.setText("");
                break;
            case R.id.square_root:
                editText.setText("√");
                break;
            case R.id.find_square:
                editText.setText("²");
                break;
            case R.id.turn_on:
                editText.setText("0");
                break;
            case R.id.log:
                editText.setText(log.getText());
                break;
            case R.id.raise_power:
                editText.setText("^");
                break;
            case R.id.root:
                editText.setText("ⁿ√");
                break;
            case R.id.anti_log:
                editText.setText("10^");
                break;
            case R.id.tangent:
                editText.setText(tangent.getText());
                break;
            case R.id.sine:
                editText.setText(sine.getText());
                break;
            case R.id.cosine:
                editText.setText(cosine.getText());
                break;
            case R.id.hypotenus:
                editText.setText(hypotenus.getText());
                break;
            case R.id.delete:
                editText.setText(delete.getText());
                break;
            case R.id.inverse:
                editText.setText("‾¹");
                break;
            case R.id.factorial:
                editText.setText("!");
                break;
            case R.id.absolute_value:
                editText.setText("abs");
                break;
            case R.id.minus:
                editText.setText(minus.getText());
                break;
            case R.id.plus:
                editText.setText(plus.getText());
                break;
            case R.id.pi:
                editText.setText(pi.getText());
                break;
            case R.id.nine:
                editText.setText(nine.getText());
                break;
            case R.id.eight:
                editText.setText(eight.getText());
                break;
            case R.id.seven:
                editText.setText(seven.getText());
                break;
            case R.id.divide:
                editText.setText(divide.getText());
                break;
            case R.id.multiply:
                editText.setText(multiply.getText());
                break;
            case R.id.percent:
                editText.setText(percent.getText());
                break;
            case R.id.six:
                editText.setText(six.getText());
                break;
            case R.id.five:
                editText.setText(five.getText());
                break;
            case R.id.four:
                editText.setText(four.getText());
                break;
            case R.id.equal_to:
                editText.setText(equal_to.getText());
                break;
            case R.id.exponential:
                editText.setText("E");
                break;
            case R.id.answer:
                editText.setText(answer.getText());
                break;
            case R.id.three:
                editText.setText(three.getText());
                break;
            case R.id.two:
                editText.setText(two.getText());
                break;
            case R.id.one:
                editText.setText(one.getText());
                break;
            case R.id.negative:
                editText.setText("-");
                break;
            case R.id.negate:
                editText.setText(negate.getText());
                break;
            case R.id.right_bracket:
                editText.setText(right_bracket.getText());
                break;
            case R.id.left_bracket:
                editText.setText(left_bracket.getText());
                break;
            case R.id.dot:
                editText.setText(dot.getText());
                break;
            case R.id.zero:
                editText.setText(zero.getText());
                break;
            default:
                editText.setText("");
                break;
        }
    }
    public void calculate(){
        editText.getText();    }


    }



//    public void onClickTurnOff(View view){
//        editText = (EditText)findViewById(R.id.editText);
        //turns off the calculator
//        on = false;}

//    public double onClickSquareRoot(View view){
//        editText = findViewById(R.id.square_root);
//        editText.setText("√");
//        double squareroot = Math.sqrt( editText.getNextFocusRightId());
//        return squareroot;}
//    public double onClickFindSquare(View view){
//        editText = findViewById(R.id.find_square);
//        double square = editText.getNextFocusLeftId()*editText.getNextFocusLeftId();
//        return square;}
//    public void onClickTurnOn(View view){
//        on = true;
//        editText.setText("0");
//        editText = findViewById(R.id.turn_on);}
//    public double onClickLog(View view){
//        double log = Math.log10(editText.findViewById(R.id.log));
//        return log;}