package com.example.mad_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    ListView list;
    String[] itemname ={
            "Profile",
            "Education",
            "Experience",
            "Projects",
            "Templates",
            "LinkedIn"


    };

    Integer[] imgid={
            R.drawable.profile,
            R.drawable.educatio,
            R.drawable.experience,
            R.drawable.books,
            R.drawable.main,
            R.drawable.link2

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                if(position==0)
                {
                    Intent i=new Intent(view.getContext(),profile.class);
                    startActivityForResult(i,0);
                }
                if(position==1)
                {
                    Intent i=new Intent(view.getContext(),education.class);
                    startActivityForResult(i,0);
                }
                if(position==2)
                {
                    Intent i=new Intent(view.getContext(),experience.class);
                    startActivityForResult(i,0);
                }
                if(position==3)
                {
                    Intent i=new Intent(view.getContext(),projects.class);
                    startActivityForResult(i,0);
                }
                if(position==4)
                {
                    Intent i=new Intent(view.getContext(),awards.class);
                    startActivityForResult(i,0);
                }
                if(position==5)
                {
                    String url = "https://www.linkedin.com/home";

                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }

            }
        });
    }
}

