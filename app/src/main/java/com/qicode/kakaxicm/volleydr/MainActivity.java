package com.qicode.kakaxicm.volleydr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.qicode.kakaxicm.volleydr.volley.RequestQueue;
import com.qicode.kakaxicm.volleydr.volley.Response;
import com.qicode.kakaxicm.volleydr.volley.VolleyError;
import com.qicode.kakaxicm.volleydr.volley.toolbox.JsonObjectRequest;
import com.qicode.kakaxicm.volleydr.volley.toolbox.Volley;

import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestQueue mQueue = Volley.newRequestQueue(this);
        //请求普通字串
//        StringRequest stringRequest = new StringRequest(Request.Method.POST,
//                "http://wenwan.cacang.com/wenwan/index/xxxxx",
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Log.e("Volley", response);
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("Volley", error.getLocalizedMessage());
//            }
//        }) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> map = new HashMap<String, String>();
//                map.put("params1", "value1");
//                map.put("params2", "value2");
//                return map;
//            }
//        };
//
//        RequestQueue mQueue = Volley.newRequestQueue(this);
//        mQueue.add(stringRequest);


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                "http://wenwan.cacang.com/wenwan/index/xxxxx",
                null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("Volley", response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        mQueue.add(jsonObjectRequest);
    }
}
