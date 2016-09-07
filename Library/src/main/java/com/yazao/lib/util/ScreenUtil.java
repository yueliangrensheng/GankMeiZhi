package com.yazao.lib.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Author:  MoonLife
 * Time: 2015/12/15 14:05
 * 屏幕相关工具类
 */
public class ScreenUtil {

	private static ScreenUtil instance = null;

	private ScreenUtil() {
	}

	public static ScreenUtil getInstance() {
		if (instance == null) {
			synchronized (ScreenUtil.class) {
				if (instance == null) {
					instance = new ScreenUtil();
				}
			}
		}
		return instance;
	}

	public DisplayMetrics getScreenMetrics(Context context) {
		if (context == null) {
			return null;
		}
		WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics outMetrics = new DisplayMetrics();
		windowManager.getDefaultDisplay().getMetrics(outMetrics);
		return outMetrics;
	}
}
