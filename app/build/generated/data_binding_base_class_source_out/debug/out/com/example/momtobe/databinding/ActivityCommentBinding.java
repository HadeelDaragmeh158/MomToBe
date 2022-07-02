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

public final class ActivityCommentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView RecycleComment;

  @NonNull
  public final Button button2;

  @NonNull
  public final TextView descriptionComment;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final ImageView imageViewComment;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final ConstraintLayout title;

  @NonNull
  public final TextView titleComment;

  private ActivityCommentBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView RecycleComment, @NonNull Button button2,
      @NonNull TextView descriptionComment, @NonNull EditText editTextTextPersonName,
      @NonNull ImageView imageViewComment, @NonNull TextView textView7,
      @NonNull ConstraintLayout title, @NonNull TextView titleComment) {
    this.rootView = rootView;
    this.RecycleComment = RecycleComment;
    this.button2 = button2;
    this.descriptionComment = descriptionComment;
    this.editTextTextPersonName = editTextTextPersonName;
    this.imageViewComment = imageViewComment;
    this.textView7 = textView7;
    this.title = title;
    this.titleComment = titleComment;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCommentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_comment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCommentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Recycle_Comment;
      RecyclerView RecycleComment = ViewBindings.findChildViewById(rootView, id);
      if (RecycleComment == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.descriptionComment;
      TextView descriptionComment = ViewBindings.findChildViewById(rootView, id);
      if (descriptionComment == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      EditText editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.imageViewComment;
      ImageView imageViewComment = ViewBindings.findChildViewById(rootView, id);
      if (imageViewComment == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      ConstraintLayout title = (ConstraintLayout) rootView;

      id = R.id.titleComment;
      TextView titleComment = ViewBindings.findChildViewById(rootView, id);
      if (titleComment == null) {
        break missingId;
      }

      return new ActivityCommentBinding((ConstraintLayout) rootView, RecycleComment, button2,
          descriptionComment, editTextTextPersonName, imageViewComment, textView7, title,
          titleComment);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
