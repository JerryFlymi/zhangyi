package com.zzy.run.fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zzy.run.R;

public class ContainerActivity extends AppCompatActivity {
    private AFragment aFragment;
    private BFragment bFragment;
    private CFragment cFragment;
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run_container);
        mBtn1 = findViewById(R.id.btn_select1);
        mBtn2 = findViewById(R.id.btn_select2);
        mBtn3 = findViewById(R.id.btn_select3);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aFragment == null){
                    aFragment = new AFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment,aFragment).commitAllowingStateLoss();
            }
        });
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bFragment == null){
                    bFragment = new BFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment,bFragment).commitAllowingStateLoss();
            }
        });
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cFragment == null){
                    cFragment = new CFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment,cFragment).commitAllowingStateLoss();
            }
        });
        bFragment = new BFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_fragment,bFragment).commitAllowingStateLoss();



    }
}
