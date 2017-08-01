package com.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Administrator on 2017-07-31.
 */
public class RegistActivity3 extends AppCompatActivity {
    String choice_do = "";
    String choice_se = "";//검색시 선택된 매세지를 띄우기 위한 선언하였습니다. 그냥 선언안하고 인자로 넘기셔도 됩니다.
    ArrayAdapter<CharSequence> adapter_Gu, adapter_Dong;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3);
        final Spinner spin_Gu = (Spinner) findViewById(R.id.spinner_Gu);
        final Spinner spin_Dong = (Spinner) findViewById(R.id.spinner_Dong);
        //array

        adapter_Gu = ArrayAdapter.createFromResource(this, R.array.Spiner_Gu, android.R.layout.simple_spinner_dropdown_item);
        adapter_Gu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);//이부분이 정확히 말로 설명을 못하겠습니다. 아무튼 필요합니다. 헤헤 고수분들 도와주세요.
        spin_Gu.setAdapter(adapter_Gu);
//어댑터에 값들을 spinner에 넣습니다. 여기까지 하시면 첫번째 spinner에 값들이 들어갈 것입니다.
        spin_Gu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {//첫번째 spinner 클릭시 이벤트 발생입니다. setO 정도까지 치시면 자동완성됩니다. 뒤에도 마찬가지입니다.

                                              @Override
                                              public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                  if (adapter_Gu.getItem(i).equals("청원구")) {//spinner에 값을 가져와서 i 보이시나요 제가 클릭 한것이 서울인지 확인합니다.
                                                      choice_do = "청원구";//버튼 클릭시 출력을 위해 값을 넣었습니다.
                                                      adapter_Dong = ArrayAdapter.createFromResource(RegistActivity3.this, R.array.Spiner_Chung_Won, android.R.layout.simple_spinner_dropdown_item);//서울일 경우에 두번째 spinner에 값을 넣습니다. //그냥 this가 아닌 Main~~~인 이유는 그냥 this는 메인엑티비티인 경우만 가능합니다. //지금과 같이 다른 함수안이나 다른 클래스에서는 꼭 자신의 것을 넣어주어야 합니다.//혹시나 다른 class -> Public View밑에서 작업하시는 분은 view명.getContext()로 해주셔야 합니다.//예로 View rootView =~~ 선언하신 경우에는 rootView.getContext()써주셔야합니다. this가 아니라요.
                                                      adapter_Dong.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                                      spin_Dong.setAdapter(adapter_Dong);//두번째 어댑터값을 두번째 spinner에 넣었습니다.
                                                      spin_Dong.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {//저희는 두번째 선택된 값도 필요하니 이안에 두번째 spinner 선택 이벤트를 정의합니다.

                                                          @Override
                                                          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                              choice_se = adapter_Dong.getItem(i).toString();//두번째 선택된 값을 choice_se에 넣습니다.
                                                          }


                                                          @Override
                                                          public void onNothingSelected(AdapterView<?> adapterView) {

                                                          }
                                                      });
                                                  } else if (adapter_Gu.getItem(i).equals("상당구")) {//똑같은 소스에 반복입니다. 인천부분입니다.
                                                      choice_do = "상당구";
                                                      adapter_Dong = ArrayAdapter.createFromResource(RegistActivity3.this, R.array.Spiner_Sang_Dang, android.R.layout.simple_spinner_dropdown_item);
                                                      adapter_Dong.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                                      spin_Dong.setAdapter(adapter_Dong);
                                                      spin_Dong.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                          @Override
                                                          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                              choice_se = adapter_Dong.getItem(i).toString();
                                                          }

                                                          @Override
                                                          public void onNothingSelected(AdapterView<?> adapterView) {

                                                          }
                                                      });
                                                  } else if (adapter_Gu.getItem(i).equals("흥덕구")) {//똑같은 소스에 반복입니다. 인천부분입니다.
                                                      choice_do = "흥덕구";
                                                      adapter_Dong = ArrayAdapter.createFromResource(RegistActivity3.this, R.array.Spiner_Heng_Duk, android.R.layout.simple_spinner_dropdown_item);
                                                      adapter_Dong.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                                      spin_Dong.setAdapter(adapter_Dong);
                                                      spin_Dong.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                          @Override
                                                          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                              choice_se = adapter_Dong.getItem(i).toString();
                                                          }

                                                          @Override
                                                          public void onNothingSelected(AdapterView<?> adapterView) {

                                                          }
                                                      });
                                                  } else if (adapter_Gu.getItem(i).equals("흥덕구")) {//똑같은 소스에 반복입니다. 인천부분입니다.
                                                      choice_do = "흥덕구";
                                                      adapter_Dong = ArrayAdapter.createFromResource(RegistActivity3.this, R.array.Spiner_Heng_Duk, android.R.layout.simple_spinner_dropdown_item);
                                                      adapter_Dong.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                                      spin_Dong.setAdapter(adapter_Dong);
                                                      spin_Dong.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                          @Override
                                                          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                              choice_se = adapter_Dong.getItem(i).toString();
                                                          }

                                                          @Override
                                                          public void onNothingSelected(AdapterView<?> adapterView) {
                                                          }
                                                      });
                                                  }
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> adapterView) {

                                              }
                                          }
        );
    }
}
