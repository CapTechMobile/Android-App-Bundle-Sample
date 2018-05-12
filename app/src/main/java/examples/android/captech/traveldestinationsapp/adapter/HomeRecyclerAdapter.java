package examples.android.captech.traveldestinationsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import examples.android.captech.traveldestinationsapp.R;
import examples.android.captech.traveldestinationsapp.model.DestinationModel;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private DestinationModel[] destinations;
    private OnItemClickListener listener;
    private Context context;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {

        private OnItemClickListener onItemClickListener;
        private TextView destinationTextView;

        public CategoryViewHolder(View view, OnItemClickListener onItemClickListener) {
            super(view);
            this.onItemClickListener = onItemClickListener;
            this.destinationTextView = view.findViewById(R.id.destinationTextView);

            if (onItemClickListener != null) {
                view.setOnClickListener(this);
            }
        }

        @Override
        public void onClick(View view) {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(getAdapterPosition());
            }
        }

    }

    public HomeRecyclerAdapter(Context context, OnItemClickListener listener, DestinationModel[] destinations) {
        this.listener = listener;
        this.context = context;
        this.destinations = destinations;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            default:
                return new CategoryViewHolder(LayoutInflater.from(context)
                        .inflate(R.layout.home_desintation_item, parent, false), listener);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((CategoryViewHolder)holder).destinationTextView.setText(destinations[position].getCity());
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        if (destinations == null) return 0;
        return destinations.length;
    }

}