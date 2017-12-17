package tony.itis.kpfu.ru.cryptocurrency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_view)
    private Toolbar toolbar;

    @BindView(R.id.price)
    private TextView price;

    @BindView(R.id.calculator)
    private ImageButton calculator;

    @BindView(R.id.plus)
    private ImageButton plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
    }
}
