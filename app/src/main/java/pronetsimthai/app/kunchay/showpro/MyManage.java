package pronetsimthai.app.kunchay.showpro;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import pronetsimthai.app.kunchay.showpro.MyOpenHelper;

/**
 * Created by kunchay on 10/11/2559.
 */

public class MyManage {

    //Explicit
    private Context context;
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;
    private MyConstant myConstant;
    private String[] tableStrings, columnStrings;

    public MyManage(Context context) {
        this.context = context;

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

        myConstant = new MyConstant();
        tableStrings = myConstant.getTableStrings();
        columnStrings = myConstant.getColumnString();



    }  //Contructor

    public long addValueToSQLite(int index, String[] strings) {

        ContentValues contentValues = new ContentValues();

        for (int i=0;i<columnStrings.length;i++) {

            contentValues.put(columnStrings[i],strings[i]);
        }

        return sqLiteDatabase.insert(tableStrings[index],null,contentValues);
    }

}   //Main Class
