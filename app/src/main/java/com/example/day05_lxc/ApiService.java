package com.example.day05_lxc;

import com.example.day05_lxc.JavaBean.ItemList;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("https://www.wanandroid.com/article/list/1/json")
    Observable<ItemList>getItemList();
}
