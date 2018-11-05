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
    dateandtime = "201{}-{:02d}-{:02d}-{:02d}-{}-{}".format(filename[0],chartodaymonthhour(filename[1]),chartodaymonthhour(filename[2]),chartodaymonthhour(filename[3]),filename[4:6],filename[6:8])
    return dateandtime

sessiondirectory = []
for f in sessionfiles:
    extractdateandtime(f)
    sessiondirectory.append(extractdateandtime(f)+"    "+f)

sessiondirectory.sort()

with open(folder+"/calendar.txt","w") as outfile:
    for s in sessiondirectory:
        outfile.write(s+"\n")
outfile.close()
