package com.example.day05_lxc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.day05_lxc.JavaBean.ItemList;
import com.example.day05_lxc.MinaP.MinaPertent;
import com.example.day05_lxc.MinaP.MinaView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MinaView, View.OnClickListener {

    private RecyclerView re;
    private Button bt_cao;
    private Button bt_shan;
    private Button bt_wan;
    private ArrayList<ItemList.DataBean.DatasBean> datasBeans;
    private MyadapterRecyc myadapterRecyc;
    private int mPsition;
    private ArrayList<Boolean> booleans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        re = findViewById(R.id.re);
        bt_cao = findViewById(R.id.bt_cao);
        bt_shan = findViewById(R.id.bt_shan);
        bt_wan = findViewById(R.id.bt_wan);
        bt_cao.setOnClickListener(this);
        bt_shan.setOnClickListener(this);
        bt_wan.setOnClickListener(this);
        re.setLayoutManager(new LinearLayoutManager(this));

        datasBeans = new ArrayList<>();
        booleans = new ArrayList<>();


        myadapterRecyc = new MyadapterRecyc(this, datasBeans);
        myadapterRecyc.setCheked(datasBeans,booleans);
        re.setAdapter(myadapterRecyc);

        MinaPertent pertent = new MinaPertent();
        pertent.Retrofit(this);

    }

    @Override
    public void Cheng(ItemList itemList) {

        ArrayList datas = (ArrayList<ItemList.DataBean.DatasBean>) itemList.getData().getDatas();
        Log.i("Gao", "Cheng: "+ datas);
        datasBeans.addAll(datas);
        for (int i = 0; i < datasBeans.size(); i++) {
            booleans.add(false);
        }
        myadapterRecyc.notifyDataSetChanged();
    }

    @Override
    public void Shi(Throwable e) {
        Log.i("Gao", "Shi: "+e);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_cao:
                    myadapterRecyc.MyadapterRecyc(true);
                    myadapterRecyc.notifyDataSetChanged();
                    break;
            case R.id.bt_shan:
                    initdelete();
                break;
            case R.id.bt_wan:
                myadapterRecyc.MyadapterRecyc(false);
                myadapterRecyc.notifyDataSetChanged();
                    break;
        }
    }

    private void initdelete() {
        for (int i = 0; i < booleans.size(); i++) {
            if (booleans.get(i)) {
                Log.i("Gao", "initdelete: " + booleans);
                datasBeans.remove(i);
                booleans.remove(i);
                i--;
                myadapterRecyc.setCheked(datasBeans, booleans);
            }
            myadapterRecyc.notifyDataSetChanged();
        }
    }

}
