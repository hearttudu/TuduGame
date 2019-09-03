package com.example.tuduzhao.tudugame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a2048_module.Game2048Activity;
import com.example.dadishu_module.DaDiShuGameActivity;
import com.example.wuziqi_module.ai.FiveChessAiActivity;
import com.example.wuziqi_module.human.FiveChessHumanActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.btn1:
                DaDiShuGameActivity.startActivity(this);
                break;
            case R.id.btn2:
                Game2048Activity.startActivity(this);
                break;
            case R.id.btn3:
                FiveChessAiActivity.startActivity(this);
                break;
            case R.id.btn4:
                FiveChessHumanActivity.startActivity(this);
                break;
        }
    }
}
