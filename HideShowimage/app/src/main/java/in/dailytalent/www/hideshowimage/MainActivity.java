package in.dailytalent.www.hideshowimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button hide_btn;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hide_btn=(Button)findViewById(R.id.h_btn);
        image=(ImageView) findViewById(R.id.img);
        hide_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(hide_btn.getText().equals("HIDE"))
                {
                    image.setVisibility(View.GONE);
                    hide_btn.setText("SEEK");
                }
                else if(hide_btn.getText().equals("SEEK"))
                {
                    image.setVisibility(View.VISIBLE);
                    hide_btn.setText("HIDE");
                }
            }
        });

    }
}