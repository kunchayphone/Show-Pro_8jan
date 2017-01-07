package pronetsimthai.app.kunchay.showpro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kunchay on 10/11/2559.
 */

public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    private Context context;
    private MyConstant myConstant;
    public static final String database_name = "ShowPro.db";
    private static final int database_version = 1;


    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version );
        this.context = context;
        myConstant = new MyConstant();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(myConstant.getCreate_aisTABLE());
        sqLiteDatabase.execSQL(myConstant.getCreate_dtacTABLE());
        sqLiteDatabase.execSQL(myConstant.getCreate_trueTABLE());

    }  //onCreate

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}



    // Main Class
