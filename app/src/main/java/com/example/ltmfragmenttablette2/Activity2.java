package com.example.ltmfragmenttablette2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);

		/*setupActionBar();*/

		// Fragments management
		FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); // begin

		Fragment3 f = new Fragment3(); // 1

		fragmentTransaction.setCustomAnimations(R.animator.animator1, R.animator.animator1 ); // 2
		fragmentTransaction.add(R.id.view_group_id, f); // 3

        fragmentTransaction.commit(); // commit
    }


	@Override
	protected void onStart() {
		super.onStart();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {
		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}

		if( item.getItemId() == R.id.remplacer_fragment3 ) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
			Fragment2 f2 = new Fragment2(); // VERT

			fragmentTransaction.replace(R.id.view_group_id, f2);
			fragmentTransaction.addToBackStack(null);

			fragmentTransaction.commit();
		}
		if( item.getItemId() == R.id.remplacer_fragment2 ) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
			Fragment3 f3 = new Fragment3(); // planete

			fragmentTransaction.replace(R.id.view_group_id, f3);
			fragmentTransaction.addToBackStack(null);

			fragmentTransaction.commit();
		}

		return super.onOptionsItemSelected(item);
	}

}
