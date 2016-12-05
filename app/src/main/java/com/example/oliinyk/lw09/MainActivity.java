package com.example.oliinyk.lw09;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppWidgetProvider {

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        Date date = new Date();
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
        SimpleDateFormat dayFormat= new SimpleDateFormat("HH:mm:ss");
        String day = dayFormat.format(date);
        views.setTextViewText(R.id.tv, "Сейчас \n" + day);
        appWidgetManager.updateAppWidget(appWidgetIds, views);
// здесь ваш текст
    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
// здесь ваш текст
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
// здесь ваш текст
    }
}