package me.fangx.common.ui.activity;

import android.os.Build;
import android.support.v7.widget.Toolbar;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import me.fangx.common.R;

/**
 * Created by fangxiao on 16/1/13.
 */
public abstract class BaseToolBarActivity extends BaseAppCompatActivity {

    public abstract boolean providesActivityToolbar();


    public void setToolbar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initView();
    }

    private void initView() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
        }
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setStatusBarTintResource(R.color.sr_color_primary);
    }

}
