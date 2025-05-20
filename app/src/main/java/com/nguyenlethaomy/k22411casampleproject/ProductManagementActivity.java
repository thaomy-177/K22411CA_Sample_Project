package com.nguyenlethaomy.k22411casampleproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Import các lớp Product và ListProduct của bạn
import com.nguyenlethaomy.models.Product;
import com.nguyenlethaomy.models.ListProduct;

public class ProductManagementActivity extends AppCompatActivity {

    ListView lvProduct; // Đổi tên từ lvCustomer thành lvProduct
    ArrayAdapter<Product> adapter; // Đổi từ Customer thành Product
    ListProduct lp = new ListProduct(); // Đổi từ ListCustomer thành ListProduct (tạo đối tượng ListProduct)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_management); // Đảm bảo bạn có layout này
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addViews();
    }

    private void addViews() {
        lvProduct = findViewById(R.id.lvProduct); // Đổi ID nếu cần (thường là lvProduct)

        // Khởi tạo ArrayAdapter với kiểu Product
        adapter = new ArrayAdapter<>(
                ProductManagementActivity.this,
                android.R.layout.simple_list_item_1); // Dùng layout 1 dòng mặc định

        // Tạo dữ liệu mẫu từ ListProduct
        lp.generate_sample_dataset();
        // Thêm tất cả các Product từ ListProduct vào adapter
        adapter.addAll(lp.getProducts());

        // Gán adapter cho ListView
        lvProduct.setAdapter(adapter);
    }
}