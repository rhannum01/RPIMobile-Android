//// File no longer needed after migrating to ArrayAdapter<MapLocation> in MapFragment
//// File not deleted because code may become useful for ListView implementation of TV Guide feature
///**
// * Filename: MapListAdapter.java
// * Author: Peter Piech
// * Date: 12/4/2013
// * Description: MapListAdapter class draws the ListView
// *              from the MapFragment class.
// */
//
//package edu.rpi.rpimobile;
//
//import java.util.ArrayList;
//
//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.GooglePlayServicesUtil;
//
//import edu.rpi.rpimobile.model.MapLocation;
//
//
//import android.content.Context;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class MapListAdapter extends BaseAdapter
///** Class used to draw the ListView of places on campus. Necessary. */
//{
//	
//	private Context context;
//	private ArrayList<MapLocation> places;
//	private LayoutInflater inflater;
//	private FragmentManager fragmentManager;
//	
//	public MapListAdapter(Context context_, ArrayList<MapLocation> places_, FragmentManager fm_)
//	{
//		this.context = context_;
//		this.places = places_;
//		this.fragmentManager = fm_;
//	}
//
//	@Override
//	public int getCount() {
//		return places.size();
//	}
//
//	@Override
//	public Object getItem(int position) {
//		return places.get(position);
//	}
//
//	@Override
//	public long getItemId(int index) {
//		return index;
//	}
//
//	@Override
//	public View getView(final int index, View convertView, ViewGroup parent) {
//		
//		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//		View itemView = inflater.inflate(R.layout.map_list_item, parent, false);
//		
//		TextView tvName = (TextView) itemView.findViewById(R.id.placename);
//		tvName.setText(places.get(index).getName());
//		
//		itemView.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				int statusCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
//				if (statusCode == ConnectionResult.SUCCESS)
//				{			
//					ViewMapFragment vmf = new ViewMapFragment();
//					vmf.setMapParameters(places.get(index).getName(),
//							places.get(index).getLatitude(),
//							places.get(index).getLongitude());
//				
//					FragmentTransaction ft = fragmentManager.beginTransaction();
////					if (fragmentManager.findFragmentById(R.id.mapview) != null)
////						/* handle the duplicate id error that crashes the app
////					   	if the fragment had already been inflated once before */
////					{
////						//delete the fragment, so it can be rebuilt:
////						(ft.remove(fragmentManager.findFragmentById(R.id.mapview))).commit();
////					}
////					ft = fragmentManager.beginTransaction();
//					ft.addToBackStack(null);
//					ft.replace(R.id.content_frame, vmf);
//					ft.commit();
//				}
//				else if (statusCode != ConnectionResult.SUCCESS)
//				{
//		    		android.widget.Toast.makeText(context, "Install the latest version of Google Play Services to use this feature", Toast.LENGTH_LONG).show();
//				}
//			}
//		});
//				
//		return itemView;
//		
//	}
//
//}