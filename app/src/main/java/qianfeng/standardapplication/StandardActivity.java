package qianfeng.standardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StandardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
    }

    @Override
    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        Log.d("qianfeng", "StandardActivity ----> singTask -----> onNewIntent: ----->");
    }

    public void onclick(View view) { // 处理跳转事件
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
