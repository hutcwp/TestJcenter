package hut.cwp.testjcenter.mvppresenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hut.cwp.mvp.BindPresenter;
import hut.cwp.mvp.MvpFragment;
import hut.cwp.testjcenter.R;

@BindPresenter(presenter = TestPresenter.class)
public class TestFragment extends MvpFragment<TestPresenter, ITest> {

    public TestFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

}
