package aslam.fullname.com.fullname;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FullNameActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText middleName;
    private EditText lastName;
    private Button button;

    private TextView fullName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_name);

        firstName = (EditText)findViewById(R.id.first_name);
        middleName = (EditText)findViewById(R.id.middle_name);
        lastName = (EditText) findViewById(R.id.last_name);

        button = (Button)findViewById(R.id.button);

        fullName = (TextView) findViewById(R.id.full_name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String fn =  firstName.getText().toString();
               String mn = middleName.getText().toString();
               String ln = lastName.getText().toString();

               fullName.setText(fn+" "+mn+" "+ln);
            }
        });
    }


}
