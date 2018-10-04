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


public enum WeatherReport {
    CURRENT((short)0),
    FORECAST((short)1),
    HOURLY_FORECAST((short)1),
    DAILY_FORECAST((short)2),
    INVALID((short)255);

    protected short value;

    private WeatherReport(short value) {
        this.value = value;
    }

    public static WeatherReport getByValue(final Short value) {
        for (final WeatherReport type : WeatherReport.values()) {
            if (value == type.value)
                return type;
        }

        return WeatherReport.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( WeatherReport value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
