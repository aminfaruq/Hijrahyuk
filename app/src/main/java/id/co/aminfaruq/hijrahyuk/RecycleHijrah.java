package id.co.aminfaruq.hijrahyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.aminfaruq.hijrahyuk.Adapter.Adapter;

public class RecycleHijrah extends AppCompatActivity {

    @BindView(R.id.RecycleHijrah)
    RecyclerView RecycleHijrah;

    String[]daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_hijrah);
        ButterKnife.bind(this);

        //TODO mengisi variable array
        daftar = getResources().getStringArray(R.array.isi_daftar);

        //TODO membuat object dan mengirim data
        Adapter adapter = new Adapter(this,daftar);

        RecycleHijrah.setHasFixedSize(true);
        RecycleHijrah.setLayoutManager(new LinearLayoutManager(this));
        RecycleHijrah.setAdapter(adapter);

    }
}
