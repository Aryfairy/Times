package br.com.myskout.bottomnavigationbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaTimesAdapter extends RecyclerView.Adapter<ListaTimesAdapter.ViewHolder> {
    private List<Times> lstTimes;
    private Context myContext;


    public ListaTimesAdapter(Context myContext, List<Times> lstTimes) {
        this.myContext = myContext;
        this.lstTimes = lstTimes;
    }

    public ListaTimesAdapter(List<Times> lstTimes, Context myContext, ViewGroup parent, int viewType) {
        this.lstTimes = lstTimes;
        this.myContext = myContext;
    }


    public ListaTimesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(myContext).inflate(R.layout.modelo_times, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(ListaTimesAdapter.ViewHolder holder, int position) {
        Times times = lstTimes.get(position);
        holder.txtNomeTimes.setText(times.getNome());
        holder.imgTimes.setImageResource(times.getImage());
        holder.cardTimes.setOnClickListener(view -> Toast.makeText(myContext, "teams", Toast.LENGTH_SHORT).show());

    }

    public int getItemCount() {
        return lstTimes.size();

        public static class ViewHolder extends RecyclerView.ViewHolder {
            TextView txtNomeTimes;
            ImageView imgTimes;
            TextView txtTitulos;
            CardView cardTimes;

            public ViewHolder(View itemView) {
                super(itemView);
                txtNomeTimes = itemView.findViewById(R.id.id_lblNomeTimes);
                imgTimes = itemView.findViewById(R.id.id_imgTimes);
                txtTitulos = itemView.findViewById(R.id.id_lblTitulos);
                cardTimes = itemView.findViewById(R.id.id_CardView);
            }
        }
    }
}