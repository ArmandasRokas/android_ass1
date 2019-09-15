package dk.rokas.ass1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private TextView tv;
    private Button b1;
    private Button b2;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        et = findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("You pushed the wrong button");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Der blev trykket");
                String input = et.getText().toString();
                tv.setText(String.format("Velkommen %s",input));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Handle item selection
        switch(item.getItemId()){
            case R.id.vejledning:
                System.out.println("vejledning");
                return true;
            case R.id.indstillinger:
                System.out.println("instillinger");
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
