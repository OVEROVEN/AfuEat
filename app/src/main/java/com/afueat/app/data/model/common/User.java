package com.afueat.app.data.model.common;

import java.util.Date;

/**
 * 用戶基礎模型類 - 包含所有用戶共同的屬性
 * User base model class - Contains properties common to all users
 */
public class User {
    private String id;          // 用戶唯一標識符 | User unique identifier
    private String name;        // 用戶名稱 | User name
    private String email;       // 電子郵件 | Email address
    private String phone;       // 電話號碼 | Phone number
    private String avatarUrl;   // 頭像圖片URL | Avatar image URL
    private Date createdAt;     // 帳戶創建時間 | Account creation time
    private Date updatedAt;     // 帳戶更新時間 | Account update time

    /**
     * 默認構造函數
     * Default constructor
     */
    public User() {}

    /**
     * 帶參數的構造函數
     * Parameterized constructor
     *
     * @param id 用戶ID | User ID
     * @param name 用戶名稱 | User name
     * @param email 電子郵件 | Email
     * @param phone 電話號碼 | Phone number
     */
    public User(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    // Getters and Setters...
}