package com.app.sampleproject.view;

import android.os.Bundle;
import com.app.sampleproject.R;
import com.app.sampleproject.model.utils.BaseActivity;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
//    private Controller mController=new Controller(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        //
    }


    private void initView() {
        //get
        //set
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
