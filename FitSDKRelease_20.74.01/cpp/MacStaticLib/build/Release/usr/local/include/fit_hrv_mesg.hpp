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


#if !defined(FIT_HRV_MESG_HPP)
#define FIT_HRV_MESG_HPP

#include "fit_mesg.hpp"

namespace fit
{

class HrvMesg : public Mesg
{
public:
    class FieldDefNum final
    {
    public:
       static const FIT_UINT8 Time = 0;
       static const FIT_UINT8 Invalid = FIT_FIELD_NUM_INVALID;
    };

    HrvMesg(void) : Mesg(Profile::MESG_HRV)
    {
    }

    HrvMesg(const Mesg &mesg) : Mesg(mesg)
    {
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns number of time
    ///////////////////////////////////////////////////////////////////////
    FIT_UINT8 GetNumTime(void) const
    {
        return GetFieldNumValues(0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of time field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsTimeValid(FIT_UINT8 index) const
    {
        const Field* field = GetField(0);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid(index);
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns time field
    // Units: s
    // Comment: Time between beats
    ///////////////////////////////////////////////////////////////////////
    FIT_FLOAT32 GetTime(FIT_UINT8 index) const
    {
        return GetFieldFLOAT32Value(0, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set time field
    // Units: s
    // Comment: Time between beats
    ///////////////////////////////////////////////////////////////////////
    void SetTime(FIT_UINT8 index, FIT_FLOAT32 time)
    {
        SetFieldFLOAT32Value(0, time, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

};

} // namespace fit

#endif // !defined(FIT_HRV_MESG_HPP)
