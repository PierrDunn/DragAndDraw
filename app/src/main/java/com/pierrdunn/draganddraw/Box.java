package com.pierrdunn.draganddraw;

import android.graphics.PointF;

/**
 * Created by pierrdunn on 13.03.18.
 * рисующийся прямоугольник
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOrigin = origin;
        mCurrent = origin;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getCurrent() {
        return mCurrent;
    }
}
