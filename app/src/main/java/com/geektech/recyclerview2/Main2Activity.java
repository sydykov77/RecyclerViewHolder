package com.geektech.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements IonTextClick {
    public static String TEXT_KEY = "text_key";

    EditText editText;
    SomeClass someClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView = findViewById(R.id.main_2_recycler);
        MainAdapter adapter = new MainAdapter();
        adapter.listener = this;
        recyclerView.setAdapter(adapter);

//        TextView textView = findViewById(R.id.main_2_text);
//        editText = findViewById(R.id.main_2_edit);
//
//        Button save = findViewById(R.id.main_2_save);
//        save.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                someClass.text = editText.getText().toString();
//                Log.d("ololo", someClass.text);
//                intent.putExtra(MainActivity.RESULT_KEY, someClass);
//                setResult(RESULT_OK, intent);
//                finish();
//            }
//        });
//
//        if (getIntent() != null) {
//            someClass = (SomeClass) getIntent().getSerializableExtra(TEXT_KEY);
//            textView.setText(someClass.text);
//        } else {
//            textView.setText("Nothing to show");
//        }
    }

    @Override
    public void onTextClick(SomeClass someClass) {
        Log.d("ololo", "TEXT " + someClass.position);
    }
}
