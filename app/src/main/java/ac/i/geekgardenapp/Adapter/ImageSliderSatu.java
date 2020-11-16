package ac.i.geekgardenapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import ac.i.geekgardenapp.R;

public class ImageSliderSatu extends SliderViewAdapter<ImageSliderSatu.SliderAdapterVH> {
    private Context context;

    public ImageSliderSatu(Context context){
        this.context=context;
    }
    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home,null);

        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        switch (position){
            case 0:
                viewHolder.imageViewBackground.setImageResource(R.drawable.dom);
                break;

            case 1:
                viewHolder.imageViewBackground.setImageResource(R.drawable.nomad);
                break;

            case 2:
                viewHolder.imageViewBackground.setImageResource(R.drawable.testing);
                break;

            case 3:
                viewHolder.imageViewBackground.setImageResource(R.drawable.medstore);
                break;

            case 4:
                viewHolder.imageViewBackground.setImageResource(R.drawable.geekpos);
                break;

            case 5:
                viewHolder.imageViewBackground.setImageResource(R.drawable.egov);
                break;

            case 6:
                viewHolder.imageViewBackground.setImageResource(R.drawable.training);
                break;

            case 7:
                viewHolder.imageViewBackground.setImageResource(R.drawable.managemen);
                break;

            default:
                Glide.with(viewHolder.itemView)
                        .load("https://asset-a.grid.id/crop/0x0:0x0/x/photo/2020/01/13/1533613903.jpg")
                        .into(viewHolder.imageViewBackground);
                break;

        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder{
        View itemView;
        ImageView imageViewBackground;
        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground=itemView.findViewById(R.id.iv_auto_image_slider);
            this.itemView=itemView;
        }
    }
}

