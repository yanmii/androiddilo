package co.yanmi.resto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class DetailAnggotaActivity extends AppCompatActivity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, LoginActivity.class));
        // Pesan toast di rubah firhat
        Toast.makeText(this, "Pesan ini di rubah", Toast.LENGTH_LONG).show();
    }

    public void setName(String name) {
        this.name = name;
    }
}
