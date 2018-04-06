package com.example.yusuf.ogrenci5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;

public class Dersprogrami extends AppCompatActivity {

    Button pzt, sali, carsamba, persembe, cuma, cumartesi, pzr, dersekle;
    DatabaseHelper myDb;
    ArrayList<String> dizi = new ArrayList<String>();
    ArrayList<String> dizi_devamsayisi = new ArrayList<String>();
    ArrayList<String> dizi_dersad = new ArrayList<String>();
    ArrayList<String> dizi_yapilandevamsizlik = new ArrayList<String>();


    ArrayList<String> dizi_id = new ArrayList<String>();

    int kontrol_gun = 0;
    int sayi = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        myDb = new DatabaseHelper(this);


        setContentView(R.layout.activity_dersprogrami);
        pzt = (Button) findViewById(R.id.pzrtesi);
        sali = (Button) findViewById(R.id.sali);
        carsamba = (Button) findViewById(R.id.carsamba);
        persembe = (Button) findViewById(R.id.persembe);
        cuma = (Button) findViewById(R.id.cuma);
        cumartesi = (Button) findViewById(R.id.cumartesi);
        pzr = (Button) findViewById(R.id.pazar);
        dersekle = (Button) findViewById(R.id.dersekle);

        dersekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);


            }
        });


        pzt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        kontrol_gun = 1;

                        dizi.clear();
                        dizi_id.clear();
                        dizi_devamsayisi.clear();
                        dizi_dersad.clear();
                        dizi_yapilandevamsizlik.clear();

                        Cursor res = myDb.getAllData_Pazartesi();

                        String devamsizlik;

                        if (res.getCount() != 0) {


                            while (res.moveToNext()) {

                                if (res.getString(3).toString().trim().equals("")) {
                                    devamsizlik = "Devamsızlık Hakkı Girilmemiş";
                                } else {
                                    devamsizlik = "Devamsızlık Hakkı: " + res.getString(3);
                                }

                                dizi_id.add(res.getString(0));
                                dizi_dersad.add(res.getString(1));
                                dizi_devamsayisi.add(res.getString(3));
                                dizi_yapilandevamsizlik.add(res.getString(4));
                                dizi.add(res.getString(1) + "\nDersin Başlama Saati: " + res.getString(2) + devamsizlik + "\nYapılan Devamsızlık: " + res.getString(4));
                            }
                            AlertDialog();

                        }

                    }
                }
        );

        sali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol_gun = 2;

                dizi.clear();
                dizi_id.clear();
                dizi_devamsayisi.clear();
                dizi_dersad.clear();
                dizi_yapilandevamsizlik.clear();


                Cursor res = myDb.getAllData_Sali();

                String devamsizlik;

                if (res.getCount() != 0) {


                    while (res.moveToNext()) {

                        if (res.getString(3).toString().trim().equals("")) {
                            devamsizlik = "Devamsızlık Hakkı Girilmemiş";
                        } else {
                            devamsizlik = "Devamsızlık Hakkı: " + res.getString(3);
                        }
                        dizi_id.add(res.getString(0));
                        dizi_dersad.add(res.getString(1));
                        dizi_devamsayisi.add(res.getString(3));
                        dizi_yapilandevamsizlik.add(res.getString(4));
                        dizi.add(res.getString(1) + "\nDersin Başlama Saati: " + res.getString(2) + devamsizlik + "\nYapılan Devamsızlık: " + res.getString(4));
                    }
                    AlertDialog();

                }


            }
        });

        carsamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kontrol_gun = 3;
                dizi.clear();
                dizi_id.clear();
                dizi_devamsayisi.clear();
                dizi_dersad.clear();
                dizi_yapilandevamsizlik.clear();

                Cursor res = myDb.getAllData_Carsanba();

                String devamsizlik;

                if (res.getCount() != 0) {


                    while (res.moveToNext()) {

                        if (res.getString(3).toString().trim().equals("")) {
                            devamsizlik = "Devamsızlık Hakkı Girilmemiş";
                        } else {
                            devamsizlik = "Devamsızlık Hakkı: " + res.getString(3);
                        }
                        dizi_id.add(res.getString(0));
                        dizi_dersad.add(res.getString(1));
                        dizi_devamsayisi.add(res.getString(3));
                        dizi_yapilandevamsizlik.add(res.getString(4));
                        dizi.add(res.getString(1) + "\nDersin Başlama Saati: " + res.getString(2) + devamsizlik + "\nYapılan Devamsızlık: " + res.getString(4));
                    }
                    AlertDialog();

                }


            }
        });

        persembe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kontrol_gun = 4;

                dizi.clear();
                dizi_id.clear();
                dizi_devamsayisi.clear();
                dizi_dersad.clear();
                dizi_yapilandevamsizlik.clear();

                Cursor res = myDb.getAllData_Persenbe();

                String devamsizlik;

                if (res.getCount() != 0) {


                    while (res.moveToNext()) {

                        if (res.getString(3).toString().trim().equals("")) {
                            devamsizlik = "Devamsızlık Hakkı Girilmemiş";
                        } else {
                            devamsizlik = "Devamsızlık Hakkı: " + res.getString(3);
                        }
                        dizi_id.add(res.getString(0));
                        dizi_dersad.add(res.getString(1));
                        dizi_devamsayisi.add(res.getString(3));
                        dizi_yapilandevamsizlik.add(res.getString(4));
                        dizi.add(res.getString(1) + "\nDersin Başlama Saati: " + res.getString(2) + devamsizlik + "\nYapılan Devamsızlık: " + res.getString(4));
                    }
                    AlertDialog();

                }


            }
        });
        cuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kontrol_gun = 5;

                dizi.clear();
                dizi_id.clear();
                dizi_devamsayisi.clear();
                dizi_dersad.clear();
                dizi_yapilandevamsizlik.clear();

                Cursor res = myDb.getAllData_Cuma();

                String devamsizlik;

                if (res.getCount() != 0) {


                    while (res.moveToNext()) {

                        if (res.getString(3).toString().trim().equals("")) {
                            devamsizlik = "Devamsızlık Hakkı Girilmemiş";
                        } else {
                            devamsizlik = "Devamsızlık Hakkı: " + res.getString(3);
                        }
                        dizi_id.add(res.getString(0));
                        dizi_dersad.add(res.getString(1));
                        dizi_devamsayisi.add(res.getString(3));
                        dizi_yapilandevamsizlik.add(res.getString(4));
                        dizi.add(res.getString(1) + "\nDersin Başlama Saati: " + res.getString(2) + devamsizlik + "\nYapılan Devamsızlık: " + res.getString(4));
                    }
                    AlertDialog();

                }


            }
        });
        cumartesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol_gun = 6;

                dizi.clear();
                dizi_id.clear();
                dizi_devamsayisi.clear();
                dizi_dersad.clear();
                dizi_yapilandevamsizlik.clear();

                Cursor res = myDb.getAllData_Cumartesi();

                String devamsizlik;

                if (res.getCount() != 0) {


                    while (res.moveToNext()) {

                        if (res.getString(3).toString().trim().equals("")) {
                            devamsizlik = "Devamsızlık Hakkı Girilmemiş";
                        } else {
                            devamsizlik = "Devamsızlık Hakkı: " + res.getString(3);
                        }
                        dizi_id.add(res.getString(0));
                        dizi_dersad.add(res.getString(1));
                        dizi_devamsayisi.add(res.getString(3));
                        dizi_yapilandevamsizlik.add(res.getString(4));
                        dizi.add(res.getString(1) + "\nDersin Başlama Saati: " + res.getString(2) + devamsizlik + "\nYapılan Devamsızlık: " + res.getString(4));
                    }
                    AlertDialog();

                }


            }
        });
        pzr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol_gun = 7;

                dizi.clear();
                dizi_id.clear();
                dizi_devamsayisi.clear();
                dizi_dersad.clear();
                dizi_yapilandevamsizlik.clear();

                Cursor res = myDb.getAllData_Pazar();

                String devamsizlik;

                if (res.getCount() != 0) {


                    while (res.moveToNext()) {

                        if (res.getString(3).toString().trim().equals("")) {
                            devamsizlik = "Devamsızlık Hakkı Girilmemiş";
                        } else {
                            devamsizlik = "Devamsızlık Hakkı: " + res.getString(3);
                        }
                        dizi_id.add(res.getString(0));
                        dizi_dersad.add(res.getString(1));
                        dizi_devamsayisi.add(res.getString(3));
                        dizi_yapilandevamsizlik.add(res.getString(4));
                        dizi.add(res.getString(1) + "\nDersin Başlama Saati: " + res.getString(2) + devamsizlik + "\nYapılan Devamsızlık: " + res.getString(4));
                    }
                    AlertDialog();

                }


            }
        });


    }

    public void AlertDialogDevamsizlikGirme() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Dersprogrami.this);

    }


    public void AlertDialog() {
        ListView listView;

        AlertDialog.Builder builder = new AlertDialog.Builder(Dersprogrami.this);

        LayoutInflater inflater = getLayoutInflater();
        View dialogLayout = inflater.inflate(R.layout.lsw, null);
        listView = (ListView) dialogLayout.findViewById(R.id.list);

        ArrayAdapter<String> veriAdaptoru = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, dizi);

        //(C) adımı
        listView.setAdapter(veriAdaptoru);

        builder.setView(dialogLayout);
        builder.show();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {


                AlertDialog.Builder builder = new AlertDialog.Builder(Dersprogrami.this);
                LayoutInflater inflater = getLayoutInflater();
                final View dialogLayout = inflater.inflate(R.layout.activity_duzenlesil, null);

                Button sl;
                sl = (Button) dialogLayout.findViewById(R.id.sil);
                Button artır = (Button) dialogLayout.findViewById(R.id.artı);
                Button azlt = (Button) dialogLayout.findViewById(R.id.eksi);
                final TextView tv = (TextView) dialogLayout.findViewById(R.id.devams);


                sl.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        if (kontrol_gun == 1) {


                            Integer deletedRows = myDb.deleteData_pazartesi(dizi_id.get(position));

                            // Eger deletedRows sifirdan buyukse olumlu, degilse olumsuz bildirim yapildir.
                            if (deletedRows > 0) {
                                Toast.makeText(Dersprogrami.this, "Data Deleted",
                                        Toast.LENGTH_LONG).show();



                            } else {
                                Toast.makeText(Dersprogrami.this, "Data not deleted",
                                        Toast.LENGTH_LONG).show();
                            }








                        } else if (kontrol_gun == 2) {


                            Integer deletedRows = myDb.deleteData_sali(dizi_id.get(position));

                            // Eger deletedRows sifirdan buyukse olumlu, degilse olumsuz bildirim yapildir.
                            if (deletedRows > 0) {
                                Toast.makeText(Dersprogrami.this, "Data Deleted",
                                        Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(Dersprogrami.this, "Data not deleted",
                                        Toast.LENGTH_LONG).show();
                            }
                            AlertDialog();



                        } else if (kontrol_gun == 3) {

                            Integer deletedRows = myDb.deleteData_carsamba(dizi_id.get(position));

                            // Eger deletedRows sifirdan buyukse olumlu, degilse olumsuz bildirim yapildir.
                            if (deletedRows > 0) {
                                Toast.makeText(Dersprogrami.this, "Data Deleted",
                                        Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(Dersprogrami.this, "Data not deleted",
                                        Toast.LENGTH_LONG).show();
                            }
                            AlertDialog();



                        } else if (kontrol_gun == 4) {

                            Integer deletedRows = myDb.deleteData_persembe(dizi_id.get(position));

                            // Eger deletedRows sifirdan buyukse olumlu, degilse olumsuz bildirim yapildir.
                            if (deletedRows > 0) {
                                Toast.makeText(Dersprogrami.this, "Data Deleted",
                                        Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(Dersprogrami.this, "Data not deleted",
                                        Toast.LENGTH_LONG).show();
                            }
                            AlertDialog();


                        } else if (kontrol_gun == 5) {


                            Integer deletedRows = myDb.deleteData_cuma(dizi_id.get(position));

                            // Eger deletedRows sifirdan buyukse olumlu, degilse olumsuz bildirim yapildir.
                            if (deletedRows > 0) {
                                Toast.makeText(Dersprogrami.this, "Data Deleted",
                                        Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(Dersprogrami.this, "Data not deleted",
                                        Toast.LENGTH_LONG).show();
                            }
                            AlertDialog();


                        } else if (kontrol_gun == 6) {

                            Integer deletedRows = myDb.deleteData_cumartesi(dizi_id.get(position));

                            // Eger deletedRows sifirdan buyukse olumlu, degilse olumsuz bildirim yapildir.
                            if (deletedRows > 0) {
                                Toast.makeText(Dersprogrami.this, "Data Deleted",
                                        Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(Dersprogrami.this, "Data not deleted",
                                        Toast.LENGTH_LONG).show();
                            }


                            AlertDialog();



                        } else if (kontrol_gun == 7) {

                            Integer deletedRows = myDb.deleteData_pazar(dizi_id.get(position));

                            // Eger deletedRows sifirdan buyukse olumlu, degilse olumsuz bildirim yapildir.
                            if (deletedRows > 0) {
                                Toast.makeText(Dersprogrami.this, "Data Deleted",
                                        Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(Dersprogrami.this, "Data not deleted",
                                        Toast.LENGTH_LONG).show();
                            }
                            AlertDialog();


                        }


                    }


                });


                tv.setText(dizi_yapilandevamsizlik.get(position));

                sayi = Integer.parseInt(dizi_yapilandevamsizlik.get(position));

                artır.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sayi += 1;
                        tv.setText(String.valueOf(sayi));
                        myDb.updatede_data(dizi_dersad.get(position), String.valueOf(sayi));
                    }
                });
                azlt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (sayi > 0) {
                            sayi -= 1;
                            tv.setText(String.valueOf(sayi));
                            myDb.updatede_data(dizi_dersad.get(position), String.valueOf(sayi));
                        }

                    }
                });


                builder.setView(dialogLayout);

                builder.show();


            }
        });

    }




    }



