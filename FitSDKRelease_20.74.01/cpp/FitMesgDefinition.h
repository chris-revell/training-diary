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


#if !defined(FIT_MESGDEFINITION_H)
#define FIT_MESGDEFINITION_H

#include "fit.hpp"
#include "fit_mesg_definition.hpp"

@interface FitMesgDefinition : NSObject
- (FIT_UINT8) Write:(FILE *) file forMesgDefn:(const fit::MesgDefinition *)mesgDefinition;
@end

#endif /* FIT_MESGDEFINITION_H */
