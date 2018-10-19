package id.co.aminfaruq.hijrahyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IsiActivity extends AppCompatActivity {

    @BindView(R.id.txtIsi)
    TextView txtIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);
        ButterKnife.bind(this);

        //TODO mengubah textview dengan data dari halaman selanjutnya
        txtIsi.setText(getIntent().getStringExtra("dt"));
    }
}
