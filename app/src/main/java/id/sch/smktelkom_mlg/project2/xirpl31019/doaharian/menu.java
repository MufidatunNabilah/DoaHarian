package id.sch.smktelkom_mlg.project2.xirpl31019.doaharian;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class menu extends ListActivity {

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] menu = new String[] { "Doa Bersumber Al-Quran", "Doa Bersumber Hadits","Bantuan", "Tentang Kami", "Exit" };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
        getListView().setBackgroundResource(R.drawable.menu);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan) {
        try {
            Intent i = null;
            if (pilihan.equals("Doa Bersumber Al-Quran")) {
                i = new Intent(this, menuquran.class);
            } else if (pilihan.equals("Doa Bersumber Hadits")) {
                i = new Intent(this, menuhadis.class);
            } else if (pilihan.equals("Bantuan")) {
                i = new Intent(this, help.class);
            } else if (pilihan.equals("Tentang Kami")) {
                i = new Intent(this, about.class);
            } else if (pilihan.equals("Exit")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Anda Yakin Ingin Menutup Aplikasi?")
                        .setCancelable(false).setPositiveButton("Ya",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Intent exit = new Intent(
                                        Intent.ACTION_MAIN);
                                exit.addCategory(Intent.CATEGORY_HOME);
                                exit
                                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(exit);
                            }
                        }).setNegativeButton("Tidak",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                dialog.cancel();
                            }
                        }).show();

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