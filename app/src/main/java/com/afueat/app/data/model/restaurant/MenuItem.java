package com.afueat.app.data.model.restaurant;

import java.util.List;

/**
 * 菜單項模型類 - 表示餐廳菜單中的單個項目
 * Menu item model class - Represents a single item in a restaurant menu
 */
public class MenuItem {
    private String id;              // 菜單項ID | Menu item ID
    private String restaurantId;    // 所屬餐廳ID | Associated restaurant ID
    private String name;            // 菜品名稱 | Dish name
    private String description;     // 菜品描述 | Dish description
    private double price;           // 價格 | Price
    private String imageUrl;        // 圖片URL | Image URL
    private List<String> categories;// 分類標籤 | Category tags
    private boolean available;      // 是否可供應 | Whether it's available

    /**
     * 默認構造函數
     * Default constructor
     */
    public MenuItem() {}

    /**
     * 帶參數的構造函數
     * Parameterized constructor
     *
     * @param id 菜單項ID | Menu item ID
     * @param restaurantId 餐廳ID | Restaurant ID
     * @param name 菜品名稱 | Dish name
     * @param price 價格 | Price
     */
    public MenuItem(String id, String restaurantId, String name, double price) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.name = name;
        this.price = price;
        this.available = true;
    }

    // Getters and Setters...
}