package pronetsimthai.app.kunchay.showpro;

/**
 * Created by kunchay on 10/11/2559.
 */

public class MyConstant {

    //Explicit
    private String urlJSONString = "http://swiftcodingthai.com/chy/get_promote_where_kunchay.php";

    private String database_name = "ShowPro.db";
    private int database_version = 1;
    private String create_aisTABLE = "create table aisTABLE(" +
            "_id integer primary key," +
            "pro_name text," +
            "pro_detail text," +
            "pro_price text," +
            "pro_regist text," +
            "pro_code text," +
            "period_id text," +
            "pro_date text);";

    private String create_dtacTABLE = "create table dtacTABLE(" +
            "_id integer primary key," +
            "pro_name text," +
            "pro_detail text," +
            "pro_price text," +
            "pro_regist text," +
            "pro_code text," +
            "period_id text," +
            "pro_date text);";

    private String create_trueTABLE = "create table trueTABLE(" +
            "_id integer primary key," +
            "pro_name text," +
            "pro_detail text," +
            "pro_price text," +
            "pro_regist text," +
            "pro_code text," +
            "period_id text," +
            "pro_date text);";

    private String[] tableStrings = new String[]{"","aisTABLE", "dtacTABLE", "trueTABLE"};
    private String[] columnString =new String[]{
                "_id",
                "pro_name",
                "pro_detail",
                "pro_price",
                "pro_regist",
                 "pro_code",
                "period_id",
                "pro_date"};

    public String getDatabase_name() {
        return database_name;
    }

    public int getDatabase_version() {
        return database_version;
    }

    public String getCreate_aisTABLE() {
        return create_aisTABLE;
    }

    public String getCreate_dtacTABLE() {
        return create_dtacTABLE;
    }

    public String getCreate_trueTABLE() {
        return create_trueTABLE;
    }

    public String[] getTableStrings() {
        return tableStrings;
    }

    public String[] getColumnString() {
        return columnString;
    }

    public String getUrlJSONString() {
        return urlJSONString;
    }
}   //Main Class
