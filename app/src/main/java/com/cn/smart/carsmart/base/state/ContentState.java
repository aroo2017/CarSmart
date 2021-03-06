package com.cn.smart.carsmart.base.state;

import com.cn.smart.carsmart.R;

/**
 * author：leo on 2016/11/25 16:19
 * email： leocheung4ever@gmail.com
 * description: 内容碎片状态
 * what & why is modified:
 */

public class ContentState extends AbstractShowState {

    @Override
    public void show(boolean animate) {
        showViewById(R.id.epf_content, animate);
    }

    @Override
    public void dismiss(boolean animate) {
        dismissViewById(R.id.epf_content, animate);
    }
}
