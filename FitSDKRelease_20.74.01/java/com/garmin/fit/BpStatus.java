////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin Canada Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2018 Garmin Canada Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 20.74Release
// Tag = production/akw/20.74.01-0-ge94e71c
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;


public enum BpStatus {
    NO_ERROR((short)0),
    ERROR_INCOMPLETE_DATA((short)1),
    ERROR_NO_MEASUREMENT((short)2),
    ERROR_DATA_OUT_OF_RANGE((short)3),
    ERROR_IRREGULAR_HEART_RATE((short)4),
    INVALID((short)255);

    protected short value;

    private BpStatus(short value) {
        this.value = value;
    }

    public static BpStatus getByValue(final Short value) {
        for (final BpStatus type : BpStatus.values()) {
            if (value == type.value)
                return type;
        }

        return BpStatus.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( BpStatus value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
