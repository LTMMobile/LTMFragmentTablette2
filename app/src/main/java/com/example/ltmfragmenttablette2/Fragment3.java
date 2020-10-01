package com.example.ltmfragmenttablette2;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Fragment3 extends Fragment {
	@Override
	public void onDestroy() {
		Toast.makeText(getActivity(), "Fragment3 - onDestroy()", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.layout_fragment3, container, false);

		v.setBackgroundColor(Color.GRAY); // par code, changement de couleur

        return v;
	}

}
