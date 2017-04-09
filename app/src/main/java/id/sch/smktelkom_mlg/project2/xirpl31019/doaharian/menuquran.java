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

public class menuquran extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] menuquran = new String[] { "Doa Agar Diberi Jodoh", "Doa Supaya Diperlakukan Adil",
                "Doa Agar Diberi Kemudahan Urusan", "Doa Sapu Jagad",
                "Doa Menghadapi Lawan","Doa Menjauhi Kesesatan",
                "Doa Diberi Keselamatan","Doa Agar Terhindar Dari Siksa Neraka",
                "Doa Agar Diberi Limpahan Rezeki", "Doa Agar Mendapat Kedudukan Yang Mulia" };
        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, menuquran));
        getListView().setBackgroundResource(R.drawable.menuquran);
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
            if (pilihan.equals("Doa Agar Diberi Jodoh")) {
                i = new Intent(this, dd1.class);
            } else if (pilihan.equals("Doa Supaya Diperlakukan Adil")) {
                i = new Intent(this, dd2.class);
            } else if (pilihan.equals("Doa Agar Diberi Kemudahan Urusan")) {
                i = new Intent(this, dd3.class);
            } else if (pilihan.equals("Doa Sapu Jagad")) {
                i = new Intent(this, dd4.class);
            } else if (pilihan.equals("Doa Menghadapi Lawan")) {
                i = new Intent(this, dd5.class);
            } else if (pilihan.equals("Doa Menjauhi Kesesatan")) {
                i = new Intent(this, dd6.class);
            } else if (pilihan.equals("Doa Diberi Keselamatan")) {
                i = new Intent(this, dd7.class);
            } else if (pilihan.equals("Doa Agar Terhindar Dari Siksa Neraka")) {
                i = new Intent(this, dd8.class);
            } else if (pilihan.equals("Doa Agar Diberi Limpahan Rezeki")) {
                i = new Intent(this, dd9.class);
            } else if (pilihan.equals("Doa Agar Mendapat Kedudukan Yang Mulia")) {
                i = new Intent(this, dd10.class);

            } else {
                Toast.makeText(
                        this, pilihan + " tidak dapat dibuka.", Toast.LENGTH_LONG).show();
            }
            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
