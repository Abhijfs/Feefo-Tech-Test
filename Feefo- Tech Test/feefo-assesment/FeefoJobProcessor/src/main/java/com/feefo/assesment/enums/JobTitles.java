package com.feefo.assesment.enums;

import com.feefo.assesment.utils.StringUtils;

public enum JobTitles {
    ARCHITECT,
    SOFTWARE_ENGINEER,
    QUALITY_SURVEYOR,
    ACCOUNTANT;

    @Override
    public String toString() {
        return StringUtils.stringFromCapitalizedSnakeCase(super.toString());
    }
}
