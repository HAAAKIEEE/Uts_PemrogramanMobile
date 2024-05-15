package id.ac.polihasnur.ti.haqi.utsbaihaqi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HitungDiskon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_diskon);
    }
    public void hitungDiskon(View view){
        EditText harga = findViewById(R.id.nin22);
        EditText jumlah = findViewById(R.id.nin33);
        EditText diskon = findViewById(R.id.nin4);
        TextView total = findViewById(R.id.Total);

        int h = Integer.parseInt(harga.getText().toString());
        int j = Integer.parseInt(jumlah.getText().toString());
        int d = Integer.parseInt(diskon.getText().toString());
        int totalHarga = h * j;
        int nilaiDiskon = (totalHarga * d) / 100;
        int totalHargaSetelahDiskon = totalHarga - nilaiDiskon;
        total.setText("Total Harga : " + String.valueOf(totalHargaSetelahDiskon));
    }
    public void Reset(View view){
        EditText nama = findViewById(R.id.nin1);
        EditText harga = findViewById(R.id.nin22);
        EditText jumlah = findViewById(R.id.nin33);
        EditText diskon = findViewById(R.id.nin4);
        TextView total = findViewById(R.id.Total);

        nama.setText(""); harga.setText(""); jumlah.setText(""); diskon.setText("");
        total.setText("Total Harga : ");
    }

}