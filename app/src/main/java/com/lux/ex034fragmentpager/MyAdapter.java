package com.lux.ex034fragmentpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {
    //fragment 객체를 참조할 수 있는 참조변수 3개 가지고 있는 배열객체 1개 생성
    Fragment[] fragments=new Fragment[3];

    //생성자 메소드
    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);

        //페이지별로 보여줄 Fragment 객체 생성 및 배열 요소로 추가
        fragments[0] = new Page1Fragment();
        fragments[1] = new Page2Fragment();
        fragments[2] = new Page3Fragment();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments[position];
    }

    @Override
    public int getItemCount() {
        return fragments.length;
    }
}
