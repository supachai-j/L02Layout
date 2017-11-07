package andriod.training.cat.com.l02layout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by LqLconf on 11/7/2017.
 */

public class ListLOAdvanceAdapter extends ArrayAdapter<String> {
    private final Context c;

    ListLOAdvanceAdapter(Context context, String[] values) {
        super(context, R.layout.item_listview, values);
        this.c = context;
    }

    private static class ViewHolder {
        ImageView imv_icon;
        TextView tv_firstLine;
        TextView tv_secondLine;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_listview, parent, false);

            holder = new ViewHolder();
            holder.imv_icon = (ImageView) convertView.findViewById(R.id.lo_imv_icon);
            holder.tv_firstLine = (TextView) convertView.findViewById(R.id.lo_tv_firstLine);
            holder.tv_secondLine = (TextView) convertView.findViewById(R.id.lo_tv_secondLine);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        String s = getItem(position);

        holder.tv_firstLine.setText(s);
        assert s != null;
        if (s.startsWith("W")) {
            holder.imv_icon.setImageResource(R.drawable.ic_setting);
        }else{
            holder.imv_icon.setImageResource(R.drawable.ic_boat);
        }
        holder.tv_secondLine.setText("...");
        return convertView;
    }
}

