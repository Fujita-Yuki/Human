package jp.techacademy.yuki.fujita.human;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("Yuki.Fujita", 24, "アプリ開発");
        // 名前をYuki.Fujita、年齢24歳、趣味はアプリ開発で、Humanのインスタンスを作る

        human.say();

        human.think();
    }
}