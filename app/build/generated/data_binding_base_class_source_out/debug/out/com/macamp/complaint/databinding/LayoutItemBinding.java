// Generated by view binder compiler. Do not edit!
package com.macamp.complaint.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.macamp.complaint.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final AppCompatTextView tvComplaint;

  @NonNull
  public final AppCompatTextView tvId;

  @NonNull
  public final AppCompatTextView tvName;

  @NonNull
  public final AppCompatTextView tvStatus;

  private LayoutItemBinding(@NonNull CardView rootView, @NonNull AppCompatTextView tvComplaint,
      @NonNull AppCompatTextView tvId, @NonNull AppCompatTextView tvName,
      @NonNull AppCompatTextView tvStatus) {
    this.rootView = rootView;
    this.tvComplaint = tvComplaint;
    this.tvId = tvId;
    this.tvName = tvName;
    this.tvStatus = tvStatus;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_complaint;
      AppCompatTextView tvComplaint = ViewBindings.findChildViewById(rootView, id);
      if (tvComplaint == null) {
        break missingId;
      }

      id = R.id.tv_id;
      AppCompatTextView tvId = ViewBindings.findChildViewById(rootView, id);
      if (tvId == null) {
        break missingId;
      }

      id = R.id.tv_name;
      AppCompatTextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_status;
      AppCompatTextView tvStatus = ViewBindings.findChildViewById(rootView, id);
      if (tvStatus == null) {
        break missingId;
      }

      return new LayoutItemBinding((CardView) rootView, tvComplaint, tvId, tvName, tvStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}