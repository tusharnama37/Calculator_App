package com.example.calc_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView price,twentyDollarAmt,tenDollarAmt,fiveDollarAmt,oneDollarAmt,twentyFiveCents,tenCents,fiveCents,oneCent;
    public Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but0,butClear;
    public String money="0.00";
    int powCount=1;
    float val=0.00f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Defining the resources of buttons, textView and accompanying listener functions for buttons
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        price=(TextView)findViewById(R.id.pText);
        twentyDollarAmt=findViewById(R.id.twentyDollarText);
        tenDollarAmt=findViewById(R.id.tenDollarText);
        fiveDollarAmt=findViewById(R.id.fiveDollarText);
        oneDollarAmt=findViewById(R.id.oneDollarText);
        twentyFiveCents=findViewById(R.id.twentyFiveText);
        tenCents=findViewById(R.id.tenCentsText);
        fiveCents=findViewById(R.id.fiveCentsText);
        oneCent=findViewById(R.id.oneCentText);
        price.setText(money);
        but1= findViewById(R.id.buttonOne);
        but1.setOnClickListener(this);
        but2= findViewById(R.id.buttonTwo);
        but2.setOnClickListener(this);
        but3= findViewById(R.id.buttonThree);
        but3.setOnClickListener(this);
        but4= findViewById(R.id.buttonFour);
        but4.setOnClickListener(this);
        but5= findViewById(R.id.buttonFive);
        but5.setOnClickListener(this);
        but6= findViewById(R.id.buttonSix);
        but6.setOnClickListener(this);
        but7=findViewById(R.id.buttonSeven);
        but7.setOnClickListener(this);
        but8=findViewById(R.id.buttonEight);
        but8.setOnClickListener(this);
        but9= findViewById(R.id.buttonNine);
        but9.setOnClickListener(this);
        but0=findViewById(R.id.buttonZero);
        but0.setOnClickListener(this);
        butClear= findViewById(R.id.clearButton);
        butClear.setOnClickListener(this);

    }
    public void computeVal(String num,String num2)
    {
        val=Float.parseFloat(num);
        val= (float) ((val*1000)+(Float.parseFloat(num2)))/100;
        powCount++;
        money=Float.toString(val);
        price.setText(money);
    }
    public void computeDenominations(String num) {
        int[] currArray = new int[8];
        BigDecimal temp_num = new BigDecimal(num);

        // Compute denominations for dollars
        currArray[0] = temp_num.divide(BigDecimal.valueOf(20), 0, BigDecimal.ROUND_DOWN).intValue();
        temp_num = temp_num.remainder(BigDecimal.valueOf(20));
        twentyDollarAmt.setText(Integer.toString(currArray[0]));

        currArray[1] = temp_num.divide(BigDecimal.valueOf(10), 0, BigDecimal.ROUND_DOWN).intValue();
        temp_num = temp_num.remainder(BigDecimal.valueOf(10));
        tenDollarAmt.setText(Integer.toString(currArray[1]));

        currArray[2] = temp_num.divide(BigDecimal.valueOf(5), 0, BigDecimal.ROUND_DOWN).intValue();
        temp_num = temp_num.remainder(BigDecimal.valueOf(5));
        fiveDollarAmt.setText(Integer.toString(currArray[2]));

        currArray[3] = temp_num.divide(BigDecimal.valueOf(1), 0, BigDecimal.ROUND_DOWN).intValue();
        temp_num = temp_num.remainder(BigDecimal.valueOf(1));
        oneDollarAmt.setText(Integer.toString(currArray[3]));

        // Compute denominations for cents
        temp_num = temp_num.multiply(BigDecimal.valueOf(100)); // Convert to cents

        currArray[4] = temp_num.divide(BigDecimal.valueOf(25), 0, BigDecimal.ROUND_DOWN).intValue();
        temp_num = temp_num.remainder(BigDecimal.valueOf(25));
        twentyFiveCents.setText(Integer.toString(currArray[4]));

        currArray[5] = temp_num.divide(BigDecimal.valueOf(10), 0, BigDecimal.ROUND_DOWN).intValue();
        temp_num = temp_num.remainder(BigDecimal.valueOf(10));
        tenCents.setText(Integer.toString(currArray[5]));

        currArray[6] = temp_num.divide(BigDecimal.valueOf(5), 0, BigDecimal.ROUND_DOWN).intValue();
        temp_num = temp_num.remainder(BigDecimal.valueOf(5));
        fiveCents.setText(Integer.toString(currArray[6]));

        currArray[7] = temp_num.divide(BigDecimal.valueOf(1), 0, BigDecimal.ROUND_DOWN).intValue();
        oneCent.setText(Integer.toString(currArray[7]));
    }

    @Override
    public void onClick(View v) {
        //Used multiple If-Else for identifying button clicks as Switch was resulting in error
        int id = v.getId();
        if (id == R.id.buttonOne) {
            computeVal(money,"1");
            computeDenominations(money);
        } else if (id == R.id.buttonTwo) {
            computeVal(money,"2");
            computeDenominations(money);
        } else if (id == R.id.buttonThree) {
            computeVal(money,"3");
            computeDenominations(money);
        } else if (id == R.id.buttonFour) {
            computeVal(money,"4");
            computeDenominations(money);
        } else if (id == R.id.buttonFive) {
            computeVal(money,"5");
            computeDenominations(money);
        } else if (id == R.id.buttonSix) {
            computeVal(money,"6");
            computeDenominations(money);
        } else if (id == R.id.buttonSeven) {
            computeVal(money,"7");
            computeDenominations(money);
        } else if (id == R.id.buttonEight) {
            computeVal(money,"8");
            computeDenominations(money);
        } else if (id == R.id.buttonNine) {
            computeVal(money,"9");
            computeDenominations(money);
        } else if (id == R.id.buttonZero) {
            computeVal(money,"0");
            computeDenominations(money);
            computeDenominations(money);
        }
        else if (id==R.id.clearButton){
            money="0.00";
            powCount=0;
            price.setText((money));
            twentyDollarAmt.setText("0");
            tenDollarAmt.setText("0");
            fiveDollarAmt.setText("0");
            oneDollarAmt.setText("0");
            twentyFiveCents.setText("0");
            tenCents.setText("0");
            fiveCents.setText("0");
            oneCent.setText("0");
        }

    }
}