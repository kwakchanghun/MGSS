package com.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-07-31.
 */
public class ValidateRequest extends StringRequest {
    private static final String REGISTER_URL = "http://52.78.11.67/my_validate.php";

    private Map<String,String> prams;

    public ValidateRequest(String userPhone, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, REGISTER_URL, listener, errorListener);
        prams = new HashMap<>();
        prams.put("",userPhone);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return super.getParams();
    }
}
