import numpy as np
import os
from sys import argv

folder = argv[1]

sessionfiles = [f for f in os.listdir(folder) if f[-4:]==".FIT"]

def RepresentsInt(s):
    try:
        int(s)
        return True
    except ValueError:
        return False

def chartodaymonthhour(char):
    if (RepresentsInt(char)):
        return(ord(char)-48)
    else:
        return(ord(char)-55)

def extractdateandtime(filename):
    dateandtime = []
    dateandtime.append("201{}".format(filename[0]))
    dateandtime.append(str(chartodaymonthhour(filename[1])))
    dateandtime.append(str(chartodaymonthhour(filename[2])))
    dateandtime.append(str(chartodaymonthhour(filename[3])))
    dateandtime.append(filename[4:6])
    dateandtime.append(filename[6:8])
    return "-".join(dateandtime)

sessiondates = np.array([])
for f in sessionfiles:
    sessiondates.append(extractdateandtime(f))

sessiondates.sort()

np.savetxt(sessiondates,"folder"+"/calendar.txt")
