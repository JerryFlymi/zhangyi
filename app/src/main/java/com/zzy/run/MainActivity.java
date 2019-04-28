package com.zzy.run;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zzy.run.fragment.ContainerActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnFragment = findViewById(R.id.bt_fragment);
        setListener();
    }

    private void setListener(){
        OnClick onclick = new OnClick();
        mBtnFragment.setOnClickListener(onclick);
    }
    private class OnClick implements View.OnClickListener{
        public void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.bt_fragment:
                    intent=new Intent(MainActivity.this, RadiogroupActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}

