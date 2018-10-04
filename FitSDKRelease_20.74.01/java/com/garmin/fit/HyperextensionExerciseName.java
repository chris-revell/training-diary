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

import java.util.HashMap;
import java.util.Map;

public class HyperextensionExerciseName {
    public static final int BACK_EXTENSION_WITH_OPPOSITE_ARM_AND_LEG_REACH = 0;
    public static final int WEIGHTED_BACK_EXTENSION_WITH_OPPOSITE_ARM_AND_LEG_REACH = 1;
    public static final int BASE_ROTATIONS = 2;
    public static final int WEIGHTED_BASE_ROTATIONS = 3;
    public static final int BENT_KNEE_REVERSE_HYPEREXTENSION = 4;
    public static final int WEIGHTED_BENT_KNEE_REVERSE_HYPEREXTENSION = 5;
    public static final int HOLLOW_HOLD_AND_ROLL = 6;
    public static final int WEIGHTED_HOLLOW_HOLD_AND_ROLL = 7;
    public static final int KICKS = 8;
    public static final int WEIGHTED_KICKS = 9;
    public static final int KNEE_RAISES = 10;
    public static final int WEIGHTED_KNEE_RAISES = 11;
    public static final int KNEELING_SUPERMAN = 12;
    public static final int WEIGHTED_KNEELING_SUPERMAN = 13;
    public static final int LAT_PULL_DOWN_WITH_ROW = 14;
    public static final int MEDICINE_BALL_DEADLIFT_TO_REACH = 15;
    public static final int ONE_ARM_ONE_LEG_ROW = 16;
    public static final int ONE_ARM_ROW_WITH_BAND = 17;
    public static final int OVERHEAD_LUNGE_WITH_MEDICINE_BALL = 18;
    public static final int PLANK_KNEE_TUCKS = 19;
    public static final int WEIGHTED_PLANK_KNEE_TUCKS = 20;
    public static final int SIDE_STEP = 21;
    public static final int WEIGHTED_SIDE_STEP = 22;
    public static final int SINGLE_LEG_BACK_EXTENSION = 23;
    public static final int WEIGHTED_SINGLE_LEG_BACK_EXTENSION = 24;
    public static final int SPINE_EXTENSION = 25;
    public static final int WEIGHTED_SPINE_EXTENSION = 26;
    public static final int STATIC_BACK_EXTENSION = 27;
    public static final int WEIGHTED_STATIC_BACK_EXTENSION = 28;
    public static final int SUPERMAN_FROM_FLOOR = 29;
    public static final int WEIGHTED_SUPERMAN_FROM_FLOOR = 30;
    public static final int SWISS_BALL_BACK_EXTENSION = 31;
    public static final int WEIGHTED_SWISS_BALL_BACK_EXTENSION = 32;
    public static final int SWISS_BALL_HYPEREXTENSION = 33;
    public static final int WEIGHTED_SWISS_BALL_HYPEREXTENSION = 34;
    public static final int SWISS_BALL_OPPOSITE_ARM_AND_LEG_LIFT = 35;
    public static final int WEIGHTED_SWISS_BALL_OPPOSITE_ARM_AND_LEG_LIFT = 36;
    public static final int SUPERMAN_ON_SWISS_BALL = 37;
    public static final int COBRA = 38;
    public static final int SUPINE_FLOOR_BARRE = 39;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(BACK_EXTENSION_WITH_OPPOSITE_ARM_AND_LEG_REACH, "BACK_EXTENSION_WITH_OPPOSITE_ARM_AND_LEG_REACH");
        stringMap.put(WEIGHTED_BACK_EXTENSION_WITH_OPPOSITE_ARM_AND_LEG_REACH, "WEIGHTED_BACK_EXTENSION_WITH_OPPOSITE_ARM_AND_LEG_REACH");
        stringMap.put(BASE_ROTATIONS, "BASE_ROTATIONS");
        stringMap.put(WEIGHTED_BASE_ROTATIONS, "WEIGHTED_BASE_ROTATIONS");
        stringMap.put(BENT_KNEE_REVERSE_HYPEREXTENSION, "BENT_KNEE_REVERSE_HYPEREXTENSION");
        stringMap.put(WEIGHTED_BENT_KNEE_REVERSE_HYPEREXTENSION, "WEIGHTED_BENT_KNEE_REVERSE_HYPEREXTENSION");
        stringMap.put(HOLLOW_HOLD_AND_ROLL, "HOLLOW_HOLD_AND_ROLL");
        stringMap.put(WEIGHTED_HOLLOW_HOLD_AND_ROLL, "WEIGHTED_HOLLOW_HOLD_AND_ROLL");
        stringMap.put(KICKS, "KICKS");
        stringMap.put(WEIGHTED_KICKS, "WEIGHTED_KICKS");
        stringMap.put(KNEE_RAISES, "KNEE_RAISES");
        stringMap.put(WEIGHTED_KNEE_RAISES, "WEIGHTED_KNEE_RAISES");
        stringMap.put(KNEELING_SUPERMAN, "KNEELING_SUPERMAN");
        stringMap.put(WEIGHTED_KNEELING_SUPERMAN, "WEIGHTED_KNEELING_SUPERMAN");
        stringMap.put(LAT_PULL_DOWN_WITH_ROW, "LAT_PULL_DOWN_WITH_ROW");
        stringMap.put(MEDICINE_BALL_DEADLIFT_TO_REACH, "MEDICINE_BALL_DEADLIFT_TO_REACH");
        stringMap.put(ONE_ARM_ONE_LEG_ROW, "ONE_ARM_ONE_LEG_ROW");
        stringMap.put(ONE_ARM_ROW_WITH_BAND, "ONE_ARM_ROW_WITH_BAND");
        stringMap.put(OVERHEAD_LUNGE_WITH_MEDICINE_BALL, "OVERHEAD_LUNGE_WITH_MEDICINE_BALL");
        stringMap.put(PLANK_KNEE_TUCKS, "PLANK_KNEE_TUCKS");
        stringMap.put(WEIGHTED_PLANK_KNEE_TUCKS, "WEIGHTED_PLANK_KNEE_TUCKS");
        stringMap.put(SIDE_STEP, "SIDE_STEP");
        stringMap.put(WEIGHTED_SIDE_STEP, "WEIGHTED_SIDE_STEP");
        stringMap.put(SINGLE_LEG_BACK_EXTENSION, "SINGLE_LEG_BACK_EXTENSION");
        stringMap.put(WEIGHTED_SINGLE_LEG_BACK_EXTENSION, "WEIGHTED_SINGLE_LEG_BACK_EXTENSION");
        stringMap.put(SPINE_EXTENSION, "SPINE_EXTENSION");
        stringMap.put(WEIGHTED_SPINE_EXTENSION, "WEIGHTED_SPINE_EXTENSION");
        stringMap.put(STATIC_BACK_EXTENSION, "STATIC_BACK_EXTENSION");
        stringMap.put(WEIGHTED_STATIC_BACK_EXTENSION, "WEIGHTED_STATIC_BACK_EXTENSION");
        stringMap.put(SUPERMAN_FROM_FLOOR, "SUPERMAN_FROM_FLOOR");
        stringMap.put(WEIGHTED_SUPERMAN_FROM_FLOOR, "WEIGHTED_SUPERMAN_FROM_FLOOR");
        stringMap.put(SWISS_BALL_BACK_EXTENSION, "SWISS_BALL_BACK_EXTENSION");
        stringMap.put(WEIGHTED_SWISS_BALL_BACK_EXTENSION, "WEIGHTED_SWISS_BALL_BACK_EXTENSION");
        stringMap.put(SWISS_BALL_HYPEREXTENSION, "SWISS_BALL_HYPEREXTENSION");
        stringMap.put(WEIGHTED_SWISS_BALL_HYPEREXTENSION, "WEIGHTED_SWISS_BALL_HYPEREXTENSION");
        stringMap.put(SWISS_BALL_OPPOSITE_ARM_AND_LEG_LIFT, "SWISS_BALL_OPPOSITE_ARM_AND_LEG_LIFT");
        stringMap.put(WEIGHTED_SWISS_BALL_OPPOSITE_ARM_AND_LEG_LIFT, "WEIGHTED_SWISS_BALL_OPPOSITE_ARM_AND_LEG_LIFT");
        stringMap.put(SUPERMAN_ON_SWISS_BALL, "SUPERMAN_ON_SWISS_BALL");
        stringMap.put(COBRA, "COBRA");
        stringMap.put(SUPINE_FLOOR_BARRE, "SUPINE_FLOOR_BARRE");
    }


    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Integer value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Integer getValueFromString( String value ) {
        for( Map.Entry<Integer, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}
