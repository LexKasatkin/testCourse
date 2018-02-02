package com.example.lex.testcourse;

/**
 * Created by lex on 02.02.18.
 */

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapterCourse extends RecyclerView.Adapter<RVAdapterCourse.ViewHolder> {

    private List<Stock> stocks;

    public RVAdapterCourse(List<Stock> stocks) {
        this.stocks= stocks;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Stock stock = stocks.get(position);
        holder.tvName.setText("Название валюты: "+stock.getName());
        holder.tvVolume.setText("Цена "+String.valueOf(stock.getVolume()));
        holder.tvAmount.setText("Количество "+String.format("%.2f", stock.getPrice().getAmount()));
    }

    @Override
    public int getItemCount() {
        if (stocks == null)
            return 0;
        return stocks.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvAmount;
        TextView tvVolume;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName =  itemView.findViewById(R.id.tvName);
            tvAmount =  itemView.findViewById(R.id.tvAmount);
            tvVolume =  itemView.findViewById(R.id.tvVolume);
        }
    }
}

