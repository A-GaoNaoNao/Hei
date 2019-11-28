package com.example.day05_lxc;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.day05_lxc.JavaBean.ItemList;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyadapterRecyc extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<ItemList.DataBean.DatasBean> list;
    private boolean flag;
    private ArrayList<Boolean> Cheked;


    public MyadapterRecyc(Context context, ArrayList<ItemList.DataBean.DatasBean> list) {
        this.context = context;
        this.list = list;
    }

    public void setCheked(ArrayList<ItemList.DataBean.DatasBean> list,ArrayList<Boolean> cheked) {
        this.list = list;
        this.Cheked = cheked;
    }

    public void MyadapterRecyc(boolean flag) {
        this.flag = flag;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item, parent, false);
        return new ItemListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final ItemListHolder itemListHolder = (ItemListHolder) holder;
        itemListHolder.title.setText(list.get(position).getTitle());
        Glide.with(context).load(list.get(position).getEnvelopePic())
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(itemListHolder.iv);

        Log.i("Gao", "onBindViewHolder: "+list.size());
        if (flag){
            itemListHolder.dian.setVisibility(itemListHolder.dian.VISIBLE);
        }else {
            itemListHolder.dian.setVisibility(itemListHolder.dian.GONE);
        }


        itemListHolder.dian.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Cheked.set(position,isChecked);

                setCheked(list,Cheked);
            }
        });

        Boolean a = Cheked.get(position);
        itemListHolder.dian.setChecked(a);

        Log.i("Gao", "onBindViewHolder: "+position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ItemListHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView title;
        private CheckBox dian;
        public ItemListHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_item);
            title = itemView.findViewById(R.id.tv_item);
            dian = itemView.findViewById(R.id.bt_dian);
        }
    }
}
