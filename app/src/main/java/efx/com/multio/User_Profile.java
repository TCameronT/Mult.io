package efx.com.multio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class User_Profile extends AppCompatActivity {

    TextView m_username;
    TextView m_title;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__profile);

        m_username = findViewById(R.id.txtUsername);
        m_title = findViewById(R.id.txtTitle);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_username.setText("haydenberryc");
                m_title.setText("Mathamagician");
            }
        });

    }
}