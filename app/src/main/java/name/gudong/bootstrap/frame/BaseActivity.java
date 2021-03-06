package name.gudong.bootstrap.frame;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by GuDong on 10/12/2016 00:15.
 * Contact with gudong.name@gmail.com.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements MvpView {
    @Inject
    P mPresenter;

    protected P getPresenter() {
        return mPresenter;
    }

    @Override
    public Context getMvpContext() {
        return this;
    }
}
