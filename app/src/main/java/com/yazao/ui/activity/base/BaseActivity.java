package com.yazao.ui.activity.base;

import com.yazao.lib.base.YZBaseActivity;

/**
 * ${TODO}
 *
 * @author zhaishaoping
 * @date 2016/9/7
 */
public abstract class BaseActivity extends YZBaseActivity {

    @Override
    protected boolean isNoStateBar() {
        return false;
    }

    @Override
    protected boolean isFullScreen() {
        return false;
    }

    @Override
    protected boolean isNoTitle() {
        return false;
    }

}
