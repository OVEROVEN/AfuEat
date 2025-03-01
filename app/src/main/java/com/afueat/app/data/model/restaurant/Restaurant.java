package com.afueat.app.data.model.restaurant;

import com.afueat.app.data.model.common.User;
import java.util.List;

/**
 * 餐廳模型類 - 繼承自User，包含餐廳特有的屬性
 * Restaurant model class - Extends User, contains restaurant-specific properties
 */
public class Restaurant extends User {
    private String description;     // 餐廳描述 | Restaurant description
    private String address;         // 餐廳地址 | Restaurant address
    private double latitude;        // 緯度 | Latitude
    private double longitude;       // 經度 | Longitude
    private List<String> categories;// 餐廳類別 | Restaurant categories
    private String openHours;       // 營業時間 | Operating hours
    private float rating;           // 評分 | Rating
    private boolean isOpen;         // 是否營業中 | Whether it's currently open

    /**
     * 默認構造函數
     * Default constructor
     */
    public Restaurant() {
        super();
    }

    // Getters and Setters...
}