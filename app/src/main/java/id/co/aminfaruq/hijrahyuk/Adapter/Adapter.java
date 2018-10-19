package id.co.aminfaruq.hijrahyuk.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.co.aminfaruq.hijrahyuk.IsiActivity;
import id.co.aminfaruq.hijrahyuk.R;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    Context context;
    String[] daftar;

    public Adapter(Context context, String[] daftar) {
        this.context = context;
        this.daftar = daftar;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.txtMenu.setText(daftar[i]);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, IsiActivity.class);
                pindah.putExtra("dt",daftar[i]);
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return daftar.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtMenu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMenu = itemView.findViewById(R.id.Linear1);



        }
    }
}
