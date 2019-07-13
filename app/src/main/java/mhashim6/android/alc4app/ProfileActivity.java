package mhashim6.android.alc4app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		setTitle(R.string.profile);
		if (getSupportActionBar() != null)
			getSupportActionBar().setDisplayShowHomeEnabled(true);
	}
}
