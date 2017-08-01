package com.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.telephony.SmsManager;
import android.widget.Spinner;

/**
 * Created by Administrator on 2017-07-28.
 */
public class RegistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner natureCode = (Spinner)findViewById(R.id.spinner);
        //array

        /*국가코드는  일단보류*/
        Button btnNext = (Button)findViewById(R.id.btnNext);


        EditText editPhone = (EditText)findViewById(R.id.editPhone);
        editPhone.setText(getPhoneNumber().replace("-", "").replace("+82", "0")); // KT의 경우 핸드폰번호 앞에 +82 라는 국가코드번호가 붙는다.
        // 그래서 국가 코드번호를 0으로 바꿔줘야 한다. 이런 식으로 해주면 정상적으로 번호를 가져올 수 있다.


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
SmsManager sms = SmsManager.getDefault();
sms.sendTextMessage("01087944232", null, "SMS버튼이 눌렸음.", null, null);
[출처] 안드로이드 - 단말확인, sms 보내기|작성자 실바

*/
            }
        });
    }


    // 핸드폰번호 얻기
    public String getPhoneNumber()
    {
        TelephonyManager mgr = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        return mgr.getLine1Number();
    }
}
/*http://cholol.tistory.com/397 */
/*http://docs.aws.amazon.com/ko_kr/sns/latest/dg/sms_publish-to-phone.html*/
/*https://aws.amazon.com/ko/blogs/korea/how-to-own-user-auth-service-using-amazon-cognito/*/
//https://www.youtube.com/watch?v=wix8xR68kF0 회원가입 참고
/*// 단말기 핸드폰번호 얻어오기
 public String getPhoneNumber() {
   TelephonyManager mgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
   return mgr.getLine1Number();

  }*/
/*
* //이메일형식체크
        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches())
        {
            Toast.makeText(SignupActivity.this,"이메일 형식이 아닙니다",Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        }

        //핸드폰번호 유효성
        if(!Pattern.matches("^01(?:0|1|[6-9]) - (?:\\d{3}|\\d{4}) - \\d{4}$", Phone_num))
        {
            Toast.makeText(SignupActivity.this,"올바른 핸드폰 번호가 아닙니다.",Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        }

        //비밀번호 유효성
        if(!Pattern.matches("^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-zA-Z]).{8,20}$", PW))
        {
            Toast.makeText(SignupActivity.this,"비밀번호 형식을 지켜주세요.",Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        }
* */