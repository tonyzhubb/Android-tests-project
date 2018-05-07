package com.example.antony.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.antony.myapplication.R.id.lu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this, "THIS APPLICATION HAS BEEN PAUSED", Toast.LENGTH_SHORT).show();
    }public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mm=getMenuInflater();
        mm.inflate(R.menu.su,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem k){
        switch (k.getItemId()){
            case R.id.nya:
                return true;
                default:
            return super.onOptionsItemSelected(k);
        }
    }

    public void tan(View view) {
        String y;
        y=((Button)view).getText().toString();
        if(y.equals("GO PRICES")){
            Intent j=new Intent(this, Main2Activity.class);
            startActivity(j);
        }




    }
}
