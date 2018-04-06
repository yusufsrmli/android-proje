package com.example.yusuf.ogrenci5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    Button Button_Kaydet,Button_Gun,geri;
    EditText dersadi,devamsayi;

    CheckBox c1,c2,c3,c4,c5,c6,c7;

    TimePicker timepicker;


    String pztsi;
    String sali;
    String carsnba;
    String prsmbe;
    String cma;
    String cmrtsi;
    String pzr;

    StringBuffer buffer_pzt=new StringBuffer();
    StringBuffer buffer_sli=new StringBuffer();
    StringBuffer buffer_crsnba=new StringBuffer();
    StringBuffer buffer_prsembe=new StringBuffer();
    StringBuffer buffer_cuma=new StringBuffer();
    StringBuffer buffer_cmrtesi=new StringBuffer();
    StringBuffer buffer_pzr=new StringBuffer();

    int kontrol=0;

    int kontrol1=0;
    int kontrol2=0;
    int kontrol3=0;
    int kontrol4=0;
    int kontrol5=0;
    int kontrol6=0;
    int kontrol7=0;




    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        myDb = new DatabaseHelper(this);
        Button_Kaydet = (Button) findViewById(R.id.kaydet);
        Button_Gun=(Button) findViewById(R.id.dersgun);
        dersadi=(EditText) findViewById(R.id.dersad);
        devamsayi=(EditText) findViewById(R.id.devamsayi);
        geri = (Button) findViewById(R.id.geri);

        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),Dersprogrami.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);

            }
        });

        Button_Kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddData();

            }
        });

        Button_Gun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                LayoutInflater  inflater = getLayoutInflater();
                View dialogLayout = inflater.inflate(R.layout.gunsaat_secimi, null);

                c1= (CheckBox) dialogLayout.findViewById(R.id.pzts);
                c2= (CheckBox) dialogLayout.findViewById(R.id.sali);
                c3= (CheckBox) dialogLayout.findViewById(R.id.carsampa);
                c4= (CheckBox) dialogLayout.findViewById(R.id.persembe);
                c5= (CheckBox) dialogLayout.findViewById(R.id.cuma);
                c6= (CheckBox) dialogLayout.findViewById(R.id.cmts);
                c7= (CheckBox) dialogLayout.findViewById(R.id.pzr);




                c1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(c1.isChecked())
                        {
                            kontrol=1;
                            kontrol1=1;
                            datepickerdialog();
                        }
                        else {
                            kontrol1=0;
                        }




                    }
                });

                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(c2.isChecked())
                        {
                            kontrol=2;
                            kontrol2=1;
                            datepickerdialog();
                        }   else {
                            kontrol2=0;
                        }



                    }
                });

                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(c3.isChecked())
                        {
                            kontrol=3;
                            kontrol3=1;
                            datepickerdialog();
                        }   else {
                            kontrol3=0;
                        }



                    }
                });

                c4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(c4.isChecked())
                        {
                            kontrol=4;
                            kontrol4=1;
                            datepickerdialog();
                        }   else {
                            kontrol4=0;
                        }


                    }
                });

                c5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(c5.isChecked())
                        {
                            kontrol=5;
                            kontrol5=1;
                            datepickerdialog();
                        }   else {
                            kontrol5=0;
                        }

                    }
                });

                c6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(c6.isChecked())
                        {
                            kontrol=6;
                            kontrol6=1;

                            datepickerdialog();
                        }   else {
                            kontrol6=0;
                        }



                    }
                });

                c7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(c7.isChecked())
                        {
                            kontrol=7;
                            kontrol7=1;
                            datepickerdialog();
                        }   else {
                            kontrol7=0;
                        }

                    }
                });




                builder.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {



                        buffer_pzt.delete(0, buffer_pzt.length());
                        buffer_sli.delete(0, buffer_sli.length());


                        if(c1.isChecked()){
                            buffer_pzt.append(pztsi+"\n");
                        }
                        if(c2.isChecked()){
                            buffer_sli.append(sali+"\n");
                        }
                        if(c3.isChecked()){
                            buffer_crsnba.append(carsnba+"\n");
                        }
                        if(c4.isChecked()){
                            buffer_prsembe.append(prsmbe+"\n");
                        }
                        if(c5.isChecked()){
                            buffer_cuma.append(cma+"\n");
                        }
                        if(c6.isChecked()){
                            buffer_cmrtesi.append(cmrtsi+"\n");
                        }
                        if(c7.isChecked()){
                            buffer_pzr.append(pzr+"\n");
                        }





                    }
                });



                builder.setView(dialogLayout);

                builder.show();

            }
        });

    }

    String time;

    public void datepickerdialog(){



        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        LayoutInflater  inflater = getLayoutInflater();
        View dialogLayout = inflater.inflate(R.layout.timepicker, null);

        timepicker= (TimePicker) dialogLayout.findViewById(R.id.timePicker);


        builder.setMessage("Başlangıç Saati");
        builder.setCancelable(false);


        builder.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                time=timepicker.getCurrentHour()+":"+ timepicker.getCurrentMinute();


                if(kontrol==1){
                    pztsi=time;

                }
                else
                if(kontrol==2){
                    sali=time;

                }
                else
                if(kontrol==3){
                    carsnba=time;

                }
                else
                if(kontrol==4){
                    prsmbe=time;

                }
                else
                if(kontrol==5){
                    cma=time;

                }
                else
                if(kontrol==6){
                    cmrtsi=time;

                }
                else
                if(kontrol==7){
                    pzr=time;

                }







            }
        });


        builder.setView(dialogLayout);

        builder.show();

    }

    public void AddData() {


        if(!dersadi.getText().toString().trim().equals("")){


            boolean isInserted = false;

            if(kontrol1==1){



                    isInserted = myDb.insertData_Pazartesi(
                            dersadi.getText().toString(),
                            buffer_pzt.toString(),
                            devamsayi.getText().toString(),"0");


                kontrol1=0;
            }
            if(kontrol2==1){



                    isInserted = myDb.insertData_Sali(
                            dersadi.getText().toString(),
                            buffer_sli.toString(),
                            devamsayi.getText().toString(),"0");


                kontrol2=0;


            }
            if(kontrol3==1){



                    isInserted = myDb.insertData_Carsanba(
                            dersadi.getText().toString(),
                            buffer_crsnba.toString(),
                            devamsayi.getText().toString(),"0");



                kontrol3=0;
            }
            if(kontrol4==1){


                    isInserted = myDb.insertData_Persenbe(
                            dersadi.getText().toString(),
                            buffer_prsembe.toString(),
                            devamsayi.getText().toString(),"0");


                kontrol4=0;
            }
            if(kontrol5==1){


                    isInserted = myDb.insertData_Cuma(
                            dersadi.getText().toString(),
                            buffer_cuma.toString(),
                            devamsayi.getText().toString(),"0");



                kontrol5=0;
            }
            if(kontrol6==1){




                    isInserted = myDb.insertData_Cumartesi(
                            dersadi.getText().toString(),
                            buffer_cmrtesi.toString(),
                            devamsayi.getText().toString(),"0");




                kontrol6=0;
            }
            if(kontrol7==1){



                    isInserted = myDb.insertData_Pazar(
                            dersadi.getText().toString(),
                            buffer_pzr.toString(),
                            devamsayi.getText().toString(),"0");



                kontrol7=0;
            }



            if (isInserted == true) {
                Toast.makeText(MainActivity.this, "Ders Eklendi",
                        Toast.LENGTH_LONG).show();

            } else
                Toast.makeText(MainActivity.this, "Data not Inserted",
                        Toast.LENGTH_LONG).show();

        }
        else {
            Toast.makeText(this, "ders adı boş olamaz", Toast.LENGTH_SHORT).show();
        }


                    }
                 }



