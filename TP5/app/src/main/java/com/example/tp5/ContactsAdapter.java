package com.example.tp5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder>{
    @NonNull
    private final List<Contact> mContacts;
    public ContactsAdapter(List<Contact> contacts) {
        mContacts=contacts;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView= inflater.inflate(R.layout.item_contact, parent, false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = mContacts.get(position);

        TextView firstNameTextView = holder.firstNameTextView;
        firstNameTextView.setText(contact.getPrenom());

        TextView lastnameTextView = holder.lastNameTextView;
        lastnameTextView.setText(contact.getNom());


    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView firstNameTextView;
        public TextView lastNameTextView;
        public ViewHolder(View itemView){
            super(itemView);
            firstNameTextView=(TextView) itemView.findViewById(R.id.contact_firstname);
            lastNameTextView=(TextView) itemView.findViewById(R.id.contact_lastname);
        }
    }
}
