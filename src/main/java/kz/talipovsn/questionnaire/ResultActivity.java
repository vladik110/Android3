package kz.talipovsn.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Переменная доступа к компоненту окна с инициализацией
        EditText editText = findViewById(R.id.editText);

        // Запрет на редактирование в компоненте "editText"
        editText.setKeyListener(null);

        // Очистка данных в компоненте "editText"
        editText.setText("");

        // Добавление данных в компонент "editText"
        editText.append(String.format("%s %s \n", getString(R.string.Ваша_модель_телефона), getIntent().getStringExtra("color")));
        editText.append(String.format("%s %s \n", getString(R.string.Ваш_пол), getIntent().getStringExtra("gender")));
        editText.append(String.format("%s %s \n", getString(R.string.Цвет_вашей_модели), getIntent().getStringExtra("color")));
        editText.append(String.format("%s %s \n", getString(R.string.Страна), getIntent().getStringExtra("country")));
    }

    // МЕТОД ДЛЯ КНОПКИ НАЗАД
    public void onBack(View v) {
        Intent intent = new Intent(ResultActivity.this, MainActivity.class);
        startActivity(intent);
        setResult(RESULT_OK);
        finish();
    }

    // МЕТОД ДЛЯ КНОПКИ ВЫХОДА
    public void next(View v){
        Intent intent = new Intent(ResultActivity.this, MainActivity2.class);
        startActivity(intent);
    }


}
