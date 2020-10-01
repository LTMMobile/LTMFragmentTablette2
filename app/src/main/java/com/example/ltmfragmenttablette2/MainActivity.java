package com.example.ltmfragmenttablette2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		Toast.makeText(this, "onMenuItemSelected", Toast.LENGTH_SHORT).show();

		if (item.getItemId() == R.id.cacher_fragment_1) {
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			Fragment f = getFragmentManager().findFragmentById(R.id.fragment1);
			transaction.hide(f);
			transaction.commit();
		}else if( item.getItemId() == R.id.cacher_fragment_2 ) {
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			Fragment f = getFragmentManager().findFragmentById(R.id.fragment2);
			transaction.hide(f);
			transaction.commit();
		}else if( item.getItemId() == R.id.montrer_fragment_1) {
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			Fragment f = getFragmentManager().findFragmentById(R.id.fragment1);
			//transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
			transaction.setCustomAnimations(R.animator.animator1, R.animator.animator1 );
			transaction.show(f);
			transaction.commit();
		}else if( item.getItemId() == R.id.montrer_fragment_2) {
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			Fragment f = getFragmentManager().findFragmentById(R.id.fragment2);
			transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
			//transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			transaction.show(f);
			transaction.commit();
		}else if( item.getItemId() == R.id.go_activity_2 ) {
			Intent i = new Intent(this, Activity2.class);
			try {
				startActivity(i);
			}catch(ActivityNotFoundException ex) {
				ex.printStackTrace();
			}
		}
		return super.onOptionsItemSelected(item);
	}

}
