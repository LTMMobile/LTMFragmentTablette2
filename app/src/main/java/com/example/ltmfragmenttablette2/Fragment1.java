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

public class Fragment1 extends Fragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.layout_fragment1, container, false);

		Log.d( "ltm", "onCreateView(...) Fragment1" );

		v.setBackgroundColor(Color.CYAN);

		Button b = v.findViewById(R.id.button1);
        b.setOnClickListener(this);

		return v;
	}

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button1) {
			Toast.makeText(getActivity(), "b1 - Fragment1", Toast.LENGTH_SHORT).show();
		}
	}

}
