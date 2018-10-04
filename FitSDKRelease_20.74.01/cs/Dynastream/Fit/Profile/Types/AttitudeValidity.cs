#region Copyright
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

#endregion

namespace Dynastream.Fit
{
    /// <summary>
    /// Implements the profile AttitudeValidity type as a class
    /// </summary>
    public static class AttitudeValidity 
    {
        public const ushort TrackAngleHeadingValid = 0x0001;
        public const ushort PitchValid = 0x0002;
        public const ushort RollValid = 0x0004;
        public const ushort LateralBodyAccelValid = 0x0008;
        public const ushort NormalBodyAccelValid = 0x0010;
        public const ushort TurnRateValid = 0x0020;
        public const ushort HwFail = 0x0040;
        public const ushort MagInvalid = 0x0080;
        public const ushort NoGps = 0x0100;
        public const ushort GpsInvalid = 0x0200;
        public const ushort SolutionCoasting = 0x0400;
        public const ushort TrueTrackAngle = 0x0800;
        public const ushort MagneticHeading = 0x1000;
        public const ushort Invalid = (ushort)0xFFFF;


    }
}

