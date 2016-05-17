package com.creasylai.fakepicasso.lib;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;

/**
 * Created by laicreasy on 16/5/17.
 */
public class Picasso {

	private static Picasso instance;

	private Picasso(){};

	public static Picasso getInstance() {
		if (null == instance) {
			synchronized (Picasso.class) {
				if (null == instance) {
					instance = new Picasso();
				}
			}
		}
		return instance;
	}

	public void loadImage(String url, ImageView imageView) {

	}

	private static Handler HANDLER = new Handler(Looper.getMainLooper()) {
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
		}
	};
}
