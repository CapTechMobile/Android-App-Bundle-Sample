package examples.android.captech.traveldestinationsapp.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import examples.android.captech.traveldestinationsapp.R;

public class DestinationImagesViewPagerAdapter extends PagerAdapter {

    private Context context;
    private int[] imageResourceIds;

    public DestinationImagesViewPagerAdapter(Context context, int[] imageResourceIds) {
        this.context = context;
        this.imageResourceIds = imageResourceIds;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (imageResourceIds == null) { return 0; }
        return imageResourceIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container, final int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.destination_image_item, container, false);

        ImageView imageView = view.findViewById(R.id.destinationImage);
        //Drawable drawable = context.getDrawable(imageResourceIds[position]);
        imageView.setImageResource(imageResourceIds[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}