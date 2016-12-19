package com.example.user.yvd121901;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void clickShow(View v)
    {
        Notification.Builder builder = new Notification.Builder(MainActivity.this);
        builder.setContentTitle("這是標題")
                .setContentText("這裡是內容")
                .setSmallIcon(R.mipmap.ic_launcher);
        Notification notification = builder.build();
        nm.notify(1, notification);
    }
}