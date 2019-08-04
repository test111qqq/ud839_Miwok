package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class ClickListenerForIntents implements View.OnClickListener {
    private Context ActivityFrom;
    private Object ActivityTo;

    public ClickListenerForIntents(Context objFrom, Object objTo){
        ActivityFrom = objFrom;
        ActivityTo = objTo;
    }

    @Override
    public void onClick(View view) {
        Intent IntentAction = new Intent(ActivityFrom, (Class<?>) ActivityTo);
        ActivityFrom.startActivity(IntentAction);
    }
}
