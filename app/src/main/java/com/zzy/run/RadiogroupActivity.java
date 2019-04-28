package com.zzy.run;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.zzy.run.fragment.AFragment;
import com.zzy.run.fragment.BFragment;
import com.zzy.run.fragment.CFragment;

public class RadiogroupActivity extends AppCompatActivity {
    private RadioGroup mRg;
    private AFragment aFragment;
    private BFragment bFragment;
    private CFragment cFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiogroup);
        bFragment = new BFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_Fragment,bFragment).commitAllowingStateLoss();
        mRg=findViewById(R.id.RG_nav);
        mRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbt_1:
                        if(aFragment == null){
                            aFragment = new AFragment();
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_Fragment,aFragment).commitAllowingStateLoss();
                        break;
                    case R.id.rbt_2:
                        if(bFragment == null){
                            bFragment = new BFragment();
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_Fragment,bFragment).commitAllowingStateLoss();
                        break;
                    case R.id.rbt_3:
                        if(cFragment == null){
                            cFragment = new CFragment();
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_Fragment,cFragment).commitAllowingStateLoss();
                        break;
                }

            }
        });

    }
}
