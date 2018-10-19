package id.co.aminfaruq.hijrahyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    //todo membuat int array agar bisa di panggil
    int gambar[] = {R.drawable.hijrah, R.drawable.indonesia_tanpa_pacaran, R.drawable.cantik, R.drawable.hijrahadalahsquare, R.drawable.dear, R.drawable.sholat, R.drawable.rizki};

    @BindView(R.id.Linear1)
    LinearLayout LinearHijrah;
    @BindView(R.id.Linear2)
    LinearLayout LinearSaatHijrahTerasaBerat;
    @BindView(R.id.Linear3)
    LinearLayout LinearKecantikan;
    @BindView(R.id.Linear4)
    LinearLayout LinearMemperbaiki;
    @BindView(R.id.Linear5)
    LinearLayout LinearPercayalah;
    @BindView(R.id.Linear6)
    LinearLayout LinearMengadu;
    @BindView(R.id.Linear7)
    LinearLayout LinearRizki;
    @BindView(R.id.imgHijrah)
    ImageView imgHijrah;
    @BindView(R.id.imgSaatHijrah)
    ImageView imgSaatHijrah;
    @BindView(R.id.imgCantik)
    ImageView imgCantik;
    @BindView(R.id.imgMemperbaiki)
    ImageView imgMemperbaiki;
    @BindView(R.id.imgPercayalah)
    ImageView imgPercayalah;
    @BindView(R.id.imgMengadu)
    ImageView imgMengadu;
    @BindView(R.id.imgJanganTakut)
    ImageView imgJanganTakut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Glide.with(this).load(gambar[0]).into(imgHijrah);
        Glide.with(this).load(gambar[1]).into(imgSaatHijrah);
        Glide.with(this).load(gambar[2]).into(imgCantik);
        Glide.with(this).load(gambar[3]).into(imgMemperbaiki);
        Glide.with(this).load(gambar[4]).into(imgPercayalah);
        Glide.with(this).load(gambar[5]).into(imgMengadu);
        Glide.with(this).load(gambar[6]).into(imgJanganTakut);
    }


    @OnClick({R.id.Linear1, R.id.Linear2, R.id.Linear3, R.id.Linear4, R.id.Linear5, R.id.Linear6, R.id.Linear7})
    public void onViewClicked(View view) {
        Intent pindah;
        switch (view.getId()) {
            case R.id.Linear1:
                pindah = new Intent(this,RecycleHijrah.class);
                startActivity(pindah);
                break;
            case R.id.Linear2:
                break;
            case R.id.Linear3:
                break;
            case R.id.Linear4:
                break;
            case R.id.Linear5:
                break;
            case R.id.Linear6:
                break;
            case R.id.Linear7:
                break;
        }
    }
}

