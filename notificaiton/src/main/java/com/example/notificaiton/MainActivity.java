package com.example.notificaiton;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnshownotifi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,DetailActivity.class);
                i.putExtra("ID","1");
                i.putExtra("TITLE","NEX SHOT");
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);


                NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this);
                builder
                        .setContentTitle("title")
                        .setContentText("conten text")
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ic_android))
                        .setSmallIcon(R.drawable.ic_android)
                        .setAutoCancel(true)
                        .setTicker("Ticker")
                        .setContentIntent(pendingIntent);
                    NotificationManager notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(0,builder.build());
            }
        });
        findViewById(R.id.btninboxstyle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] name=new String[3];
                name[0]=new String("1 dara");
                name[1]=new String("2 dara");
                name[2]=new String("3 dara");


                Notification.Builder builder=new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("contentTitle")
                        .setContentText("contentText");
                Notification notification = new Notification.InboxStyle(builder)
                        .addLine("First Message")
                        .addLine("Second Message")
                        .addLine("Third Message")
                        .addLine("Fourth Message")
                        .setBigContentTitle("Here Your Messages")
                        .setSummaryText("+3 more")
                        .build();
                NotificationManager notificationManager = (NotificationManager)getSystemService(MainActivity.NOTIFICATION_SERVICE);
                notificationManager.notify(121,notification);

                for(String string:name){


                }
            }
        });
    }
}
