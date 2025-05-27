package com.nguyenlethaomy.k22411casampleproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nguyenlethaomy.connectors.EmployeeConnector;
import com.nguyenlethaomy.models.Employee;

public class LoginActivity extends AppCompatActivity {
    EditText edtUserName;
    EditText edtPassword;
    CheckBox chkSaveLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        addViews();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void addViews() {
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        chkSaveLogin = findViewById(R.id.chkSaveLoginInfo);
    }

    public void do_login(View view) {
        EmployeeConnector ec = new EmployeeConnector();

        String usr = edtUserName.getText().toString();
        String pwd = edtPassword.getText().toString();

        Employee e_login = ec.login(usr, pwd);
        if (e_login != null) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Login failed! Check your account again!", Toast.LENGTH_LONG).show();
        }
    }

    public void do_exit(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
        Resources res=getResources();
        builder.setTitle(res.getText(R.string.title_confirm_exit_title));
        builder.setMessage(res.getText(R.string.title_confirm_exit_message));
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton(res.getText(R.string.title_confirm_exit_ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0); // Hoặc dùng finish() nếu muốn chỉ thoát Activity
            }
        });

        builder.setNegativeButton(res.getText(R.string.title_confirm_exit_cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel(); // <-- đúng biến!
            }
        });

        AlertDialog dialog = builder.create();
        dialog.setCanceledOnTouchOutside (false);
        dialog.show();
    }
}
