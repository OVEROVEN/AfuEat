package com.afueat.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

/**
 * 主活動頁面 - 應用程序的入口點
 * Main Activity - Entry point of the application
 */
public class MainActivityJava extends AppCompatActivity {

    /**
     * 活動創建時調用
     * Called when the activity is created
     *
     * @param savedInstanceState 保存的實例狀態 | Saved instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);

        // 初始化歡迎文本 | Initialize welcome text
        TextView welcomeText = findViewById(R.id.welcome_text);
        welcomeText.setText("Welcome to Afu Eat");
    }
}