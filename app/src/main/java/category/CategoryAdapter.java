package category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;

import java.util.List;

import hotel.HotelAdapter;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private Context mContext;
    private List<Category> mListCategory;

    public CategoryAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Category> list) {
        this.mListCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = mListCategory.get(position);
        if (category == null){
            return;
        }

        holder.tv_Category.setText(category.getNamecategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        holder.rcv_Hotel.setLayoutManager(linearLayoutManager);

        HotelAdapter hotelAdapter = new HotelAdapter();
        hotelAdapter.setData(category.getHotels());
        holder.rcv_Hotel.setAdapter(hotelAdapter);
    }

    @Override
    public int getItemCount() {
        if (mListCategory != null){
            return mListCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_Category;
        private RecyclerView rcv_Hotel;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_Category = itemView.findViewById(R.id.tv_category);
            rcv_Hotel = itemView.findViewById(R.id.rcv_hotel);

        }
    }
}
