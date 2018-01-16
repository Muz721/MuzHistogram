package com.example.administrator.muzhistogram;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.muzhistogram.customerview.MuzHistogram;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt)
    TextView txt;
    @BindView(R.id.muzHistogram)
    MuzHistogram muzHistogram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.txt)
    public void onViewClicked(View v) {
        switch (v.getId()){
            case R.id.txt:
                ArrayList<String> type = new ArrayList<String>();
                type.add("支付宝");
                type.add("微信");
                type.add("QQ");
                type.add("微博");
                type.add("空间");
                type.add("新浪");
                type.add("网易");
                type.add("360");
                type.add("暴雪");
                type.add("小米");
                type.add("苹果");
                type.add("华为");
                ArrayList<Double> money=new ArrayList<Double>();
                money.add(110.1);
                money.add(120.1);
                money.add(130.1);
                money.add(140.1);
                money.add(120.1);
                money.add(460.1);
                money.add(170.1);
                money.add(180.1);
                money.add(390.1);
                money.add(105.1);
                money.add(210.1);
                money.add(220.1);
                ArrayList<String> colours=new ArrayList<String>();
                colours.add("#FF0000");
                colours.add("#FF00FF");
                colours.add("#800080");
                colours.add("#0000FF");
                colours.add("#00FF7F");
                colours.add("#008000");
                colours.add("#FFFF00");
                colours.add("#DAA520");
                colours.add("#FFF5EE");
                colours.add("#FFFFFF");
                colours.add("#00FFFF");
                colours.add("#2F4F4F");
                muzHistogram.setPaints(type,money);
                muzHistogram.setColors(colours);
                muzHistogram.setInitColor(Color.BLUE);
                muzHistogram.setInitHistogramWidth(200);
                muzHistogram.setHistogramMinInterval(50);
                muzHistogram.setInitTextSize(50);
                muzHistogram.setInitTextNameInterval(50);
                muzHistogram.setInitTextNumberInterval(50);
                muzHistogram.setInitTextNameColor(Color.RED);
                muzHistogram.setInitTextNumberColor(Color.RED);
                muzHistogram.setInitTextColor(true);
                muzHistogram.setInitHistogramColor(Color.GREEN);
                break;
        }
    }
}
