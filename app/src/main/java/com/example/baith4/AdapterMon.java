package com.example.baith4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMon extends RecyclerView.Adapter<AdapterMon.MonViewHolder>{
    List<Mon> list;

    public void setData(List<Mon> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mon, parent, false);
        return new MonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MonViewHolder holder, int position) {
        Mon mon = list.get(position);

        if (mon == null){
            return;
        }
        holder.imgAnh.setImageResource(mon.getImgAnh());
        holder.tenMon.setText(mon.getTenMon());
        holder.giaMon.setText(mon.getGiaMon());
    }

    @Override
    public int getItemCount() {
        if (list != null){
            return list.size();
        }
        return 0;
    }

    public class MonViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAnh;
        TextView tenMon, giaMon;

        public MonViewHolder(@NonNull View itemView) {
            super(itemView);

            imgAnh = itemView.findViewById(R.id.img_anh);
            tenMon = itemView.findViewById(R.id.tv_tenmon);
            giaMon = itemView.findViewById(R.id.tv_giamon);
        }
    }
}
