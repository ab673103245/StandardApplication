package qianfeng.standardapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    // 重写一个 singleTop专用的方法
    @Override
    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        // 每点击一次  singleTop模式的Activity，而设置了singleTop的Activity的界面又是在栈顶的时候，就会调用这个onNewIntent()方法
        Log.d("qianfeng", "onNewIntent: ------------------>");
    }
    public void Main1(View view) {  // 返回第一个界面
        startActivity(new Intent(this,StandardActivity.class));
    }

    public void Main2(View view) {  // 继续第二个界面
        startActivity(new Intent(this,SecondActivity.class));
    }
}
