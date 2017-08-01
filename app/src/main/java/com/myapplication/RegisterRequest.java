package com.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-07-31.
 */
public class RegisterRequest extends StringRequest {

    private static final String REGISTER_URL = "http://52.78.11.67/my_register.php";

    private Map<String,String> prams;

    public RegisterRequest(String userPhone, String userPassword,String userAddress, String userBirth, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, REGISTER_URL, listener, errorListener);
        prams = new HashMap<>();
        prams.put("",userPhone);
        prams.put("",userPassword);
        prams.put("",userAddress);
        prams.put("",userBirth);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return super.getParams();
    }
}
