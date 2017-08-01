package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2017-07-28.
 */
public class RegistActivity2 extends AppCompatActivity  {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText editSMSNumber = (EditText)findViewById(R.id.editSMSNumber);
        Button btnPass = (Button)findViewById(R.id.btnPass);


        btnPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result = new Intent();
            }
        });
    }

    public void sendSMS(String smsNumber){

        String smsNum = smsNumber.getBytes().toString();

        if (smsNum.length()>0){

            sendSMS(smsNum);

        }else{
            Toast.makeText(this, "인증번호를 입력해 주세요", Toast.LENGTH_SHORT).show();

        }
    }
}
/**
 * public String getMobileNumber()
 	{
  		if (!hasPhonePermission()) {
 			return "";
 		}

 		Context context = TiApplication.getInstance().getApplicationContext();
 		TelephonyManager tMgr = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
 		String mPhoneNumber = tMgr.getLine1Number();
 		Log.d(LCAT, "getMobileNumber : " + mPhoneNumber);
  		return mPhoneNumber;
  	}
 *
 */

/*
public void sendSMS(View v){

    String smsNum = smsNumber.getText().toString();

    String smsText = smsTextContext.getText().toString();



    if (smsNum.length()>0 && smsText.length()>0){

        sendSMS(smsNum, smsText);

    }else{

        Toast.makeText(this, "모두 입력해 주세요", Toast.LENGTH_SHORT).show();

    }

}
 *
 */
