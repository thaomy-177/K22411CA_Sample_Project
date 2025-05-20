package com.nguyenlethaomy.k22411casampleproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class EmployeeManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_management); // gắn layout
    }

    // Xử lý khi click vào ảnh hoặc chữ Employee Healthcare
    public void do_open_employee_healthcare(View view) {
        Intent intent = new Intent(this, EmployeeHealthcareActivity.class);
        startActivity(intent);
    }
}
