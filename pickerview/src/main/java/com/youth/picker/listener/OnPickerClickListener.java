package com.youth.picker.listener;

import com.youth.picker.entity.PickerData;

public interface OnPickerClickListener {
    void OnPickerClick(PickerData pickerData);

    void OnPickerConfirmClick(PickerData pickerData);
}
