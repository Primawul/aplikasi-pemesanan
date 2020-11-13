package ac.i.geekgardenapp;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefRegisUser {public static final String SP_CUSTOMER_APP = "spCustomerOrder";

    public static final String SP_CUST_NAME = "spCustName";


    public static  final String SP_CUST_EMAIL="spCustEmail";
    public static final String SP_CUST_PASS = "spCustPass";

    public static  final String SP_CUST_NO_TELP="spCustTelp";

    public static final String SP_SUDAH_LOGIN = "spSudahLogin";

    SharedPreferences sp;
    SharedPreferences.Editor spEditor;

    public SharedPrefRegisUser(Context context){
        sp = context.getSharedPreferences(SP_CUSTOMER_APP, Context.MODE_PRIVATE);
        spEditor = sp.edit();
    }

    public void saveSPBoolean(String keySP, boolean value){
        spEditor.putBoolean(keySP, value);
        spEditor.commit();
    }


    public Boolean getSPSudahLogin(){
        return sp.getBoolean(SP_SUDAH_LOGIN, false);
    }

    public  void  setSpCustName (String nameKey, String nameValue){
        spEditor.putString(nameKey, nameValue);
        spEditor.commit();
    }

    public String getSpCustName() {
        return  sp.getString(SP_CUST_NAME,"");

    }

    public  void  setSpCustPass(String keyPass, String valuePass){
        spEditor.putString(keyPass, valuePass);
        spEditor.commit();
    }

    public  String getSpCustPass(){
        return sp.getString(SP_CUST_PASS,"");
    }

    public void setSpCustEmail(String keyEmail, String valueEmail){
        spEditor.putString(keyEmail,keyEmail);
        spEditor.commit();
    }

    public String getSpCustEmail(){
        return  sp.getString(SP_CUST_EMAIL,"");
    }

    public  void setSpCustNoTelp(String keyPhone, String valuePhone){
        spEditor.putString(keyPhone, valuePhone);
        spEditor.commit();
    }

    public  String getSpCustNoTelp(){
        return sp.getString(SP_CUST_NO_TELP,"");
    }

}
