// Generated by view binder compiler. Do not edit!
package com.example.momtobe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.momtobe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCommentEperianceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView RecycleCommentExperiance;

  @NonNull
  public final Button button2;

  @NonNull
  public final TextView descriptionCommentExperiance;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final ImageView imageViewCommentExperiance;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView titleCommentExperiance;

  private ActivityCommentEperianceBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView RecycleCommentExperiance, @NonNull Button button2,
      @NonNull TextView descriptionCommentExperiance, @NonNull EditText editTextTextPersonName,
      @NonNull ImageView imageViewCommentExperiance, @NonNull TextView textView7,
      @NonNull TextView titleCommentExperiance) {
    this.rootView = rootView;
    this.RecycleCommentExperiance = RecycleCommentExperiance;
    this.button2 = button2;
    this.descriptionCommentExperiance = descriptionCommentExperiance;
    this.editTextTextPersonName = editTextTextPersonName;
    this.imageViewCommentExperiance = imageViewCommentExperiance;
    this.textView7 = textView7;
    this.titleCommentExperiance = titleCommentExperiance;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCommentEperianceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCommentEperianceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_comment_eperiance, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCommentEperianceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Recycle_CommentExperiance;
      RecyclerView RecycleCommentExperiance = ViewBindings.findChildViewById(rootView, id);
      if (RecycleCommentExperiance == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.descriptionCommentExperiance;
      TextView descriptionCommentExperiance = ViewBindings.findChildViewById(rootView, id);
      if (descriptionCommentExperiance == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      EditText editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.imageViewCommentExperiance;
      ImageView imageViewCommentExperiance = ViewBindings.findChildViewById(rootView, id);
      if (imageViewCommentExperiance == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.titleCommentExperiance;
      TextView titleCommentExperiance = ViewBindings.findChildViewById(rootView, id);
      if (titleCommentExperiance == null) {
        break missingId;
      }

      return new ActivityCommentEperianceBinding((ConstraintLayout) rootView,
          RecycleCommentExperiance, button2, descriptionCommentExperiance, editTextTextPersonName,
          imageViewCommentExperiance, textView7, titleCommentExperiance);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
