package com.cxs.pre.signaturedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cxs.pre.signaturedemo.signaturepad.views.SignaturePad;

public class MainActivity extends AppCompatActivity {

    private SignaturePad signatureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClean(View v) {
        signatureView = (SignaturePad) findViewById(R.id.sp_signature);
        signatureView.clear();
    }
}
