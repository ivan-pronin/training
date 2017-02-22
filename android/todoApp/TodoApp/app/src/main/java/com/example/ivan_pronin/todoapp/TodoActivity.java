package com.example.ivan_pronin.todoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class TodoActivity extends AppCompatActivity {

    private ArrayAdapter<String> itemsAdapter;
    private ListView lvItems;
    private List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        lvItems = (ListView) findViewById(R.id.lvItems);
        readItems();
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        items.add("First item");
        items.add("Second item");
        setupListViewerListener();
    }

    private void setupListViewerListener() {
        lvItems.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                items.remove(position);
                itemsAdapter.notifyDataSetChanged();
                saveItems();
                return true;
            }
        });
    }

    public void addTodoItem(View view) {
        EditText editText = (EditText) findViewById(R.id.etNewItem);
        itemsAdapter.add(editText.getText().toString());
        editText.setText("");
        saveItems();
    }

    private void readItems()
    {
        File filesDir = getFilesDir();
        File todoFile = new File(filesDir, "todo.txt");
        try {
            if (!todoFile.exists())
            {
                todoFile.createNewFile();
            }
            items = new ArrayList<>(FileUtils.readLines(todoFile, Charset.defaultCharset()));
        } catch (IOException e) {
            items = new ArrayList<>();
            e.printStackTrace();
        }
    }

    private void saveItems()
    {
        File filesDir = getFilesDir();
        File todoFile = new File(filesDir, "todo.txt");
        try {
            FileUtils.writeLines(todoFile, items);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
