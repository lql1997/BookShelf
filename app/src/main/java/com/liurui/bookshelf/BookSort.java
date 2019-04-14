package com.liurui.bookshelf;

import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookSort {

    public ArrayList<Book> sort( ArrayList<Book> itemView)
    {
        Book temp;

        for(int i=0;i<itemView.size();i++)
        {
            for(int j=i;j<itemView.size();j++)
            {
                if(itemView.get(i).getName().compareTo(itemView.get(j).getName())>0)
                {
                    temp=itemView.get(i);
                    itemView.set(i,itemView.get(j));
                    itemView.set(j,temp);
                }
            }
        }

        return itemView;
    }


}
