package com.example.josh.week2daily4.Database;

import android.provider.BaseColumns;
import android.widget.FrameLayout;

public class DatabaseContract {

    public static final String NAME = "animal.db";
    public static final int VERISON = 1;

    public static final String GET_ALL = "SELECT * FROM " +
            FeedEntry.TABLE_NAME;

    public static final String CREATE_TABLE = "CREATE TABLE " +
            FeedEntry.TABLE_NAME + "(" +
            FeedEntry.COL_CATEGORYID + " TEXT," +
            FeedEntry.COL_NAME + " TEXT," +
            FeedEntry.COL_AGE + " TEXT," +
            FeedEntry.COL_WEIGHT + " TEXT," +
            FeedEntry.COL_FACT + " TEXT," +
            FeedEntry.COL_PICTURE + " BLOB)";

    public static class FeedEntry implements BaseColumns{
        public static final String TABLE_NAME = "animaltable";
        public static final String COL_CATEGORYID = "category";
        public static final String COL_NAME = "name";
        public static final String COL_AGE = "age";
        public static final String COL_WEIGHT = "weight";
        public static final String COL_FACT = "fact";
        public static final String COL_PICTURE = "picture";

    }


//    String categoryId;
//    String name;
//    String age;
//    String weight;
//    String fact;
//    Bitmap picture;





}
