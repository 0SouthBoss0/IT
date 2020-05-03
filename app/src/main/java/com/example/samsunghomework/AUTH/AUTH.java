package com.example.samsunghomework.AUTH;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;;
import com.example.samsunghomework.R;

import org.json.JSONObject;

public class AUTH extends Activity {

    private static String CLIENT_ID = "7445474";
    private static String CLIENT_SECRET = "krL7V9qecCh34ck0nkmD";
    private static String TOKEN_URL = "https://oauth.vk.com/access_token";
    private static String OAUTH_URL = "http://oauth.vk.com/authorize";
    private static String RESPONSE_TYPE = "code";
    private static String VK_API_URL = "https://api.vk.com/method/users.get";
    private static String REDIRECT_URI = "http://localhost";
    private static String OUR_SERVER = "http://109.252.69.85:8080/VK/";

    WebView web;
    Button auth;
    SharedPreferences pref;
    TextView Access;
    TextView serverResponse;
    String responsePOST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth);
        pref = getSharedPreferences("AppPref", MODE_PRIVATE);
        Access = (TextView) findViewById(R.id.Access);
        serverResponse = (TextView) findViewById(R.id.response);
        auth = (Button) findViewById(R.id.auth);
        auth.setOnClickListener(new View.OnClickListener() {
            Dialog auth_dialog;

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                auth_dialog = new Dialog(AUTH.this);
                auth_dialog.setContentView(R.layout.auth_dialog);
                web = (WebView) auth_dialog.findViewById(R.id.webv);
                web.getSettings().setJavaScriptEnabled(true);
                web.loadUrl("https://oauth.vk.com/authorize?client_id=7445474&display=page&scope=friends&response_type=token&v=5.103&state=228228");
                web.setWebViewClient(new WebViewClient() {
                    boolean authComplete = false;
                    Intent resultIntent = new Intent();

                    @Override
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
                        super.onPageStarted(view, url, favicon);
                    }

                    String authCode;

                    @Override
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);
                        if (url.contains("?code=") && authComplete != true) {
                            Uri uri = Uri.parse(url);
                            authCode = uri.getQueryParameter("code");
                            Log.i("", "CODE : " + authCode);
                            authComplete = true;
                            resultIntent.putExtra("code", authCode);
                           AUTH.this.setResult(Activity.RESULT_OK, resultIntent);
                            setResult(Activity.RESULT_CANCELED, resultIntent);
                            SharedPreferences.Editor edit = pref.edit();
                            edit.putString("Code", authCode);
                            edit.commit();
                            auth_dialog.dismiss();
                            new TokenGet().execute();
                            Toast.makeText(getApplicationContext(), "Authorization Code is: " + authCode, Toast.LENGTH_SHORT).show();
                        } else if (url.contains("error=access_denied")) {
                            Log.i("", "ACCESS_DENIED_HERE");
                            resultIntent.putExtra("code", authCode);
                            authComplete = true;
                            setResult(Activity.RESULT_CANCELED, resultIntent);
                            Toast.makeText(getApplicationContext(), "Error Occured", Toast.LENGTH_SHORT).show();
                            auth_dialog.dismiss();
                        }
                    }
                });
                auth_dialog.show();
                auth_dialog.setTitle("IT ШКОЛА SAMSUNG");
                auth_dialog.setCancelable(true);
            }
        });
    }
    private class TokenGet extends AsyncTask<String, String, JSONObject> {
        private ProgressDialog pDialog;
        String Code;

        @Override
        protected void onPreExecute() {super.onPreExecute();
            pDialog = new ProgressDialog(AUTH.this);
            pDialog.setMessage("Connecting VK ...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            Code = pref.getString("Code", "");
            pDialog.show();
        }

        @Override
        protected JSONObject doInBackground(String... args) {
            GetAccessToken jParserToken = new GetAccessToken();
            JSONObject jsonToken = jParserToken.gettoken(TOKEN_URL, Code,
                    CLIENT_ID, CLIENT_SECRET, REDIRECT_URI);
            GetUserInfo jParserUser = new GetUserInfo();
            JSONObject jsonUser = jParserUser.getuserinfo(VK_API_URL, jsonToken);
            SetToServer jsetToServer = new SetToServer();
            responsePOST = jsetToServer.setPOST(OUR_SERVER, jsonUser);
            return jsonUser;
        }

        @Override
        protected void onPostExecute(JSONObject json) {
            pDialog.dismiss();
            if (json != null) {
                String jsonResp = json.toString();
                auth.setVisibility(View.GONE);
                Access.setText(jsonResp);
                serverResponse.setText("Ответ сервера: " + responsePOST);
            } else {
                Toast.makeText(getApplicationContext(), "Network Error",
                        Toast.LENGTH_SHORT).show();
                pDialog.dismiss();
            }
        }
    }
}