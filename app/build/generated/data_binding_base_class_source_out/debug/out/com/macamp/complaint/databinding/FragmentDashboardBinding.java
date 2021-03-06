// Generated by view binder compiler. Do not edit!
package com.macamp.complaint.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Guideline;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.card.MaterialCardView;
import com.macamp.complaint.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDashboardBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final AppCompatTextView AllComplaintTxt;

  @NonNull
  public final AppCompatTextView AllComplaintTxt7;

  @NonNull
  public final MaterialCardView allComplaintsBtn;

  @NonNull
  public final AppCompatImageView appCompatImageView;

  @NonNull
  public final AppCompatImageView appCompatImageView12;

  @NonNull
  public final AppCompatImageView appCompatImageView2;

  @NonNull
  public final AppCompatTextView appCompatTextView;

  @NonNull
  public final AppCompatTextView appCompatTextView12;

  @NonNull
  public final AppCompatTextView appCompatTextView2;

  @NonNull
  public final AppCompatTextView appCompatTextView3;

  @NonNull
  public final AppCompatTextView appCompatTextView4;

  @NonNull
  public final AppCompatTextView appCompatTextView6;

  @NonNull
  public final AppCompatTextView appCompatTextView7;

  @NonNull
  public final AppCompatTextView appCompatTextView8;

  @NonNull
  public final LinearLayoutCompat chartView;

  @NonNull
  public final MaterialCardView completedBtn;

  @NonNull
  public final AppCompatTextView completedComplaintsTxt;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final AppCompatImageView image3;

  @NonNull
  public final AppCompatImageView image4;

  @NonNull
  public final MaterialCardView pendingBtn;

  @NonNull
  public final AppCompatTextView pendingComplaintsTxt;

  @NonNull
  public final PieChart pieChart;

  @NonNull
  public final AppCompatTextView returnComplaintTxt;

  @NonNull
  public final MaterialCardView returnComplaintsBtn;

  @NonNull
  public final MaterialCardView submittedBtn;

  @NonNull
  public final AppCompatTextView submittedComplaintTxt;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final MaterialCardView yesterdayComplaintsBtn;

  @NonNull
  public final AppCompatTextView yesterdayComplaintsTxt;

  @NonNull
  public final MaterialCardView yesterdayCompletedBtn;

  @NonNull
  public final MaterialCardView yesterdayPendingBtn;

  @NonNull
  public final AppCompatTextView yesterdayPendingTxt;

  private FragmentDashboardBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull AppCompatTextView AllComplaintTxt, @NonNull AppCompatTextView AllComplaintTxt7,
      @NonNull MaterialCardView allComplaintsBtn, @NonNull AppCompatImageView appCompatImageView,
      @NonNull AppCompatImageView appCompatImageView12,
      @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView,
      @NonNull AppCompatTextView appCompatTextView12, @NonNull AppCompatTextView appCompatTextView2,
      @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4,
      @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7,
      @NonNull AppCompatTextView appCompatTextView8, @NonNull LinearLayoutCompat chartView,
      @NonNull MaterialCardView completedBtn, @NonNull AppCompatTextView completedComplaintsTxt,
      @NonNull Guideline guideline3, @NonNull AppCompatImageView image3,
      @NonNull AppCompatImageView image4, @NonNull MaterialCardView pendingBtn,
      @NonNull AppCompatTextView pendingComplaintsTxt, @NonNull PieChart pieChart,
      @NonNull AppCompatTextView returnComplaintTxt, @NonNull MaterialCardView returnComplaintsBtn,
      @NonNull MaterialCardView submittedBtn, @NonNull AppCompatTextView submittedComplaintTxt,
      @NonNull SwipeRefreshLayout swipeRefreshLayout,
      @NonNull MaterialCardView yesterdayComplaintsBtn,
      @NonNull AppCompatTextView yesterdayComplaintsTxt,
      @NonNull MaterialCardView yesterdayCompletedBtn,
      @NonNull MaterialCardView yesterdayPendingBtn,
      @NonNull AppCompatTextView yesterdayPendingTxt) {
    this.rootView = rootView;
    this.AllComplaintTxt = AllComplaintTxt;
    this.AllComplaintTxt7 = AllComplaintTxt7;
    this.allComplaintsBtn = allComplaintsBtn;
    this.appCompatImageView = appCompatImageView;
    this.appCompatImageView12 = appCompatImageView12;
    this.appCompatImageView2 = appCompatImageView2;
    this.appCompatTextView = appCompatTextView;
    this.appCompatTextView12 = appCompatTextView12;
    this.appCompatTextView2 = appCompatTextView2;
    this.appCompatTextView3 = appCompatTextView3;
    this.appCompatTextView4 = appCompatTextView4;
    this.appCompatTextView6 = appCompatTextView6;
    this.appCompatTextView7 = appCompatTextView7;
    this.appCompatTextView8 = appCompatTextView8;
    this.chartView = chartView;
    this.completedBtn = completedBtn;
    this.completedComplaintsTxt = completedComplaintsTxt;
    this.guideline3 = guideline3;
    this.image3 = image3;
    this.image4 = image4;
    this.pendingBtn = pendingBtn;
    this.pendingComplaintsTxt = pendingComplaintsTxt;
    this.pieChart = pieChart;
    this.returnComplaintTxt = returnComplaintTxt;
    this.returnComplaintsBtn = returnComplaintsBtn;
    this.submittedBtn = submittedBtn;
    this.submittedComplaintTxt = submittedComplaintTxt;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.yesterdayComplaintsBtn = yesterdayComplaintsBtn;
    this.yesterdayComplaintsTxt = yesterdayComplaintsTxt;
    this.yesterdayCompletedBtn = yesterdayCompletedBtn;
    this.yesterdayPendingBtn = yesterdayPendingBtn;
    this.yesterdayPendingTxt = yesterdayPendingTxt;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AllComplaintTxt;
      AppCompatTextView AllComplaintTxt = ViewBindings.findChildViewById(rootView, id);
      if (AllComplaintTxt == null) {
        break missingId;
      }

      id = R.id.AllComplaintTxt7;
      AppCompatTextView AllComplaintTxt7 = ViewBindings.findChildViewById(rootView, id);
      if (AllComplaintTxt7 == null) {
        break missingId;
      }

      id = R.id.allComplaintsBtn;
      MaterialCardView allComplaintsBtn = ViewBindings.findChildViewById(rootView, id);
      if (allComplaintsBtn == null) {
        break missingId;
      }

      id = R.id.appCompatImageView;
      AppCompatImageView appCompatImageView = ViewBindings.findChildViewById(rootView, id);
      if (appCompatImageView == null) {
        break missingId;
      }

      id = R.id.appCompatImageView12;
      AppCompatImageView appCompatImageView12 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatImageView12 == null) {
        break missingId;
      }

      id = R.id.appCompatImageView2;
      AppCompatImageView appCompatImageView2 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatImageView2 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView;
      AppCompatTextView appCompatTextView = ViewBindings.findChildViewById(rootView, id);
      if (appCompatTextView == null) {
        break missingId;
      }

      id = R.id.appCompatTextView12;
      AppCompatTextView appCompatTextView12 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatTextView12 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView2;
      AppCompatTextView appCompatTextView2 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatTextView2 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView3;
      AppCompatTextView appCompatTextView3 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatTextView3 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView4;
      AppCompatTextView appCompatTextView4 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatTextView4 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView6;
      AppCompatTextView appCompatTextView6 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatTextView6 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView7;
      AppCompatTextView appCompatTextView7 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatTextView7 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView8;
      AppCompatTextView appCompatTextView8 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatTextView8 == null) {
        break missingId;
      }

      id = R.id.chart_view;
      LinearLayoutCompat chartView = ViewBindings.findChildViewById(rootView, id);
      if (chartView == null) {
        break missingId;
      }

      id = R.id.completedBtn;
      MaterialCardView completedBtn = ViewBindings.findChildViewById(rootView, id);
      if (completedBtn == null) {
        break missingId;
      }

      id = R.id.completedComplaintsTxt;
      AppCompatTextView completedComplaintsTxt = ViewBindings.findChildViewById(rootView, id);
      if (completedComplaintsTxt == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.image3;
      AppCompatImageView image3 = ViewBindings.findChildViewById(rootView, id);
      if (image3 == null) {
        break missingId;
      }

      id = R.id.image4;
      AppCompatImageView image4 = ViewBindings.findChildViewById(rootView, id);
      if (image4 == null) {
        break missingId;
      }

      id = R.id.pendingBtn;
      MaterialCardView pendingBtn = ViewBindings.findChildViewById(rootView, id);
      if (pendingBtn == null) {
        break missingId;
      }

      id = R.id.pendingComplaintsTxt;
      AppCompatTextView pendingComplaintsTxt = ViewBindings.findChildViewById(rootView, id);
      if (pendingComplaintsTxt == null) {
        break missingId;
      }

      id = R.id.pieChart;
      PieChart pieChart = ViewBindings.findChildViewById(rootView, id);
      if (pieChart == null) {
        break missingId;
      }

      id = R.id.returnComplaintTxt;
      AppCompatTextView returnComplaintTxt = ViewBindings.findChildViewById(rootView, id);
      if (returnComplaintTxt == null) {
        break missingId;
      }

      id = R.id.returnComplaintsBtn;
      MaterialCardView returnComplaintsBtn = ViewBindings.findChildViewById(rootView, id);
      if (returnComplaintsBtn == null) {
        break missingId;
      }

      id = R.id.submittedBtn;
      MaterialCardView submittedBtn = ViewBindings.findChildViewById(rootView, id);
      if (submittedBtn == null) {
        break missingId;
      }

      id = R.id.submittedComplaintTxt;
      AppCompatTextView submittedComplaintTxt = ViewBindings.findChildViewById(rootView, id);
      if (submittedComplaintTxt == null) {
        break missingId;
      }

      SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) rootView;

      id = R.id.yesterdayComplaintsBtn;
      MaterialCardView yesterdayComplaintsBtn = ViewBindings.findChildViewById(rootView, id);
      if (yesterdayComplaintsBtn == null) {
        break missingId;
      }

      id = R.id.yesterdayComplaintsTxt;
      AppCompatTextView yesterdayComplaintsTxt = ViewBindings.findChildViewById(rootView, id);
      if (yesterdayComplaintsTxt == null) {
        break missingId;
      }

      id = R.id.yesterdayCompletedBtn;
      MaterialCardView yesterdayCompletedBtn = ViewBindings.findChildViewById(rootView, id);
      if (yesterdayCompletedBtn == null) {
        break missingId;
      }

      id = R.id.yesterdayPendingBtn;
      MaterialCardView yesterdayPendingBtn = ViewBindings.findChildViewById(rootView, id);
      if (yesterdayPendingBtn == null) {
        break missingId;
      }

      id = R.id.yesterdayPendingTxt;
      AppCompatTextView yesterdayPendingTxt = ViewBindings.findChildViewById(rootView, id);
      if (yesterdayPendingTxt == null) {
        break missingId;
      }

      return new FragmentDashboardBinding((SwipeRefreshLayout) rootView, AllComplaintTxt,
          AllComplaintTxt7, allComplaintsBtn, appCompatImageView, appCompatImageView12,
          appCompatImageView2, appCompatTextView, appCompatTextView12, appCompatTextView2,
          appCompatTextView3, appCompatTextView4, appCompatTextView6, appCompatTextView7,
          appCompatTextView8, chartView, completedBtn, completedComplaintsTxt, guideline3, image3,
          image4, pendingBtn, pendingComplaintsTxt, pieChart, returnComplaintTxt,
          returnComplaintsBtn, submittedBtn, submittedComplaintTxt, swipeRefreshLayout,
          yesterdayComplaintsBtn, yesterdayComplaintsTxt, yesterdayCompletedBtn,
          yesterdayPendingBtn, yesterdayPendingTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
