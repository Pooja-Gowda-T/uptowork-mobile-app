package com.example.mad_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class awards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awards);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void web(View view)
    {
        openUrl("https://edit.org/edit/all/1a605th");

    }
    public void openUrl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
    public void web1(View view)
    {
        openUrl1("https://edit.org/edit/all/41z6ewl");
    }
    public void openUrl1(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
    public void web2(View view)
    {
        openUrl3("https://edit.org/edit/all/2cisx91");
    }
    public void openUrl3(String url1)
    {
        Uri uri=Uri.parse(url1);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
    public void web3(View view)
    {
        openUrl4("https://edit.org/edit/all/4bafoqd");
    }
    public void openUrl4(String url2)
    {
        Uri uri=Uri.parse(url2);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }


}