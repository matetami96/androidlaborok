package ro.sapi.retrofitapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TodosAdapter extends RecyclerView.Adapter<TodosAdapter.CustomViewHolder> {

    private List<Todo> dataList;
    private Context context;

    public TodosAdapter(Context context, List<Todo> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        TextView userid;
        TextView id;
        TextView title;
        TextView completed;

        public CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            userid = mView.findViewById(R.id.UserId);
            id = mView.findViewById(R.id.Id);
            title = mView.findViewById(R.id.Title);
            completed = mView.findViewById(R.id.Completed);
        }
    }

    @Override
    public TodosAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row2, parent, false);
        return new TodosAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TodosAdapter.CustomViewHolder holder, int position) {
        holder.userid.setText(dataList.get(position).getUserId().toString());
        holder.id.setText(dataList.get(position).getId().toString());
        holder.title.setText(dataList.get(position).getTitle());
        holder.completed.setText(dataList.get(position).getCompleted().toString());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
