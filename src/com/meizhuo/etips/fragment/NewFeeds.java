package com.meizhuo.etips.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.InjectView;

import com.meizhuo.etips.activities.R;

public class NewFeeds extends BaseFragment {
	@InjectView(R.id.textView1) TextView tv;

	@Override public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState,
				R.layout.fragment_explore);
		tv.setText("NewFeeds");
		return contentView;
	}
}
