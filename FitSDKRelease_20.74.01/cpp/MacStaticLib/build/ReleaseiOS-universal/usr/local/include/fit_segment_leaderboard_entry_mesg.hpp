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


#if !defined(FIT_SEGMENT_LEADERBOARD_ENTRY_MESG_HPP)
#define FIT_SEGMENT_LEADERBOARD_ENTRY_MESG_HPP

#include "fit_mesg.hpp"

namespace fit
{

class SegmentLeaderboardEntryMesg : public Mesg
{
public:
    class FieldDefNum final
    {
    public:
       static const FIT_UINT8 MessageIndex = 254;
       static const FIT_UINT8 Name = 0;
       static const FIT_UINT8 Type = 1;
       static const FIT_UINT8 GroupPrimaryKey = 2;
       static const FIT_UINT8 ActivityId = 3;
       static const FIT_UINT8 SegmentTime = 4;
       static const FIT_UINT8 ActivityIdString = 5;
       static const FIT_UINT8 Invalid = FIT_FIELD_NUM_INVALID;
    };

    SegmentLeaderboardEntryMesg(void) : Mesg(Profile::MESG_SEGMENT_LEADERBOARD_ENTRY)
    {
    }

    SegmentLeaderboardEntryMesg(const Mesg &mesg) : Mesg(mesg)
    {
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of message_index field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsMessageIndexValid() const
    {
        const Field* field = GetField(254);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns message_index field
    ///////////////////////////////////////////////////////////////////////
    FIT_MESSAGE_INDEX GetMessageIndex(void) const
    {
        return GetFieldUINT16Value(254, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set message_index field
    ///////////////////////////////////////////////////////////////////////
    void SetMessageIndex(FIT_MESSAGE_INDEX messageIndex)
    {
        SetFieldUINT16Value(254, messageIndex, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of name field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsNameValid() const
    {
        const Field* field = GetField(0);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns name field
    // Comment: Friendly name assigned to leader
    ///////////////////////////////////////////////////////////////////////
    FIT_WSTRING GetName(void) const
    {
        return GetFieldSTRINGValue(0, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set name field
    // Comment: Friendly name assigned to leader
    ///////////////////////////////////////////////////////////////////////
    void SetName(FIT_WSTRING name)
    {
        SetFieldSTRINGValue(0, name, 0);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of type field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsTypeValid() const
    {
        const Field* field = GetField(1);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns type field
    // Comment: Leader classification
    ///////////////////////////////////////////////////////////////////////
    FIT_SEGMENT_LEADERBOARD_TYPE GetType(void) const
    {
        return GetFieldENUMValue(1, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set type field
    // Comment: Leader classification
    ///////////////////////////////////////////////////////////////////////
    void SetType(FIT_SEGMENT_LEADERBOARD_TYPE type)
    {
        SetFieldENUMValue(1, type, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of group_primary_key field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsGroupPrimaryKeyValid() const
    {
        const Field* field = GetField(2);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns group_primary_key field
    // Comment: Primary user ID of this leader
    ///////////////////////////////////////////////////////////////////////
    FIT_UINT32 GetGroupPrimaryKey(void) const
    {
        return GetFieldUINT32Value(2, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set group_primary_key field
    // Comment: Primary user ID of this leader
    ///////////////////////////////////////////////////////////////////////
    void SetGroupPrimaryKey(FIT_UINT32 groupPrimaryKey)
    {
        SetFieldUINT32Value(2, groupPrimaryKey, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of activity_id field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsActivityIdValid() const
    {
        const Field* field = GetField(3);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns activity_id field
    // Comment: ID of the activity associated with this leader time
    ///////////////////////////////////////////////////////////////////////
    FIT_UINT32 GetActivityId(void) const
    {
        return GetFieldUINT32Value(3, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set activity_id field
    // Comment: ID of the activity associated with this leader time
    ///////////////////////////////////////////////////////////////////////
    void SetActivityId(FIT_UINT32 activityId)
    {
        SetFieldUINT32Value(3, activityId, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of segment_time field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsSegmentTimeValid() const
    {
        const Field* field = GetField(4);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns segment_time field
    // Units: s
    // Comment: Segment Time (includes pauses)
    ///////////////////////////////////////////////////////////////////////
    FIT_FLOAT32 GetSegmentTime(void) const
    {
        return GetFieldFLOAT32Value(4, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set segment_time field
    // Units: s
    // Comment: Segment Time (includes pauses)
    ///////////////////////////////////////////////////////////////////////
    void SetSegmentTime(FIT_FLOAT32 segmentTime)
    {
        SetFieldFLOAT32Value(4, segmentTime, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of activity_id_string field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsActivityIdStringValid() const
    {
        const Field* field = GetField(5);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns activity_id_string field
    // Comment: String version of the activity_id. 21 characters long, express in decimal
    ///////////////////////////////////////////////////////////////////////
    FIT_WSTRING GetActivityIdString(void) const
    {
        return GetFieldSTRINGValue(5, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set activity_id_string field
    // Comment: String version of the activity_id. 21 characters long, express in decimal
    ///////////////////////////////////////////////////////////////////////
    void SetActivityIdString(FIT_WSTRING activityIdString)
    {
        SetFieldSTRINGValue(5, activityIdString, 0);
    }

};

} // namespace fit

#endif // !defined(FIT_SEGMENT_LEADERBOARD_ENTRY_MESG_HPP)
