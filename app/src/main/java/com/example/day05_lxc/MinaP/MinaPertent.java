package com.example.day05_lxc.MinaP;

import com.example.day05_lxc.JavaBean.ItemList;
import com.example.day05_lxc.MinaM.MinaMedlo;
import com.example.day05_lxc.MinaM.Minabackll;

public class MinaPertent {
    public void Retrofit(final MinaView minaView){
        MinaMedlo medlo = new MinaMedlo();
        medlo.Retrofit(new Minabackll() {
            @Override
            public void ChengGong(ItemList itemList) {
                if (minaView!=null && itemList!=null){
                    minaView.Cheng(itemList);
                }
            }

            @Override
            public void ShiBai(Throwable e) {
                if (minaView!=null && e!=null){
                    minaView.Shi(e);
                }
            }
        });
    }
}
