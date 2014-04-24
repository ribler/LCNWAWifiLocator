package login.com.test;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/* click acticity */
import android.view.View.OnClickListener;
import android.test.*;
import android.text.format.Formatter;
/* this part for network status */
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
/* this part for database */
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import junit.framework.TestCase;

public class loginTest extends TestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void test() {	
		String username = "userTest";
		String passwordOne = "passwordTest";
		String passwordTwo = "passwordTest";
		
		boolean passTest = userTest (username,passwordOne,passwordTwo);
		assertTrue(passTest);
		
		assertEquals(passwordOne,passwordTwo);
		assertNotSame(username,passwordTwo);			
	}
	
	
	public boolean userTest (String username,String passOne,String passTwo)
	{
		if (username == "userTest" && passOne == passTwo 
				&& passOne == "passwordTest"){
			return true;
		}
		else
			return false;
	}
	
	
	public boolean isWifiConnect(String address)
	{
		if (address== "161.115.86.113")
			return true;
		else
			return false;
	}
	
	public String getIpAddr() {
		   WifiManager wifiManager = (WifiManager) getSystemService(WIFI_SERVICE);
		   WifiInfo wifiInfo = wifiManager.getConnectionInfo();
		   int ip = wifiInfo.getIpAddress();

		   String ipString = String.format(
		   "%d.%d.%d.%d",
		   (ip & 0xff),
		   (ip >> 8 & 0xff),
		   (ip >> 16 & 0xff),
		   (ip >> 24 & 0xff));

		   return ipString;
		}
}
