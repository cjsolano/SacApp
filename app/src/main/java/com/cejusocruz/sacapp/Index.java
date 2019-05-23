package com.cejusocruz.sacapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.index_main);

        Thread logo = new Thread(){

            public void run(){
                try{
                    int tiempo=0;
                    while(tiempo<3000){
                        sleep(100);
                        tiempo=tiempo+100;
                    }
                    Intent i=new Intent( Index.this, MainActivity.class);
                    startActivity(i);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    finish();
                }
            }
        };

        logo.start();
    }

}
