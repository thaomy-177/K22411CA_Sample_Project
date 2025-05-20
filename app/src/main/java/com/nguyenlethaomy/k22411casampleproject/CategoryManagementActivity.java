package com.nguyenlethaomy.k22411casampleproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Import các lớp Category và ListCategory của bạn
import com.nguyenlethaomy.models.Category;
import com.nguyenlethaomy.models.ListCategory;

public class CategoryManagementActivity extends AppCompatActivity {

    ListView lvCategory; // Đổi tên từ lvCustomer thành lvCategory
    ArrayAdapter<Category> adapter; // Đổi từ Customer thành Category
    ListCategory lc = new ListCategory(); // Đổi từ ListCustomer thành ListCategory


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category_management); // Đảm bảo bạn có layout này
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addViews();
    }


    private void addViews() {
        lvCategory = findViewById(R.id.lvCategory); // Đổi ID nếu cần (thường là lvCategory)

        // Khởi tạo ArrayAdapter với kiểu Category
        adapter = new ArrayAdapter<>(
                CategoryManagementActivity.this,
                android.R.layout.simple_list_item_1); // Dùng layout 1 dòng mặc định

        // Tạo dữ liệu mẫu từ ListCategory
        lc.generate_sample_dataset();
        // Thêm tất cả các Category từ ListCategory vào adapter
        adapter.addAll(lc.getCategories());

        // Gán adapter cho ListView
        lvCategory.setAdapter(adapter);
    }
}