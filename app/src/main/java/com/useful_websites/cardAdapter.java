package com.useful_websites;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class cardAdapter extends ArrayAdapter<cardClass> {
    Context c_context;
    int c_res;
    cardClass c_data[] = null;

    public cardAdapter(Context context, int resource, cardClass[] data) {
        super(context, resource, data);
        this.c_context = context;
        this.c_res = resource;
        this.c_data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        Place_Holder holder = null;

        if (row == null) {
            LayoutInflater inflater = LayoutInflater.from(c_context);
            row = inflater.inflate(c_res, parent, false);
            holder = new Place_Holder();

            holder.Hcategory = (TextView) row.findViewById(R.id.cate);
            holder.Hdesc = (TextView) row.findViewById(R.id.card_link_desc);
            holder.Hnum = (TextView) row.findViewById(R.id.num);
            holder.Hshare = (TextView) row.findViewById(R.id.card_share);
            holder.Htitle = (TextView) row.findViewById(R.id.card_link_title);
            holder.Hvisit = (TextView) row.findViewById(R.id.card_visit);
            row.setTag(holder);
        }
        else {
            holder = (Place_Holder) row.getTag();
        }

        cardClass tempObj = c_data[position];
        Integer posi = position ;
        String num = Integer.toString(posi) ;
        num = "#"+num ;

        holder.Hvisit.setOnClickListener(listen_visit);
        holder.Hvisit.setTag(posi);

        holder.Hshare.setOnClickListener(listen_share);
        holder.Hshare.setTag(posi);

        holder.Htitle.setText(tempObj.classTitle);
        holder.Hdesc.setText(tempObj.classDesc);
        holder.Hcategory.setText(tempObj.classCategory);
        holder.Hnum.setText(num);

        return row;
    } // get view

    View.OnClickListener listen_visit = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Integer vposi = (Integer) view.getTag() ;
            cardClass tempObj = c_data[vposi] ;
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(tempObj.classVisit)) ;
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            c_context.startActivity(i);
        }
    };

    View.OnClickListener listen_share = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Integer vposi = (Integer) view.getTag() ;
            cardClass tempObj = c_data[vposi] ;
            Intent share = new Intent() ;
            share.setAction(Intent.ACTION_SEND) ;
            share.putExtra(Intent.EXTRA_TEXT,"Visit this Amazing Website\n\n" + tempObj.classVisit + "\n\nFor more such websites download the app *Useful Websites* from Play Store :\n" + "https://play.google.com/store/apps/details?id=com.useful_websites") ;
            share.setType("text/plain") ;
            share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK) ;
            share.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) ;
            Intent.createChooser(share,"share via") ;
            c_context.startActivity(share);
        }
    };

    private static class Place_Holder {
        TextView Hcategory ;
        TextView Hnum ;
        TextView Htitle ;
        TextView Hdesc ;
        TextView Hshare ;
        TextView Hvisit ;
    }

} // cardAdapter
