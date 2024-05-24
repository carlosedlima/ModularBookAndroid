package br.com.review;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Objects;

public class ReviewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_review, container, false);

        String bookName = getArguments().getString("bookName");
        String[] reviews = {
                "Review 1 for " + bookName,
                "Review 2 for " + bookName,
                "Review 3 for " + bookName
        };

        TextView textView = view.findViewById(R.id.book_name);
        textView.setText(bookName);

        ListView listView = view.findViewById(R.id.review_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(),
                android.R.layout.simple_list_item_1, reviews);
        listView.setAdapter(adapter);

        return view;
    }
}