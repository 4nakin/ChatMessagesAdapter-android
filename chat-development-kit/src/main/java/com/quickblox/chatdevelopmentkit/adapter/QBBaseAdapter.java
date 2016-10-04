package com.quickblox.chatdevelopmentkit.adapter;

import android.widget.ImageView;
import com.quickblox.chat.model.QBChatMessage;
import java.util.List;

public interface QBBaseAdapter<T> {

    T getItem(int position);

    int getItemViewType(int position);

    void add(T item);

    List<T> getList();

    void addList(List<T> items);

    void displayAvatarImage (String uri, ImageView imageView);

    String obtainAvatarUrl(int type, QBChatMessage chatMessage);

}