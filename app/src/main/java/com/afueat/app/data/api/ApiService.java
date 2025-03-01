package com.afueat.app.data.api;

import com.afueat.app.data.model.restaurant.MenuItem;
import com.afueat.app.data.model.restaurant.Restaurant;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * API服務接口 - 定義與後端服務器的通信方法
 * API Service Interface - Defines communication methods with the backend server
 */
public interface ApiService {
    /**
     * 獲取附近餐廳列表
     * Get list of nearby restaurants
     *
     * @param latitude 緯度 | Latitude
     * @param longitude 經度 | Longitude
     * @return 餐廳列表 | List of restaurants
     */
    @GET("restaurants")
    Call<List<Restaurant>> getRestaurants(@Query("latitude") double latitude, @Query("longitude") double longitude);

    /**
     * 根據ID獲取特定餐廳詳情
     * Get specific restaurant details by ID
     *
     * @param id 餐廳ID | Restaurant ID
     * @return 餐廳詳情 | Restaurant details
     */
    @GET("restaurants/{id}")
    Call<Restaurant> getRestaurantById(@Path("id") String id);

    /**
     * 獲取指定餐廳的菜單
     * Get menu for a specific restaurant
     *
     * @param restaurantId 餐廳ID | Restaurant ID
     * @return 菜單列表 | Menu list
     */
    @GET("restaurants/{id}/menu")
    Call<List<MenuItem>> getRestaurantMenu(@Path("id") String restaurantId);
}