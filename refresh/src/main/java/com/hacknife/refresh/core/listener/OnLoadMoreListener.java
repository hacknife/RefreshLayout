package com.hacknife.refresh.core.listener;

import android.support.annotation.NonNull;

import com.hacknife.refresh.core.api.Refresh;

/**
 * 加载更多监听器
 * Created by SCWANG on 2017/5/26.
 */

public interface OnLoadMoreListener {
    void onLoadMore(@NonNull Refresh refreshLayout);
}
