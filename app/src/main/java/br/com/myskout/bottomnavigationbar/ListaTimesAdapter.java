package br.com.myskout.bottomnavigationbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

public class ListaTimesAdapter {
    private List<Times> lstTimes;
    private Context myContext;

    public ListaTimesAdapter(List<Times> lstTimes, Context myContext) {
        this.lstTimes = lstTimes;
        this.myContext = myContext;
    }

    public ListaTimesAdapter.ViewHolder onCreateViewHolder(){
        View view = LayoutInflater.from(myContext).inflate(R.layout.)
    }

    public class ViewHolder {
    }
}
