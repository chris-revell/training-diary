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

using System;
using System.IO;

namespace Dynastream.Fit
{
    internal class DeveloperDataKey
        : IComparable
    {
        public byte DeveloperDataIndex { get; private set; }
        public byte FieldDefNum { get; private set; }

        public DeveloperDataKey(byte developerDataIndex, byte fieldDefNum)
        {
            DeveloperDataIndex = developerDataIndex;
            FieldDefNum = fieldDefNum;
        }

        /// <summary>
        /// Determines whether the specified <see cref="T:System.Object"/> is equal to the current <see cref="T:System.Object"/>.
        /// </summary>
        /// <returns>
        /// true if the specified <see cref="T:System.Object"/> is equal to the current <see cref="T:System.Object"/>; otherwise, false.
        /// </returns>
        /// <param name="obj">The <see cref="T:System.Object"/> to compare with the current <see cref="T:System.Object"/>. </param>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            if (obj.GetType() != GetType()) return false;
            return Equals(obj as DeveloperDataKey);
        }

        /// <summary>
        /// Determines whether the specified <see cref="T:Dynastream.Fit.DeveloperDataKey"/> is equal to the current <see cref="T:Dynastream.Fit.DeveloperDataKey"/>.
        /// </summary>
        /// <returns>
        /// true if the specified <see cref="T:Dynastream.Fit.DeveloperDataKey"/> is equal to the current <see cref="T:Dynastream.Fit.DeveloperDataKey"/>; otherwise, false.
        /// </returns>
        /// <param name="other">
        /// The <see cref="T:Dynastream.Fit.DeveloperDataKey"/> to compare with the current <see cref="T:Dynastream.Fit.DeveloperDataKey"/>.
        /// </param>
        protected bool Equals(DeveloperDataKey other)
        {
            return (DeveloperDataIndex == other.DeveloperDataIndex) &&
                   (FieldDefNum == other.FieldDefNum);
        }

        /// <summary>
        /// Serves as a hash function for a particular type.
        /// </summary>
        /// <returns>
        /// A hash code for the current <see cref="T:System.Object"/>.
        /// </returns>
        public override int GetHashCode()
        {
            unchecked
            {
                return (DeveloperDataIndex.GetHashCode() * 397) ^
                        FieldDefNum.GetHashCode();
            }
        }

        /// <summary>
        /// Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object.
        /// </summary>
        /// <returns>
        /// A 32-bit signed integer that indicates the relative order of the objects being compared. The return value has these meanings: Value Meaning Less than zero This instance precedes <paramref name="obj"/> in the sort order. Zero This instance occurs in the same position in the sort order as <paramref name="obj"/>. Greater than zero This instance follows <paramref name="obj"/> in the sort order.
        /// </returns>
        /// <param name="obj">An object to compare with this instance. </param><exception cref="T:System.ArgumentException"><paramref name="obj"/> is not the same type as this instance. </exception>
        public int CompareTo(object obj)
        {
            var other = obj as DeveloperDataKey;
            if (other == null)
            {
                throw new InvalidOperationException("Cannot compare");
            }

            if (DeveloperDataIndex > other.DeveloperDataIndex) return 1;
            if (DeveloperDataIndex < other.DeveloperDataIndex) return -1;
            if (FieldDefNum > other.FieldDefNum) return 1;
            if (FieldDefNum < other.FieldDefNum) return -1;
            return 0;
        }
    }
} // namespace
