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

public class CurlExerciseName {
    public static final int ALTERNATING_DUMBBELL_BICEPS_CURL = 0;
    public static final int ALTERNATING_DUMBBELL_BICEPS_CURL_ON_SWISS_BALL = 1;
    public static final int ALTERNATING_INCLINE_DUMBBELL_BICEPS_CURL = 2;
    public static final int BARBELL_BICEPS_CURL = 3;
    public static final int BARBELL_REVERSE_WRIST_CURL = 4;
    public static final int BARBELL_WRIST_CURL = 5;
    public static final int BEHIND_THE_BACK_BARBELL_REVERSE_WRIST_CURL = 6;
    public static final int BEHIND_THE_BACK_ONE_ARM_CABLE_CURL = 7;
    public static final int CABLE_BICEPS_CURL = 8;
    public static final int CABLE_HAMMER_CURL = 9;
    public static final int CHEATING_BARBELL_BICEPS_CURL = 10;
    public static final int CLOSE_GRIP_EZ_BAR_BICEPS_CURL = 11;
    public static final int CROSS_BODY_DUMBBELL_HAMMER_CURL = 12;
    public static final int DEAD_HANG_BICEPS_CURL = 13;
    public static final int DECLINE_HAMMER_CURL = 14;
    public static final int DUMBBELL_BICEPS_CURL_WITH_STATIC_HOLD = 15;
    public static final int DUMBBELL_HAMMER_CURL = 16;
    public static final int DUMBBELL_REVERSE_WRIST_CURL = 17;
    public static final int DUMBBELL_WRIST_CURL = 18;
    public static final int EZ_BAR_PREACHER_CURL = 19;
    public static final int FORWARD_BEND_BICEPS_CURL = 20;
    public static final int HAMMER_CURL_TO_PRESS = 21;
    public static final int INCLINE_DUMBBELL_BICEPS_CURL = 22;
    public static final int INCLINE_OFFSET_THUMB_DUMBBELL_CURL = 23;
    public static final int KETTLEBELL_BICEPS_CURL = 24;
    public static final int LYING_CONCENTRATION_CABLE_CURL = 25;
    public static final int ONE_ARM_PREACHER_CURL = 26;
    public static final int PLATE_PINCH_CURL = 27;
    public static final int PREACHER_CURL_WITH_CABLE = 28;
    public static final int REVERSE_EZ_BAR_CURL = 29;
    public static final int REVERSE_GRIP_WRIST_CURL = 30;
    public static final int REVERSE_GRIP_BARBELL_BICEPS_CURL = 31;
    public static final int SEATED_ALTERNATING_DUMBBELL_BICEPS_CURL = 32;
    public static final int SEATED_DUMBBELL_BICEPS_CURL = 33;
    public static final int SEATED_REVERSE_DUMBBELL_CURL = 34;
    public static final int SPLIT_STANCE_OFFSET_PINKY_DUMBBELL_CURL = 35;
    public static final int STANDING_ALTERNATING_DUMBBELL_CURLS = 36;
    public static final int STANDING_DUMBBELL_BICEPS_CURL = 37;
    public static final int STANDING_EZ_BAR_BICEPS_CURL = 38;
    public static final int STATIC_CURL = 39;
    public static final int SWISS_BALL_DUMBBELL_OVERHEAD_TRICEPS_EXTENSION = 40;
    public static final int SWISS_BALL_EZ_BAR_PREACHER_CURL = 41;
    public static final int TWISTING_STANDING_DUMBBELL_BICEPS_CURL = 42;
    public static final int WIDE_GRIP_EZ_BAR_BICEPS_CURL = 43;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(ALTERNATING_DUMBBELL_BICEPS_CURL, "ALTERNATING_DUMBBELL_BICEPS_CURL");
        stringMap.put(ALTERNATING_DUMBBELL_BICEPS_CURL_ON_SWISS_BALL, "ALTERNATING_DUMBBELL_BICEPS_CURL_ON_SWISS_BALL");
        stringMap.put(ALTERNATING_INCLINE_DUMBBELL_BICEPS_CURL, "ALTERNATING_INCLINE_DUMBBELL_BICEPS_CURL");
        stringMap.put(BARBELL_BICEPS_CURL, "BARBELL_BICEPS_CURL");
        stringMap.put(BARBELL_REVERSE_WRIST_CURL, "BARBELL_REVERSE_WRIST_CURL");
        stringMap.put(BARBELL_WRIST_CURL, "BARBELL_WRIST_CURL");
        stringMap.put(BEHIND_THE_BACK_BARBELL_REVERSE_WRIST_CURL, "BEHIND_THE_BACK_BARBELL_REVERSE_WRIST_CURL");
        stringMap.put(BEHIND_THE_BACK_ONE_ARM_CABLE_CURL, "BEHIND_THE_BACK_ONE_ARM_CABLE_CURL");
        stringMap.put(CABLE_BICEPS_CURL, "CABLE_BICEPS_CURL");
        stringMap.put(CABLE_HAMMER_CURL, "CABLE_HAMMER_CURL");
        stringMap.put(CHEATING_BARBELL_BICEPS_CURL, "CHEATING_BARBELL_BICEPS_CURL");
        stringMap.put(CLOSE_GRIP_EZ_BAR_BICEPS_CURL, "CLOSE_GRIP_EZ_BAR_BICEPS_CURL");
        stringMap.put(CROSS_BODY_DUMBBELL_HAMMER_CURL, "CROSS_BODY_DUMBBELL_HAMMER_CURL");
        stringMap.put(DEAD_HANG_BICEPS_CURL, "DEAD_HANG_BICEPS_CURL");
        stringMap.put(DECLINE_HAMMER_CURL, "DECLINE_HAMMER_CURL");
        stringMap.put(DUMBBELL_BICEPS_CURL_WITH_STATIC_HOLD, "DUMBBELL_BICEPS_CURL_WITH_STATIC_HOLD");
        stringMap.put(DUMBBELL_HAMMER_CURL, "DUMBBELL_HAMMER_CURL");
        stringMap.put(DUMBBELL_REVERSE_WRIST_CURL, "DUMBBELL_REVERSE_WRIST_CURL");
        stringMap.put(DUMBBELL_WRIST_CURL, "DUMBBELL_WRIST_CURL");
        stringMap.put(EZ_BAR_PREACHER_CURL, "EZ_BAR_PREACHER_CURL");
        stringMap.put(FORWARD_BEND_BICEPS_CURL, "FORWARD_BEND_BICEPS_CURL");
        stringMap.put(HAMMER_CURL_TO_PRESS, "HAMMER_CURL_TO_PRESS");
        stringMap.put(INCLINE_DUMBBELL_BICEPS_CURL, "INCLINE_DUMBBELL_BICEPS_CURL");
        stringMap.put(INCLINE_OFFSET_THUMB_DUMBBELL_CURL, "INCLINE_OFFSET_THUMB_DUMBBELL_CURL");
        stringMap.put(KETTLEBELL_BICEPS_CURL, "KETTLEBELL_BICEPS_CURL");
        stringMap.put(LYING_CONCENTRATION_CABLE_CURL, "LYING_CONCENTRATION_CABLE_CURL");
        stringMap.put(ONE_ARM_PREACHER_CURL, "ONE_ARM_PREACHER_CURL");
        stringMap.put(PLATE_PINCH_CURL, "PLATE_PINCH_CURL");
        stringMap.put(PREACHER_CURL_WITH_CABLE, "PREACHER_CURL_WITH_CABLE");
        stringMap.put(REVERSE_EZ_BAR_CURL, "REVERSE_EZ_BAR_CURL");
        stringMap.put(REVERSE_GRIP_WRIST_CURL, "REVERSE_GRIP_WRIST_CURL");
        stringMap.put(REVERSE_GRIP_BARBELL_BICEPS_CURL, "REVERSE_GRIP_BARBELL_BICEPS_CURL");
        stringMap.put(SEATED_ALTERNATING_DUMBBELL_BICEPS_CURL, "SEATED_ALTERNATING_DUMBBELL_BICEPS_CURL");
        stringMap.put(SEATED_DUMBBELL_BICEPS_CURL, "SEATED_DUMBBELL_BICEPS_CURL");
        stringMap.put(SEATED_REVERSE_DUMBBELL_CURL, "SEATED_REVERSE_DUMBBELL_CURL");
        stringMap.put(SPLIT_STANCE_OFFSET_PINKY_DUMBBELL_CURL, "SPLIT_STANCE_OFFSET_PINKY_DUMBBELL_CURL");
        stringMap.put(STANDING_ALTERNATING_DUMBBELL_CURLS, "STANDING_ALTERNATING_DUMBBELL_CURLS");
        stringMap.put(STANDING_DUMBBELL_BICEPS_CURL, "STANDING_DUMBBELL_BICEPS_CURL");
        stringMap.put(STANDING_EZ_BAR_BICEPS_CURL, "STANDING_EZ_BAR_BICEPS_CURL");
        stringMap.put(STATIC_CURL, "STATIC_CURL");
        stringMap.put(SWISS_BALL_DUMBBELL_OVERHEAD_TRICEPS_EXTENSION, "SWISS_BALL_DUMBBELL_OVERHEAD_TRICEPS_EXTENSION");
        stringMap.put(SWISS_BALL_EZ_BAR_PREACHER_CURL, "SWISS_BALL_EZ_BAR_PREACHER_CURL");
        stringMap.put(TWISTING_STANDING_DUMBBELL_BICEPS_CURL, "TWISTING_STANDING_DUMBBELL_BICEPS_CURL");
        stringMap.put(WIDE_GRIP_EZ_BAR_BICEPS_CURL, "WIDE_GRIP_EZ_BAR_BICEPS_CURL");
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
