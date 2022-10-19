package hotel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;

import java.util.List;


public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {

    private List<Hotel> mHotels;
    public void setData(List<Hotel> list) {
        this.mHotels = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hotel, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        Hotel hotel = mHotels.get(position);
        if (hotel == null){
            return;
        }
        holder.img_hotel.setImageResource(hotel.getResourceId());
        holder.tv_title.setText(hotel.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mHotels != null) {
            return mHotels.size();
        }
        return 0;
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_hotel;
        private TextView tv_title;

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);
            img_hotel = itemView.findViewById(R.id.img_hotel);
            tv_title = itemView.findViewById(R.id.tv_title);
        }
    }
}
