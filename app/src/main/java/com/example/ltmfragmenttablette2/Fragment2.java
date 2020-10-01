package com.example.ltmfragmenttablette2;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		Log.d( "ltm", "onCreateView(...) Fragment2" );

		View v = inflater.inflate(R.layout.layout_fragment2, container, false);

		v.setBackgroundColor(Color.GREEN);

		Button b = v.findViewById(R.id.button1);
        b.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "b1 - Fragment2", Toast.LENGTH_SHORT).show();
			}
		});

		return v;
	}

}
