package com.chiranth.android.todolist.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.chiranth.android.todolist.CustomCursorAdapter;

/**
 * Created by bschiranth1692 on 5/29/17.
 */

public class TaskUtils {

    private static CustomCursorAdapter mAdapter;

    public static Cursor getAllTasks(Context context) {

        TaskDbHelper dbHelper = new TaskDbHelper(context);
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();

        String by = TaskContract.TaskEntry.COLUMN_PRIORITY;

        return sqLiteDatabase.query(TaskContract.TaskEntry.TABLE_NAME,
                null,null,null,null,null,by,null);
    }


    public static CustomCursorAdapter getAdapter(){
        return mAdapter;
    }

    public static void setAdapter(CustomCursorAdapter adapter){
        mAdapter = adapter;
    }
}
