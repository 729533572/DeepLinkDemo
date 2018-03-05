package com.main.deeplinkdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by shuqiao on 2018/3/5.
 */

public class UserActivity extends Activity {
    public static final String TAG = "UserActivity";

    private TextView tvTitle;
    private TextView tvContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user);

        tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText(TAG);

        tvContent = findViewById(R.id.tv_content);
        Intent intent = getIntent();
        if (intent != null && intent.getData() != null) {
            Uri uri = intent.getData();
            StringBuilder sb = new StringBuilder();
            sb.append(uri + "\n");
            sb.append("scheme : " + uri.getScheme() + "\n");
            sb.append("host : " + uri.getHost() + "\n");
            sb.append("path : " + uri.getPath() + "\n");

            for (String param : uri.getQueryParameterNames()) {
                sb.append("params : " + param + " = " + uri.getQueryParameter(param) + "\n");
            }
            tvContent.setText(sb.toString());
        }
    }
}
