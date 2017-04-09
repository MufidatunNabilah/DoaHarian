package id.sch.smktelkom_mlg.project2.xirpl31019.doaharian;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Hyung on 4/6/2017.
 */

public class menuhadis extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] menuhadis = new String[]
                { "Doa Akan Makan", "Doa Sesudah Makan","Doa Akan Tidur",
                        "Doa Bangun Tidur", "Doa Masuk Masjid", "Doa Keluar Masjid",
                        "Doa Masuk Rumah", "Doa Keluar Rumah", "Doa Masuk Toilet", "Doa Keluar Toilet" };
        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, menuhadis));
        getListView().setBackgroundResource(R.drawable.menuhadis);


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);

    }
    protected void tampilkanPilihan(String pilihan) {
        try {
            Intent i = null;
            if (pilihan.equals("Doa Akan Makan")) {
                i = new Intent(this, d1.class);
            } else if (pilihan.equals("Doa Sesudah Makan")) {
                i = new Intent(this, d2.class);
            } else if (pilihan.equals("Doa Akan Tidur")) {
                i = new Intent(this, d3.class);
            } else if (pilihan.equals("Doa Bangun Tidur")) {
                i = new Intent(this, d4.class);
            } else if (pilihan.equals("Doa Masuk Masjid")) {
                i = new Intent(this, d5.class);
            } else if (pilihan.equals("Doa Keluar Masjid")) {
                i = new Intent(this, d6.class);
            } else if (pilihan.equals("Doa Masuk Rumah")) {
                i = new Intent(this, d7.class);
            } else if (pilihan.equals("Doa Keluar Rumah")) {
                i = new Intent(this, d8.class);
            } else if (pilihan.equals("Doa Masuk Toilet")) {
                i = new Intent(this, d9.class);
            } else if (pilihan.equals("Doa Keluar Toilet")) {
                i = new Intent(this, d10.class);

            } else {
                Toast.makeText(this, pilihan + " tidak dapat dibuka.", Toast.LENGTH_LONG).show();
            }
            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}