package kr.co.tjoeun.spinner_20200526;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.spinner_20200526.adapters.OccupationSpinnerAdapter;
import kr.co.tjoeun.spinner_20200526.databinding.ActivityMainBinding;
import kr.co.tjoeun.spinner_20200526.datas.Occupation;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;
    List<Occupation> occupations = new ArrayList<>();

    OccupationSpinnerAdapter osa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvent();
        setValues();
    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setValues() {
        addOccupations();
        osa = new OccupationSpinnerAdapter(mContext, R.layout.occupation_spinner_list_item, occupations);
        binding.occSpinner.setAdapter(osa);
    }

    void addOccupations() {
        occupations.add(new Occupation("안드로이드", R.drawable.andorid_icon));
        occupations.add(new Occupation("iOS", R.drawable.ios_icon));
        occupations.add(new Occupation("웹프론트", R.drawable.web_icon));
        occupations.add(new Occupation("서버", R.drawable.server_icon));
    }
}
