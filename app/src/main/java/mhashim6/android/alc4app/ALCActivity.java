package mhashim6.android.alc4app;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class ALCActivity extends AppCompatActivity {

	private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alc);
		setTitle(R.string.about);
		webView = findViewById(R.id.webview);
		webView.setWebViewClient(new MyWebViewClient());
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("https://andela.com/alc/");

		if (getSupportActionBar() != null)
			getSupportActionBar().setDisplayShowHomeEnabled(true);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		webView.destroy();
	}


	private class MyWebViewClient extends WebViewClient {

		@Override
		public boolean shouldOverrideUrlLoading(WebView webView, String url) {
			return false;
		}

		@Override
		public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
			handler.proceed();
		}

	}

}
