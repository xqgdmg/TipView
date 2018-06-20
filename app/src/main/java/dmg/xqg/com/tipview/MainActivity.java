package dmg.xqg.com.tipview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TipView tipView = (TipView) findViewById(R.id.tipView);
        TextView tvClickMe = (TextView) findViewById(R.id.tvClickMe);

        tvClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipView.show();//弹出提示
            }
        });



    }
}
