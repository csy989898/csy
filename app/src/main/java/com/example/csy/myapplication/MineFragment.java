package com.example.csy.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MineFragment extends Fragment implements View.OnClickListener {
    private Context context;
    private View view;
    private LinearLayout mUserHead;
    /**
     * 账户与安全
     */
    private TextView mUserAccount;
    /**
     * 新消息通知
     */
    private TextView mUserNewmessge;
    /**
     * 隐私
     */
    private TextView mUserPrivacy;
    /**
     * 通用
     */
    private TextView mUserGeneral;
    /**
     * 关于我们
     */
    private TextView mUserAboutWe;
    /**
     * 退出登录
     */
    private TextView mUserQuit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_mine_fragment, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mUserHead = (LinearLayout) view.findViewById(R.id.User_head);
        mUserHead.setOnClickListener(this);
        mUserAccount = (TextView) view.findViewById(R.id.user_account);
        mUserAccount.setOnClickListener(this);
        mUserNewmessge = (TextView) view.findViewById(R.id.user_newmessge);
        mUserNewmessge.setOnClickListener(this);
        mUserPrivacy = (TextView) view.findViewById(R.id.user_privacy);
        mUserPrivacy.setOnClickListener(this);
        mUserGeneral = (TextView) view.findViewById(R.id.user_general);
        mUserGeneral.setOnClickListener(this);
        mUserAboutWe = (TextView) view.findViewById(R.id.user_aboutWe);
        mUserAboutWe.setOnClickListener(this);
        mUserQuit = (TextView) view.findViewById(R.id.user_quit);
        mUserQuit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.User_head:
                break;
            case R.id.user_account:
                break;
            case R.id.user_newmessge:
                break;
            case R.id.user_privacy:
                break;
            case R.id.user_general:
                break;
            case R.id.user_aboutWe:
                break;
            case R.id.user_quit:
                break;
        }
    }
}
