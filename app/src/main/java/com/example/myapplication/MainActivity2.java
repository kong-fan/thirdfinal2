package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity2 extends AppCompatActivity {

    class Data {
        int photo;
    }

    public class MyAdapter extends BaseAdapter {
        private MainActivity2.Data[] data;
        private int view;

        public MyAdapter(MainActivity2.Data[] data, int view) {
            this.data = data;
            this.view = view;
        }

        public int getCount() {
            return data.length;
        }

        public Object getItem(int position) {
            return data[position];
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(view, parent, false);
            ImageView imageView = convertView.findViewById(R.id.imageView);
            imageView.setImageResource(data[position].photo);
            return convertView;
        }
    }

    private Button btn_photo, btn_setting, btn_home,btn_cat,btn_fuck,btn_ha,btn_knowledge,btn_dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_home = findViewById(R.id.btn_home);
        btn_photo = findViewById(R.id.btn_photo);
        btn_setting = findViewById(R.id.btn_setting);
        btn_cat = findViewById(R.id.btn_cat);
        btn_fuck = findViewById(R.id.btn_fuck);
        btn_ha = findViewById(R.id.btn_ha);
        btn_knowledge=findViewById(R.id.btn_knowledge);
        btn_dog=findViewById(R.id.btn_dog);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivity2.this, MainActivity.class), 1);
                finish();
            }
        });
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivity2.this, MainActivity3.class), 3);
                finish();
            }
        });


        int[] PhotoIdArray = new int[]{R.drawable.cat_qq_1,R.drawable.cat_qq_2};
        Data[] PhotoData = new Data[PhotoIdArray.length];
        for (int i = 0; i < PhotoData.length; i++) {
            PhotoData[i] = new Data();
            PhotoData[i].photo = PhotoIdArray[i];

            MyAdapter PhotoAdapter = new MyAdapter(PhotoData, R.layout.photo);

            GridView gridview = findViewById(R.id.gridview);
            gridview.setAdapter(PhotoAdapter);
            gridview.setNumColumns(1);
        }

        btn_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] PhotoIdArray = new int[]{R.drawable.cat_qq_1,R.drawable.cat_qq_2};
                Data[] PhotoData = new Data[PhotoIdArray.length];
                for (int i = 0; i < PhotoData.length; i++) {
                    PhotoData[i] = new Data();
                    PhotoData[i].photo = PhotoIdArray[i];

                    MyAdapter PhotoAdapter = new MyAdapter(PhotoData, R.layout.photo);

                    GridView gridview = findViewById(R.id.gridview);
                    gridview.setAdapter(PhotoAdapter);
                    gridview.setNumColumns(1);
                }
            }
        });
        btn_ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] PhotoIdArray = new int[]{R.drawable.hit_me_1,R.drawable.hit_me_2};
                Data[] PhotoData = new Data[PhotoIdArray.length];
                for (int i = 0; i < PhotoData.length; i++) {
                    PhotoData[i] = new Data();
                    PhotoData[i].photo = PhotoIdArray[i];

                    MyAdapter PhotoAdapter = new MyAdapter(PhotoData, R.layout.photo);

                    GridView gridview = findViewById(R.id.gridview);
                    gridview.setAdapter(PhotoAdapter);
                    gridview.setNumColumns(1);
                }
            }
        });
        btn_fuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] PhotoIdArray = new int[]{R.drawable.fuck_1,R.drawable.fuck_2,R.drawable.fuck_3,R.drawable.fuck_4};
                Data[] PhotoData = new Data[PhotoIdArray.length];
                for (int i = 0; i < PhotoData.length; i++) {
                    PhotoData[i] = new Data();
                    PhotoData[i].photo = PhotoIdArray[i];

                    MyAdapter PhotoAdapter = new MyAdapter(PhotoData, R.layout.photo);

                    GridView gridview = findViewById(R.id.gridview);
                    gridview.setAdapter(PhotoAdapter);
                    gridview.setNumColumns(1);
                }
            }
        });
        btn_knowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] PhotoIdArray = new int[]{R.drawable.knowledge_1,R.drawable.knowledge_2,R.drawable.knowledge_3};
                Data[] PhotoData = new Data[PhotoIdArray.length];
                for (int i = 0; i < PhotoData.length; i++) {
                    PhotoData[i] = new Data();
                    PhotoData[i].photo = PhotoIdArray[i];

                    MyAdapter PhotoAdapter = new MyAdapter(PhotoData, R.layout.photo);

                    GridView gridview = findViewById(R.id.gridview);
                    gridview.setAdapter(PhotoAdapter);
                    gridview.setNumColumns(1);
                }
            }
        });
        btn_dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] PhotoIdArray = new int[]{R.drawable.dog_1,R.drawable.dog_2,R.drawable.dog_3,R.drawable.dog_4,R.drawable.dog_5
                        ,R.drawable.dog_6,R.drawable.dog_7,R.drawable.dog_8,R.drawable.dog_9,R.drawable.dog_10,R.drawable.dog_11
                ,R.drawable.dog_12,R.drawable.dog_13,R.drawable.dog_14,R.drawable.dog_15,R.drawable.dog_16};
                Data[] PhotoData = new Data[PhotoIdArray.length];
                for (int i = 0; i < PhotoData.length; i++) {
                    PhotoData[i] = new Data();
                    PhotoData[i].photo = PhotoIdArray[i];

                    MyAdapter PhotoAdapter = new MyAdapter(PhotoData, R.layout.photo);

                    GridView gridview = findViewById(R.id.gridview);
                    gridview.setAdapter(PhotoAdapter);
                    gridview.setNumColumns(1);
                }
            }
        });
    }
}

