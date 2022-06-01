package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 9);
        sViewsWithIds.put(R.id.entree_price, 10);
        sViewsWithIds.put(R.id.side_price, 11);
        sViewsWithIds.put(R.id.accompaniment_price, 12);
        sViewsWithIds.put(R.id.divider, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[8]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        this.accompanimentSelection.setTag(null);
        this.cancelButton.setTag(null);
        this.entreeSelection.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.sideSelection.setTag(null);
        this.submitButton.setTag(null);
        this.subtotal.setTag(null);
        this.tax.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragmentCheckout == variableId) {
            setFragmentCheckout((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else if (BR.orderView == variableId) {
            setOrderView((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragmentCheckout(@Nullable com.example.lunchtray.ui.order.CheckoutFragment FragmentCheckout) {
        this.mFragmentCheckout = FragmentCheckout;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.fragmentCheckout);
        super.requestRebind();
    }
    public void setOrderView(@Nullable com.example.lunchtray.model.OrderViewModel OrderView) {
        this.mOrderView = OrderView;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.orderView);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOrderViewTax((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeOrderViewTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeOrderViewSide((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 3 :
                return onChangeOrderViewEntree((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 4 :
                return onChangeOrderViewSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeOrderViewAccompaniment((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOrderViewTax(androidx.lifecycle.LiveData<java.lang.String> OrderViewTax, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewTotal(androidx.lifecycle.LiveData<java.lang.String> OrderViewTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewSide(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderViewSide, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewEntree(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderViewEntree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewSubtotal(androidx.lifecycle.LiveData<java.lang.String> OrderViewSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewAccompaniment(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderViewAccompaniment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.lunchtray.ui.order.CheckoutFragment fragmentCheckout = mFragmentCheckout;
        androidx.lifecycle.LiveData<java.lang.String> orderViewTax = null;
        androidx.lifecycle.LiveData<java.lang.String> orderViewTotal = null;
        com.example.lunchtray.model.OrderViewModel orderView = mOrderView;
        java.lang.String orderViewEntreeName = null;
        java.lang.String taxAndroidStringTaxOrderViewTax = null;
        java.lang.String orderViewSideName = null;
        java.lang.String orderViewTaxGetValue = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderViewSide = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderViewEntree = null;
        java.lang.String totalAndroidStringTotalOrderViewTotal = null;
        com.example.lunchtray.model.MenuItem orderViewEntreeGetValue = null;
        com.example.lunchtray.model.MenuItem orderViewAccompanimentGetValue = null;
        java.lang.String orderViewTotalGetValue = null;
        com.example.lunchtray.model.MenuItem orderViewSideGetValue = null;
        java.lang.String orderViewSubtotalGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> orderViewSubtotal = null;
        java.lang.String subtotalAndroidStringSubtotalOrderViewSubtotal = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderViewAccompaniment = null;
        java.lang.String orderViewAccompanimentName = null;

        if ((dirtyFlags & 0x1bfL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (orderView != null) {
                        // read orderView.tax
                        orderViewTax = orderView.getTax();
                    }
                    updateLiveDataRegistration(0, orderViewTax);


                    if (orderViewTax != null) {
                        // read orderView.tax.getValue()
                        orderViewTaxGetValue = orderViewTax.getValue();
                    }


                    // read @android:string/tax
                    taxAndroidStringTaxOrderViewTax = tax.getResources().getString(R.string.tax, orderViewTaxGetValue);
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (orderView != null) {
                        // read orderView.total
                        orderViewTotal = orderView.getTotal();
                    }
                    updateLiveDataRegistration(1, orderViewTotal);


                    if (orderViewTotal != null) {
                        // read orderView.total.getValue()
                        orderViewTotalGetValue = orderViewTotal.getValue();
                    }


                    // read @android:string/total
                    totalAndroidStringTotalOrderViewTotal = total.getResources().getString(R.string.total, orderViewTotalGetValue);
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (orderView != null) {
                        // read orderView.side
                        orderViewSide = orderView.getSide();
                    }
                    updateLiveDataRegistration(2, orderViewSide);


                    if (orderViewSide != null) {
                        // read orderView.side.getValue()
                        orderViewSideGetValue = orderViewSide.getValue();
                    }


                    if (orderViewSideGetValue != null) {
                        // read orderView.side.getValue().name
                        orderViewSideName = orderViewSideGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (orderView != null) {
                        // read orderView.entree
                        orderViewEntree = orderView.getEntree();
                    }
                    updateLiveDataRegistration(3, orderViewEntree);


                    if (orderViewEntree != null) {
                        // read orderView.entree.getValue()
                        orderViewEntreeGetValue = orderViewEntree.getValue();
                    }


                    if (orderViewEntreeGetValue != null) {
                        // read orderView.entree.getValue().name
                        orderViewEntreeName = orderViewEntreeGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (orderView != null) {
                        // read orderView.subtotal
                        orderViewSubtotal = orderView.getSubtotal();
                    }
                    updateLiveDataRegistration(4, orderViewSubtotal);


                    if (orderViewSubtotal != null) {
                        // read orderView.subtotal.getValue()
                        orderViewSubtotalGetValue = orderViewSubtotal.getValue();
                    }


                    // read @android:string/subtotal
                    subtotalAndroidStringSubtotalOrderViewSubtotal = subtotal.getResources().getString(R.string.subtotal, orderViewSubtotalGetValue);
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (orderView != null) {
                        // read orderView.accompaniment
                        orderViewAccompaniment = orderView.getAccompaniment();
                    }
                    updateLiveDataRegistration(5, orderViewAccompaniment);


                    if (orderViewAccompaniment != null) {
                        // read orderView.accompaniment.getValue()
                        orderViewAccompanimentGetValue = orderViewAccompaniment.getValue();
                    }


                    if (orderViewAccompanimentGetValue != null) {
                        // read orderView.accompaniment.getValue().name
                        orderViewAccompanimentName = orderViewAccompanimentGetValue.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentSelection, orderViewAccompanimentName);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback7);
            this.submitButton.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreeSelection, orderViewEntreeName);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sideSelection, orderViewSideName);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalOrderViewSubtotal);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tax, taxAndroidStringTaxOrderViewTax);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalOrderViewTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // fragmentCheckout
                com.example.lunchtray.ui.order.CheckoutFragment fragmentCheckout = mFragmentCheckout;
                // fragmentCheckout != null
                boolean fragmentCheckoutJavaLangObjectNull = false;



                fragmentCheckoutJavaLangObjectNull = (fragmentCheckout) != (null);
                if (fragmentCheckoutJavaLangObjectNull) {


                    fragmentCheckout.submitOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragmentCheckout
                com.example.lunchtray.ui.order.CheckoutFragment fragmentCheckout = mFragmentCheckout;
                // fragmentCheckout != null
                boolean fragmentCheckoutJavaLangObjectNull = false;



                fragmentCheckoutJavaLangObjectNull = (fragmentCheckout) != (null);
                if (fragmentCheckoutJavaLangObjectNull) {


                    fragmentCheckout.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): orderView.tax
        flag 1 (0x2L): orderView.total
        flag 2 (0x3L): orderView.side
        flag 3 (0x4L): orderView.entree
        flag 4 (0x5L): orderView.subtotal
        flag 5 (0x6L): orderView.accompaniment
        flag 6 (0x7L): fragmentCheckout
        flag 7 (0x8L): orderView
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}