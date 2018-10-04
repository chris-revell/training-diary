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


#include "fit_developer_field_description.hpp"

namespace fit
{
DeveloperFieldDescription::DeveloperFieldDescription
    (
    const DeveloperFieldDescription& other
    )
    : description( new FieldDescriptionMesg( *other.description ) )
    , developer( new DeveloperDataIdMesg( *other.developer ) )
{

}

DeveloperFieldDescription::DeveloperFieldDescription
    (
    const FieldDescriptionMesg& desc,
    const DeveloperDataIdMesg& developer
    )
    : description( new FieldDescriptionMesg( desc ) )
    , developer( new DeveloperDataIdMesg( developer ) )
{
}

DeveloperFieldDescription::~DeveloperFieldDescription()
{
    delete developer;
    delete description;
}

FIT_UINT32 DeveloperFieldDescription::GetApplicationVersion() const
{
    return developer->GetApplicationVersion();
}

FIT_UINT8 DeveloperFieldDescription::GetFieldDefinitionNumber() const
{
    return description->GetFieldDefinitionNumber();
}

std::vector<FIT_UINT8> DeveloperFieldDescription::GetApplicationId() const
{
    // This is a UUID, and thus we expect the return value to be exactly 16 bytes.
    // if it is not we will return an empty vector
    std::vector< FIT_UINT8 > rv( 16 );

    if ( developer->GetNumApplicationId() == 16 )
    {
        for ( FIT_UINT8 i = 0; i < 16; i++ )
        {
            rv[i] = developer->GetApplicationId( i );
        }
    }

    return rv;
}
} // namespace fit
