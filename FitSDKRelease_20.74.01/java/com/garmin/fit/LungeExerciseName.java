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

public class LungeExerciseName {
    public static final int OVERHEAD_LUNGE = 0;
    public static final int LUNGE_MATRIX = 1;
    public static final int WEIGHTED_LUNGE_MATRIX = 2;
    public static final int ALTERNATING_BARBELL_FORWARD_LUNGE = 3;
    public static final int ALTERNATING_DUMBBELL_LUNGE_WITH_REACH = 4;
    public static final int BACK_FOOT_ELEVATED_DUMBBELL_SPLIT_SQUAT = 5;
    public static final int BARBELL_BOX_LUNGE = 6;
    public static final int BARBELL_BULGARIAN_SPLIT_SQUAT = 7;
    public static final int BARBELL_CROSSOVER_LUNGE = 8;
    public static final int BARBELL_FRONT_SPLIT_SQUAT = 9;
    public static final int BARBELL_LUNGE = 10;
    public static final int BARBELL_REVERSE_LUNGE = 11;
    public static final int BARBELL_SIDE_LUNGE = 12;
    public static final int BARBELL_SPLIT_SQUAT = 13;
    public static final int CORE_CONTROL_REAR_LUNGE = 14;
    public static final int DIAGONAL_LUNGE = 15;
    public static final int DROP_LUNGE = 16;
    public static final int DUMBBELL_BOX_LUNGE = 17;
    public static final int DUMBBELL_BULGARIAN_SPLIT_SQUAT = 18;
    public static final int DUMBBELL_CROSSOVER_LUNGE = 19;
    public static final int DUMBBELL_DIAGONAL_LUNGE = 20;
    public static final int DUMBBELL_LUNGE = 21;
    public static final int DUMBBELL_LUNGE_AND_ROTATION = 22;
    public static final int DUMBBELL_OVERHEAD_BULGARIAN_SPLIT_SQUAT = 23;
    public static final int DUMBBELL_REVERSE_LUNGE_TO_HIGH_KNEE_AND_PRESS = 24;
    public static final int DUMBBELL_SIDE_LUNGE = 25;
    public static final int ELEVATED_FRONT_FOOT_BARBELL_SPLIT_SQUAT = 26;
    public static final int FRONT_FOOT_ELEVATED_DUMBBELL_SPLIT_SQUAT = 27;
    public static final int GUNSLINGER_LUNGE = 28;
    public static final int LAWNMOWER_LUNGE = 29;
    public static final int LOW_LUNGE_WITH_ISOMETRIC_ADDUCTION = 30;
    public static final int LOW_SIDE_TO_SIDE_LUNGE = 31;
    public static final int LUNGE = 32;
    public static final int WEIGHTED_LUNGE = 33;
    public static final int LUNGE_WITH_ARM_REACH = 34;
    public static final int LUNGE_WITH_DIAGONAL_REACH = 35;
    public static final int LUNGE_WITH_SIDE_BEND = 36;
    public static final int OFFSET_DUMBBELL_LUNGE = 37;
    public static final int OFFSET_DUMBBELL_REVERSE_LUNGE = 38;
    public static final int OVERHEAD_BULGARIAN_SPLIT_SQUAT = 39;
    public static final int OVERHEAD_DUMBBELL_REVERSE_LUNGE = 40;
    public static final int OVERHEAD_DUMBBELL_SPLIT_SQUAT = 41;
    public static final int OVERHEAD_LUNGE_WITH_ROTATION = 42;
    public static final int REVERSE_BARBELL_BOX_LUNGE = 43;
    public static final int REVERSE_BOX_LUNGE = 44;
    public static final int REVERSE_DUMBBELL_BOX_LUNGE = 45;
    public static final int REVERSE_DUMBBELL_CROSSOVER_LUNGE = 46;
    public static final int REVERSE_DUMBBELL_DIAGONAL_LUNGE = 47;
    public static final int REVERSE_LUNGE_WITH_REACH_BACK = 48;
    public static final int WEIGHTED_REVERSE_LUNGE_WITH_REACH_BACK = 49;
    public static final int REVERSE_LUNGE_WITH_TWIST_AND_OVERHEAD_REACH = 50;
    public static final int WEIGHTED_REVERSE_LUNGE_WITH_TWIST_AND_OVERHEAD_REACH = 51;
    public static final int REVERSE_SLIDING_BOX_LUNGE = 52;
    public static final int WEIGHTED_REVERSE_SLIDING_BOX_LUNGE = 53;
    public static final int REVERSE_SLIDING_LUNGE = 54;
    public static final int WEIGHTED_REVERSE_SLIDING_LUNGE = 55;
    public static final int RUNNERS_LUNGE_TO_BALANCE = 56;
    public static final int WEIGHTED_RUNNERS_LUNGE_TO_BALANCE = 57;
    public static final int SHIFTING_SIDE_LUNGE = 58;
    public static final int SIDE_AND_CROSSOVER_LUNGE = 59;
    public static final int WEIGHTED_SIDE_AND_CROSSOVER_LUNGE = 60;
    public static final int SIDE_LUNGE = 61;
    public static final int WEIGHTED_SIDE_LUNGE = 62;
    public static final int SIDE_LUNGE_AND_PRESS = 63;
    public static final int SIDE_LUNGE_JUMP_OFF = 64;
    public static final int SIDE_LUNGE_SWEEP = 65;
    public static final int WEIGHTED_SIDE_LUNGE_SWEEP = 66;
    public static final int SIDE_LUNGE_TO_CROSSOVER_TAP = 67;
    public static final int WEIGHTED_SIDE_LUNGE_TO_CROSSOVER_TAP = 68;
    public static final int SIDE_TO_SIDE_LUNGE_CHOPS = 69;
    public static final int WEIGHTED_SIDE_TO_SIDE_LUNGE_CHOPS = 70;
    public static final int SIFF_JUMP_LUNGE = 71;
    public static final int WEIGHTED_SIFF_JUMP_LUNGE = 72;
    public static final int SINGLE_ARM_REVERSE_LUNGE_AND_PRESS = 73;
    public static final int SLIDING_LATERAL_LUNGE = 74;
    public static final int WEIGHTED_SLIDING_LATERAL_LUNGE = 75;
    public static final int WALKING_BARBELL_LUNGE = 76;
    public static final int WALKING_DUMBBELL_LUNGE = 77;
    public static final int WALKING_LUNGE = 78;
    public static final int WEIGHTED_WALKING_LUNGE = 79;
    public static final int WIDE_GRIP_OVERHEAD_BARBELL_SPLIT_SQUAT = 80;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(OVERHEAD_LUNGE, "OVERHEAD_LUNGE");
        stringMap.put(LUNGE_MATRIX, "LUNGE_MATRIX");
        stringMap.put(WEIGHTED_LUNGE_MATRIX, "WEIGHTED_LUNGE_MATRIX");
        stringMap.put(ALTERNATING_BARBELL_FORWARD_LUNGE, "ALTERNATING_BARBELL_FORWARD_LUNGE");
        stringMap.put(ALTERNATING_DUMBBELL_LUNGE_WITH_REACH, "ALTERNATING_DUMBBELL_LUNGE_WITH_REACH");
        stringMap.put(BACK_FOOT_ELEVATED_DUMBBELL_SPLIT_SQUAT, "BACK_FOOT_ELEVATED_DUMBBELL_SPLIT_SQUAT");
        stringMap.put(BARBELL_BOX_LUNGE, "BARBELL_BOX_LUNGE");
        stringMap.put(BARBELL_BULGARIAN_SPLIT_SQUAT, "BARBELL_BULGARIAN_SPLIT_SQUAT");
        stringMap.put(BARBELL_CROSSOVER_LUNGE, "BARBELL_CROSSOVER_LUNGE");
        stringMap.put(BARBELL_FRONT_SPLIT_SQUAT, "BARBELL_FRONT_SPLIT_SQUAT");
        stringMap.put(BARBELL_LUNGE, "BARBELL_LUNGE");
        stringMap.put(BARBELL_REVERSE_LUNGE, "BARBELL_REVERSE_LUNGE");
        stringMap.put(BARBELL_SIDE_LUNGE, "BARBELL_SIDE_LUNGE");
        stringMap.put(BARBELL_SPLIT_SQUAT, "BARBELL_SPLIT_SQUAT");
        stringMap.put(CORE_CONTROL_REAR_LUNGE, "CORE_CONTROL_REAR_LUNGE");
        stringMap.put(DIAGONAL_LUNGE, "DIAGONAL_LUNGE");
        stringMap.put(DROP_LUNGE, "DROP_LUNGE");
        stringMap.put(DUMBBELL_BOX_LUNGE, "DUMBBELL_BOX_LUNGE");
        stringMap.put(DUMBBELL_BULGARIAN_SPLIT_SQUAT, "DUMBBELL_BULGARIAN_SPLIT_SQUAT");
        stringMap.put(DUMBBELL_CROSSOVER_LUNGE, "DUMBBELL_CROSSOVER_LUNGE");
        stringMap.put(DUMBBELL_DIAGONAL_LUNGE, "DUMBBELL_DIAGONAL_LUNGE");
        stringMap.put(DUMBBELL_LUNGE, "DUMBBELL_LUNGE");
        stringMap.put(DUMBBELL_LUNGE_AND_ROTATION, "DUMBBELL_LUNGE_AND_ROTATION");
        stringMap.put(DUMBBELL_OVERHEAD_BULGARIAN_SPLIT_SQUAT, "DUMBBELL_OVERHEAD_BULGARIAN_SPLIT_SQUAT");
        stringMap.put(DUMBBELL_REVERSE_LUNGE_TO_HIGH_KNEE_AND_PRESS, "DUMBBELL_REVERSE_LUNGE_TO_HIGH_KNEE_AND_PRESS");
        stringMap.put(DUMBBELL_SIDE_LUNGE, "DUMBBELL_SIDE_LUNGE");
        stringMap.put(ELEVATED_FRONT_FOOT_BARBELL_SPLIT_SQUAT, "ELEVATED_FRONT_FOOT_BARBELL_SPLIT_SQUAT");
        stringMap.put(FRONT_FOOT_ELEVATED_DUMBBELL_SPLIT_SQUAT, "FRONT_FOOT_ELEVATED_DUMBBELL_SPLIT_SQUAT");
        stringMap.put(GUNSLINGER_LUNGE, "GUNSLINGER_LUNGE");
        stringMap.put(LAWNMOWER_LUNGE, "LAWNMOWER_LUNGE");
        stringMap.put(LOW_LUNGE_WITH_ISOMETRIC_ADDUCTION, "LOW_LUNGE_WITH_ISOMETRIC_ADDUCTION");
        stringMap.put(LOW_SIDE_TO_SIDE_LUNGE, "LOW_SIDE_TO_SIDE_LUNGE");
        stringMap.put(LUNGE, "LUNGE");
        stringMap.put(WEIGHTED_LUNGE, "WEIGHTED_LUNGE");
        stringMap.put(LUNGE_WITH_ARM_REACH, "LUNGE_WITH_ARM_REACH");
        stringMap.put(LUNGE_WITH_DIAGONAL_REACH, "LUNGE_WITH_DIAGONAL_REACH");
        stringMap.put(LUNGE_WITH_SIDE_BEND, "LUNGE_WITH_SIDE_BEND");
        stringMap.put(OFFSET_DUMBBELL_LUNGE, "OFFSET_DUMBBELL_LUNGE");
        stringMap.put(OFFSET_DUMBBELL_REVERSE_LUNGE, "OFFSET_DUMBBELL_REVERSE_LUNGE");
        stringMap.put(OVERHEAD_BULGARIAN_SPLIT_SQUAT, "OVERHEAD_BULGARIAN_SPLIT_SQUAT");
        stringMap.put(OVERHEAD_DUMBBELL_REVERSE_LUNGE, "OVERHEAD_DUMBBELL_REVERSE_LUNGE");
        stringMap.put(OVERHEAD_DUMBBELL_SPLIT_SQUAT, "OVERHEAD_DUMBBELL_SPLIT_SQUAT");
        stringMap.put(OVERHEAD_LUNGE_WITH_ROTATION, "OVERHEAD_LUNGE_WITH_ROTATION");
        stringMap.put(REVERSE_BARBELL_BOX_LUNGE, "REVERSE_BARBELL_BOX_LUNGE");
        stringMap.put(REVERSE_BOX_LUNGE, "REVERSE_BOX_LUNGE");
        stringMap.put(REVERSE_DUMBBELL_BOX_LUNGE, "REVERSE_DUMBBELL_BOX_LUNGE");
        stringMap.put(REVERSE_DUMBBELL_CROSSOVER_LUNGE, "REVERSE_DUMBBELL_CROSSOVER_LUNGE");
        stringMap.put(REVERSE_DUMBBELL_DIAGONAL_LUNGE, "REVERSE_DUMBBELL_DIAGONAL_LUNGE");
        stringMap.put(REVERSE_LUNGE_WITH_REACH_BACK, "REVERSE_LUNGE_WITH_REACH_BACK");
        stringMap.put(WEIGHTED_REVERSE_LUNGE_WITH_REACH_BACK, "WEIGHTED_REVERSE_LUNGE_WITH_REACH_BACK");
        stringMap.put(REVERSE_LUNGE_WITH_TWIST_AND_OVERHEAD_REACH, "REVERSE_LUNGE_WITH_TWIST_AND_OVERHEAD_REACH");
        stringMap.put(WEIGHTED_REVERSE_LUNGE_WITH_TWIST_AND_OVERHEAD_REACH, "WEIGHTED_REVERSE_LUNGE_WITH_TWIST_AND_OVERHEAD_REACH");
        stringMap.put(REVERSE_SLIDING_BOX_LUNGE, "REVERSE_SLIDING_BOX_LUNGE");
        stringMap.put(WEIGHTED_REVERSE_SLIDING_BOX_LUNGE, "WEIGHTED_REVERSE_SLIDING_BOX_LUNGE");
        stringMap.put(REVERSE_SLIDING_LUNGE, "REVERSE_SLIDING_LUNGE");
        stringMap.put(WEIGHTED_REVERSE_SLIDING_LUNGE, "WEIGHTED_REVERSE_SLIDING_LUNGE");
        stringMap.put(RUNNERS_LUNGE_TO_BALANCE, "RUNNERS_LUNGE_TO_BALANCE");
        stringMap.put(WEIGHTED_RUNNERS_LUNGE_TO_BALANCE, "WEIGHTED_RUNNERS_LUNGE_TO_BALANCE");
        stringMap.put(SHIFTING_SIDE_LUNGE, "SHIFTING_SIDE_LUNGE");
        stringMap.put(SIDE_AND_CROSSOVER_LUNGE, "SIDE_AND_CROSSOVER_LUNGE");
        stringMap.put(WEIGHTED_SIDE_AND_CROSSOVER_LUNGE, "WEIGHTED_SIDE_AND_CROSSOVER_LUNGE");
        stringMap.put(SIDE_LUNGE, "SIDE_LUNGE");
        stringMap.put(WEIGHTED_SIDE_LUNGE, "WEIGHTED_SIDE_LUNGE");
        stringMap.put(SIDE_LUNGE_AND_PRESS, "SIDE_LUNGE_AND_PRESS");
        stringMap.put(SIDE_LUNGE_JUMP_OFF, "SIDE_LUNGE_JUMP_OFF");
        stringMap.put(SIDE_LUNGE_SWEEP, "SIDE_LUNGE_SWEEP");
        stringMap.put(WEIGHTED_SIDE_LUNGE_SWEEP, "WEIGHTED_SIDE_LUNGE_SWEEP");
        stringMap.put(SIDE_LUNGE_TO_CROSSOVER_TAP, "SIDE_LUNGE_TO_CROSSOVER_TAP");
        stringMap.put(WEIGHTED_SIDE_LUNGE_TO_CROSSOVER_TAP, "WEIGHTED_SIDE_LUNGE_TO_CROSSOVER_TAP");
        stringMap.put(SIDE_TO_SIDE_LUNGE_CHOPS, "SIDE_TO_SIDE_LUNGE_CHOPS");
        stringMap.put(WEIGHTED_SIDE_TO_SIDE_LUNGE_CHOPS, "WEIGHTED_SIDE_TO_SIDE_LUNGE_CHOPS");
        stringMap.put(SIFF_JUMP_LUNGE, "SIFF_JUMP_LUNGE");
        stringMap.put(WEIGHTED_SIFF_JUMP_LUNGE, "WEIGHTED_SIFF_JUMP_LUNGE");
        stringMap.put(SINGLE_ARM_REVERSE_LUNGE_AND_PRESS, "SINGLE_ARM_REVERSE_LUNGE_AND_PRESS");
        stringMap.put(SLIDING_LATERAL_LUNGE, "SLIDING_LATERAL_LUNGE");
        stringMap.put(WEIGHTED_SLIDING_LATERAL_LUNGE, "WEIGHTED_SLIDING_LATERAL_LUNGE");
        stringMap.put(WALKING_BARBELL_LUNGE, "WALKING_BARBELL_LUNGE");
        stringMap.put(WALKING_DUMBBELL_LUNGE, "WALKING_DUMBBELL_LUNGE");
        stringMap.put(WALKING_LUNGE, "WALKING_LUNGE");
        stringMap.put(WEIGHTED_WALKING_LUNGE, "WEIGHTED_WALKING_LUNGE");
        stringMap.put(WIDE_GRIP_OVERHEAD_BARBELL_SPLIT_SQUAT, "WIDE_GRIP_OVERHEAD_BARBELL_SPLIT_SQUAT");
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
